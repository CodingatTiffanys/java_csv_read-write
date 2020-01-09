import java.io.*;
import java.util.*;
import static java.lang.String.*;


public class csv_normalizer {

    public static void main(String[] args) throws IOException {
        //Take in file
        Scanner user = new Scanner(System.in);
        String fileName = user.next().trim();
        File file = new File(fileName);
        List<List<String>> lines = new ArrayList<>();

        try {
            //parse through file data and put into double array
            Scanner inputStream = new Scanner(file);

            //create new file to write to
            String outputFileName = user.next().trim();
            FileWriter writer = new FileWriter(outputFileName);
            while (inputStream.hasNextLine()) {
                String data = inputStream.nextLine();
                //split data via comma
                String[] values = data.split(",");

                //loop through indexes and call methods to work data
                for (int index = 0; index<values.length; index++){
                if (index == 3) {
                    values[3] = setTimestamp(values[3]);
                }
                else if (index == 4) {
                    values[4] = setAddress(values[4]);
                }
                else if (index == 5) {
                    values[5] = setZip(values[5]);
                }
                else if (index == 6) {
                    values[6] = setFullName(values[6]);
                }
                else if (index == 7) {
                    values[7] = setFooDuration(values[7]);
                }
                else if (index == 8) {
                    values[8] = setBarDuration(values[8]);
                }
                else if (index == 9) {
                    values[9] = values[7] + values[8];

                } }

                lines.add(Arrays.asList(values));
                writer.append(join(",", values));
                writer.append("\n");
            }
            //close out of input/file reader and writer
            inputStream.close();
            writer.flush();
            writer.close();

            //catch exceptions
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


    }

    //*** Methods to work Data***//

    private static String setAddress(String values) {
        String address = values;
        return address;
    }


    public static String setZip(String values) {
        String zip = values;
        return String.format("%1$" + 7 + "s", zip).replace(" ", "0");

    }
    private static String setTimestamp(String values) {
        String timestamp = values;
        return timestamp;


    }
    private static String setFullName(String values) {
        String fullName = values;
        return fullName.toUpperCase();
    }

    private static String setFooDuration(String values) {
        return values;

    }
    private static String setBarDuration(String values) {
        return values;
    }
}

//end of program





