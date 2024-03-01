package com.directi.training.dip.exercise;

import java.io.IOException;

import com.directi.training.dip.exercise.MyDatabase;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        File file1= new File("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        File file2= new File("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        MyNetwork myNetwork= new MyNetwork("http", "myfirstappwith.appspot.com", "/index.html");
        MyDatabase myDatabase = new MyDatabase();
        Base64Encoder myEncoder = new Base64Encoder();
        EncodingModule encodingModule = new EncodingModule(myEncoder);
        encodingModule.encodeWithFiles(file1, file2);
        encodingModule.encodeBasedOnNetworkAndDatabase(myNetwork, myDatabase);
    }
}
