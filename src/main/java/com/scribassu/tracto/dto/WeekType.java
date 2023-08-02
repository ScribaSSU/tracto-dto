package com.scribassu.tracto.dto;

public enum WeekType {
    NOM("чис."),
    DENOM("знам."),
    FULL("");

    private final String type;

    public String getType() {
        return type;
    }

    public static WeekType fromType(String type) {
        for (WeekType weekType : WeekType.values()) {
            if (weekType.type.equalsIgnoreCase(type)) {
                return weekType;
            }
        }
        return FULL;
    }

    WeekType(String type) {
        this.type = type;
    }
}

