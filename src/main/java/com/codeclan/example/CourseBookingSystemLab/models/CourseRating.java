package com.codeclan.example.CourseBookingSystemLab.models;

public enum CourseRating {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int value;

    CourseRating(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
