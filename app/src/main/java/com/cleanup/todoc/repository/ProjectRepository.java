package com.cleanup.todoc.repository;

import com.cleanup.todoc.dao.ProjectDao;
import com.cleanup.todoc.model.Project;
import java.util.List;
import io.reactivex.rxjava3.core.Flowable;

public class ProjectRepository {

    private final ProjectDao projectDao;

    public ProjectRepository(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    public Flowable<List<Project>> getAllProjects() {
        return projectDao.getAllProjects();
    }

    public void insertProject(Project project) {
        projectDao.insert(project);
    }

    public void updateProject(Project project) {
        projectDao.update(project);
    }

    public void deleteProject(Project project) {
        projectDao.delete(project);
    }
}
