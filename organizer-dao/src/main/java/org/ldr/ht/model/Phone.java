package org.ldr.ht.model;

/**
 * Created by laurenra on 2/4/17.
 */
public class Phone {

    private String type;
    private String number;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
