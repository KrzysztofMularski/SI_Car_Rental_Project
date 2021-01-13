package carRentalPack;

public class Client {
    private String name;
    private int loyaltyProgram;

    public Client(String name, int loyaltyProgram) {
        this.name = name;
        this.loyaltyProgram = loyaltyProgram;
    }

    public String getName() {
        return this.name;
    }

    public int getLoyaltyProgram() {
        return this.loyaltyProgram;
    }
}