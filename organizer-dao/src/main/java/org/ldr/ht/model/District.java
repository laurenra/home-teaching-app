package org.ldr.ht.model;

import java.util.List;

/**
 * Created by laurenra on 2/4/17.
 */
public class District {

    private int id;
    private String description;
    private List<Companionship> companionships;

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

    public List<Companionship> getCompanionships() {
        return companionships;
    }

    public void setCompanionships(List<Companionship> companionships) {
        this.companionships = companionships;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", companionships=" + companionships +
                '}';
    }
}
