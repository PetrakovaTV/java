package lesson2.converters;

import lesson2.Currency;

import static lesson2.Currency.CNY;

public class YuanConverter implements Converter {
    private static final double EXCHANGE_RATE = 13.0;

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
        return CNY;
    }
}
