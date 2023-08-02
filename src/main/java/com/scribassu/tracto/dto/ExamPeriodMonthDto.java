package com.scribassu.tracto.dto;

import java.util.Objects;

public class ExamPeriodMonthDto {
    private int number;
    private String rusNominative;
    private String rusGenitive;
    private String eng;

    public ExamPeriodMonthDto() {
    }

    public ExamPeriodMonthDto(int number, String rusNominative, String rusGenitive, String eng) {
        this.number = number;
        this.rusNominative = rusNominative;
        this.rusGenitive = rusGenitive;
        this.eng = eng;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRusNominative() {
        return rusNominative;
    }

    public void setRusNominative(String rusNominative) {
        this.rusNominative = rusNominative;
    }

    public String getRusGenitive() {
        return rusGenitive;
    }

    public void setRusGenitive(String rusGenitive) {
        this.rusGenitive = rusGenitive;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamPeriodMonthDto that = (ExamPeriodMonthDto) o;
        return getNumber() == that.getNumber() && getRusNominative().equals(that.getRusNominative()) && getRusGenitive().equals(that.getRusGenitive()) && getEng().equals(that.getEng());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getRusNominative(), getRusGenitive(), getEng());
    }

    @Override
    public String toString() {
        return "ExamPeriodMonthDto{" +
                "number=" + number +
                ", rusNominative='" + rusNominative + '\'' +
                ", rusGenitive='" + rusGenitive + '\'' +
                ", eng='" + eng + '\'' +
                '}';
    }
}
