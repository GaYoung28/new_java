package org.example.day11.review;

public class 물건 {
    private String name; // 상품명
    private String seller; //판매자
    private int price; //가격
    private String arrivalTime; //도착일
    private double discount;

    public 물건(String name, String seller, int price, String arrivalTime, double discount) {
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.arrivalTime = arrivalTime;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getSeller() {
        return seller;
    }

    public int getPrice() {
        return price;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getDiscount() {
        return discount;
    }

    public int getDiscountPrice() {
        return price - (int)(price * discount) ;
    }

    @Override
    public String toString() {
        return "물건{" +
                "name='" + name + '\'' +
                ", seller='" + seller + '\'' +
                ", price=" + price +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", discount=" + discount +
                '}';
    }
}
