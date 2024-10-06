package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class ClassA{
    public ClassA(){
    }

    public void print(){
        System.out.println("Class A");
    }
    public void test(){
        System.out.println("Test A");
    }
}

class ClassB{
    private int a;
    public void print(){
        System.out.println("Class B");
    }

    public void test(){
        System.out.println("Test B");
    }

    public ClassB(){
        System.out.println("Class B Constructor");
        System.out.println("Class B Constructor");
        System.out.println("Class B Constructor");
    }
}

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
    }
}
