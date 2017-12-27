package de.martinhomuth.workoutperfection;

import org.junit.Test;
import static org.junit.Assert.*;

public class MuscleGroupsTest {

    @Test
    public void Muscle_OnCreation_InformationAvailable() throws Exception {
        MuscleGroups muscle = new MuscleGroups("Quadriceps");
        assertEquals(muscle.getMusclegroups(), "Quadriceps");
    }
}
