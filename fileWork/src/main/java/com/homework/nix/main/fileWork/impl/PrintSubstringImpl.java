package com.homework.nix.main.fileWork.impl;


import com.homework.nix.main.fileWork.PrintSubstring;

import java.io.*;

public class PrintSubstringImpl implements PrintSubstring {

    @Override
    public void getStringWithGivenSubstring(String subString) {
        try {
            File file = new File("file.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                if(line.contains(subString)){
                    System.out.println(line);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
