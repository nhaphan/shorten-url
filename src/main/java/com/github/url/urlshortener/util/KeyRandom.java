package com.github.url.urlshortener.util;

import java.util.concurrent.ThreadLocalRandom;

public class KeyRandom {
    public static String keyRandom() {
        String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder strRandom = new StringBuilder();
        int max = 61;
        int min = 0;
        for(int i = 0; i < 7; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            strRandom.append(characters.charAt(randomNum));
        }
        return strRandom.toString();
    }
}
