package com.scribassu.tracto.dto;

import java.util.Objects;

public class DayDto {
    private long id;
    private int dayNumber;
    private WeekDay weekDay;

    public DayDto() {
    }

    public DayDto(long id, int dayNumber, WeekDay weekDay) {
        this.id = id;
        this.dayNumber = dayNumber;
        this.weekDay = weekDay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayDto dayDto = (DayDto) o;
        return getId() == dayDto.getId() && getDayNumber() == dayDto.getDayNumber() && getWeekDay() == dayDto.getWeekDay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDayNumber(), getWeekDay());
    }

    @Override
    public String toString() {
        return "DayDto{" +
                "id=" + id +
                ", dayNumber=" + dayNumber +
                ", weekDay=" + weekDay +
                '}';
    }
}
