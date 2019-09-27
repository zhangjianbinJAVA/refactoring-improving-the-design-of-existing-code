package chapter01.ver01;

import chapter01.ver01.state.BasePrice;
import chapter01.ver01.state.ChildRensPrice;
import chapter01.ver01.state.NewReleasePrice;
import chapter01.ver01.state.RegularPrice;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;

    private BasePrice basePrice;


    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return basePrice.getPriceCode();
    }

    public String getTitle() {
        return _title;
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) { // 取得影片出租价格
            case REGULAR: // 普通片
                basePrice = new RegularPrice();
                break;
            case NEW_RELEASE: // 新片
                basePrice = new NewReleasePrice();
                break;
            case CHILDRENS: // 儿童。
                basePrice = new ChildRensPrice();
                break;
            default:
                throw new IllegalArgumentException("priceCode error");
        }
    }

    public double getCharge(int _daysRented) {
        return basePrice.getCharge(_daysRented);

    }

    public int getFreQuentRenterPoints(int _daysRented) {
        return basePrice.getFreQuentRenterPoints(_daysRented);
    }
}