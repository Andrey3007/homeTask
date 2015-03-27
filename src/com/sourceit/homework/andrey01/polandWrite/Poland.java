package com.sourceit.homework.andrey01.polandWrite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Андрей on 25.03.2015.
 */
public class Poland {
    LinkedList operations = new LinkedList();
    LinkedList endEntry = new LinkedList();
    LinkedList inPut = new LinkedList();
    LinkedList result= new LinkedList();





    public Double fullPoland(String s){
        s = s.replaceAll(" ", "");
        prepare(s);
        try {
            convToPoland();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        calcPoland();
        inPut.remove();
        endEntry.remove();
        operations.remove();
        return (Double)result.removeLast();
    }

    private void calcPoland(){
        for(int i=0; i<endEntry.size(); i++){
            if(endEntry.get(i) instanceof Double){
                result.add(endEntry.get(i));
            }else{
                switch ((char)endEntry.get(i)){
                    case '+':
                        result.add((Double)result.remove(result.size()-2)+(Double)result.removeLast());
                        break;
                    case '-':
                        result.add((Double)result.remove(result.size()-2)-(Double)result.removeLast());
                        break;
                    case '*':
                        result.add((Double)result.remove(result.size()-2)*(Double)result.removeLast());
                        break;
                    case '/':
                        result.add((Double)result.remove(result.size()-2)/(Double)result.removeLast());
                        break;
                }
            }
        }
    }

    private void convToPoland() throws Exception {
        operations.addLast(inPut.removeFirst());


       for(;;){
            Object ob= inPut.getFirst();
            if (ob instanceof Double) {
                endEntry.addLast(inPut.removeFirst());
            } else {


                char inP = (char) inPut.getFirst();
                char opL = (char) operations.getLast();


                switch (opL) {
                    case '+':
                        switch (inP) {
                            case '+':
                                action2();
                                break;
                            case '-':
                                action2();
                                break;
                            case '*':
                                action1();
                                break;
                            case '/':
                                action1();
                                break;
                            case '(':
                                action1();
                                break;
                            case ')':
                                action2();
                                break;
                            case '|':
                                action2();
                                break;
                        }
                        break;
                    case '-':
                        switch (inP) {
                            case '+':
                                action2();
                                break;
                            case '-':
                                action2();
                                break;
                            case '*':
                                action1();
                                break;
                            case '/':
                                action1();
                                break;
                            case '(':
                                action1();
                                break;
                            case ')':
                                action2();
                                break;
                            case '|':
                                action2();
                                break;
                        }
                        break;
                    case '*':
                        switch (inP) {
                            case '+':
                                action2();
                                break;
                            case '-':
                                action2();
                                break;
                            case '*':
                                action2();
                                break;
                            case '/':
                                action2();
                                break;
                            case '(':
                                action1();
                                break;
                            case ')':
                                action2();
                                break;
                            case '|':
                                action2();
                                break;
                        }
                        break;
                    case '/':
                        switch (inP) {
                            case '+':
                                action2();
                                break;
                            case '-':
                                action2();
                                break;
                            case '*':
                                action2();
                                break;
                            case '/':
                                action2();
                                break;
                            case '(':
                                action1();
                                break;
                            case ')':
                                action2();
                                break;
                            case '|':
                                action2();
                                break;
                        }
                        break;
                    case '(':
                        switch (inP) {
                            case '+':
                                action1();
                                break;
                            case '-':
                                action1();
                                break;
                            case '*':
                                action1();
                                break;
                            case '/':
                                action1();
                                break;
                            case '(':
                                action1();
                                break;
                            case ')':
                                action3();
                                break;
                            case '|':
                                action5();
                                break;
                        }
                        break;
                    case ')':
                        action5();
                        break;
                    case '|':
                        switch (inP) {
                            case '+':
                                action1();
                                break;
                            case '-':
                                action1();
                                break;
                            case '*':
                                action1();
                                break;
                            case '/':
                                action1();
                                break;
                            case '(':
                                action1();
                                break;
                            case ')':
                                action5();
                                break;
                            case '|':
                                action4();
                                return;
                        }
                        break;
                }
            }


        }
    }



    private void prepare(String s) {
        s = s.replaceAll(",", ".");
        char c[] = s.toCharArray();
        StringBuilder s2 = new StringBuilder();

        for (char x : c) {
            if (x == '+' || x == '-' || x == '*' || x == '/' || x == '(' || x == ')') {
                Double d = null;
                if (s2.length() != 0) {
                    d = Double.parseDouble(s2.toString());
                }
                if (d != null) {
                    inPut.addLast(d);
                }
                inPut.addLast(x);
                s2.delete(0, s2.length());
            } else {
                s2.append(x);
            }

        }

        inPut.addFirst('|');
        inPut.addLast('|');
    }




    private void action1() {
        operations.addLast(inPut.removeFirst());
    }

    private void action2() {
        endEntry.addLast(operations.removeLast());
    }

    private void action3() {
        inPut.removeFirst();
        operations.removeLast();
    }

    private void action4() {
        System.out.println("OK");
    }

    private void action5() throws Exception {
        throw new Exception("not correct");
    }


}
