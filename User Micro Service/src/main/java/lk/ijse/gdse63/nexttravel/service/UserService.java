package lk.ijse.gdse63.nexttravel.service;

import lk.ijse.gdse63.nexttravel.dto.UserDTO;
import lk.ijse.gdse63.nexttravel.exception.UserNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService{

    UserDTO searchUserByEmail(String email) throws UserNotFoundException;

}
