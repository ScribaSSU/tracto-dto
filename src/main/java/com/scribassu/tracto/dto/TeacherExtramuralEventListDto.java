package com.scribassu.tracto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherExtramuralEventListDto {
    private List<ExtramuralEventDto> extramuralEvents;
    private TeacherDto teacher;
}
