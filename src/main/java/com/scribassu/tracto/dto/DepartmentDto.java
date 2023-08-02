package com.scribassu.tracto.dto;

import java.util.Objects;

public class DepartmentDto {
    private long id;
    private String fullName;
    private String shortName;
    private String url;

    public DepartmentDto() {
    }

    public DepartmentDto(long id, String fullName, String shortName, String url) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentDto that = (DepartmentDto) o;
        return getId() == that.getId() && getFullName().equals(that.getFullName()) && getShortName().equals(that.getShortName()) && getUrl().equals(that.getUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFullName(), getShortName(), getUrl());
    }

    @Override
    public String toString() {
        return "DepartmentDto{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
