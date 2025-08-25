package Services;

import Repository.UserRepository;
import Entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    //obtencao do repositorio para utilizar para salvar,editar etc os dados
    public UserService (UserRepository repository){
        this.repository = repository;
    }

    //guardar utilizadores
    public User save(User user){
        return repository.save(user);
    }

    //obter todos os utilizadores
    public Iterable<User> findAll(){
        return repository.findAll();
    }

    //encontrar utilizador pelo username
    public User findByUsername(String username){
        return repository.findByUsername(username);
    }
}
