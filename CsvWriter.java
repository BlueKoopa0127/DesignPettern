import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class CsvWriter {
    public static <T extends ICsv> void Write(Iterator<T> data, String filePath) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));

            while (data.hasNext()) {
                writer.println(data.next().toCsv());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
