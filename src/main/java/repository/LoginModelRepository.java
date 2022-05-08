package repository;


import lombok.SneakyThrows;
import lombok.Value;
import models.LoginModel;

import java.io.FileInputStream;
import java.lang.System;
import java.util.Properties;

public class LoginModelRepository {

    private LoginModelRepository() {
    }

    @SneakyThrows
    public static LoginModel getLoginModel() {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/sources/application.properties"));
        String email = properties.getProperty("email");
        String password = properties.getProperty("password");

        return LoginModel.builder().email(email)
                .password(password)
                .build();
    }
}