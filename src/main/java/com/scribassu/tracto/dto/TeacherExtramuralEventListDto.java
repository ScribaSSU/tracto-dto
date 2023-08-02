package com.scribassu.tracto.dto;

import java.util.List;
import java.util.Objects;

public class TeacherExtramuralEventListDto {

    private List<ExtramuralEventDto> extramuralEvents;
    private TeacherDto teacher;

    public TeacherExtramuralEventListDto() {
    }

    public TeacherExtramuralEventListDto(List<ExtramuralEventDto> extramuralEvents,
                                         TeacherDto teacher) {
        this.extramuralEvents = extramuralEvents;
        this.teacher = teacher;
    }

    public List<ExtramuralEventDto> getExtramuralEvents() {
        return extramuralEvents;
    }

    public void setExtramuralEvents(List<ExtramuralEventDto> extramuralEvents) {
        this.extramuralEvents = extramuralEvents;
    }

    public TeacherDto getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDto teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherExtramuralEventListDto that = (TeacherExtramuralEventListDto) o;
        return getExtramuralEvents().equals(that.getExtramuralEvents()) && getTeacher().equals(that.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExtramuralEvents(), getTeacher());
    }

    @Override
    public String toString() {
        return "TeacherExtramuralEventDto{" +
                "extramuralEvents=" + extramuralEvents +
                ", teacher=" + teacher +
                '}';
    }
}
