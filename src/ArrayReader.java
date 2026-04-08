import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReader {

    public static String[] execute() {
        System.out.println("Введите путь к файлу");

        try (Scanner sc = new Scanner(System.in)) {
            String path = sc.nextLine();
            File file = new File(path);

            ArrayList<String> numbers = new ArrayList<>();

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(" ");
                    for (String part : parts) {
                        if (!part.trim().isEmpty()) {
                            numbers.add(part);
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("Файл не найден: " + path);
                return new String[0];
            }

            return numbers.toArray(new String[0]);
        }
    }
}