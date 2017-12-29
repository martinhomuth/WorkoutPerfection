package de.martinhomuth.workoutperfection;

/**
 * This class represents a single exercise.
 */

class Exercise {

    /**
     * Name of the exercise itself
     */
    private String mName;

    /**
     * brief Every exercise targets 1..n musclegroups
     */
    private MuscleGroups mMuscleGroups;

    Exercise(String name, MuscleGroups musclegroups) {
        mName = name;
        mMuscleGroups = musclegroups;
    }

    String getName() {
        return mName;
    }

    MuscleGroups getMuscleGroups() {
        return mMuscleGroups;
    }

    String getCategory() {
        return "Legs";
    }
}

