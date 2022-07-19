package com.example.generic;

public class Print<T> {

    private T text;

    public void setText(T text) {
        this.text = text;
    }

    public void printText() {
        System.out.print(this.text);
    }
}
