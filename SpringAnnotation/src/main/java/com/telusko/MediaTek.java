package com.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
class MediaTek implements MobileProcessor{
    
    public void process(){
        System.out.println("2nd best cpu");
    }
}