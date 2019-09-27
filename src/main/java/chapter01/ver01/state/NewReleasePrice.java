package chapter01.ver01.state;

import chapter01.ver09.Movie;

/**
 * @author zh
 * @date 2019/9/27/027 22:34
 */
public class NewReleasePrice extends BasePrice {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFreQuentRenterPoints(int _daysRented) {
        return _daysRented > 1 ? 2 : 1;
    }
}
