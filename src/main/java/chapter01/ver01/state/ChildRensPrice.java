package chapter01.ver01.state;

import chapter01.ver09.Movie;

/**
 * @author zh
 * @date 2019/9/27/027 22:30
 */
public class ChildRensPrice extends BasePrice {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
