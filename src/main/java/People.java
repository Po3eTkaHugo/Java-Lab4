import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/***
 * Class for creating a list of people recorded in a CSV file
 */
public class People {
    /***
     * List of people
     */
    private final List<Human> data = new ArrayList<>();
    /***
     * Department id
     */
    private int divisionId = 1;
    /***
     * Data separator in csv file
     */
    char separator;// ';';
    /***
     * Path to csv file
     */
    String csvFilePath;// "foreignNames.csv";
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    /***
     * Constructor for setting parameters for reading from a csv file
     * @param path Path to csv file
     * @param separator Data separator in csv file
     */
    public People(String path, char separator) {
        this.csvFilePath = path;
        this.separator = separator;
    }

    /***
     * Method for reading data from a csv file and writing it to a list
     */
    public void read() {
        boolean header = true;
        try (InputStream in = People.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in))
                     .withCSVParser(new CSVParserBuilder().withSeparator(separator).build())
                     .build()) {

            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (header) {
                    header = false;
                }
                else {
                    Human human = new Human(Integer.parseInt(nextLine[0]), String.valueOf(nextLine[1]),
                                            String.valueOf(nextLine[2]), dateFormat.parse(nextLine[3]),
                                            new Division(divisionId++, String.valueOf(nextLine[4])),
                                            Integer.parseInt(nextLine[5]));
                    data.add(human);
                }
            }
        }
        catch (Exception  e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * Displaying data from a list on the screen
     */
    public void print() {
        System.out.println("List of people:");
        for (Human human : data) {
            System.out.println(human.print());
        }
    }
}
