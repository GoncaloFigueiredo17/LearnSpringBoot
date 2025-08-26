package Repository;
import Entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;


public interface UserRepository extends CrudRepository<User,Long> { //CrudRepository ja tem metodos como FindAll ,  save , FindById ...
    User findByUsername(String username);
}
