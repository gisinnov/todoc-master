package com.cleanup.todoc.viewmodel;

import androidx.lifecycle.ViewModel;
import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.repository.ProjectRepository;
import java.util.List;
import io.reactivex.rxjava3.core.Flowable;

public class ProjectViewModel extends ViewModel {

    private final ProjectRepository projectRepository;

    public ProjectViewModel(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Flowable<List<Project>> getAllProjects() {
        return projectRepository.getAllProjects();
    }

    public void insertProject(Project project) {
        projectRepository.insertProject(project);
    }

    public void updateProject(Project project) {
        projectRepository.updateProject(project);
    }

    public void deleteProject(Project project) {
        projectRepository.deleteProject(project);
    }
}
