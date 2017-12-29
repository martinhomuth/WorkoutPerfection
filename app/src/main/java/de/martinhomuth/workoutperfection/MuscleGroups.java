package de.martinhomuth.workoutperfection;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * This class represents a group of muscles
 */
class MuscleGroups {

    private List<String> mMuscleGroups;

    MuscleGroups(String... musclegroups)
    {
        List<String> groups = new Vector<>();
        Collections.addAll(groups, musclegroups);
        mMuscleGroups = groups;
    }

    List<String> getMuscleGroups()
    {
        return mMuscleGroups;
    }
}
