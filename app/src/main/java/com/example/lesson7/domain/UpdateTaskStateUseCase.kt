package com.example.lesson7.domain

import com.example.lesson7.data.model.TaskEntity
import com.example.lesson7.data.model.TaskState

interface UpdateTaskStateUseCase {
    suspend operator fun invoke(
        task : TaskEntity,
        taskState : TaskState
    )
}