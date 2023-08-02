package com.scribassu.tracto.dto;

public enum EducationForm {
    DO("Дневная"),
    ZO("Заочная"),
    VO("Вечерняя");

    private final String type;

    public String getGroupType() {
        return type;
    }

    public static EducationForm fromGroupType(String type) {
        for (EducationForm ef : EducationForm.values()) {
            if (ef.type.equalsIgnoreCase(type)) {
                return ef;
            }
        }
        return DO;
    }

    EducationForm(String type) {
        this.type = type;
    }
}
