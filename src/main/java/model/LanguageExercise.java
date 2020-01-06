package model;

import enums.Language;

public class LanguageExercise extends Exercise {
    private Language language;

    public LanguageExercise(String number, String content, Language language) {
        super(number, content);
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "LanguageExercise{ " +
                getNumber() +
                " " + getContent() +
                "language=" + language +
                '}';
    }
}
