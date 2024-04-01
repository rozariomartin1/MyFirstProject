import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseExtentManager {

    public static ExtentReports extentReports;

    public static ExtentReports createInstance(String file) {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(file);
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        return extentReports;
    }
}
