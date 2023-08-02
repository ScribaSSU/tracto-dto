package com.scribassu.tracto.dto;

import java.util.Objects;

public class LessonTimeDto {
    private long id;
    private int lessonNumber;
    private int hourStart;
    private int minuteStart;
    private int hourEnd;
    private int minuteEnd;

    public LessonTimeDto() {
    }

    public LessonTimeDto(long id, int lessonNumber, int hourStart, int minuteStart, int hourEnd, int minuteEnd) {
        this.id = id;
        this.lessonNumber = lessonNumber;
        this.hourStart = hourStart;
        this.minuteStart = minuteStart;
        this.hourEnd = hourEnd;
        this.minuteEnd = minuteEnd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public int getHourStart() {
        return hourStart;
    }

    public void setHourStart(int hourStart) {
        this.hourStart = hourStart;
    }

    public int getMinuteStart() {
        return minuteStart;
    }

    public void setMinuteStart(int minuteStart) {
        this.minuteStart = minuteStart;
    }

    public int getHourEnd() {
        return hourEnd;
    }

    public void setHourEnd(int hourEnd) {
        this.hourEnd = hourEnd;
    }

    public int getMinuteEnd() {
        return minuteEnd;
    }

    public void setMinuteEnd(int minuteEnd) {
        this.minuteEnd = minuteEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonTimeDto that = (LessonTimeDto) o;
        return getLessonNumber() == that.getLessonNumber() && getHourStart() == that.getHourStart() && getMinuteStart() == that.getMinuteStart() && getHourEnd() == that.getHourEnd() && getMinuteEnd() == that.getMinuteEnd() && getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLessonNumber(), getHourStart(), getMinuteStart(), getHourEnd(), getMinuteEnd());
    }

    @Override
    public String toString() {
        return "LessonTimeDto{" +
                "id=" + id +
                ", lessonNumber=" + lessonNumber +
                ", hourStart=" + hourStart +
                ", minuteStart=" + minuteStart +
                ", hourEnd=" + hourEnd +
                ", minuteEnd=" + minuteEnd +
                '}';
    }
}
