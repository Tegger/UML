import java.util.Scanner;
public class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String inputInfo;//examples
        int inputShift;//examples


        employee person = new employee();


        System.out.println("Please enter your first name: ");
        inputInfo = scanner.next();
        person.firstName = inputInfo;
        System.out.println("Please enter your last name: ");
        inputInfo = scanner.next();
        person.lastName = inputInfo;;
        System.out.println("Please enter your ID: ");
        inputInfo = scanner.next();
        person.ID = inputInfo;;
        System.out.println("Please enter your shift number: ");
        inputShift = scanner.nextInt();
        person.shift = inputShift;;

        person.printAll();




    }


}
