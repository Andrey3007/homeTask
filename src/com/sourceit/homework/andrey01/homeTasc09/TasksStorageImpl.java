package com.sourceit.homework.andrey01.homeTasc09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TasksStorage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Андрей on 17.03.2015.
 */
public class TasksStorageImpl implements TasksStorage {

    LinkedList<Task> list = new LinkedList<>();

    @Override
    public void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException("task is null");
        }
        list.addFirst(task);
    }

    @Override
    public synchronized Task get() {
        if(list.size()>0){
            return list.removeLast();
        }else {
            throw new NullPointerException("storage is null");
        }

    }

    @Override
    public int count() {
        return list.size();
    }
}
