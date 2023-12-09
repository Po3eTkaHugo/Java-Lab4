/***
 * Class in which data about the department is stored
 */
public class Division {
    /***
     * Identifier field
     */
    private final int ID;
    /***
     * Department name field
     */
    private final String name;

    /***
     * Constructor of department
     * @param ID Identifier
     * @param name Department name
     */
    public Division(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    /***
     * Printing department data
     * @return department details
     */
    public String print() {
        return "division.id = " + ID + "; division.name = " + name;
    }
}
