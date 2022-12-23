package org.example;

import org.example.mapper.PatientMapper;
import org.example.pojo.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import javax.swing.*;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    PatientMapper patientMapper;
    private Gson gson = new Gson();
    @GetMapping("/test")
    public String test(){
        // transform data to Json format
        List<Patient> patients = patientMapper.selectList(null);
        return gson.toJson(patients);
    }

    //delete data
    @GetMapping("/delete")
    public void deletePatient(){
        String patient = "{\"id\":10,\"name\":\"Chloe\",\"age\":22,\"disease\":\"color blindness\",\"doctor\":\"Daniel\"}";
        // transform Json format to data
        Patient patient_delete = gson.fromJson(patient, Patient.class);
        patientMapper.deleteById(patient_delete);
    }

    //insert data
    @GetMapping("/insert")
    public void insertPatient(){
        String patient = "{\"id\":10,\"name\":\"Claire\",\"age\":22,\"disease\":\"color blindness\",\"doctor\":\"Daniel\"}";
        // transform Json format to data
        Patient patient_insert = gson.fromJson(patient, Patient.class);
        patientMapper.insert(patient_insert);
    }

    //update data
    @GetMapping("/update")
    public void updatePatient(){
        String patient = "{\"id\":10,\"name\":\"Sara\",\"age\":22,\"disease\":\"color blindness\",\"doctor\":\"Daniel\"}";
        // transform Json format to data
        Patient patient_update = gson.fromJson(patient, Patient.class);
        patientMapper.updateById(patient_update);
    }
}
