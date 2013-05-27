package com.kaniyarasu.pojos;

/**
 * Created by IntelliJ IDEA.
 * User: kaniyarasu
 * Date: 27/5/13
 * Time: 5:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void sayHello(){
        System.out.print("Hello ! " + name);
    }
}
