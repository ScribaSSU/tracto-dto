package com.scribassu.tracto.dto;

import java.util.Objects;

public class ExamPeriodEventDto {
    private long id;
    private ExamPeriodEventType examPeriodEventType;
    private int day;
    private ExamPeriodMonthDto month;
    private String year;
    private int hour;
    private int minute;
    private String subjectName;
    private TeacherDto teacher;
    private StudentGroupDto studentGroup;
    private String place;

    public ExamPeriodEventDto() {
    }

    public ExamPeriodEventDto(long id, ExamPeriodEventType examPeriodEventType, int day, ExamPeriodMonthDto month, String year, int hour, int minute, String subjectName, TeacherDto teacher, StudentGroupDto studentGroup, String place) {
        this.id = id;
        this.examPeriodEventType = examPeriodEventType;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.studentGroup = studentGroup;
        this.place = place;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ExamPeriodEventType getExamPeriodEventType() {
        return examPeriodEventType;
    }

    public void setExamPeriodEventType(ExamPeriodEventType examPeriodEventType) {
        this.examPeriodEventType = examPeriodEventType;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public ExamPeriodMonthDto getMonth() {
        return month;
    }

    public void setMonth(ExamPeriodMonthDto month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public TeacherDto getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDto teacher) {
        this.teacher = teacher;
    }

    public StudentGroupDto getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroupDto studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamPeriodEventDto that = (ExamPeriodEventDto) o;
        return getId() == that.getId() && getDay() == that.getDay() && getHour() == that.getHour() && getMinute() == that.getMinute() && getExamPeriodEventType() == that.getExamPeriodEventType() && getMonth().equals(that.getMonth()) && getYear().equals(that.getYear()) && getSubjectName().equals(that.getSubjectName()) && getTeacher().equals(that.getTeacher()) && getStudentGroup().equals(that.getStudentGroup()) && getPlace().equals(that.getPlace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getExamPeriodEventType(), getDay(), getMonth(), getYear(), getHour(), getMinute(), getSubjectName(), getTeacher(), getStudentGroup(), getPlace());
    }

    @Override
    public String toString() {
        return "ExamPeriodEventDto{" +
                "id=" + id +
                ", examPeriodEventType=" + examPeriodEventType +
                ", day=" + day +
                ", month=" + month +
                ", year='" + year + '\'' +
                ", hour=" + hour +
                ", minute=" + minute +
                ", subjectName='" + subjectName + '\'' +
                ", teacher=" + teacher +
                ", studentGroup=" + studentGroup +
                ", place='" + place + '\'' +
                '}';
    }
}
