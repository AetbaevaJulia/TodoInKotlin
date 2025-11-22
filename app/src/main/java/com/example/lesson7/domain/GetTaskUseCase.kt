package com.example.lesson7.domain

import com.example.lesson7.data.model.TaskEntity

interface GetTaskUseCase {
    suspend operator fun invoke():
            List<TaskEntity>
}