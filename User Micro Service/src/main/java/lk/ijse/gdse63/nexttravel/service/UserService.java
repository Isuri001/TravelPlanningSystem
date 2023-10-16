package lk.ijse.gdse63.nexttravel.service;

import lk.ijse.gdse63.nexttravel.dto.UserDTO;
import lk.ijse.gdse63.nexttravel.exception.CreateFailException;
import lk.ijse.gdse63.nexttravel.exception.DeleteFailException;
import lk.ijse.gdse63.nexttravel.exception.UpdateFailException;
import lk.ijse.gdse63.nexttravel.exception.UserNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService  extends UserDetailsService{

    UserDTO searchUserByEmail(String email) throws UserNotFoundException;

    void updateUser(UserDTO email) throws UpdateFailException;

    int addUsers(UserDTO email) throws CreateFailException;

    void deleteUser(String email) throws DeleteFailException;

    List<UserDTO> getAll(String email) throws UserNotFoundException;


}
