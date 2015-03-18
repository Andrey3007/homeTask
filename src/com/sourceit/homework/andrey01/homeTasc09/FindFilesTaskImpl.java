package com.sourceit.homework.andrey01.homeTasc09;

import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.*;

/**
 * Created by Андрей on 17.03.2015.
 */
public class FindFilesTaskImpl extends TaskImpl implements FindFilesTask {
    private String directory;
    private String name;
    private PrintStream stream;

    FindFilesTaskImpl(PrintStream printStream, String directory, String fileName) throws FileNotFoundException {
        setPrintStream(printStream);
        setDirectory(directory);
        setFileNameSearchString(fileName);
    }

    @Override
    public void setDirectory(String s) throws NullPointerException, FileNotFoundException {
        if (s == null) {
            throw new NullPointerException("directory is null");
        }

        if (!(new File("C:\\Games").exists())) {
            throw new FileNotFoundException("directory does not exist");
        }
        this.directory = s;
    }

    @Override
    public void setFileNameSearchString(String s) throws IllegalArgumentException {
        if (s == null) {
            throw new IllegalArgumentException("searchString is null");
        }
        this.name = s;
    }

    @Override
    public void setPrintStream(PrintStream printStream) {
        this.stream = printStream;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        super.execute();
        File file = new File(directory + "\\" + name);
        if (file.exists()) {
            stream.println(file.getAbsolutePath());
        } else {
            throw new TaskExecutionFailedException("ExecutionFailed");
        }

    }
}
