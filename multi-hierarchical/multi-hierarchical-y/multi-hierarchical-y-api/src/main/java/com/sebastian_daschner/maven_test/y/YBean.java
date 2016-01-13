package com.sebastian_daschner.maven_test.y;

import javax.ejb.Local;

@Local
public interface YBean {

    String get();

    Y get(String id);

}

