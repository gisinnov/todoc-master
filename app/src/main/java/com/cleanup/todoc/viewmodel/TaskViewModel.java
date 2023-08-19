package com.cleanup.todoc.viewmodel;

import androidx.lifecycle.ViewModel;
import com.cleanup.todoc.model.Task;
import com.cleanup.todoc.repository.TaskRepository;
import java.util.List;
import io.reactivex.rxjava3.core.Flowable;

public class TaskViewModel extends ViewModel {

    private final TaskRepository taskRepository;

    public TaskViewModel(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Flowable<List<Task>> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    public void insertTask(Task task) {
        taskRepository.insertTask(task);
    }

    public void updateTask(Task task) {
        taskRepository.updateTask(task);
    }

    public void deleteTask(Task task) {
        taskRepository.deleteTask(task);
    }
}
