package zad24;

public class BasketTest {
    public static void main(String[] args) {
        Basket basket = new Basket();
//       basket.removeFromBasket();
        for (int i = 0; i <10;i++){
            basket.addToBasket();
        }
        basket.addToBasket();

    }
}
