package com.puce.PersonalAchievements.controllers

import com.puce.PersonalAchievements.models.entities.PersonalAchievement
import com.puce.PersonalAchievements.services.PersonalAchievementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/PersonalAchievements")
class PersonalAchievementController (
    private val service: PersonalAchievementService
){
    @GetMapping
    fun findAll(): List<PersonalAchievement>{
        return service.findAll()
    }

    @PostMapping
    fun save (
        @RequestBody personalAchievement: PersonalAchievement
    ) = service.saveAchievement(personalAchievement)
}