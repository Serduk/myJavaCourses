package core.csvUtils;


import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by sergey on 1/28/16.
 */
public class WorkWithCSV{
    String userHome = System.getProperty("user.home");
    String saveFile = userHome + "/Pictures/testScreenShots/outputData";
    String formatForFile = ".csv";
    String saveToCSV = saveFile+formatForFile;


    /**
     * @Method save in CSV File
     * */

    public void saveInCSV(String email){
        try{
            createHeadForCSV();
            FileWriter writer = new FileWriter(saveToCSV);

            writer.append(email);
            writer.append(',');
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
}
