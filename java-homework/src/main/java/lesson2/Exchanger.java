package lesson2;

import lesson2.converters.*;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class Exchanger {

    private final Map<Currency, Converter> converterDictionary = new HashMap<>(); // справочник

    public double convert(double value, Currency  from, Currency target) {
        Converter toRub = converterDictionary.get(from);
        Converter toTarget = converterDictionary.get(target);
        if (isNull(toRub) || isNull(toTarget)) {
            System.out.println("Валюта " + (isNull(toRub) ? from : target) + " отсутствует в справочнике");
            return -1;
        }
        double rub = toRub.convertToRub(value);
        return toTarget.convertToCurrency(rub);
    }

    public void addConverter(Converter converter) {
        converterDictionary.put(converter.getType(), converter);
    }
}
