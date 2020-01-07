import java.io.*;
import java.util.Scanner;

public class csv_normalizer {

    public static void main(String[] args) throws IOException {
        String fileName = "src/sample.csv";
        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()) {
                String data = inputStream.nextLine();
               // data.split(",");
                System.out.println(data);
            }
            inputStream.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

