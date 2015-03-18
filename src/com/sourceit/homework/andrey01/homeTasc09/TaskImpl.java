package com.sourceit.homework.andrey01.homeTasc09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

/**
 * Created by Андрей on 17.03.2015.
 */
public class TaskImpl implements Task {
    private int tryCount;

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        incTryCount();
        if(getTryCount()>5){
            throw new TaskExecutionFailedException("tryCount= 5");
        }
    }
}
