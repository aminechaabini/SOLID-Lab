package com.directi.training.dip.exercise.sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File implements Reader, Writer {

    String path;

    public File(String path){
        this.path=path;
    }

    public String read() throws IOException{
        BufferedReader reader = null;
        try {
            String aLine;
            String text = "";
            reader = new BufferedReader(
                new FileReader(path));
                while ((aLine = reader.readLine()) != null){
                    text += aLine + "\n";
                }
                return text;
        }
        finally{
            if (reader != null) {
                reader.close();
            }
        }
    }

    public int write(String string) throws IOException{
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(
                new FileWriter(path));
                writer.append(string);
        }
        finally{
            if (writer != null) {
                writer.close();
            }
        }
        return 0;
    }
    
}
