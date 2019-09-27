package chapter01.ver01.state;

/**
 * @author zh
 * @date 2019/9/27/027 22:27
 */
public abstract class BasePrice {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFreQuentRenterPoints(int _daysRented) {
        return 1;
    }

}
