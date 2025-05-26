package com.puce.PersonalAchievements.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class PersonalAchievement(
    @Id @GeneratedValue(strategy = IDENTITY)
    val id: Long = 0,
    val title: String = "",
    val description: String = "",
    val category: String = "",
    val date: LocalDate = LocalDate.now(),

    @Column(name = "student_name")
    val studentName: String = ""
)