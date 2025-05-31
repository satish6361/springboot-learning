package com.satish.learning.day02_1._DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ProdDB implements DB{
    public String getDB(){
        return "This is Production DB";
    }

}
