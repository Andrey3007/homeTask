package com.sourceit.homework.andrey01.homeTasc09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TaskExecutionFailedException;
import com.sourceit.hometask.threads.TaskExecutor;
import com.sourceit.hometask.threads.TasksStorage;

/**
 * Created by Андрей on 17.03.2015.
 */
public class TaskExecutorImpl implements TaskExecutor {

    TaskExecutorImpl(TasksStorage tasksStorage){
        setStorage(tasksStorage);
    }

    private TasksStorage storage;

    @Override
    public void setStorage(TasksStorage tasksStorage) throws NullPointerException {
        if(tasksStorage==null){
            throw new NullPointerException("specified task storage is null");
        }
        this.storage = tasksStorage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        if(storage.count()==0){
            throw new NullPointerException("storage is null");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Task task=storage.get();

        try {
            task.execute();
        } catch (TaskExecutionFailedException e) {
            if(task.getTryCount()<5){
                storage.add(task);
            }
        }
        start();
    }

    @Override
    public void stop() throws IllegalStateException {
        Thread.currentThread().interrupt();
    }
}
