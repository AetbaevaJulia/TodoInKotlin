package com.example.lesson7.data.db

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.lesson7.data.model.TaskEntity

@Dao
interface TasksDAO {

    @Upsert
    suspend fun upsertTask(taskEntity: TaskEntity)

    @Query("SELECT * FROM ${TaskEntity.TABLE} ORDER BY endTime ASC")
    suspend fun getAllTasks() : List<TaskEntity>
}