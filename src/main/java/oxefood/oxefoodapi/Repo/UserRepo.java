package oxefood.oxefoodapi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import oxefood.oxefoodapi.Models.User;


public interface UserRepo extends JpaRepository<User, Long> {
}
