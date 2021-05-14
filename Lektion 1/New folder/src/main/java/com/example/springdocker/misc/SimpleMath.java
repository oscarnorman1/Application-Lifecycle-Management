package com.example.springdocker.misc;

public class SimpleMath {

    public int addPositives(int a, int b) {
        if (a < 0 && b < 0)
            throw new IndexOutOfBoundsException("Båda får er vara negativa");

        return a + b;
    }

}
