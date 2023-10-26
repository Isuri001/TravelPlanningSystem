package lk.ijse.gdse63.nexttravel.repo;

import lk.ijse.gdse63.nexttravel.entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin, String> {

    Admin findByEmail(String email);

}
