package ru.aspu.oop.auction;

/**
 * A class that models an auction bid.
 * It contains a reference to the Person bidding and the amount bid.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Bid
{
    // The person making the bid.
    private final String bidder;
    // The value of the bid. This could be a large number so
    // the long type has been used.
    private final long value;

    /**
     * Create a bid.
     * @param bidder Who is bidding for the lot.
     * @param value The value of the bid.
     */
    public Bid(String bidder, long value)
    {
        this.bidder = bidder;
        this.value = value;
    }

    /**
     * @return The bidder.
     */
    public String getBidder()
    {
        return bidder;
    }

    /**
     * @return The value of the bid.
     */
    public long getValue()
    {
        return value;
    }
}
