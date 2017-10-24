/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author J.D.
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
 
public class execTask {
    public static void main(String[] args) 
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 2; i <= 20; i++) 
        {
            Task task = new Task( i + " People" );
            System.out.println("Normal Table Seating: " + task.getName());
            executor.execute(task);
        }
        executor.shutdown();
    }
}