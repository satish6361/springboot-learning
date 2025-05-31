package com.satish.learning.day02_1._DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {


    final private DB db;

    public DBService(DB db){
        this.db = db;
    }


    public String getDB(){
        return db.getDB();
    }

}
