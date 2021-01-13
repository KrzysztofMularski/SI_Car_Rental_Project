package carRentalPack;

public class PriceList {
    private int carSeatCost;
    private int bicyclesRackCost;
    private int lostHubcupCost;
    private int lostVehicleRegCertCost;
    private int penaltyFactorPerDay;
    private double kmCost1;
    private double kmCost2;

    public PriceList(int carSeatCost, int bicyclesRackCost, int lostHubcupCost, int lostVehicleRegCertCost, int penaltyFactorPerDay, double kmCost1, double kmCost2) {
        this.carSeatCost = carSeatCost;
        this.bicyclesRackCost = bicyclesRackCost;
        this.lostHubcupCost = lostHubcupCost;
        this.lostVehicleRegCertCost = lostVehicleRegCertCost;
        this.penaltyFactorPerDay = penaltyFactorPerDay;
        this.kmCost1 = kmCost1;
        this.kmCost2 = kmCost2;
    }

    public int getCarSeatCost() {
        return this.carSeatCost;
    }

    public int getBicyclesRackCost() {
        return this.bicyclesRackCost;
    }

    public int getLostHubcupCost() {
        return this.lostHubcupCost;
    }

    public int getLostVehicleRegCertCost() {
        return this.lostVehicleRegCertCost;
    }

    public int getPenaltyFactorPerDay() {
        return this.penaltyFactorPerDay;
    }

    public double getKmCost1() {
        return this.kmCost1;
    }

    public double getKmCost2() {
        return this.kmCost2;
    }
}