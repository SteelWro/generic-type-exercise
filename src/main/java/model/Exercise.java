package model;

import enums.Priority;

public class Exercise {
    private String number;
    private String content;
    private Priority priority;

    public Exercise(String number, String content) {
        this.number = number;
        this.content = content;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "number='" + number + '\'' +
                ", content='" + content + '\'' +
                ", priority=" + priority +
                '}';
    }
}
