package com.satish.learning.day02_1._DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DevDB implements DB{
    public String getDB(){
        return "This is Development DB";
    }

}
