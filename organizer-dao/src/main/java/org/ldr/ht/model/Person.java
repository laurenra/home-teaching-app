package org.ldr.ht.model;

import java.util.List;

/**
 * Created by laurenra on 2/4/17.
 */
public class Person {

    private String familyName;
    private String givenName;
    private String preferredName;
    private List<Phone> phone;
    private List<Email> email;
    private List<Address> address;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "familyName='" + familyName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", preferredName='" + preferredName + '\'' +
                ", phone=" + phone +
                ", email=" + email +
                ", address=" + address +
                '}';
    }
}
