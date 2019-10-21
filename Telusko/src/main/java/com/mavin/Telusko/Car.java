package com.mavin.Telusko;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    public void drive(){
        System.out.println("Run run run ...");
    }
}