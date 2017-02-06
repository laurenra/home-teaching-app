package org.ldr.ht.model;

import java.util.List;

/**
 * Created by laurenra on 2/4/17.
 */
public class Teachers {

    private List<Person> teachers;

    public List<Person> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Person> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "teachers=" + teachers +
                '}';
    }
}
