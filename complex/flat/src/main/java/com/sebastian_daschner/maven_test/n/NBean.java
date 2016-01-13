package com.sebastian_daschner.maven_test.n;

import javax.ejb.Local;

@Local
public interface NBean {

    String get();

    N get(String id);

}

