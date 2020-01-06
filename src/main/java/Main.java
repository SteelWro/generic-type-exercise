import enums.Area;
import enums.Language;
import enums.Priority;
import model.Exercise;
import model.LanguageExercise;
import model.MathExercise;

public class Main {
    public static void main(String[] args) {
        ExerciseManager exerciseManager = new ExerciseManager();

        Exercise exerciseOne = new LanguageExercise("1a","skończ dialog", Language.ENGLISH);
        Exercise exerciseTwo = new LanguageExercise("1b","wypelnij luki", Language.FRENCH);
        Exercise exerciseThree = new LanguageExercise("1f","dokończ słowa", Language.POLISH);
        Exercise exerciseFour = new LanguageExercise("2a","naucz się słówek", Language.ENGLISH);

        Exercise exerciseFive = new MathExercise("2a","rozwiąż równianie", Area.TRIGONOMETRY);
        Exercise exerciseSix = new MathExercise("3g","rozwiąż działanie",Area.ALGEBRA);


        exerciseManager.addExercise(exerciseOne, Priority.SIX);
        exerciseManager.addExercise(exerciseTwo, Priority.TWO);
        exerciseManager.addExercise(exerciseThree, Priority.THREE);
        exerciseManager.addExercise(exerciseFour, Priority.ONE);
        exerciseManager.addExercise(exerciseFive, Priority.FIVE);
        exerciseManager.addExercise(exerciseSix, Priority.SEVEN);

        System.out.println(exerciseManager.getExercise().toString());

    }
}
