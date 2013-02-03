/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fafnirx.tasktracker.bean;

import de.fafnirx.tasktracker.ejb.TasksDao;
import de.fafnirx.tasktracker.entity.Task;
import de.fafnirx.tasktracker.model.TaskModel;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Named
@RequestScoped
public class TasksBean {
    private List<Task> allTasks;
    private Task currentTask;
    
    @Inject
    TasksDao taskDao;
    
    
    public String getGreeting() {
        return "World";
    }
    
    
    public TaskModel getAllTasks() {
        if (allTasks == null) {
            allTasks = taskDao.findAllTasks();
        }
        
        return new TaskModel( allTasks, taskDao);
    }
    public Task getSelectedTask() {
        return currentTask;
    }
    public void setSelectedTask( Task task) {
        currentTask = task;
    }
}
