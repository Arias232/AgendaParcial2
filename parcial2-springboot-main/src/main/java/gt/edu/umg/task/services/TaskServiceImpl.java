package gt.edu.umg.task.services;
import gt.edu.umg.task.daos.TaskDao;
import gt.edu.umg.task.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public List<Task> findAll() {return (List<Task>) taskDao.findAll();}

    @Override
    public Task findById(Long id) {
        return taskDao.findById(id).orElse(null);
    }

    @Override
    public Task create(Task task) {return taskDao.save(task);}

    @Override
    public Task modify(Long id, Task task) {if (taskDao.existsById(id)) {task.setId((id));return taskDao.save(task);}return  null;}

    public void delete(Long id){ if(taskDao.existsById(id)){ taskDao.deleteById(id);}}
}