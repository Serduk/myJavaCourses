package core.csvUtils;


import core.random.RandomUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by sergey on 1/28/16.
 */

/**
 * @Methods for work with CSV file.
 * ExampleSite: http://www.mkyong.com/java/how-to-export-data-to-csv-file-java/
 * ExampleSite: http://www.csvreader.com/java_csv_samples.php
 * */

public class WorkWithCSV{
    RandomUtils randomUtils = new RandomUtils();
    String userHome = System.getProperty("user.home");
    String saveFile = userHome + "/Pictures/testScreenShots/outputData";
    String formatForFile = ".csv";
    String saveToCSV = saveFile + randomUtils.getUiqTime() + formatForFile;

    String tesDataReadFileName = "testData";
    String testDataCSV = userHome + "/Pictures/testScreenShots/" + tesDataReadFileName + formatForFile;





    /**
     * @Method save in CSV File
     * This method create csv file with UniqName from incoming parameters
     * Add to already exist file new Data if we need
     * */

    public void saveInCSV(String fileTestName, String email, String location, String userID, String siteName, String userAutologin){

        String createAndSaveAndAddToCSV = saveFile + fileTestName + formatForFile;
        boolean alreadyExists = new File(createAndSaveAndAddToCSV).exists();

        try{
            FileWriter writer = new FileWriter(createAndSaveAndAddToCSV, true);

            if (!alreadyExists) {
                writer.append("Email:");
                writer.append(',');
                writer.append("location:");
                writer.append(',');
                writer.append("User ID");
                writer.append(",");
                writer.append("Autologin");
                writer.append(",");
                writer.append("SiteName");
                writer.append("\n");
            }

            writer.append(email);
            writer.append(',');
            writer.append(location);
            writer.append(',');
            writer.append(userID);
            writer.append(',');
            writer.append(userAutologin);
            writer.append(',');
            writer.append(siteName);
            writer.append("\n");

            //generate whatever data you want

            writer.flush();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * @Method get column with email
     * */
    public String getEmailColumm() throws IOException {
        File file = new File(saveToCSV);
        List<String> lines = Files.readAllLines(file.toPath(),
                StandardCharsets.UTF_8);
        for (String line : lines) {
            String[] array = line.split(",");
//            System.out.println(array[0]);
//            System.out.println(lines.get(0));
            return array[0];
        }
        return lines.get(0);
    }


    /**
     * @Method get test data from already exist csv file
     * */
    public String getTestData() throws IOException {
        File file = new File(testDataCSV);

        List<String> lines = Files.readAllLines(file.toPath(),
                StandardCharsets.UTF_8);
        for (String line : lines) {
            String[] array = line.split(",");
            return array[0];
        }
        return lines.get(0);
    }
}
