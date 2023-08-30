package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamPeriodMonthDto {
    private int number;
    private String rusNominative;
    private String rusGenitive;
    private String eng;
}
