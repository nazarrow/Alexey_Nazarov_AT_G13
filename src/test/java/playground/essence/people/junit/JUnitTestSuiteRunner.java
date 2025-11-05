package playground.essence.people.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerJUnitTests.class,
        ManualEngineerJUnitTests.class,
        ParameterizedJUnitTests.class
})

public class JUnitTestSuiteRunner {
}
