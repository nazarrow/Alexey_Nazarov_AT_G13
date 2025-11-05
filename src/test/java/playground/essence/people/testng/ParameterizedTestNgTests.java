package playground.essence.people.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import playground.essence.people.AutomatedEngineer;
import playground.essence.people.Engineer;
import playground.essence.people.ManualEngineer;

import static org.testng.Assert.assertEquals;

public class ParameterizedTestNgTests {

    @DataProvider(name = "engineerData")
    public Object[][] engineerData() {
        return new Object[][]{
                {new AutomatedEngineer(32, 3), 32, 9, 3},
                {new ManualEngineer(30, 3), 30, 6, 3}
        };
    }

    @Test(dataProvider = "engineerData")
    public void testGetAge(Engineer engineer, int expAge, int expSkill, int expExperience) {
        assertEquals(engineer.getAge(), expAge, "Age should match constructor value for " + engineer.getClass().getSimpleName());
    }

    @Test(dataProvider = "engineerData")
    public void testSetAge(Engineer engineer, int expAge, int expSkill, int expExperience) {
        engineer.setAge(30);
        assertEquals(engineer.getAge(), 30, "Age should be updated after set for " + engineer.getClass().getSimpleName());
    }

    @Test(dataProvider = "engineerData")
    public void testGetSkill(Engineer engineer, int expAge, int expSkill, int expExperience) {
        assertEquals(engineer.getSkill(), expSkill, "Skill should match expected value for " + engineer.getClass().getSimpleName());
    }

    @Test(dataProvider = "engineerData")
    public void testSetSkill(Engineer engineer, int expAge, int expSkill, int expExperience) {
        engineer.setSkill(20);
        assertEquals(engineer.getSkill(), 20, "Skill should be updated after set for " + engineer.getClass().getSimpleName());
    }

    @Test(dataProvider = "engineerData")
    public void testGetExperience(Engineer engineer, int expAge, int expSkill, int expExperience) {
        assertEquals(engineer.getExperience(), expExperience, "Experience should match constructor value for " + engineer.getClass().getSimpleName());
    }

    @Test(dataProvider = "engineerData")
    public void testSetExperience(Engineer engineer, int expAge, int expSkill, int expExperience) {
        engineer.setExperience(5);
        assertEquals(engineer.getExperience(), 5, "Experience should be updated after set for " + engineer.getClass().getSimpleName());
    }
}