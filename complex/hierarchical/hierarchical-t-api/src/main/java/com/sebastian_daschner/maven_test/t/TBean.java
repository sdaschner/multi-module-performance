package com.sebastian_daschner.maven_test.t;

import javax.ejb.Local;

@Local
public interface TBean {

    String get();

    T get(String id);

}

