package com.scribassu.tracto.dto;

import java.util.List;
import java.util.Objects;

public class ExtramuralEventListDto {
    private List<ExtramuralEventDto> extramuralEvents;
    private StudentGroupDto studentGroup;

    public ExtramuralEventListDto(List<ExtramuralEventDto> extramuralEvents,
                                  StudentGroupDto studentGroup) {
        this.extramuralEvents = extramuralEvents;
        this.studentGroup = studentGroup;
    }

    public List<ExtramuralEventDto> getExtramuralEvents() {
        return extramuralEvents;
    }

    public void setExtramuralEvents(List<ExtramuralEventDto> extramuralEvents) {
        this.extramuralEvents = extramuralEvents;
    }

    public StudentGroupDto getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroupDto studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtramuralEventListDto that = (ExtramuralEventListDto) o;
        return getExtramuralEvents().equals(that.getExtramuralEvents()) && getStudentGroup().equals(that.getStudentGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExtramuralEvents(), getStudentGroup());
    }

    @Override
    public String toString() {
        return "ExtramuralEventListDto{" +
                "extramuralEvents=" + extramuralEvents +
                ", studentGroup=" + studentGroup +
                '}';
    }
}
