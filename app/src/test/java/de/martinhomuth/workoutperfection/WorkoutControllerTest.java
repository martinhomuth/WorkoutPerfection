package de.martinhomuth.workoutperfection;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkoutControllerTest {

    @Test
    public void WorkoutController_EmptyDatabase_NextWorkoutIsEmpty() throws Exception {
        ExerciseDatabaseController database = new ExerciseDatabaseController();
        Exercise nextExercise = database.getNextExercise();
        assertEquals(nextExercise, null);
    }

}
