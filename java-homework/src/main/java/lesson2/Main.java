package lesson2;

import lesson2.converters.DollarConverter;
import lesson2.converters.RubleConverter;
import lesson2.converters.JenaConverter;
import lesson2.converters.YuanConverter;

import static lesson2.Currency.*;

public class Main {

    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();
        exchanger.addConverter(new JenaConverter());
        exchanger.addConverter(new DollarConverter());
        exchanger.addConverter(new RubleConverter());
        exchanger.addConverter(new YuanConverter());

        for (Currency from : values()) {
            for (Currency to : values()) {
                double val = exchanger.convert(1, from, to);
                System.out.println("1 " + from.name() + " = " + val + " " + to.name() );
            }
        }
    }
}
