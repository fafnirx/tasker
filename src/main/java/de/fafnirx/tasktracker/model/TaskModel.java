/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fafnirx.tasktracker.model;

import de.fafnirx.tasktracker.ejb.TasksDao;
import de.fafnirx.tasktracker.entity.Task;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author Mirko Leschikar <fafnirx@gmail.com>
 */
@Named
@ViewScoped
public class TaskModel extends ListDataModel<Task> implements Serializable,SelectableDataModel<Task> {
    
    TasksDao tasksDao;
    
    public TaskModel() {
        
    }
    
    public TaskModel( List<Task> data, TasksDao tasksDao) {
       super(data);
       this.tasksDao = tasksDao;
    }
    
    @Override
    public Object getRowKey(Task t) {
        return t.getId();
    }

    @Override
    public Task getRowData(String rowKey) {
        Long taskRowKey = Long.valueOf(rowKey);
        Task resultTask = tasksDao.findTaskById(taskRowKey);
        return resultTask;
    }
    
}
