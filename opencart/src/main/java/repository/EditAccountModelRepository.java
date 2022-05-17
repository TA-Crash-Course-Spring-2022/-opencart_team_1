package repository;

import models.EditAccountModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditAccountModelRepository {

    private EditAccountModelRepository() {
    }

    public static EditAccountModel getValidEditAccount() {
        return EditAccountModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .setEmail(RandomStringUtils.randomAlphabetic(8) + "@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .build();
    }

    public static EditAccountModel getFirstNameEdit() {
        return EditAccountModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .build();
    }

    public static EditAccountModel getLastNameEdit() {
        return EditAccountModel.builder()
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .build();
    }

    public static EditAccountModel getEmailEdit() {
        return EditAccountModel.builder()
                .setEmail(RandomStringUtils.randomAlphabetic(8) + "gmail.com")
                .build();
    }

    public static EditAccountModel getTelephoneEdit() {
        return EditAccountModel.builder()
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .build();
    }

    public static EditAccountModel getInvalidTelephoneEdit() {
        return EditAccountModel.builder()
                .setTelephone(RandomStringUtils.randomAlphabetic(10))
                .build();
    }
}
