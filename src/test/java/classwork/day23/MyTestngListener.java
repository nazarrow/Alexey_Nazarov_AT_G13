package classwork.day23;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestngListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.printf("Starting test %s", result.getMethod().getDescription()).println();
    }

    public void onTestSuccess(ITestResult result) {
        System.out.printf("Success test %s", result.getMethod().getDescription()).println();
        TestRailReporter.reportResult("2368", result.getMethod().getDescription(), new Result(1));
    }

    public void onTestFailure(ITestResult result) {
        System.out.printf("Failed test %s", result.getMethod().getDescription()).println();
        TestRailReporter.reportResult("2368", result.getMethod().getDescription(), new Result(5));
    }

}
