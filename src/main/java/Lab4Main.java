public class Lab4Main {
    public static void main(String[] args) {
        People listOfPeople = new People("foreignNames.csv", ';');
        listOfPeople.read();
        listOfPeople.print();
    }
}
