package com.scribassu.tracto.dto;

import java.util.Objects;

public class ExtramuralEventDto {
    private long id;
    private ExamPeriodMonthDto month;
    private int day;
    private String year;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;
    private DepartmentDto department;
    private StudentGroupDto studentGroup;
    private ExtramuralEventType eventType;
    private String name;
    private String place;
    private String teacher;

    public ExtramuralEventDto() {
    }

    public ExtramuralEventDto(long id, ExamPeriodMonthDto month, int day, String year, int startHour, int startMinute, int endHour, int endMinute, DepartmentDto department, StudentGroupDto studentGroup, ExtramuralEventType eventType, String name, String place, String teacher) {
        this.id = id;
        this.month = month;
        this.day = day;
        this.year = year;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
        this.department = department;
        this.studentGroup = studentGroup;
        this.eventType = eventType;
        this.name = name;
        this.place = place;
        this.teacher = teacher;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ExamPeriodMonthDto getMonth() {
        return month;
    }

    public void setMonth(ExamPeriodMonthDto month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
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

    public ExtramuralEventType getEventType() {
        return eventType;
    }

    public void setEventType(ExtramuralEventType eventType) {
        this.eventType = eventType;
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtramuralEventDto that = (ExtramuralEventDto) o;
        return getDay() == that.getDay() && getStartHour() == that.getStartHour() && getStartMinute() == that.getStartMinute() && getEndHour() == that.getEndHour() && getEndMinute() == that.getEndMinute() && getId() == that.getId() && getMonth().equals(that.getMonth()) && getYear().equals(that.getYear()) && getDepartment().equals(that.getDepartment()) && getStudentGroup().equals(that.getStudentGroup()) && getEventType() == that.getEventType() && getName().equals(that.getName()) && getPlace().equals(that.getPlace()) && getTeacher().equals(that.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMonth(), getDay(), getYear(), getStartHour(), getStartMinute(), getEndHour(), getEndMinute(), getDepartment(), getStudentGroup(), getEventType(), getName(), getPlace(), getTeacher());
    }

    @Override
    public String toString() {
        return "ExtramuralEventDto{" +
                "id=" + id +
                ", month=" + month +
                ", day=" + day +
                ", year='" + year + '\'' +
                ", startHour=" + startHour +
                ", startMinute=" + startMinute +
                ", endHour=" + endHour +
                ", endMinute=" + endMinute +
                ", department=" + department +
                ", studentGroup=" + studentGroup +
                ", eventType=" + eventType +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
