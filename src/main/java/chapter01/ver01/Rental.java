package chapter01.ver01;

/**
 * 租凭
 */
public class Rental {
    private Movie _movie; // 影片
    private int _daysRented; // 租期

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    /**
     * 函数应该放在它所使用的数据的所属对象内
     * <p>
     * F6 可以利用idea 的 重构 选择 public  移动可以 自动将函数移动该 rental 类下面
     * <p>
     * ctrl + f6 修改方法名
     *
     * @return
     */
    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
