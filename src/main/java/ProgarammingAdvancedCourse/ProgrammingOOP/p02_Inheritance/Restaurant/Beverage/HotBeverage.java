package p02_Inheritance.Restaurant.Beverage;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {
    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
