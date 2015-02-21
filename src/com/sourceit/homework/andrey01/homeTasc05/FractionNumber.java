package com.sourceit.homework.andrey01.homeTasc05;

/**
 * Created by Андрей on 21.02.2015.
 */
public class FractionNumber implements com.sourceit.hometask.basic.FractionNumber {
    static int 	DEFAULT_DIVISOR_VALUE=1;
    int divident;
    int divisor;

    @Override
    public void setDividend(int i) {
        divident=i;
    }

    @Override
    public int getDividend() {
        return divident;
    }

    @Override
    public void setDivisor(int i) {
divisor=i;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double doubleValue() {
        return ((double)(divident))/divisor;
    }

    @Override
    public int compareTo(com.sourceit.hometask.basic.FractionNumber o) {
        return 0;
    } // Я не понимаю что должен делать этот метод

    @Override
    public String toString() {
        String s=getDividend()+"/"+getDivisor();
        return s;
    }
}
