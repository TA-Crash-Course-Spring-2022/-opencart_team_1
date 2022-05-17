package repository;

import models.LoginModel;

public class LoginModelRepository {

    private LoginModelRepository() {
    }

    public static LoginModel getLoginUser() {
         return LoginModel.builder()
                 .email("admin@gmail.com")
                 .password("admin")
                 .build();
        }
    }
