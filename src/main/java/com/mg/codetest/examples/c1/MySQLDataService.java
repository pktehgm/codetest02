package com.mg.codetest.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,231,32,31};
    }
}
