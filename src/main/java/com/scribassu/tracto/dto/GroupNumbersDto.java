package com.scribassu.tracto.dto;

import java.util.List;
import java.util.Objects;

public class GroupNumbersDto {

    private List<String> groupNumbers;

    private String departmentUrl;

    private String educationForm;

    public GroupNumbersDto() {
    }

    public GroupNumbersDto(List<String> groupNumbers,
                           String departmentUrl,
                           String educationForm) {
        this.groupNumbers = groupNumbers;
        this.departmentUrl = departmentUrl;
        this.educationForm = educationForm;
    }

    public List<String> getGroupNumbers() {
        return groupNumbers;
    }

    public void setGroupNumbers(List<String> groupNumbers) {
        this.groupNumbers = groupNumbers;
    }

    public String getDepartmentUrl() {
        return departmentUrl;
    }

    public void setDepartmentUrl(String departmentUrl) {
        this.departmentUrl = departmentUrl;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupNumbersDto that = (GroupNumbersDto) o;
        return getGroupNumbers().equals(that.getGroupNumbers()) && getDepartmentUrl().equals(that.getDepartmentUrl()) && getEducationForm().equals(that.getEducationForm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGroupNumbers(), getDepartmentUrl(), getEducationForm());
    }

    @Override
    public String toString() {
        return "GroupNumbersDto{" +
                "groupNumbers=" + groupNumbers +
                ", departmentUrl='" + departmentUrl + '\'' +
                ", educationForm='" + educationForm + '\'' +
                '}';
    }
}
