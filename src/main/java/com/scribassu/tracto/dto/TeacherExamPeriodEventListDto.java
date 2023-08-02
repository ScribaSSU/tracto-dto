package com.scribassu.tracto.dto;

import java.util.List;
import java.util.Objects;

public class TeacherExamPeriodEventListDto {

    private List<ExamPeriodEventDto> examPeriodEvents;

    private TeacherDto teacher;

    public TeacherExamPeriodEventListDto() {
    }

    public TeacherExamPeriodEventListDto(List<ExamPeriodEventDto> examPeriodEvents,
                                         TeacherDto teacher) {
        this.examPeriodEvents = examPeriodEvents;
        this.teacher = teacher;
    }

    public List<ExamPeriodEventDto> getExamPeriodEvents() {
        return examPeriodEvents;
    }

    public void setExamPeriodEvents(List<ExamPeriodEventDto> examPeriodEvents) {
        this.examPeriodEvents = examPeriodEvents;
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
        TeacherExamPeriodEventListDto that = (TeacherExamPeriodEventListDto) o;
        return getExamPeriodEvents().equals(that.getExamPeriodEvents()) && getTeacher().equals(that.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExamPeriodEvents(), getTeacher());
    }

    @Override
    public String toString() {
        return "TeacherExamPeriodEventDto{" +
                "examPeriodEvents=" + examPeriodEvents +
                ", teacher=" + teacher +
                '}';
    }
}
