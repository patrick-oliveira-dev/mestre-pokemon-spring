package one.digitalinnovation.pps.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {

    @Id
    private Long id;
    private String name;
    @JsonProperty("base_experience")
    private Long baseExperience;
    private Long height;
    private Long weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Long baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
