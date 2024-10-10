package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting extends BaseClass {



	public static void generateJVMReport(String jsonFileReport) {

		//1.Mention the path of JVM Report where to store?
		File file = new File(getProjectPath()+"\\target");
		//2.Create the Object for Configuration Class
		Configuration configuration = new Configuration(file, "OMR Branch Hotel Project");
		//3.Pass the Key, Value as Details--Browser,OS Versions,Sprint
		configuration.addClassifications("OS", "Windows 11");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "129.0.6668.90");
		configuration.addClassifications("Sprint", "37");
		//4.Create the Object for ReportBuilder Class to read results from JSON File
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFileReport);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		//5.Generate the JVM Report
		builder.generateReports();

	}

}
