package com.sebastian_daschner.maven_test.k;

import javax.ejb.Local;

@Local
public interface KBean {

    String get();

    K get(String id);

}

