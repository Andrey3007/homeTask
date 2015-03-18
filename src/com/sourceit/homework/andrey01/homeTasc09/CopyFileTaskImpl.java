package com.sourceit.homework.andrey01.homeTasc09;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sourceit.hometask.threads.CopyFileTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;
import com.sourceit.homework.andrey01.homeTasc08.CopyFileStrategyImpl3;

/**
 * Created by Андрей on 17.03.2015.
 */
public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {
    private String source;
    private String destiny;
    private CopyFileStrategy copyFileStrategy;

    CopyFileTaskImpl(CopyFileStrategy copyFileStrategy,String source,String destiny){
        setFileCopyUtils(copyFileStrategy);
        setDestinyFilePath(destiny);
        setSourceFilePath(source);
    }

    @Override
    public void setFileCopyUtils(CopyFileStrategy copyFileStrategy) {
        this.copyFileStrategy=copyFileStrategy;
    }

    @Override
    public void setSourceFilePath(String s) {
        this.source = s;
    }

    @Override
    public void setDestinyFilePath(String s) {
        this.destiny = s;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        super.execute();
        try {
            copyFileStrategy.copyFile(source,destiny);
        } catch (FileCopyFailedException e) {
            System.out.println(e.getMessage());
        }

    }
}
