package repository;

import models.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterModelRepository {

    private RegisterModelRepository() {
    }

    public static RegisterModel getValidRegisterUser() {
        String password = RandomStringUtils.randomAlphabetic(5);
        return RegisterModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(5))
                .setLastName(RandomStringUtils.randomAlphabetic(7))
                .setEmail(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }
}
