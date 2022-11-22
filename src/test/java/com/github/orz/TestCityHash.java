package com.github.orz;

public class TestCityHash {
    public static void main(String[] args) {
        CityHash hasher = new CityHash();

        String s = "";
        for (int i = 0; i < 300; i++) {
            s = s + "a";
            long hash = hasher.hash64WithSeed(s, 0);

            System.out.printf("%s\t%s\t%d\n", s, Long.toHexString(hash), hash);
        }
    }
}