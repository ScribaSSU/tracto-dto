package com.scribassu.tracto.dto;

import java.util.Objects;

public class TeacherDto {
    private long id;
    private String surname;
    private String name;
    private String patronymic;

    public TeacherDto() {
    }

    public TeacherDto(long id, String surname, String name, String patronymic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherDto that = (TeacherDto) o;
        return getId() == that.getId() && getSurname().equals(that.getSurname()) && getName().equals(that.getName()) && getPatronymic().equals(that.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSurname(), getName(), getPatronymic());
    }

    @Override
    public String toString() {
        return "TeacherDto{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
