package lesson2.converters;

import lesson2.Currency;

import static lesson2.Currency.JPY;

public class JenaConverter implements Converter {
    private static final double EXCHANGE_RATE = 0.62;

    @Override
    public double convertToRub(double ue) {
        return format(ue * EXCHANGE_RATE);
    }

    @Override
    public double convertToCurrency(double rub) {
        return format(rub / EXCHANGE_RATE);
    }

    @Override
    public Currency getType() {
        return JPY;
    }
}
