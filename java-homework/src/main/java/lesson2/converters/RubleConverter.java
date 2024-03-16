package lesson2.converters;

import lesson2.Currency;

import static lesson2.Currency.RUB;

public class RubleConverter implements Converter {

    @Override
    public double convertToRub(double ue) {
        return ue;
    }

    @Override
    public double convertToCurrency(double rub) {
        return rub;
    }

    @Override
    public Currency getType() {
        return RUB;
    }
}
