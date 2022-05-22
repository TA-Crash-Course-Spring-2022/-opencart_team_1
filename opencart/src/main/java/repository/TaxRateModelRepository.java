package repository;

import models.EditCurrencyModel;
import models.TaxRateModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class TaxRateModelRepository {


    private TaxRateModelRepository() {
    }

    public static TaxRateModel getValidTaxRate(){
        return TaxRateModel.builder()
                .setTaxName (RandomStringUtils.randomAlphabetic(4))
                .setTaxRate(String.valueOf(RandomUtils.nextDouble(0,20)))
                .setTaxType(RandomUtils.nextBoolean())
                .setCustomerGroup(RandomUtils.nextBoolean())
                .setGeoZone(String.valueOf(RandomUtils.nextInt(3,4)))
                        .build();

    }
}