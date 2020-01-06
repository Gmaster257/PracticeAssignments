package app;

public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car(124.23, 348592672, "red", 5);
        car.paint("blue");
        System.out.println("Millage: " + car.getMiles());
        System.out.println("Vin Number: " + car.getVinNumber());
        System.out.println("Color: " + car.getColor());
        System.out.println("Age: " + car.getAge());
        System.out.println("");
        // System.out.println("Type a command to get/set a parameter.");
        /**
         * if(System.in.???){
         * 
         * }
         */
    }
}