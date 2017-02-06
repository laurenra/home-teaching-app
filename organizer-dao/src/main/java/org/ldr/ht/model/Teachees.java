package org.ldr.ht.model;

import java.util.List;

/**
 * Created by laurenra on 2/4/17.
 */
public class Teachees {

    private List<Teachees> teachees;

    public List<Teachees> getTeachees() {
        return teachees;
    }

    public void setTeachees(List<Teachees> teachees) {
        this.teachees = teachees;
    }

    @Override
    public String toString() {
        return "Teachees{" +
                "teachees=" + teachees +
                '}';
    }
}
