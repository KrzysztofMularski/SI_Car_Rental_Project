package carRentalPack;

public class CarCategory {
    private char name;
    private char nextCategory;
    private int firstPrice;
    private int secondPrice;

    public CarCategory(char name, char nextCategory, int firstPrice, int secondPrice) {
        this.name = name;
        this.nextCategory = nextCategory;
        this.firstPrice = firstPrice;
        this.secondPrice = secondPrice;
    }

    public char getName() {
        return this.name;
    }

    public char getNextCategory() {
        return this.nextCategory;
    }

    public int getFirstPrice() {
        return this.firstPrice;
    }

    public int getSecondPrice() {
        return this.secondPrice;
    }
}