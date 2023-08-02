package com.scribassu.tracto.dto;

public enum ExamPeriodEventType {
    MIDTERM("Зачет"),
    MIDTERM_WITH_MARK("Дифференцированный зачет"),
    EXAM("Экзамен"),
    CONSULTATION("Консультация");

    private final String type;

    public String getType() {
        return this.type;
    }

    ExamPeriodEventType(String type) {
        this.type = type;
    }
}
