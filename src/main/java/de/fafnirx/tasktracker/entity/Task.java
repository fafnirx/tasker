/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fafnirx.tasktracker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Entity
public class Task {
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
