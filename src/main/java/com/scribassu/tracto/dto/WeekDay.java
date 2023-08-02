package com.scribassu.tracto.dto;

public enum WeekDay {
    MONDAY("пн."),
    TUESDAY("вт."),
    WEDNESDAY("ср."),
    THURSDAY("чт."),
    FRIDAY("пт."),
    SATURDAY("сб."),
    SUNDAY("вс.");

    private final String day;

    public String getDay() {
        return day;
    }

    public static WeekDay fromDay(String day) {
        for (WeekDay wd : WeekDay.values()) {
            if (wd.day.equalsIgnoreCase(day)) {
                return wd;
            }
        }
        return MONDAY;
    }

    WeekDay(String day) {
        this.day = day;
    }
}
