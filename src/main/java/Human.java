import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * Class in which data about the human is stored
 */
public class Human {
    /***
     * Identifier field
     */
    private final int ID;
    /***
     * Person's name
     */
    private final String name;
    /***
     * Person's gender
     */
    private final String gender;
    /***
     * Date of Birth
     */
    private final Date dateOfBirth;
    /***
     * Department details
     */
    private final Division division;
    /***
     * Salary amount
     */
    private final double salary;

    /***
     * Person data constructor
     * @param ID Identifier
     * @param name Person's name
     * @param gender Person's gender
     * @param dateOfBirth Date of Birth
     * @param division Department details
     * @param salary Salary amount
     */
    public Human(int ID, String name, String gender, Date dateOfBirth, Division division, int salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.division = division;
        this.salary = salary;
    }

    /***
     * Printing information about a person
     * @return data about a person
     */
    public String print() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "ID = " + ID + "; name = " + name + "; gender = " + gender + "; birthday = " + dateFormat.format(dateOfBirth) + "; " + division.print() + "; salary = " + salary  + "\n";
    }
}
