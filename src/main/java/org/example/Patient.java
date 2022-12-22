package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
    private long id;
    private String name;
    private int age;
    private String disease;
}
