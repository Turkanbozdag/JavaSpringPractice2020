package day43_MethodOverriding.CARTask;

import day43_MethodOverriding.CARTask.Car;

public class Jeep extends Car {
    public  void start(){
        System.out.println("call mechanic");
        System.out.println("oil change");
        System.out.println("jump start");
    }
}
