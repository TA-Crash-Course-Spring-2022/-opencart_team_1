package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditAccountModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;

    private EditAccountModel() {
    }

    public static EditAccountModel.Builder builder() {
        return new EditAccountModel().new Builder();
    }

    public class Builder {

        public EditAccountModel.Builder setFirstName(String value) {
            firstName = value;
            return this;
        }

        public EditAccountModel.Builder setLastName(String value) {
            lastName = value;
            return this;
        }

        public EditAccountModel.Builder setEmail(String value) {
            email = value;
            return this;
        }

        public EditAccountModel.Builder setTelephone(String value) {
            telephone = value;
            return this;
        }

        public EditAccountModel build() {
            return EditAccountModel.this;
        }
    }
}
