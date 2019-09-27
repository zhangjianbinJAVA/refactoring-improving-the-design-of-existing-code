package chapter01.ver01.state;

import chapter01.ver01.Movie;

/**
 * 新片
 *
 * @Author: zhangjianbin
 * @Date: 2019/9/27 17:23
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
    public int getFrequentRenterPoints(int _daysRented) {
        // add frequent renter points （累计常客积点。
        // add bonus for a two day new release rental
        //if (_daysRented > 1) {
        //    return 2;
        //} else {
        //    return 1;
        //}
        return _daysRented > 1 ? 2 : 1;
    }
}
