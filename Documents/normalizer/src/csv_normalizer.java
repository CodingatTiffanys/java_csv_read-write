import java.io.*;
import java.util.Scanner;

public class csv_normalizer {

    public static void main(String[] args) throws IOException {
        String fileName = "src/sample.csv";
        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            FileWriter writer = new FileWriter("src/new.csv");
            while (inputStream.hasNext()) {
                String data = inputStream.nextLine();
                writer.append(data);
            }
            inputStream.close();
            writer.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

}

