package com.puce.PersonalAchievements.repositories

import com.puce.PersonalAchievements.models.entities.PersonalAchievement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonalAchievementRepository: JpaRepository<PersonalAchievement, Long> {
}




