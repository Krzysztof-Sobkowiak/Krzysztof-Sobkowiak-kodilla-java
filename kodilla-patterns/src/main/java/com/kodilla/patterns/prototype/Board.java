package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Board extends Prototype<Board>{

    private String name;
    private Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "    Board [" + name + "]";
        for(TaskList list : lists) {
            s = s + "\n" + list.toString();
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Board deepCopy() throws  CloneNotSupportedException {
        Board clonedBoard = super.clone();
        clonedBoard.lists = new HashSet<>();
        for(TaskList theList : lists) {
            TaskList clonedList = new TaskList(theList.getName());
            for(Task task : theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(! (o instanceof Board))
            return false;
        Board board = (Board) o;
        return getName().equals(board.getName()) && getLists().equals(board.getLists());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLists());
    }
}