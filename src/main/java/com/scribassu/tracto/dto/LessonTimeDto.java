package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonTimeDto {
    private long id;
    private int lessonNumber;
    private int hourStart;
    private int minuteStart;
    private int hourEnd;
    private int minuteEnd;
}
