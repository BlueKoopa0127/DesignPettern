import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CsvWriter {
    public static <T extends ICsv> void Write(List<T> data, String filePath) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));

            for (T t : data) {
                writer.println(t.toCsv());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends ICsv> void Write(T[] data, String filePath) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));

            for (T t : data) {
                writer.println(t.toCsv());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
