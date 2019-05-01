package com.test.taskrun.rest;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//@Singleton
//@Startup
@ApplicationPath("/")
public class RestApplication extends Application {

//    @Schedule(hour = "*", minute = "*", second ="*", persistent = false)
//    public void test(){
//        System.out.println("Teste");
//    }

}
