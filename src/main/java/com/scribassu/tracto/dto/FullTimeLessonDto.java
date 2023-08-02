package com.scribassu.tracto.dto;

import java.util.Objects;

public class FullTimeLessonDto {
    private long id;
    private String name;
    private String place;
    private DepartmentDto department;
    private StudentGroupDto studentGroup;
    private String subGroup;
    private DayDto day;
    private LessonTimeDto lessonTime;
    private TeacherDto teacher;
    private WeekType weekType;
    private LessonType lessonType;

    public FullTimeLessonDto() {
    }

    public FullTimeLessonDto(long id, String name, String place, DepartmentDto department, StudentGroupDto studentGroup, String subGroup, DayDto day, LessonTimeDto lessonTime, TeacherDto teacher, WeekType weekType, LessonType lessonType) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.department = department;
        this.studentGroup = studentGroup;
        this.subGroup = subGroup;
        this.day = day;
        this.lessonTime = lessonTime;
        this.teacher = teacher;
        this.weekType = weekType;
        this.lessonType = lessonType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public StudentGroupDto getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroupDto studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    public DayDto getDay() {
        return day;
    }

    public void setDay(DayDto day) {
        this.day = day;
    }

    public LessonTimeDto getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(LessonTimeDto lessonTime) {
        this.lessonTime = lessonTime;
    }

    public TeacherDto getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDto teacher) {
        this.teacher = teacher;
    }

    public WeekType getWeekType() {
        return weekType;
    }

    public void setWeekType(WeekType weekType) {
        this.weekType = weekType;
    }

    public LessonType getLessonType() {
        return lessonType;
    }

    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullTimeLessonDto that = (FullTimeLessonDto) o;
        return getId() == that.getId() && getName().equals(that.getName()) && getPlace().equals(that.getPlace()) && getDepartment().equals(that.getDepartment()) && getStudentGroup().equals(that.getStudentGroup()) && getSubGroup().equals(that.getSubGroup()) && getDay().equals(that.getDay()) && getLessonTime().equals(that.getLessonTime()) && getTeacher().equals(that.getTeacher()) && getWeekType() == that.getWeekType() && getLessonType() == that.getLessonType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPlace(), getDepartment(), getStudentGroup(), getSubGroup(), getDay(), getLessonTime(), getTeacher(), getWeekType(), getLessonType());
    }

    @Override
    public String toString() {
        return "FullTimeLessonDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", department=" + department +
                ", studentGroup=" + studentGroup +
                ", subGroup='" + subGroup + '\'' +
                ", day=" + day +
                ", lessonTime=" + lessonTime +
                ", teacher=" + teacher +
                ", weekType=" + weekType +
                ", lessonType=" + lessonType +
                '}';
    }
}
