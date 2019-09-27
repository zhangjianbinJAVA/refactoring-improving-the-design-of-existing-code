package chapter01.ver01.state;

import chapter01.ver01.Movie;

/**
 * 普通片
 *
 * @Author: zhangjianbin
 * @Date: 2019/9/27 17:24
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
