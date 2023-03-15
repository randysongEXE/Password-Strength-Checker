import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class DictionaryCheck {

    //this variable stores the text file
    private static final String DICTIONARY_FILE = "dictionary.txt";

    //This method uses a bufferedreader to check the contents of the file. The loops then compared the inputted password to its contents.
    public boolean dictionaryCheck(String password) {
        try (BufferedReader br = new BufferedReader(new FileReader(DICTIONARY_FILE))) {
            String word;
            while ((word = br.readLine()) != null) {
                if (word.equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
