package ru.netology.sqr;

public class SQRService {

    public int calc(int min, int max) {
        int result = 0;


        for (int i = 10; i <= 99; i++) {
            int sqrt = i * i;
            if (sqrt >= min) {
                if (sqrt <= max) {
                    result++;
                }
            }
        }
        return result;
    }
}




