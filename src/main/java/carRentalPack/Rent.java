package carRentalPack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rent {
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
    private Client client;
    private Date rentalDate;
    private Date plannedReturnDate;
    private char prefCarCategory;
    private int carSeat;
    private int bicyclesRack;

    private Car car;
    private int rentalDays;
    private int carCostPerDay;
    private int equipTotalCost;
    private int rentalTotalCost;

    public Rent(Client client, String rentalDate, String plannedReturnDate, char prefCarCategory, int carSeat, int bicyclesRack) {
        this.client = client;
        try {
			this.rentalDate = dateFormat.parse(rentalDate);
			this.plannedReturnDate = dateFormat.parse(plannedReturnDate);
		} 
		catch (java.text.ParseException e) {
			e.printStackTrace();
		}
        this.prefCarCategory = prefCarCategory;
        this.carSeat = carSeat;
        this.bicyclesRack = bicyclesRack;
    }

    public Client getClient() {
        return this.client;
    }

    public Date getRentalDate() {
        return this.rentalDate;
    }

    public Date getPlannedReturnDate() {
        return this.plannedReturnDate;
    }
    
    public void setPrefCarCategory(char prefCarCategory) {
        this.prefCarCategory = prefCarCategory;
    }
    
    public char getPrefCarCategory() {
        return this.prefCarCategory;
    }

    public int getCarSeat() {
        return this.carSeat;
    }

    public int getBicyclesRack() {
        return this.bicyclesRack;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }
    
    public Car getCar() {
        return this.car;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public int getRentalDays() {
        return this.rentalDays;
    }

    public void setCarCostPerDay(int carCostPerDay) {
        this.carCostPerDay = carCostPerDay;
    }

    public int getCarCostPerDay() {
        return this.carCostPerDay;
    }

    public void setEquipTotalCost(int equipTotalCost) {
        this.equipTotalCost = equipTotalCost;
    }

    public int getEquipTotalCost() {
        return this.equipTotalCost;
    }

    public void setRentalTotalCost(int rentalTotalCost) {
        this.rentalTotalCost = rentalTotalCost;
    }

    public int getRentalTotalCost() {
        return this.rentalTotalCost;
    }
}