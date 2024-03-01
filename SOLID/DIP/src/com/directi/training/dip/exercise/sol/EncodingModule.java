package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule
{

    Encoder encoder;

    public EncodingModule( Encoder encoder){

        this.encoder=encoder;
    }
    public void encodeWithFiles(Reader reader, Writer writer) throws IOException
    {
        String text = reader.read();
        encodedText = encoder.encode(text);
        writer.write(encodedText) 
    }

    public void encodeBasedOnNetworkAndDatabase(Reader reader, Writer writer) throws IOException
    {
        String text = reader.read();
        encodedText = encoder.encode(text);
        writer.write(encodedTexttext) 
    }
}

