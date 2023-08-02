package com.scribassu.tracto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DepartmentsListDto {
    private List<DepartmentDto> departmentsList;

    public DepartmentsListDto() {
        this.departmentsList = new ArrayList<>();
    }

    public DepartmentsListDto(List<DepartmentDto> departmentsList) {
        this.departmentsList = departmentsList;
    }

    public List<DepartmentDto> getDepartmentsList() {
        return departmentsList;
    }

    public void setDepartmentsList(List<DepartmentDto> departmentsList) {
        this.departmentsList = departmentsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentsListDto that = (DepartmentsListDto) o;
        return getDepartmentsList().equals(that.getDepartmentsList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentsList());
    }

    @Override
    public String toString() {
        return "DepartmentsListDto{" +
                "departmentsList=" + departmentsList +
                '}';
    }
}
