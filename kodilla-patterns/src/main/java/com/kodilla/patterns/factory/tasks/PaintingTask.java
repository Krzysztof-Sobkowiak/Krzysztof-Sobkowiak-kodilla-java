package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isTaskExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Painting: " + taskName + ", Color: " + color + ", What to paint: " + whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        isTaskExecuted = true;
        return isTaskExecuted;
    }
}