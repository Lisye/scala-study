package com.leo.chapter07.myextends;

public class JavaDaynamicBind {
    public static void main(String[] args) {
        AA obj = new BB();
        System.out.println(obj.sum()); //40 //? 30
        System.out.println(obj.sum1()); //30 //? 20

        System.out.println(obj.i);
    }
}

class AA {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class BB extends AA {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}