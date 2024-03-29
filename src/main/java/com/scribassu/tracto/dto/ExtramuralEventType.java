package com.scribassu.tracto.dto;

public enum ExtramuralEventType {
    LECTURE("лек."),
    PRACTICE("пр."),
    LABORATORY("лаб."),

    MIDTERM("Зачет"),
    MIDTERM_WITH_MARK("Дифференцированный зачет"),
    EXAM("Экзамен"),
    CONSULTATION("Консультация");

    private final String type;

    public String getType() {
        return type;
    }

    ExtramuralEventType(String type) {
        this.type = type;
    }

    public static ExtramuralEventType getExtramuralEventType(String type) {
        switch (type) {
            case "Лекция":
                return LECTURE;
            case "Практика":
                return PRACTICE;
            case "Лабораторная":
                return LABORATORY;
            case "Зачет":
                return MIDTERM;
            case "Дифференцированный зачет":
                return MIDTERM_WITH_MARK;
            case "Экзамен":
                return EXAM;
            case "Консультация":
                return CONSULTATION;
            default:
                throw new IllegalArgumentException("ExtramuralEventType does not contain value " + type);
        }
    }
}
