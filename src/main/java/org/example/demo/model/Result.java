package org.example.demo.model;

public class Result {
    private final int a;
    private final int b;
    private final int result;

    public Result(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResult() {
        return result;
    }
}
