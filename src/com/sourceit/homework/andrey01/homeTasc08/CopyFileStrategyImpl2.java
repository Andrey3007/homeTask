package com.sourceit.homework.andrey01.homeTasc08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;

/**
 * Created by Андрей on 15.03.2015.
 */
public class CopyFileStrategyImpl2 implements CopyFileStrategy {
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
        try (BufferedInputStream bufIn = new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
             BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(file1.getAbsolutePath()))) {
            int i;
            for (; (i = bufIn.read()) != -1; ) {
                bufOut.write(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
