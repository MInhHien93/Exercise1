package Entities;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private String identity;
    private String dateOfBirth;

    public Customer() {
    }

    public Customer(String name, String identity, String dateOfBirth) {
        this.name = name;
        this.identity = identity;
        this.dateOfBirth = dateOfBirth;
    }

    public String getItennity() {
        return identity;
    }

    public void setId(String idCard) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Tên khách hàng: " + name + "\n" +
                "Chứng minh thư: " + identity + "\n" +
                "Ngày sinh: " + dateOfBirth + "\n";
    }
}
