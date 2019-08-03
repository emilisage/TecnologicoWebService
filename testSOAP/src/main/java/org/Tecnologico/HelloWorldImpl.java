
package org.Tecnologico;

import javax.jws.WebService;

@WebService(endpointInterface = "org.Tecnologico.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

