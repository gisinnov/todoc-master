package com.cleanup.todoc.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.cleanup.todoc.model.Project;
import java.util.List;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface ProjectDao {

    @Query("SELECT * FROM Project")
    Flowable<List<Project>> getAllProjects();

    @Insert
    void insert(Project project);

    @Update
    void update(Project project);

    @Delete
    void delete(Project project);
}
