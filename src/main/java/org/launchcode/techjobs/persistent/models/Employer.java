package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {


    @Size(min=3, max=255)
    @NotBlank
private String location;


    public Employer() {
    }

    public Employer(String name, String location) {
        super();
        this.setName(name);
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
