package com.cleanup.todoc.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.cleanup.todoc.dao.ProjectDao;
import com.cleanup.todoc.dao.TaskDao;
import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

@Database(entities = {Task.class, Project.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract TaskDao taskDao();

    public abstract ProjectDao projectDao();
}
