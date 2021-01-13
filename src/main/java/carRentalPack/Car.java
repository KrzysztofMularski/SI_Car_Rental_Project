package carRentalPack;

public class Car {
    private String name;
    private char category;
    
    public Car(String name, char category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public char getCategory() {
        return this.category;
    }
}