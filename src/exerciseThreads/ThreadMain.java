/*
 * Martin Hilaire May 17, 2017
 * flyberson@gmail.com
 * Datamatiker studerende
 * Copyright (C) 2017 flyberson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exerciseThreads;

import java.awt.Toolkit;
import java.util.concurrent.ExecutorService;  
    import java.util.concurrent.Executors; 

/**
 *
 * @author flyberson
 */
public class ThreadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //start1();
        
//        Multi t1 = new Multi();
//        t1.start();  
//        Multi3 m3 = new Multi3();
//        Thread t2 = new Thread(m3);
//        t2.start();

// Test sleep method
//TestSleepMethod1 t1 = new TestSleepMethod1();
//TestSleepMethod1 t2 = new TestSleepMethod1();
//t1.start();
//t2.start();

// TestJoinMethod1 t1=new TestJoinMethod1();  
// TestJoinMethod1 t2=new TestJoinMethod1();  
// TestJoinMethod1 t3=new TestJoinMethod1();  
// t1.start();  
// try{  
//  t1.join();  
// }catch(Exception e){System.out.println(e);}  
//  
// t2.start();  
// t3.start();  

//
// TestJoinMethod2 t1=new TestJoinMethod2();  
// TestJoinMethod2 t2=new TestJoinMethod2();  
// TestJoinMethod2 t3=new TestJoinMethod2();  
// t1.start();  
// try{  
//  t1.join(1500);  
// }catch(Exception e){System.out.println(e);}  
//  
// t2.start();  
// t3.start();  



//Daemon test
//TestDaemonThread1 t1=new TestDaemonThread1();//creating thread  
//  TestDaemonThread1 t2=new TestDaemonThread1();  
//  TestDaemonThread1 t3=new TestDaemonThread1();  
//  
//  t1.setDaemon(true);//now t1 is daemon thread  
//    
//  t1.start();//starting threads  
//  t2.start();  
//  t3.start();  


//Thread pool test
//  ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
//        for (int i = 0; i < 10; i++) {  
//            Runnable worker = new WorkerThread("" + i);  
//            executor.execute(worker);//calling execute method of ExecutorService  
//          }  
//        executor.shutdown();  
//        while (!executor.isTerminated()) {   }  
//  
//        System.out.println("Finished all threads");


//Threadgroup example

//          ThreadGroupDemo runnable = new ThreadGroupDemo();  
//          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
//            
//          Thread t1 = new Thread(tg1, runnable,"one");  
//          t1.start();  
//          Thread t2 = new Thread(tg1, runnable,"two");  
//          t2.start();  
//          Thread t3 = new Thread(tg1, runnable,"three");  
//          t3.start();  
//               
//          System.out.println("Thread Group Name: "+tg1.getName());  
//         tg1.list(); 

Runtime r=Runtime.getRuntime();  
r.addShutdownHook(new Multi());  
      
System.out.println("Now main sleeping... press ctrl+c to exit");  
try{Thread.sleep(3000);}catch (Exception e) {}  

 
            
    }
    
    
    public static void start1(){
        System.out.println("Here");
       
        Thread t2 = new Thread(){
            @Override
            public void run(){
                System.out.println("Here2");
                for (int i = 0; i < 10; i++) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("This is a Thread");
                    try {
                        sleep(1000);
                    } catch (Exception e) {
                    }
                    
                }
                
            }
        };
        t2.run();
        
    }
    
 
    
}
  class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
  
}
class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}
}
class TestSleepMethod1 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 } }


class TestJoinMethod1 extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }} 
class TestJoinMethod2 extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }}  

 class TestDaemonThread1 extends Thread{  
 public void run(){  
  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
   System.out.println("daemon thread work");  
  }  
  else{  
  System.out.println("user thread work");  
 }  
 }} 

     
    class WorkerThread implements Runnable {  
        private String message;  
        public WorkerThread(String s){  
            this.message=s;  
        }  
         public void run() {  
            System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
            processmessage();//call processmessage method that sleeps the thread for 2 seconds  
            System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
        }  
        private void processmessage() {  
            try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
        }  
    }

 class ThreadGroupDemo implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }}  
