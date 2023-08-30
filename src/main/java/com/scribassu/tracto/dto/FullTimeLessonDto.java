package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullTimeLessonDto {
    private long id;
    private String name;
    private String place;
    private DepartmentDto department;
    private StudentGroupDto studentGroup;
    private String subGroup;
    private DayDto day;
    private LessonTimeDto lessonTime;
    private TeacherDto teacher;
    private WeekType weekType;
    private LessonType lessonType;
    private Long updatedTimestamp;
    private Long beginTimestamp;
    private Long endTimestamp;
}
