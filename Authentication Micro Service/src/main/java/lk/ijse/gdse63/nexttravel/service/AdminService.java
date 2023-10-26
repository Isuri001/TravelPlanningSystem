package lk.ijse.gdse63.nexttravel.service;

import lk.ijse.gdse63.nexttravel.dto.AdminDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdminService extends UserDetailsService{

    AdminDTO searchUser(String email);

}
