/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author J.D.
 */
class Task implements Runnable 
{
    private String name;
 
    public Task(String name) 
    {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    @Override
    public void run() 
    {
        try
        {
            Long duration = (long) (15);
            System.out.println("Table Request: " + name);
            TimeUnit.SECONDS.sleep(duration);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}