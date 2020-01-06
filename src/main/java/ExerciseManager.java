import enums.Priority;
import model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ExerciseManager<T extends Exercise> {
    List<T> exercises = new ArrayList<>();

    public void addExercise(T exercise, Priority priority){
        exercise.setPriority(priority);
        exercises.add(exercise);
    }

    public T getExercise() {
        return exercises.stream().filter(e -> e.getPriority().equals(Priority.SEVEN)).findFirst().get();
    }
}
