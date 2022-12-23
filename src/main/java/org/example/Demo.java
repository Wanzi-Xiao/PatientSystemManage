package org.example;

import com.google.gson.Gson;
import java.util.List;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // from Java to JSON through Gson
        Gson gson = new Gson();

        // from Java to list through Gson
        List<Patient> patientList = new ArrayList<Patient>();

        // toString method to print the created object
        Patient patient = new Patient( 10,  "dave", 18,  "heart attack", "Dacy", 17);
        patientList.add(patient);

        System.out.println(gson.toJson(patientList));
    }
}
