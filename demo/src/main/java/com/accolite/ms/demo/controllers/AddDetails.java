package com.accolite.ms.demo.controllers;

import com.accolite.ms.demo.model.OnboardeeEnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200") //for angular

public class AddDetails {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/addOnboardeeDetails")
    public int addOnboardeeDetails(@RequestBody OnboardeeEnt onboardeeEnt) {
        String sqlQuery = "INSERT INTO board_details(age, company, location, emailID) VALUES(?, ?, ?, ?)";
        return jdbcTemplate.update(sqlQuery, onboardeeEnt.getAge(), onboardeeEnt.getCompany(), onboardeeEnt.getLocation(), onboardeeEnt.getEmailID());
        }
        
}   