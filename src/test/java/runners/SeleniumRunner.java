package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.seleniumwd.junit.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        WidgetWeatherTest.class,
        BookingParisJUnitTest.class,
        W3schoolsTest.class,
        BookingLondonTest.class,
        DemoQATest.class,
        BookingHintTest.class,
        BookingPragueTest.class
})

public class SeleniumRunner {
}
