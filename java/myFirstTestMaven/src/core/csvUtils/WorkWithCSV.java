package core.csvUtils;


import core.random.RandomUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by sergey on 1/28/16.
 */
public class WorkWithCSV{
    RandomUtils randomUtils = new RandomUtils();
    String userHome = System.getProperty("user.home");
    String saveFile = userHome + "/Pictures/testScreenShots/outputData";
    String formatForFile = ".csv";
    String saveToCSV = saveFile + randomUtils.getUiqTime() + formatForFile;


    /**
     * @Method save in CSV File
     * */

    public void saveInCSV(String email, String password, String shortID){
        try{
            createHeadForCSV();
            FileWriter writer = new FileWriter(saveToCSV);

            writer.append(email);
            writer.append(',');
            writer.append(password);
            writer.append("\n");

            //generate whatever data you want

            writer.flush();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void createHeadForCSV() throws IOException {
        FileWriter writer = new FileWriter(saveToCSV);
        writer.append("Registration Time");
        writer.append(',');
        writer.append("User Email");
        writer.append("Password");
        writer.append("\n");
    }




    /**
     * @Method reading CSV File
     * */
//    public void readFromCSV() throws IOException {
//        String getCsvFile = saveToCSV;
//        BufferedReader bufferedReader = null;
//        String line = "";
//        String csvSplitBy = ",";
//
//        try {
//            bufferedReader = new BufferedReader(new FileReader(getCsvFile));
//            while ((line = bufferedReader.readLine()) != null) {
//                //use comma as separator
//                String[] email = line.split(csvSplitBy);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(bufferedReader != null) {
//                try {
//                    bufferedReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        System.out.println("Done");
//    }

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
}
