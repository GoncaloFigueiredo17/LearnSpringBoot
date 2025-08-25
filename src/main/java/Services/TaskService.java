package Services;
import Entities.Task;
import Repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    //criar nova task
    public Task save(Task task){
        return repository.save(task);
    }

    //eliminar uma tarefa
    public void delete(Task task){
        repository.delete(task);
    }
}
