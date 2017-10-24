/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.Examples;

/**
 *
 * @author J.D.
 */
public class ThreadE {
    //This is the beginning of the Thread.
    static void threadMes(String mes) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          mes);
    }
    private static class MesLoop
        implements Runnable {
        //This is the example of a Runnable.
        public void run() {
            String[] mesPrint = {
                "This will implement a number of things with Threads.",
                "This shows the basic thread.",
                "It also shows a runnable.",
                "As well as an executor."
            };
            try {
                for (int i = 0;
                        i < mesPrint.length;
                        i++) { Thread.sleep(2000);
                    threadMes(mesPrint[i]);
                }
            } catch (InterruptedException e) {
                threadMes ("Working it!");
            }
        }
    }

    public static void main(String args[])
            //This is the example of an Executor
        throws InterruptedException {

        long waitTillCom = 2000 * 20 * 20;

        if (args.length > 0) {
            try {
                waitTillCom = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("It has to be an integer.");
                System.exit(1);
            }
        }
        threadMes("This is the beginning.");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MesLoop());
        t.start();

        threadMes("This going to finish.");
        while (t.isAlive()) {
            threadMes("Searching");
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > waitTillCom)
                  && t.isAlive()) {
                threadMes("This might take forever.");
                t.interrupt();
                t.join();
            }
        }
        threadMes("Done.");
    }
}
