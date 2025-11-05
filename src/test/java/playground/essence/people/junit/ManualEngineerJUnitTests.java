package playground.essence.people.junit;

import org.junit.Before;
import org.junit.Test;
import playground.essence.people.ManualEngineer;

import static org.junit.Assert.assertEquals;

public class ManualEngineerJUnitTests {
    private ManualEngineer engineer;

    @Before
    public void setUp() {
        engineer = new ManualEngineer(32, 3);
    }

    @Test
    public void testGetAge() {
        assertEquals("Age should match constructor value", 32, engineer.getAge());
    }

    @Test
    public void testSetAge() {
        engineer.setAge(30);
        assertEquals("Age should be updated after set", 30, engineer.getAge());
    }

    @Test
    public void testGetSkill() {
        assertEquals("Skill should be experience * 2", 6, engineer.getSkill());
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(20);
        assertEquals("Skill should be updated after set", 20, engineer.getSkill());
    }

    @Test
    public void testGetExperience() {
        assertEquals("Experience should match constructor value", 3, engineer.getExperience());
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(8);
        assertEquals("Experience should be updated after set", 8, engineer.getExperience());
    }

}
