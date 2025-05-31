package com.satish.learning.day02_1._DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public interface DB {

    String getDB();
}
