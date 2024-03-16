package lesson2.converters;

import lesson2.Currency;

public interface Converter {

    double convertToRub(double ue);

    double convertToCurrency(double rub);

    Currency getType();

    default double format(double val) {
        double scale = Math.pow(10, 4);
        return Math.round(val * scale) / scale;
    }
}
