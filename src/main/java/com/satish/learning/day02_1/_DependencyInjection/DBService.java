package com.satish.learning.day02_1._DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    ProdDB db;
    public String getDB(){
        return db.getDB();
    }

}
