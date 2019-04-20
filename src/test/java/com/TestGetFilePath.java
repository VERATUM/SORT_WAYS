package com;

import org.junit.Test;

import java.net.URL;

public class TestGetFilePath {

    @Test
    public void get0() {
        String canonicalName = this.getClass().getCanonicalName();
        System.out.println("canonicalName = " + canonicalName);
        String name = this.getClass().getName();
        System.out.println("name = " + name);

        String path = TestGetFilePath.class.getResource("/").getPath();
        System.out.println("path = " + path);
    }
    @Test
    public void get01() {
        URL url = TestGetFilePath.class.getResource("");
        System.out.println("url = " + url);
        //url = jar:file:/D:/JetBrains/IntelliJ%20IDEA%202018.2.8/lib/idea_rt.jar!/com/
        String encode = System.getProperty("file.encoding");
        System.out.println("encode = " + encode);
    }

    @Test
    public void get02() {
        URL url = TestGetFilePath.class.getResource("/");
        System.out.println("url = " + url);
        //url = file:/G:/01_IDEA_WORKSPACE/GitCheckout/SORT_WAYS/target/test-classes/
    }

    @Test
    public void get03() {
        URL url = Thread.currentThread().getContextClassLoader().getResource("");
        System.out.println("url = " + url);
        //url = file:/G:/01_IDEA_WORKSPACE/GitCheckout/SORT_WAYS/target/test-classes/
    }

    @Test
    public void get04() {
        URL resource = TestGetFilePath.class.getClassLoader().getResource("");
        System.out.println("url = " + resource);
        //url = file:/G:/01_IDEA_WORKSPACE/GitCheckout/SORT_WAYS/target/test-classes/
    }

    @Test
    public void get05() {
        URL resource = ClassLoader.getSystemResource("");
        System.out.println("url = " + resource);
        //url = file:/G:/01_IDEA_WORKSPACE/GitCheckout/SORT_WAYS/target/test-classes/
    }
}
