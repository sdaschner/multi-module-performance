#!/bin/bash

data=(a b c d e f g h i j k l m n o p q r s t u v w x y z)

mkdir -p hierarchical-web-ui/src/main/java/com/sebastian_daschner/maven_test/

for val in ${data[@]}; do
    upperVal=${val^^}

    mkdir -p hierarchical-$val-{api,core,model,ui}/src/main/java/com/sebastian_daschner/maven_test/$val/

    tee hierarchical-$val-api/src/main/java/com/sebastian_daschner/maven_test/$val/${upperVal}Bean.java << EOF
package com.sebastian_daschner.maven_test.$val;

import javax.ejb.Local;

@Local
public interface ${upperVal}Bean {

    String get();

    ${upperVal} get(String id);

}

EOF

    tee hierarchical-$val-core/src/main/java/com/sebastian_daschner/maven_test/$val/${upperVal}BeanImpl.java << EOF
package com.sebastian_daschner.maven_test.$val;

import javax.ejb.Stateless;

@Stateless
public class ${upperVal}BeanImpl implements ${upperVal}Bean {

    @Override
    public String get() {
        return "${val}";
    }

    @Override
    public ${upperVal} get(String id) {
        return new ${upperVal}(id);
    }

}
EOF
    
    tee hierarchical-$val-model/src/main/java/com/sebastian_daschner/maven_test/$val/${upperVal}.java << EOF
package com.sebastian_daschner.maven_test.$val;

public class ${upperVal} {

    private String $val;

    public $upperVal(String $val) {
        this.$val = $val;
    }

    public String get${upperVal}() {
        return $val;
    }

    public void set${upperVal}(String $val) {
        this.$val = $val;
    }

}
EOF

    tee hierarchical-$val-ui/src/main/java/com/sebastian_daschner/maven_test/$val/${upperVal}Resource.java << EOF
package com.sebastian_daschner.maven_test.$val;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("${val}")
public class ${upperVal}Resource {

    @Inject
    ${upperVal}Bean ${val};

    @GET
    public String get() {
        return ${val}.get();
    }

    @GET
    @Path("{id}")
    public ${upperVal} get(@PathParam("id") String id) {
        return ${val}.get(id);
    }

}
EOF

    tee hierarchical-$val-core/pom.xml << EOF
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <artifactId>hierarchical-${val}-core</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <parent>
        <groupId>com.sebastian-daschner</groupId>
        <artifactId>hierarchical-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-api</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-model</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

</project>
EOF

    tee hierarchical-$val-api/pom.xml << EOF
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <artifactId>hierarchical-${val}-api</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <parent>
        <groupId>com.sebastian-daschner</groupId>
        <artifactId>hierarchical-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-model</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

</project>
EOF

    tee hierarchical-$val-model/pom.xml << EOF
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <artifactId>hierarchical-${val}-model</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <parent>
        <groupId>com.sebastian-daschner</groupId>
        <artifactId>hierarchical-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

</project>
EOF

    tee hierarchical-$val-ui/pom.xml << EOF
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <artifactId>hierarchical-${val}-ui</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <parent>
        <groupId>com.sebastian-daschner</groupId>
        <artifactId>hierarchical-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-api</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-core</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-model</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

</project>
EOF

done

tee hierarchical-web-ui/pom.xml << EOF
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <artifactId>hierarchical-web-ui</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>war</packaging>

    <parent>
        <groupId>com.sebastian-daschner</groupId>
        <artifactId>hierarchical-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <dependencies>
EOF

tee pom.xml << EOF
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.sebastian-daschner</groupId>
    <artifactId>hierarchical-parent</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>pom</packaging>

    <modules>
        <module>hierarchical-web-ui</module>
EOF

for val in ${data[@]}; do

tee -a hierarchical-web-ui/pom.xml << EOF
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-api</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-core</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-model</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.sebastian-daschner</groupId>
            <artifactId>hierarchical-${val}-ui</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
EOF

tee -a pom.xml << EOF
        <module>hierarchical-${val}-api</module>
        <module>hierarchical-${val}-model</module>
        <module>hierarchical-${val}-core</module>
        <module>hierarchical-${val}-ui</module>
EOF

done
tee -a hierarchical-web-ui/pom.xml << EOF
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

    <properties>
        <failOnMissingWebXml>false</failOnMissingWebXml>
    </properties>

</project>
EOF

tee -a pom.xml << EOF
    </modules>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
</project>
EOF

tee -a hierarchical-web-ui/src/main/java/com/sebastian_daschner/maven_test/JAXRSConfiguration.java << EOF
package com.sebastian_daschner.maven_test;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {
    // nothing to configure
}
EOF
