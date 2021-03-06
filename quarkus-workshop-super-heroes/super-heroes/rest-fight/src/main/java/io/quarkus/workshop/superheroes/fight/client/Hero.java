// tag::adocBean[]
package io.quarkus.workshop.superheroes.fight.client;

// end::adocBean[]
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.validation.constraints.NotNull;

// tag::adocBean[]
@Schema(description="The hero fighting against the villain")
public class Hero {

    @NotNull
    private String name;
    @NotNull
    private int level;
    @NotNull
    private String picture;
    private String powers;

    // Getters and setters

    // tag::adocSkip[]
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    @Override
    public String toString() {
        return "Hero{" +
            "name='" + name + '\'' +
            ", level=" + level +
            ", picture='" + picture + '\'' +
            ", powers='" + powers + '\'' +
            '}';
    }
    // end::adocSkip[]
}
// end::adocBean[]
