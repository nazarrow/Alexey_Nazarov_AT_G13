package playground.essence.people;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AutomatedEngineerTestNgTests {
    private AutomatedEngineer engineer;

    @BeforeMethod
    public void setUp() {
        engineer = new AutomatedEngineer(32, 3);
    }

    @Test
    public void testGetAge() {
        assertEquals(engineer.getAge(), 32, "Age should match constructor value");
    }

    @Test
    public void testSetAge() {
        engineer.setAge(30);
        assertEquals(engineer.getAge(), 30, "Age should be updated after set");
    }

    @Test
    public void testGetSkill() {
        assertEquals(engineer.getSkill(), 9, "Skill should be experience * 3");
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(20);
        assertEquals(engineer.getSkill(), 20, "Skill should be updated after set");
    }

    @Test
    public void testGetExperience() {
        assertEquals(engineer.getExperience(), 3, "Experience should match constructor value");
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(8);
        assertEquals(engineer.getExperience(), 8, "Experience should be updated after set");
    }
}
