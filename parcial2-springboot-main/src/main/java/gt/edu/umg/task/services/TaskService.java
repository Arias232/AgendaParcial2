package gt.edu.umg.task.services;

import gt.edu.umg.task.entities.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
    Task findById(Long id);
    Task create(Task task);
    Task modify(Long id, Task task);
    void delete(Long id);
}
