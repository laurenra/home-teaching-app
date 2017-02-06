package org.ldr.ht.model;

/**
 * Created by laurenra on 2/4/17.
 */
public class Companionship {

    private int id;
    private Teachers teachers;
    private Teachees teachees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public Teachees getTeachees() {
        return teachees;
    }

    public void setTeachees(Teachees teachees) {
        this.teachees = teachees;
    }

    @Override
    public String toString() {
        return "Companionship{" +
                "id=" + id +
                ", teachers=" + teachers +
                ", teachees=" + teachees +
                '}';
    }
}
