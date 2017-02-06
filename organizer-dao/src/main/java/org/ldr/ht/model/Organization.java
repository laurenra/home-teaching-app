package org.ldr.ht.model;

import java.util.List;

/**
 * Created by laurenra on 2/4/17.
 */
public class Organization {

    private int id;
    private String description;
    private List<District> districts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", districts=" + districts +
                '}';
    }
}
