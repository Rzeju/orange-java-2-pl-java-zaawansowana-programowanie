package pl.bonus.zad24_zad25_prezentacja;

public class Basket {

    private final String[] basket = new String[10];

    public Basket() {

    }

    public void addToBasket(String element) throws BasketFullException {
        isFull();
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = element;
                break;
            }
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        isEmpty();
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i -1] = null;
                break;
            }
            if (i + 1 == basket.length) {
                basket[i] = null;
            }
        }
    }

    private void isFull() throws BasketFullException {
        int counter = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                counter++;
            }
        }
        if (counter == 10) {
            throw new BasketFullException("Basket is full");
        }
    }

    private void isEmpty() throws BasketEmptyException {
        int counter = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                counter++;
            }
        }
        if (counter == 10) {
            throw new BasketEmptyException("Basket is empty!");
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < basket.length; i++) {
            result = result + basket[i] + ", ";
        }

        return result.substring(0, result.length() - 2);
    }


}
