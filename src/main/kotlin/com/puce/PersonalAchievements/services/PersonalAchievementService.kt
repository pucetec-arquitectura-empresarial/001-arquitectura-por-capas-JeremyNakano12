package com.puce.PersonalAchievements.services

import com.puce.PersonalAchievements.models.entities.PersonalAchievement
import com.puce.PersonalAchievements.repositories.PersonalAchievementRepository
import org.springframework.stereotype.Service

@Service
class PersonalAchievementService (
    private val repository: PersonalAchievementRepository
){
    fun findAll(): List<PersonalAchievement>{
        return repository.findAll()
    }

    fun saveAchievement(achievement: PersonalAchievement): PersonalAchievement{
        return repository.save(achievement)
    }
}