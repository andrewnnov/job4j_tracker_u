package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> taskSet = new HashSet<>();

        for (Task task : tasks) {
            taskSet.add(task.getNumber());
        }
        return taskSet;
    }
}
