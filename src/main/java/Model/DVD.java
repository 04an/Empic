package Model;

import java.rmi.server.UID;
import java.time.LocalDate;

public class DVD extends Product {
    private int dateOfProduct;

    public DVD(int id, String name, double price, int dateOfProduct) {
        super(id, name, price);
        if (dateOfProduct >= 1995 && dateOfProduct <= LocalDate.now().getYear()) {
            this.dateOfProduct = dateOfProduct;

        } else {
            this.dateOfProduct = 0;
        }
    }

    @Override
    public double discount() {

        double discountPrice = getPrice() - getPrice() * ((LocalDate.now().getYear() - dateOfProduct) / 100.0);
        return discountPrice;
    }
}
