package com.scribassu.tracto.dto;

import java.util.List;
import java.util.Objects;

public class TeacherFullTimeLessonListDto {

    private List<FullTimeLessonDto> lessons;

    private TeacherDto teacher;

    private DayDto day;

    public TeacherFullTimeLessonListDto() {
    }

    public TeacherFullTimeLessonListDto(List<FullTimeLessonDto> lessons,
                                        TeacherDto teacher) {
        this.lessons = lessons;
        this.teacher = teacher;
        this.day = new DayDto();
    }

    public TeacherFullTimeLessonListDto(List<FullTimeLessonDto> lessons,
                                        TeacherDto teacher,
                                        DayDto day) {
        this.lessons = lessons;
        this.teacher = teacher;
        this.day = day;
    }

    public List<FullTimeLessonDto> getLessons() {
        return lessons;
    }

    public void setLessons(List<FullTimeLessonDto> lessons) {
        this.lessons = lessons;
    }

    public TeacherDto getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDto teacher) {
        this.teacher = teacher;
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
        TeacherFullTimeLessonListDto that = (TeacherFullTimeLessonListDto) o;
        return getLessons().equals(that.getLessons()) && getTeacher().equals(that.getTeacher()) && getDay().equals(that.getDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLessons(), getTeacher(), getDay());
    }

    @Override
    public String toString() {
        return "TeacherFullTimeLessonDto{" +
                "lessons=" + lessons +
                ", teacher=" + teacher +
                ", day=" + day +
                '}';
    }
}
