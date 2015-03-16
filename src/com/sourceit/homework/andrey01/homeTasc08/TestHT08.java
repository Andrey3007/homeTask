package com.sourceit.homework.andrey01.homeTasc08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Андрей on 09.03.2015.
 */
public class TestHT08 {
    public static void main(String[] args) {
        CopyFileFactoryImpl cop = new CopyFileFactoryImpl();

        CopyFileStrategy simple = cop.createSimpleCopyFileStrategy();
        CopyFileStrategy buffer = cop.createBufferedCopyFileStrategy();
        CopyFileStrategy channels = cop.createChannelsCopyFileStrategy();
        CopyFileStrategy filesCopy = cop.createFilesCopyFileStrategy();

        String source = "C:\\workSpace\\homeTask\\resources\\GOPR6218.MP4";
        String destination = "C:\\workSpace\\homeTask\\resources\\newDestination.MP4";

        File sourceFile = new File("C:\\workSpace\\homeTask\\resources\\GOPR6218.MP4");
        File destinationFile = new File("C:\\workSpace\\homeTask\\resources\\newDestination.MP4");
        long start;
        long end;


        start = System.nanoTime();
        try {
            simple.copyFile(source, destination);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            simple.copyFile(sourceFile, destinationFile);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            buffer.copyFile(source, destination);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            buffer.copyFile(sourceFile, destinationFile);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            channels.copyFile(source, destination);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            channels.copyFile(sourceFile, destinationFile);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            filesCopy.copyFile(source, destination);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            System.out.println("FileCopyFailedException");
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            filesCopy.copyFile(sourceFile, destinationFile);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


    }
}
