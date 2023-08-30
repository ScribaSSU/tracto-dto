package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherFullTimeLessonListDto {
    private List<FullTimeLessonDto> lessons;
    private TeacherDto teacher;
    private DayDto day;

    public TeacherFullTimeLessonListDto(List<FullTimeLessonDto> lessons,
                                        TeacherDto teacher) {
        this.lessons = lessons;
        this.teacher = teacher;
        this.day = new DayDto();
    }
}
