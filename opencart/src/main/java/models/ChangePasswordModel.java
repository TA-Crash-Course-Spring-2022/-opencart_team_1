package models;

import jdk.jfr.SettingDefinition;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordModel {

    private String password;
    private String confirmPassword;

    private ChangePasswordModel() {
    }

    public static ChangePasswordModel.Builder builder() {
        return new ChangePasswordModel().new Builder();
    }

    public class Builder {

        public ChangePasswordModel.Builder setPassword(String value) {
            password = value;
            return this;
        }

        public ChangePasswordModel.Builder setConfirmPassword(String value) {
            confirmPassword = value;
            return this;
        }

        public ChangePasswordModel build() {
            return ChangePasswordModel.this;
        }
    }
}
