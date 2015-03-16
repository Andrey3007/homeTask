package com.sourceit.homework.andrey01.homeTasc08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;
import java.nio.Buffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

/**
 * Created by Андрей on 15.03.2015.
 */
public class CopyFileStrategyImpl3 implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try (FileChannel in = new FileInputStream(s).getChannel();
             FileChannel out = new FileOutputStream(s1).getChannel()) {
            out.transferFrom(in, 0, in.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new FileAlreadyPresentsException("File is already present");
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try (FileChannel in = new FileInputStream(file.getAbsolutePath()).getChannel();
             FileChannel out = new FileOutputStream(file1.getAbsolutePath()).getChannel()) {
            out.transferFrom(in, 0, in.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new FileAlreadyPresentsException("File is already present");
    }
}
