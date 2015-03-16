package com.sourceit.homework.andrey01.homeTasc08;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;

/**
 * Created by Андрей on 15.03.2015.
 */
public class CopyFileFactoryImpl implements CopyFileFactory {
    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        return new CopyFileStrategy1();
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new CopyFileStrategyImpl2();
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new CopyFileStrategyImpl3();
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new CopyFileStrategyImpl4();
    }
}
