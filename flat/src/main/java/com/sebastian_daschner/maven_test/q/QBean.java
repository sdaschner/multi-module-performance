package com.sebastian_daschner.maven_test.q;

import javax.ejb.Local;

@Local
public interface QBean {

    String get();

    Q get(String id);

}

