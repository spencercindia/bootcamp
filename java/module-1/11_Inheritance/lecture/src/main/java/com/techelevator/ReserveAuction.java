package com.techelevator;

public class ReserveAuction extends Auction {



    private int reservePrice;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid offerBid){
        boolean isCurrentWinningBid = false;

        if (offerBid.getBidAmount() >= reservePrice){
            isCurrentWinningBid = super.placeBid(offerBid);
        }
        return isCurrentWinningBid;
    }

    public int getReservePrice() {
        return reservePrice;
    }
}
