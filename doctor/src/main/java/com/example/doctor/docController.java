package com.example.doctor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class docController {

    @GetMapping("/getAllDoctors")
    public String getAllDoctors(){
        return "All Doctors";
    }
}
