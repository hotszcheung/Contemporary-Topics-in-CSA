/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author a1
 */
public class DebugToTextFile implements Debug {
    public void log (String msg){
        try{
               File file = new File("G:/SEM4/Contemporary Topics in CSA/Lab 1 Source Code for Question 3/Lab1 Q3 partB/src/Q3/log.txt");
               if(!file.exists()){
                   file.createNewFile();
               }
               FileWriter outputFile = new FileWriter(file,true);
               PrintWriter out = new PrintWriter(outputFile);
               //Write text to file
                out.println(msg);               
                
                out.flush();
                //write the text from buffer to the file
                out.close();
                // close the file after use
            
            }catch (IOException e){
			e.printStackTrace();
	    }
    }
}
