package com;

import java.net.URL;

public class GetFilePath {
    public static void main(String[] args) {
        URL url01 = GetFilePath.class.getResource("");
        System.out.println("url01 = " + url01);
    }
}
