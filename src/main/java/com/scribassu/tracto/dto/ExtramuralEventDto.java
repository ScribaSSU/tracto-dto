package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtramuralEventDto {
    private long id;
    private ExamPeriodMonthDto month;
    private int day;
    private String year;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;
    private DepartmentDto department;
    private StudentGroupDto studentGroup;
    private ExtramuralEventType eventType;
    private String name;
    private String place;
    private String teacher;
}
