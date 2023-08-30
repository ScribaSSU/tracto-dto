package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private long id;
    private String fullName;
    private String shortName;
    private String url;
    private boolean weekShift;
}
