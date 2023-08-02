package com.scribassu.tracto.dto;

import java.util.List;
import java.util.Objects;

public class ExamPeriodEventListDto {

    private List<ExamPeriodEventDto> examPeriodEvents;

    private StudentGroupDto studentGroup;

    public ExamPeriodEventListDto() {
    }

    public ExamPeriodEventListDto(List<ExamPeriodEventDto> examPeriodEvents,
                                  StudentGroupDto studentGroup) {
        this.examPeriodEvents = examPeriodEvents;
        this.studentGroup = studentGroup;
    }

    public List<ExamPeriodEventDto> getExamPeriodEvents() {
        return examPeriodEvents;
    }

    public void setExamPeriodEvents(List<ExamPeriodEventDto> examPeriodEvents) {
        this.examPeriodEvents = examPeriodEvents;
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
        ExamPeriodEventListDto that = (ExamPeriodEventListDto) o;
        return getExamPeriodEvents().equals(that.getExamPeriodEvents()) && getStudentGroup().equals(that.getStudentGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExamPeriodEvents(), getStudentGroup());
    }

    @Override
    public String toString() {
        return "ExamPeriodEventListDto{" +
                "examPeriodEvents=" + examPeriodEvents +
                ", studentGroup=" + studentGroup +
                '}';
    }
}
