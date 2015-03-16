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
        try (BufferedInputStream bufIn = new BufferedInputStream(new FileInputStream(s));
             BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(s1))) {
            int i;
            for (; (i = bufIn.read()) != -1; ) {
                bufOut.write(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new FileAlreadyPresentsException("File is already present");
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
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
        throw new FileAlreadyPresentsException("File is already present");
    }
}
