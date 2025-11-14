package homework.day16;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.support.ui.ISelect;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        WidgetWeatherTest.class,
        BookingParisTest.class,
        W3schoolsTest.class,
        BookingLondonTest.class,
        DemoQATest.class,
        BookingHintTest.class,
        BookingPragueTest.class
})

public class JUnitRunner {
}
