package repository;

import models.ChangePasswordModel;
import org.apache.commons.lang3.RandomStringUtils;

public class ChangePasswordModelRepository {

    private ChangePasswordModelRepository() {
    }

    public static ChangePasswordModel getPositiveChangePassword() {
        String password = RandomStringUtils.randomAlphabetic(4);
        return ChangePasswordModel.builder()
                .setPassword(password)
                .setConfirmPassword(password)
                .build();
    }

    public static ChangePasswordModel getNegativeChangePassword() {
        String password = "     ";
        return ChangePasswordModel.builder()
                .setPassword(password)
                .setConfirmPassword(password)
                .build();
    }
}
