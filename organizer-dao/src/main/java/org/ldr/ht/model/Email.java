package org.ldr.ht.model;

/**
 * Created by laurenra on 2/4/17.
 */
public class Email {

    private String type;
    private String address;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Email{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
