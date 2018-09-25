public class employee {
    String firstName = "";
    String lastName = "";
    String ID = "";
    int shift = 0;

    public employee(){

    }


    public employee(String firstName, String lastName, String ID, int shift){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.shift = shift;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
    public void printAll(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("ID: " + getID());
        System.out.println("Shift: " + getShift());

    }
}



