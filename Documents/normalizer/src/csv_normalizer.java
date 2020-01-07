import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class csv_normalizer {

    public static void main(String[] args) throws IOException {
        String fileName = "src/sample.csv";
        File file = new File(fileName);
        List<List<String>> lines = new ArrayList<>();

        try {
            Scanner inputStream = new Scanner(file);
            FileWriter writer = new FileWriter("src/new.csv");
            while (inputStream.hasNext()) {
                String data = inputStream.nextLine();
                String[] values = data.split(",");
                lines.add(Arrays.asList(values));

                for(List<String> lineData : lines){
                    writer.append(String.join(",", values));
                    writer.append("\n");
            }}
            inputStream.close();
            writer.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

}

