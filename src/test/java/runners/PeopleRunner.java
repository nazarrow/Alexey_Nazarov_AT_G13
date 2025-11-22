package runners;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.people.junit.AutomatedEngineerJUnitTests;
import tests.people.junit.ManualEngineerJUnitTests;
import tests.people.junit.ParameterizedJUnitTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerJUnitTests.class,
        ManualEngineerJUnitTests.class,
        ParameterizedJUnitTests.class
})

public class PeopleRunner {
}
