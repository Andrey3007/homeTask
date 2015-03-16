package com.sourceit.homework.andrey01.homeTasc08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;

/**
 * Created by Андрей on 15.03.2015.
 */
public class CopyFileStrategy1 implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try (FileInputStream in = new FileInputStream(s); FileOutputStream out = new FileOutputStream(s1)) {
            int read;
            for (; (read = in.read()) != -1; ) {
                out.write(read);
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
        try (FileInputStream in = new FileInputStream(file.getAbsolutePath());
             FileOutputStream out = new FileOutputStream(file1.getAbsolutePath())) {
            int read;
            for (; (read = in.read()) != -1; ) {
                out.write(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new FileAlreadyPresentsException("File is already present");
    }
}
