package com.dblibproject.dblibproject;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomSumService {

    private final Random random = new Random();

    public int getRandomSum() {
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        return num1 + num2;
    }
}