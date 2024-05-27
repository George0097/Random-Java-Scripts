public class GetterSetterJava {
    private int myNumber;

    // Getter method for myNumber
    public int getMyNumber() {
        return myNumber;
    }

    // Setter method for myNumber
    public void setMyNumber(int newValue) {
        myNumber =newValue;
    }
}

class Main {
    public static void main(String[] args) {
        GetterSetterJava obj = new GetterSetterJava();

        // Set the value using the setter
        obj.setMyNumber(512);

        // Get the value using the getter
        int value = obj.getMyNumber();
        System.out.println(value);
    }
}

