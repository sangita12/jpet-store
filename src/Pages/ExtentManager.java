package Pages;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports instance;
	
	public static String reportFilePath = "C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj";
	
	public static String extentReportFile = reportFilePath + "\\TestReport_" + System.currentTimeMillis() + ".html";

    public static ExtentReports getInstance() {
        if (instance == null) {
        	instance = new ExtentReports(reportFilePath, false);
            //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("path/to/your/report.html");
           // extent.attachReporter(htmlReporter);
        }
        return instance;
    }


}
