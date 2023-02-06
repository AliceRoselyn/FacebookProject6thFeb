package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJvmReport(String jsonflie) {
		File f = new File("C:\\Users\\T JOHNVEDANAYAGAM\\eclipse-workspace\\Cucumber\\Reports\\jvmreport");
		Configuration c = new Configuration(f,"Facebook Application");
		c.addClassifications("plateform","Windows");
		c.addClassifications("jdk","1.8");
		 ArrayList<String> li = new ArrayList<String>();
		li.add(jsonflie);
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}

}
