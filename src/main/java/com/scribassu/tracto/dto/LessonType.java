package com.scribassu.tracto.dto;

public enum LessonType {
    LECTURE("лек."),
    PRACTICE("пр."),
    LABORATORY("лаб.");

    private final String type;

    public String getType() {
        return this.type;
    }

    LessonType(String type) {
        this.type = type;
    }
}
