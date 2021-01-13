package carRentalPack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Return {
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
    private Rent rent;
    private Date returnDate;
    private int lostHubcupsNum;
    private int lostVehicleRegCert;
    private int distanceTravelled;
    
    private int daysLateNum = 0;
    private double kmCost;
    private double distanceTotalCost;
    private double delayTotalCost = 0;
    private double returnTotalCost;
    private double totalSum;

    public Return(Rent rent, String returnDate, int lostHubcupsNum, int lostVehicleRegCert, int distanceTravelled) {
        this.rent = rent;
        try {
			this.returnDate = dateFormat.parse(returnDate);
		} 
		catch (java.text.ParseException e) {
			e.printStackTrace();
		}
        this.lostHubcupsNum = lostHubcupsNum;
        this.lostVehicleRegCert = lostVehicleRegCert;
        this.distanceTravelled = distanceTravelled;
    }

    public Rent getRent() {
        return this.rent;
    }

    public Date getReturnDate() {
        return this.returnDate;
    }

    public int getLostHubcupsNum() {
        return this.lostHubcupsNum;
    }

    public int getLostVehicleRegCert() {
        return this.lostVehicleRegCert;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public void setDaysLateNum(int daysLateNum) {
        this.daysLateNum = daysLateNum;
    }
    
    public void setKmCost(double kmCost) {
        this.kmCost = kmCost;
    }

    public double getKmCost() {
        return this.kmCost;
    }

    public int getDaysLateNum() {
        return this.daysLateNum;
    }

    public void setDistanceTotalCost(double distanceTotalCost) {
        this.distanceTotalCost = distanceTotalCost;
    }

    public double getDistanceTotalCost() {
        return this.distanceTotalCost;
    }

    public void setDelayTotalCost(double delayTotalCost) {
        this.delayTotalCost = delayTotalCost;
    }

    public double getDelayTotalCost() {
        return this.delayTotalCost;
    }

    public void setReturnTotalCost(double returnTotalCost) {
        this.returnTotalCost = returnTotalCost;
    }

    public double getReturnTotalCost() {
        return this.returnTotalCost;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public double getTotalSum() {
        return this.totalSum;
    }        
}