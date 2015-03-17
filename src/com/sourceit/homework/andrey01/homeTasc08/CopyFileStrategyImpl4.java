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
        File file = new File(s);
        File file1 = new File(s1);
        copyFile(file, file1);
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        if (file1 != null && file1.exists()) {
            throw new FileAlreadyPresentsException("File is already present");
        }
        try {
            Files.copy(file.toPath(), file1.toPath());
        } catch (FileAlreadyExistsException e) {
            throw new FileAlreadyPresentsException("File is already present");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
