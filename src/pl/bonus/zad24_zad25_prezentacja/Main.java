package pl.bonus.zad24_zad25_prezentacja;

public class Main {

    public static void main(String[] args) throws BasketFullException, BasketEmptyException {

        Basket basket = new Basket();


        basket.addToBasket("element1");
        basket.addToBasket("element2");
        basket.addToBasket("element3");
        basket.addToBasket("element4");
        basket.addToBasket("element5");
        basket.addToBasket("element6");
        basket.addToBasket("element7");
        basket.addToBasket("element8");
        basket.addToBasket("element9");
        basket.addToBasket("element10");

        basket.removeFromBasket();
        System.out.println(basket);
    }
}
