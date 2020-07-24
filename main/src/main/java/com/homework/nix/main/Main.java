package com.homework.nix.main;

import com.homework.nix.main.fileWork.InsertDirectory;
import com.homework.nix.main.fileWork.PrintSubstring;
import com.homework.nix.main.fileWork.impl.InsertDirectoryImpl;
import com.homework.nix.main.fileWork.impl.PrintSubstringImpl;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        PrintSubstring printSubstring = new PrintSubstringImpl();


        System.out.println("1. Написать программу, которая читает файл построчно и выводит только те строки, которые содержат указанную подстроку.");
        printSubstring.getStringWithGivenSubstring("музыка");

        System.out.println("\n2. Написать программу, которая рекурсивно копирует содержимое каталога(directory) в указанное место(testDir).");
        InsertDirectory insertDirectory = new InsertDirectoryImpl();
        File file = new File("directory");
        File file2 = new File("testDir");
        insertDirectory.copyAndInsertDirectory(file, file2);
    }
}
