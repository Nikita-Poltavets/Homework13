package com.homework.nix.main.fileWork.impl;

import com.homework.nix.main.fileWork.InsertDirectory;

import java.io.File;
import java.io.IOException;

public class InsertDirectoryImpl implements InsertDirectory {

    @Override
    public void copyAndInsertDirectory(File sourceDir, File destDir) {

        File[] files = sourceDir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                File copiedDestDir = new File(destDir.toString() + "/" + file.getName());
                copiedDestDir.mkdir();
                copyAndInsertDirectory(file, copiedDestDir);
            }
            if(file.isFile()){
               try {
                    File copiedDestFile = new File(destDir.toString() + "/" + file.getName());
                    copiedDestFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
