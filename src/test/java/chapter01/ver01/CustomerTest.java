package chapter01.ver01;

import org.testng.annotations.Test;

public class CustomerTest {

    /**
     * 顾客租了哪些影片 、 租期多长，程序根据租赁时间和影片类型算出费用 和 积分
     * <p>
     * 影片分类：普通、儿童片、新片
     * <p>
     * 积分会根据租片种类是否为新版而不同
     */
    @Test
    public void statement() {
        //消费者
        Customer customer = new Customer("John");

        //影片名称
        String title = "Titanic";
        //影片类型
        int priceCode = 2;
        //租期
        int _daysRented = 7;

        //影片
        Movie movie = new Movie(title, priceCode);

        //租赁
        Rental rental = new Rental(movie, _daysRented);
        customer.addRental(rental);

        //计算费用和积分
        String result = customer.statement();
        System.out.println(result);
    }
}
