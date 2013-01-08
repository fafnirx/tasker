/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fafnirx.tasktracker.bean;

import de.fafnirx.tasktracker.entity.Task;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Named
@RequestScoped
public class TasksBean {
    private List<Task> allTasks;
    
    public String getGreeting() {
        return "World";
    }
    
    public List<Task> getAllTasks() {
        if (allTasks == null) {
            allTasks = new ArrayList<Task>();
            
            allTasks.add(new Task("Task1", "Description Task 1"));
            allTasks.add(new Task("Task2", "Description Task 2"));
            allTasks.add(new Task("Task3", "Description Task 3"));
            allTasks.add(new Task("Task4", "Description Task 4"));
            allTasks.add(new Task("Task5", "Description Task 5"));
        }
        
        return allTasks;
    }
}
