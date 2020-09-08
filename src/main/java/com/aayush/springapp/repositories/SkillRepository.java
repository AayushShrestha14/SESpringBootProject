/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aayush.springapp.repositories;

import com.aayush.springapp.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dell
 */
@Repository(value = "SkillRepository")
public interface SkillRepository extends JpaRepository<Skill, Long>{
    @Query(nativeQuery = true,value = "select count(1) as total from skills",countName = "total")
    int countSkill();
}
