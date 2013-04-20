package models;

import play.data.validation.Constraints;

import javax.validation.Valid;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Alina
 * Date: 16.04.13
 * Time: 23:14
 * To change this template use File | Settings | File Templates.
 */
public class User {

    public User() {}

    public User(String username, String address, String phone) {
        this.username = username;
        this.address = address;
        this.phone = phone;
    }

    @Constraints.Required
    @Constraints.MinLength(4)
    public String username;

    @Constraints.Required
    public String address;

    @Constraints.Required
    //@Valid
    //@Constraints.Pattern(value = "[0-9.+]+", message = "Пожалуйста, введите действительный телефон")
    public String phone;

    /*public static class Phone {

        public Phone() {}

        public Phone(String number) {
            this.number = number;
        }

        @Constraints.Required
        @Constraints.Pattern(value = "[0-9.+]+", message = "Пожалуйста, введите действительный телефон")
        public String number;
    }   */
}
