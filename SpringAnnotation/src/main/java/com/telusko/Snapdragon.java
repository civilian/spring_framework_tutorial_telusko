package com.telusko;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{

    public void process(){
        System.out.println("World best cpu");
    }
}