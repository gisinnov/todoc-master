package com.cleanup.todoc.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.cleanup.todoc.model.Task;
import java.util.List;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM Task")
    Flowable<List<Task>> getAllTasks();

    @Insert
    void insert(Task task);

    @Update
    void update(Task task);

    @Delete
    void delete(Task task);
}
