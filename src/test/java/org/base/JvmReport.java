package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JvmReport {
	
	public static void generateJvmReport(String jsonFile) {
         File loc= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");

     Configuration con = new Configuration(loc, "pages Automation");
     con.addClassifications("os","Windows os");
     con.addClassifications("Browser","chrome");
     con.addClassifications("version","79");
     con.addClassifications("sprint","23");
     List<String> jsonFiles = new ArrayList<String>();
     jsonFiles.add(jsonFile);
     ReportBuilder builder = new ReportBuilder(jsonFiles, con);
     
     builder.generateReports();
     
     
     

		
		
		
		
	}
	

}
