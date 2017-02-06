package org.ldr.ht.model;

import java.util.List;

/**
 * Created by laurenra on 2/4/17.
 */
public class Unit {

    private int id;
    private String description;
    private List<Organization> organizations;

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

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", organizations=" + organizations +
                '}';
    }
}
