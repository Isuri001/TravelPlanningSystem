package lk.ijse.gdse63.nexttravel.repo;

import lk.ijse.gdse63.nexttravel.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}
