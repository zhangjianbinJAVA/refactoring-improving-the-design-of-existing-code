package chapter01.ver01.state;

import chapter01.ver09.Movie;

/**
 * @author zh
 * @date 2019/9/27/027 22:34
 */
public class RegularPrice extends BasePrice {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        int result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
