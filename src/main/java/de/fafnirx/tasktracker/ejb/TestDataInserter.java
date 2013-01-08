/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fafnirx.tasktracker.ejb;

import de.fafnirx.tasktracker.entity.Task;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Singleton
@Startup
public class TestDataInserter {
    
    @PersistenceContext
    EntityManager em;
    
    @PostConstruct
    public void insertData() {
        em.persist(new Task("Task 10", "Description Task 10"));
        em.persist(new Task("Task 11", "Description Task 11"));
        em.persist(new Task("Task 12", "Description Task 12"));
    }
}
