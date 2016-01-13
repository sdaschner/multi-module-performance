package com.sebastian_daschner.maven_test.g;

import javax.ejb.Local;

@Local
public interface GBean {

    String get();

    G get(String id);

}

