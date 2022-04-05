package com.techelevator;

import java.io.PrintWriter;
import java.math.BigDecimal;

public class HotelReservation {
    private String name;
    private int numOfNights;
    private final BigDecimal cost = new BigDecimal("59.99");
    private final BigDecimal minibarCharge = new BigDecimal("12.99");
    private final BigDecimal cleaningFee = new BigDecimal("34.99");
    private BigDecimal estimatedTotal;
    private BigDecimal actualTotal;

    public HotelReservation(String name, int numOfNights) {
        this.name = name;
        this.numOfNights = numOfNights;
        this.estimatedTotal = cost.multiply(new BigDecimal(numOfNights));
    }

    public BigDecimal getActualTotal(boolean requiresCleaning, boolean usedMinibar) {
        BigDecimal additionalCharges = new BigDecimal("0.00");
        if (usedMinibar){
            additionalCharges = additionalCharges.add(minibarCharge);
            if (requiresCleaning) {
                additionalCharges = additionalCharges.add(cleaningFee.multiply(new BigDecimal(2)));
            }
        } else if (requiresCleaning) {
            additionalCharges = additionalCharges.add(cleaningFee);
        }
        actualTotal = additionalCharges.add(estimatedTotal);
        return actualTotal;
    }

    public String getName() {
        return name;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public BigDecimal getEstimatedTotal() {
        return estimatedTotal;
    }

    public boolean usedTheMinibar(boolean wasUsed){
        return wasUsed;
    }

    public String toString(){
        return "RESERVATION - " + name + " - $" + estimatedTotal;
    }
}
