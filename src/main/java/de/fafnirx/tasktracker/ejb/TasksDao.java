/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fafnirx.tasktracker.ejb;

import de.fafnirx.tasktracker.entity.Task;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Stateless
public class TasksDao {

    @PersistenceContext
    EntityManager em;
    
    
    public Task findTaskById( Long id) {
        return em.find(Task.class, id);
    }
    
    public List<Task> findAllTasks() {
        return em.createNamedQuery("findalltask").getResultList();
    }
}
