package com.sourceit.homework.andrey01.homeTasc08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Андрей on 15.03.2015.
 */
public class CopyFileStrategyImpl4 implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            Path pathSource = Paths.get(s);
            Path pathDestination = Paths.get(s1);
            Files.copy(pathSource, pathDestination);
        } catch (FileAlreadyExistsException e) {
            throw new FileAlreadyPresentsException("File is already present");
        } catch (IOException e) {
            System.err.println("yew");
            e.printStackTrace();
        }


    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            Files.copy(file.toPath(), file1.toPath());
        } catch (FileAlreadyExistsException e) {
            throw new FileAlreadyPresentsException("File is already present");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
