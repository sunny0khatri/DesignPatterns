package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        s1.setMsg("Hello");
        Singleton s2=Singleton.getInstance();
        s2.setMsg("Hi");
        System.out.println("debug");
    }
}
