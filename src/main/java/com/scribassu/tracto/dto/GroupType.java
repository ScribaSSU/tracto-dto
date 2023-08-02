package com.scribassu.tracto.dto;

public enum GroupType {
    SPECIALTY("Специалитет"),
    BACHELOR("Бакалавриат"),
    MASTER("Магистратура"),
    GRADUATE_SCHOOL("Аспирантура"),
    COLLEGE("Колледж");

    private String type;

    public String getType() {
        return type;
    }

    GroupType(String type) {
        this.type = type;
    }
}