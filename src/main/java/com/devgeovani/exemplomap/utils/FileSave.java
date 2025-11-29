package com.devgeovani.exemplomap.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSave {

    public void fileSaveData() {

        String path = "..\\data\\data.json";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            System.out.println(line);

        } catch (IOException e){
            System.out.println("Error: " + e);
        }

    }
}
