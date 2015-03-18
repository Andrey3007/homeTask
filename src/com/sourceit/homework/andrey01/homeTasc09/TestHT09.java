package com.sourceit.homework.andrey01.homeTasc09;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.threads.TaskExecutionFailedException;
import com.sourceit.homework.andrey01.homeTasc08.CopyFileFactoryImpl;

import java.io.*;

/**
 * Created by Андрей on 09.03.2015.
 */
public class TestHT09 {
    public static void main(String[] args) {
        TasksStorageImpl tasksStorage = new TasksStorageImpl();
        CopyFileFactory fileFactory = new CopyFileFactoryImpl();

        PrintStream printStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
        FindFilesTaskImpl find = null;

        CopyFileTaskImpl copyFileTask = new CopyFileTaskImpl(fileFactory.createChannelsCopyFileStrategy(),
                "C:\\workSpace\\homeTask\\resources\\GOPR6218.MP4",
                "C:\\workSpace\\homeTask\\resources\\newDestination.MP4");

        try {
            new FindFilesTaskImpl(printStream, "C:\\workSpace\\homeTask\\resources",
                    "source.txt");
        } catch (FileNotFoundException e) {
            e.getMessage();
        }


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    tasksStorage.add(new CopyFileTaskImpl(fileFactory.createChannelsCopyFileStrategy(),
                            "C:\\workSpace\\homeTask\\resources\\GOPR6218.MP4",
                            "C:\\workSpace\\homeTask\\resources\\newDestination.MP4"));
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    tasksStorage.add(new CopyFileTaskImpl(fileFactory.createChannelsCopyFileStrategy(),
                            "C:\\workSpace\\homeTask\\resources\\GOPR6218.MP4",
                            "C:\\workSpace\\homeTask\\resources\\newDestination.MP4"));
                }
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        tasksStorage.add(new FindFilesTaskImpl(printStream, "C:\\workSpace\\homeTask\\resources",
                                "source.txt"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);
        thread4.setDaemon(true);
        thread5.setDaemon(true);
        thread6.setDaemon(true);
        thread7.setDaemon(true);
        thread8.setDaemon(true);


        thread1.start();
        thread2.start();
        thread3.start();


        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
