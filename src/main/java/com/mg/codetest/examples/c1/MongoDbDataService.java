package com.mg.codetest.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {4,5,6,7,8,9};
    }

}
