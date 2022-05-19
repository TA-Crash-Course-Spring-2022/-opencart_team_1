package repository;

import models.EditCurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.random.RandomGenerator;

import static java.lang.Math.random;

public class EditCurrencyModelRepository {

    private EditCurrencyModelRepository() {
    }

    public static EditCurrencyModel getCurrencyTitle() {
        String currencyTitle = RandomStringUtils.randomAlphabetic(4);
        return EditCurrencyModel.builder()
                .setCurrencyTitle(currencyTitle)
                .build();
    }

    public static EditCurrencyModel getCurrencyCode() {
        String currencyCode = RandomStringUtils.randomAlphabetic(3).toUpperCase();
        return EditCurrencyModel.builder()
                .setCurrencyCode(currencyCode)
                .build();
    }

    public static EditCurrencyModel getCurrencySymbolLeft() {
        String symbolLeft = RandomStringUtils.randomAlphabetic(1);
        return EditCurrencyModel.builder()
                .setSymbolLeft(symbolLeft)
                .build();
    }

    public static EditCurrencyModel getCurrencySymbolRight() {
        String symbolRight = RandomStringUtils.randomAlphabetic(1);
        return EditCurrencyModel.builder()
                .setSymbolLeft(symbolRight)
                .build();
    }

    public static EditCurrencyModel getCurrencyDecimalPlaces() {
        String decimalPlaces = RandomStringUtils.randomNumeric(1);
        return EditCurrencyModel.builder()
                .setSymbolLeft(decimalPlaces)
                .build();
    }

    public static EditCurrencyModel getCurrencyValue() {
        String value = String.valueOf(RandomUtils.nextDouble(0.0001, 1));
        return EditCurrencyModel.builder()
                .setValue(value)
                .build();
    }

    public static EditCurrencyModel getCurrencyStatus() {
        boolean status = RandomUtils.nextBoolean();
        return EditCurrencyModel.builder()
                .setStatus(status)
                .build();
    }
}
