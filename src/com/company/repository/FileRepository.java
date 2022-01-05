package com.company.repository;

import com.company.commons.constants.FileConstants;

import java.io.*;
import java.util.Scanner;

public class FileRepository {

    private File dataFolder = null;
    private File dataFile = null;

    public FileRepository() {

        createDataFolder();
        createDataFile();
    }

    private void createDataFolder() {

        dataFolder = new File(System.getProperty("user.home") + File.separator + FileConstants.WHERE_PATH + File.separator + FileConstants.FOLDER_NAME);
        boolean createdFolder = true;

        if (!dataFolder.exists()) {
            dataFolder.mkdir();
        } else if (dataFolder.exists() && !dataFolder.isDirectory()) {
            dataFolder.mkdir();
        }

    }


    private void createDataFile() {

        try {
            dataFile = new File(dataFolder.getAbsolutePath() + File.separator + FileConstants.USER_CV_DATA);
            dataFile.createNewFile();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    public void writeInFile(String str) {
        try {
            FileWriter myWriter = new FileWriter(dataFile.getAbsolutePath());
            myWriter.write(str);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public String readFromFile() {
        FileReader fr = null;
        String data = "";
        try {
            fr = new FileReader(dataFile.getAbsolutePath());
            Scanner sc = new Scanner(fr);

            while (sc.hasNextLine()) {
                data += sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;


    }

}
