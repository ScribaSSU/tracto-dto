package com.scribassu.tracto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TeacherListDto {

    private List<TeacherDto> teachers;

    public TeacherListDto() {
        this.teachers = new ArrayList<>();
    }

    public TeacherListDto(List<TeacherDto> teachers) {
        this.teachers = teachers;
    }

    public List<TeacherDto> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherDto> teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherListDto that = (TeacherListDto) o;
        return getTeachers().equals(that.getTeachers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeachers());
    }

    @Override
    public String toString() {
        return "TeacherListDto{" +
                "teachers=" + teachers +
                '}';
    }
}
