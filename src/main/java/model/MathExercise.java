package model;

import enums.Area;

public class MathExercise extends Exercise {
    private Area area;
    public MathExercise(String number, String content, Area area) {
        super(number, content);
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String toString(String number, String content) {
        return "MathExercise{ " +
                getNumber() +
                " " + getContent() +
                "area=" + area +
                '}';
    }
}
