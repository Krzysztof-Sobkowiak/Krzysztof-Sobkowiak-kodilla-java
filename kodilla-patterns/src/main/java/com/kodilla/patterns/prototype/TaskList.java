package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskList {

    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TaskList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        String s = "    List [" + name + "]";
        for(Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(! (o instanceof TaskList))
            return false;
        TaskList taskList = (TaskList) o;
        return getName().equals(taskList.getName()) && getTasks().equals(taskList.getTasks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTasks());
    }
}