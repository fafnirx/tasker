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
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Named
@ViewScoped
public class TasksBean {
    private List<Task> allTasks;
    private Task currentTask;
    private TaskModel taskModel;
    
    @Inject
    TasksDao taskDao;
    
    
    public String getGreeting() {
        return "World";
    }
    
    
    public TaskModel getAllTasks() {
        if (allTasks == null) {
            allTasks = taskDao.findAllTasks();
            taskModel = new TaskModel( allTasks, taskDao);
        }
        
        return taskModel;
    }
    public Task getSelectedTask() {
        return currentTask;
    }
    
    public void setSelectedTask( Task task) {
        currentTask = task;
    }
    
    public void updateTask() {
        String name = getSelectedTask().getName();
        System.out.println("Name = " + name);
    }
    
    public void createTask() {
        
    }
}
