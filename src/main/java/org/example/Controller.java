package org.example;

import org.example.mapper.PatientMapper;
import org.example.pojo.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import java.util.List;

@SuppressWarnings("all")
@RestController
public class Controller {
    @Autowired
    PatientMapper patientMapper;
    private Gson gson = new Gson();
    @GetMapping("/test")
    public String test(){
        List<Patient> patients = patientMapper.selectList(null);
        return gson.toJson(patients);
    }
}
