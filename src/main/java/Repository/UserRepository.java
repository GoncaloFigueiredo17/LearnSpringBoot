package Repository;
import Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> { //CrudRepository ja tem metodos como FindAll ,  save , FindById ...
    User findByUsername(String username);
}
