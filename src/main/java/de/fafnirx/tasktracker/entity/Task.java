/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fafnirx.tasktracker.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Entity
@NamedQueries({
    @NamedQuery(name="findalltask", query="SELECT t FROM Task t")
})
public class Task implements Serializable {
    @Id @GeneratedValue
    private Long id;
    
    private String name;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Task() {
    }
    
}
