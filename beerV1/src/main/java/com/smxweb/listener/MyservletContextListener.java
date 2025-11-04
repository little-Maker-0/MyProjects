package com.smxweb.listener;

import com.smxweb.model.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyservletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        String name = sc.getInitParameter("breed");
        Dog d = new Dog(name);
        sc.setAttribute("dog", d);
    }
}
