package com.satish.learning.day02_1._DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class DevDB {
    public String getDB(){
        return "This is Development DB";
    }

}
