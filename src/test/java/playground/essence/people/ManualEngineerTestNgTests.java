package playground.essence.people;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ManualEngineerTestNgTests {
    private ManualEngineer engineer;

    @BeforeMethod
    public void setUp() {
        engineer = new ManualEngineer(32, 3);
    }

    @Test
    public void testGetAge() {
        assertEquals(engineer.getAge(), 32, "Age should match constructor value");
    }

    @Test
    public void testSetAge() {
        engineer.setAge(35);
        assertEquals(engineer.getAge(), 35, "Age should be updated after set");
    }

    @Test
    public void testGetSkill() {
        assertEquals(engineer.getSkill(), 6, "Skill should be experience * 2");
    }

    @Test
    public void testSetSkill() {
        engineer.setSkill(15);
        assertEquals(engineer.getSkill(), 15, "Skill should be updated after set");
    }

    @Test
    public void testGetExperience() {
        assertEquals(engineer.getExperience(), 3, "Experience should match constructor value");
    }

    @Test
    public void testSetExperience() {
        engineer.setExperience(6);
        assertEquals(engineer.getExperience(), 6, "Experience should be updated after set");
    }
}
