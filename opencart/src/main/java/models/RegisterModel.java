package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String passwordConfirm;

    private RegisterModel() {
    }

    public static RegisterModel.Builder builder() {
        return new RegisterModel().new Builder();
    }

    public class Builder {

        public RegisterModel.Builder setFirstName(String value) {
            firstName = value;
            return this;
        }

        public RegisterModel.Builder setLastName(String value) {
            lastName = value;
            return this;
        }

        public RegisterModel.Builder setEmail(String value) {
            email = value;
            return this;
        }

        public RegisterModel.Builder setTelephone(String value) {
            telephone = value;
            return this;
        }

        public RegisterModel.Builder setPassword(String value) {
            password = value;
            return this;
        }

        public RegisterModel.Builder setPasswordConfirm(String value) {
            passwordConfirm = value;
            return this;
        }

        public RegisterModel build() {
            return RegisterModel.this;
        }
    }
}
