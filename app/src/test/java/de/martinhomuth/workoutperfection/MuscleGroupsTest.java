package de.martinhomuth.workoutperfection;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class MuscleGroupsTest {

    @Test
    public void Muscle_OnCreation_InformationAvailable() throws Exception {
        Vector<String> expected = new Vector<>();
        expected.add("Quadriceps");
        MuscleGroups muscle = new MuscleGroups("Quadriceps");
        assertEquals(muscle.getMuscleGroups(), expected);
    }
}
