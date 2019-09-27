package chapter01.ver01.state;

import chapter01.ver01.Movie;

/**
 * 儿童 片
 *
 * @Author: zhangjianbin
 * @Date: 2019/9/27 17:22
 */
public class ChildrensPrice extends BasePrice {
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
