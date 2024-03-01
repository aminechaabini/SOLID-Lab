package com.directi.training.dip.exercise.sol;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyNetwork implements Reader{

    String protocol;
    String host;
    String file;

    MyNetwork(String protocol, String host, String file){
        this.protocol=protocol;
        this.host=host;
        this.file=file;
    }

    public String read()throws IOException{
        URL url;
        url = new URL(this.protocol,this.host,this.file);
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        return inputString1.toString() ;
    }

}
