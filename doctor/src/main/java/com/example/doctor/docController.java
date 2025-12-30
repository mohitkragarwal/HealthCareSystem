package com.example.doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class docController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/getAllDoctors")
    public String getAllDoctors(){
        return "All Doctors";
    }

    @GetMapping("/getAllPatientsFromPatientService")
    public String getAllPatientsFromPatientService(){
        System.out.println("Inside getAllPatientsFromPatientService");
        String patientUrl= "http://patient-sevice:8080/getAllPatient";
        return restTemplate.getForObject(patientUrl, String.class);
    }
}
