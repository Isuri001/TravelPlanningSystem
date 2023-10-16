package lk.ijse.gdse63.nexttravel.service.impl;

import lk.ijse.gdse63.nexttravel.dto.UserDTO;
import lk.ijse.gdse63.nexttravel.entity.User;
import lk.ijse.gdse63.nexttravel.exception.UserNotFoundException;
import lk.ijse.gdse63.nexttravel.repo.UserRepo;
import lk.ijse.gdse63.nexttravel.service.UserService;
import org.json.JSONArray;
import org.json.JSONException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Value("http://localhost:8080/api/v1/login")

    private String adminDataEndPoint;

    private final UserRepo userRepository;
    private ModelMapper modelMapper;

    public UserServiceImpl(UserRepo userRepository,ModelMapper mapper){
        this.userRepository = userRepository;
        this.modelMapper=mapper;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        List<String> roles = new ArrayList<>();
        roles.add("user");
        UserDetails userDetails =
                org.springframework.security.core.userdetails.User.builder()
                        .username(user.getEmail())
                        .password(user.getPassword())
                        .roles(roles.toArray(new String[1]))
                        .build();
        return userDetails;
    }


    @Override
    public UserDTO searchUserByEmail(String email) throws UserNotFoundException {
        try {
            User byEmail = userRepository.findByEmail(email);
            UserDTO map = modelMapper.map(byEmail, UserDTO.class);
            map.setNicImg(jsonStringToArray(byEmail.getNicImgs()));
            return map;
        }catch (Exception e){
            e.printStackTrace();
            throw new UserNotFoundException("User Not Found");
        }
    }

    ArrayList<String> jsonStringToArray(String jsonString) throws JSONException {
        ArrayList<String> stringArray = new ArrayList<>();


        JSONArray jsonArray = new JSONArray(jsonString);

        for (int i =0; i<jsonArray.length();i++){
            stringArray.add(jsonArray.getString(i));
        }
        return stringArray;
    }

}
