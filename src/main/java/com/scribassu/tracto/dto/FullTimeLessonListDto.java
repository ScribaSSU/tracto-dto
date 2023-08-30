package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullTimeLessonListDto {
    private List<FullTimeLessonDto> lessons;
    private StudentGroupDto studentGroup;
    private DayDto day;

    public FullTimeLessonListDto(List<FullTimeLessonDto> lessons,
                                 StudentGroupDto studentGroup) {
        this.lessons = lessons;
        this.studentGroup = studentGroup;
        this.day = new DayDto();
    }
}
