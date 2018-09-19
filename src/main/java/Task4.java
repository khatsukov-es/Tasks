import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by ELDAR on 19.09.18.
 */
public class Task4 {

    public static void main(String[] args) throws IOException {

        editValue("fsdfsdfd","4");

    }


    public static void editValue(String columnName, String newValue) throws IOException {
        List<String> lines = readLines("text.txt");
        List<String> columns = Arrays.asList(lines.get(0).split(" "));
        List<String> values = Arrays.asList(lines.get(1).split(" "));
        int index = columns.indexOf(columnName);
        values.set(index, newValue);
        StringBuilder sb = new StringBuilder();
        for (String column : columns) {
            sb.append(column + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append('\n');
        for (String value : values) {
            sb.append(value + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        writeToFile(sb.toString());
    }

    public static void writeToFile(String text) throws IOException {
        FileWriter writer = new FileWriter("text.txt");
        writer.write(text);
    }

    public static List<String> readLines(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        List<String> lines = new ArrayList<>();
        try {
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            return lines;
        } finally {
            reader.close();
        }
    }
}
