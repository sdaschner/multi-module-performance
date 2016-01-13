package com.sebastian_daschner.maven_test.i;

import javax.ejb.Local;

@Local
public interface IBean {

    String get();

    I get(String id);

}

