package tech.lashley.springbootserver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Feedback {
    private String content;
    public Feedback(long counter) {
        //Modify to feed file into this constructor, data then passed to Spring Application
        this.content = readText();
        content=(Long.toString(counter) + " " + content);
    }
    public String getContent() {
        return content;
    }

    private String readText(){
    	File file = null;
    	FileReader fr = null;
	    String feedbackText = "";
	    try {
	        file = new File("C:\\Users\\rlash\\Documents\\feedback.txt");
		    fr = new FileReader(file);
	    } catch(Exception e){
	        System.out.println(e);
	    }

	    try {
	        while (fr.read() != -1) {
	            feedbackText += fr.read();
	        }
		    fr.close();
	    } catch(IOException e){
	        System.err.println(e);
	    }
	    return feedbackText;
	}
}
