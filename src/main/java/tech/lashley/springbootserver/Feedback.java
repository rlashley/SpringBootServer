package tech.lashley.springbootserver;

import java.io.File;
import java.util.Scanner;


public class Feedback {
    private String content;
    public Feedback() {
        //Modify to feed file into this constructor, data then passed to Spring Application
        this.content = readText();
    }
    public String getContent() {
        return content;
    }

    //reads the feedback.txt file
    private String readText(){
    	File file = null;
    	Scanner scan = null;
	    String feedbackText = "";
	    try {
	        file = new File("src/home/pi/Public/feedback/feedback.txt");
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
