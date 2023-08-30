package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentGroupDto {
    private long id;
    private String groupNumber;
    private String groupNumberRus;
    private DepartmentDto department;
    private EducationForm educationForm;
    private GroupType groupType;
}
