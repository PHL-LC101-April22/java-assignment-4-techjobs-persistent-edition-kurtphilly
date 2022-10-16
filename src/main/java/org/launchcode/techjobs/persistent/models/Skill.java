package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min=3)
    @NotBlank

    private String description;

    public Skill() {}



    public Skill(String name, String description) {
        super();
        this.setName(name);
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}