package com.example.patient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/getAllPatient")
    public String getAllPatient(){
        return "All Patient";
    }
}
