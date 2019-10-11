package tech.lashley.springbootserver;

import java.io.File;
import java.util.Scanner;

import org.json.simple.JSONObject;


public class Feedback {

	//Feed file then pass to Spring Application
    public String getFeedback() {
        return readFeedback();
    }
    
    //Method returns resume file as string
    public String getResume() {
    	return resumeFile();
    }
    
    //Method to return resume in JSON format
    public JSONObject getJSONResume() {
    	JSONObject jsonObject = new JSONObject();
    	//Convert JSON resume text into jsonObject
    	
    	
    	return jsonObject;   	
    }
    
    //sends the resume.txt file
    private String resumeFile() {
    	File file = null;
    	Scanner scan = null;
	    String resumeText = "";
	    try {
	        file = new File("/home/pi/Public/feedback/resume.txt");
		    scan = new Scanner(file);
	    } catch(Exception e){
	        System.out.println(e);
	    }

	    //while there's a next line, add it to output
	    try {
	        while (scan.hasNextLine()) {
	            resumeText += (scan.nextLine()+" ");
	        }
		    scan.close();
	    } catch(Exception e){
	        System.err.println(e);
	    }
    	return resumeText;
    }

    //reads the feedback.txt file
    private String readFeedback(){
    	File file = null;
    	Scanner scan = null;
	    String feedbackText = "";
	    try {
	        file = new File("/home/pi/Public/feedback/feedback.txt");
		    scan = new Scanner(file);
	    } catch(Exception e){
	        System.out.println(e);
	    }

	    //while there's a next line, add it to output
	    try {
	        while (scan.hasNextLine()) {
	            feedbackText += (scan.nextLine()+" ");
	        }
		    scan.close();
	    } catch(Exception e){
	        System.err.println(e);
	    }
	    return feedbackText;
	}
}
