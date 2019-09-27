package chapter01.ver01.state;

/**
 * price class
 *
 * @Author: zhangjianbin
 * @Date: 2019/9/27 17:20
 */
public abstract class BasePrice {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int _daysRented) {
        return 1;
    }

}
