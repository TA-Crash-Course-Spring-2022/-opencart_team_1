package repository;

import models.ChangePasswordModel;

public class ChangePasswordModelRepository {

    private ChangePasswordModelRepository() {
    }

    public static ChangePasswordModel getValidChangePassword() {
        String password = "1111";
        return ChangePasswordModel.builder()
                .setPassword(password)
                .setConfirmPassword(password)
                .build();
    }

    public static ChangePasswordModel getInvalidChangePassword() {
        String password = "     ";
        return ChangePasswordModel.builder()
                .setPassword(password)
                .setConfirmPassword(password)
                .build();
    }
}
