/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dj.magatzem.objectes.utils;

import java.io.PrintStream;

/**
 * Exemple singleton
 * @author Blau9
 */
public class Logger {
    private PrintStream out;
    private PrintStream err;
    private Logger(){ 
        out=System.out;
        err=System.err;
    }

    private static Logger instance;

    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }
    public void error(Object message){
        err.println(message);
    }
    public void warn(Object message){
        out.println("WARN: "+ message);
    }
    public void debug(Object message){
        out.println(message);
    }
    
}
