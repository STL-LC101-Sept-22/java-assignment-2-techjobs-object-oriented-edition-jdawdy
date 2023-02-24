package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.naming.Name;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){

        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(),job2.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields(){

        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product Tester", job1.getName());
        assertTrue(job1 instanceof Job);

        assertEquals("ACME", job1.getEmployer().getValue());
        assertTrue(job1.getEmployer() instanceof Employer);

        assertEquals("Desert", job1.getLocation().getValue());
        assertTrue(job1.getLocation() instanceof Location);

        assertEquals("Quality Control", job1.getPositionType().getValue());
        assertTrue(job1.getPositionType() instanceof PositionType);

        assertEquals("Persistence", job1.getCoreCompetency().getValue());
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testEqualsMethod(){

        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job1.getId() != job2.getId());

    }
    @Test
    public void testToStringMethodStartsEndsWithNewLine(){

        String test1 = "\nID: 5\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n";
        String result1 = Character.toString(test1.charAt(0));
        String result2 = Character.toString(test1.charAt(test1.length() -1));
        assertEquals("\n", result1);
        assertEquals("\n", result2);

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){

        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String test1 = "\nID: 1\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n";
        assertEquals(test1, job1.toString());

    }
    @Test
    public void testToStringHandlesEmptyField(){

        Job job1 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String test1 = "\nID: 1\nName: Data not available\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n";
        assertEquals(test1, job1.toString());

    }
}
