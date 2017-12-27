package de.martinhomuth.workoutperfection;

import de.martinhomuth.workoutperfection.MuscleGroups;

/**
 * @brief This class represents a single exercise.
 */

public class Exercise {

    public Exercise(String name, String category, MuscleGroups musclegroup) {
        this.name = name;
        this.category = category;
        this.musclegroup = musclegroup;
    }

    /**
     * @brief Name of the exercise itself
     */
    private String name;

    private String category;

    private MuscleGroups musclegroup;


    public String getName()
    {
        return this.name;
    }

    public String getCategory()
    {
        return this.category;
    }

    public MuscleGroups getMusclegroup()
    {
        return this.musclegroup;

    }
}
