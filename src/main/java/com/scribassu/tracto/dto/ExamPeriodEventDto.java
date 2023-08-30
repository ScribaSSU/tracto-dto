package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamPeriodEventDto {
    private long id;
    private ExamPeriodEventType examPeriodEventType;
    private int day;
    private ExamPeriodMonthDto month;
    private String year;
    private int hour;
    private int minute;
    private String subjectName;
    private TeacherDto teacher;
    private StudentGroupDto studentGroup;
    private String place;
}
