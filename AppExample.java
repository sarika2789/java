package com.sample;
import javax.ws.rs.core.Application;  
import java.util.HashSet;  
import java.util.Set;

public class AppExample extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(RestExample.class);

        return classes;
    }
}
