package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private long id;
    private String surname;
    private String name;
    private String patronymic;
}
