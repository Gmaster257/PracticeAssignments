package app;

public class Car {
    private double miles;
    private long vinNumber;
    private String color;
    private int age;

    /**
     * Create a new car
     * 
     * @param miles     - The number of miles the car has traveled
     * @param vinNumber - The vin number of the car
     * @param color     - The color of the car
     * @param age       - The number of years since the car was made
     */
    public Car(double miles, long vinNumber, String color, int age) {
        this.miles = miles;
        this.vinNumber = vinNumber;
        this.color = color;
        this.age = age;
    }

    /**
     * Get the millage of a car
     * 
     * @return - The number of miles the car has traveled
     */
    public double getMiles() {
        return miles;
    }

    /**
     * Set the millage of a car
     * 
     * @param miles - The millage you want to assign to the car
     */
    public void setMiles(double miles) {
        this.miles = miles;
    }

    /**
     * Get the vin number of a car
     * 
     * @return - The vin number of the car
     */
    public long getVinNumber() {
        return vinNumber;
    }

    /**
     * Set the vin number of a car
     * 
     * @param vinNumber - The vin number you want to assign to the car
     */
    public void setVinNumber(long vinNumber) {
        this.vinNumber = vinNumber;
    }

    /**
     * Get the color of a car
     * 
     * @return - The color of the car
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the color of a car
     * 
     * @param color - The color you want to change the car to
     */
    public void paint(String color) {
        this.color = color;
    }

    /**
     * Get the age of a car
     * 
     * @return - The number of years since the car was made
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of a car
     * 
     * @param age - The age you want to assign to the car
     */
    public void setAge(int age) {
        this.age = age;
    }

}