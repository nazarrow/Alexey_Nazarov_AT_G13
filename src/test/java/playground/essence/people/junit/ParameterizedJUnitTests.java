package playground.essence.people.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import playground.essence.people.AutomatedEngineer;
import playground.essence.people.Engineer;
import playground.essence.people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedJUnitTests {

    private final Engineer engineer;
    private final int expAge;
    private final int expSkill;
    private final int expExperience;

    public ParameterizedJUnitTests(Engineer engineer, int expAge, int expSkill, int expExperience) {
        this.engineer = engineer;
        this.expAge = expAge;
        this.expSkill = expSkill;
        this.expExperience = expExperience;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> allEngineers() {
        return Arrays.asList(new Object[][]{
                {new AutomatedEngineer(32, 3), 32, 9, 3},
                {new ManualEngineer(30, 3), 30, 6, 3}
        });
    }

    @Test
    public void testGetAge() {
        assertEquals("Age should match constructor value for " + engineer.getClass().getSimpleName(), expAge, engineer.getAge());
    }

    @Test
    public void testSetAge() {
        engineer.setAge(30);
        assertEquals("Age should be updated after set for " + engineer.getClass().getSimpleName(), 30, engineer.getAge());
    }

    @Test
    public void testGetSkill() {
        assertEquals("Skill should match expected value for " + engineer.getClass().getSimpleName(), expSkill, engineer.getSkill());
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(20);
        assertEquals("Skill should be updated after set for " + engineer.getClass().getSimpleName(), 20, engineer.getSkill());
    }

    @Test
    public void testGetExperience() {
        assertEquals("Experience should match constructor value for " + engineer.getClass().getSimpleName(), expExperience, engineer.getExperience());
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(3);
        assertEquals("Experience should be updated after set for " + engineer.getClass().getSimpleName(), 3, engineer.getExperience());
    }

}
