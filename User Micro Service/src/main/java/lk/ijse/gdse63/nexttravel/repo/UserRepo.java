package lk.ijse.gdse63.nexttravel.repo;

import lk.ijse.gdse63.nexttravel.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
    User findByUsernameAndEmail(String username , String email );

    User findByEmail(String email);

}
