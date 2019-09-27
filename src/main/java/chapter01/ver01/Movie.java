package chapter01.ver01;

import chapter01.ver01.state.BasePrice;
import chapter01.ver01.state.ChildrensPrice;
import chapter01.ver01.state.NewReleasePrice;
import chapter01.ver01.state.RegularPrice;

/**
 * 影片
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;

    //private int _priceCode;

    private BasePrice _price;

    public BasePrice getPrice() {
        return _price;
    }

    public void setPrice(BasePrice price) {
        this._price = price;
    }

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public String getTitle() {
        return _title;
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("incorrect price code");
        }
    }

    /**
     * 影片类型 价格 计算
     * <p>
     * 重构  运用多态取代与价格相关的条件逻辑
     *
     * @param daysRented
     * @return
     */
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }


    /**
     * 常客积点
     *
     * @param daysRented
     * @return
     */
    public int getFrequentRenterPoints(int daysRented) {
        // add frequent renter points （累计常客积点。
        // add bonus for a two day new release rental
        return _price.getFrequentRenterPoints(daysRented);
    }

}