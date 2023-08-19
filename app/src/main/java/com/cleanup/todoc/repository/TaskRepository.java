package com.cleanup.todoc.repository;

import com.cleanup.todoc.dao.TaskDao;
import com.cleanup.todoc.model.Task;
import java.util.List;
import io.reactivex.rxjava3.core.Flowable;

public class TaskRepository {

    private final TaskDao taskDao;

    public TaskRepository(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public Flowable<List<Task>> getAllTasks() {
        return taskDao.getAllTasks();
    }

    public void insertTask(Task task) {
        taskDao.insert(task);
    }

    public void updateTask(Task task) {
        taskDao.update(task);
    }

    public void deleteTask(Task task) {
        taskDao.delete(task);
    }
}
