import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Text {
    public static void main(String[] args) {
        String filePath = "src/main/resources/input.txt";

        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Eliminare semne de punctuație
            content = content.replaceAll("[^a-zA-Z0-9\\s]", "");

            // Eliminare spații multiple
            content = content.replaceAll("\\s+", " ");

            // Conversie la lowercase
            content = content.toLowerCase();

            // Afișare rezultat
            System.out.println("Text procesat: " + content);
        } catch (IOException e) {
            System.err.println("Eroare la citirea fișierului: " + e.getMessage());
        }
    }
}
