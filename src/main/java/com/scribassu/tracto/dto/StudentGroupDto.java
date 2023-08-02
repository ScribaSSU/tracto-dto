package com.scribassu.tracto.dto;

import java.util.Objects;

public class StudentGroupDto {
    private long id;
    private String groupNumber;
    private String groupNumberRus;
    private DepartmentDto department;
    private EducationForm educationForm;
    private GroupType groupType;

    public StudentGroupDto() {
    }

    public StudentGroupDto(long id, String groupNumber, String groupNumberRus, DepartmentDto department, EducationForm educationForm, GroupType groupType) {
        this.id = id;
        this.groupNumber = groupNumber;
        this.groupNumberRus = groupNumberRus;
        this.department = department;
        this.educationForm = educationForm;
        this.groupType = groupType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupNumberRus() {
        return groupNumberRus;
    }

    public void setGroupNumberRus(String groupNumberRus) {
        this.groupNumberRus = groupNumberRus;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public EducationForm getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(EducationForm educationForm) {
        this.educationForm = educationForm;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGroupDto that = (StudentGroupDto) o;
        return getId() == that.getId() && getGroupNumber().equals(that.getGroupNumber()) && getGroupNumberRus().equals(that.getGroupNumberRus()) && getDepartment().equals(that.getDepartment()) && getEducationForm() == that.getEducationForm() && getGroupType().equals(that.getGroupType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGroupNumber(), getGroupNumberRus(), getDepartment(), getEducationForm(), getGroupType());
    }

    @Override
    public String toString() {
        return "StudentGroupDto{" +
                "id=" + id +
                ", groupNumber='" + groupNumber + '\'' +
                ", groupNumberRus='" + groupNumberRus + '\'' +
                ", department=" + department +
                ", educationForm=" + educationForm +
                ", groupType='" + groupType + '\'' +
                '}';
    }
}
