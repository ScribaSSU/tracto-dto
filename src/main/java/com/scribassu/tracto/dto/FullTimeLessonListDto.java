package com.scribassu.tracto.dto;

import java.util.List;
import java.util.Objects;

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

    public FullTimeLessonListDto(List<FullTimeLessonDto> lessons,
                                 StudentGroupDto studentGroup,
                                 DayDto day) {
        this.lessons = lessons;
        this.studentGroup = studentGroup;
        this.day = day;
    }

    public List<FullTimeLessonDto> getLessons() {
        return lessons;
    }

    public void setLessons(List<FullTimeLessonDto> lessons) {
        this.lessons = lessons;
    }

    public StudentGroupDto getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroupDto studentGroup) {
        this.studentGroup = studentGroup;
    }

    public DayDto getDay() {
        return day;
    }

    public void setDay(DayDto day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullTimeLessonListDto that = (FullTimeLessonListDto) o;
        return getLessons().equals(that.getLessons()) && getStudentGroup().equals(that.getStudentGroup()) && getDay().equals(that.getDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLessons(), getStudentGroup(), getDay());
    }

    @Override
    public String toString() {
        return "FullTimeLessonListDto{" +
                "lessons=" + lessons +
                ", studentGroup=" + studentGroup +
                ", day=" + day +
                '}';
    }
}
