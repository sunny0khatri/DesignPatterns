package Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

    private String msg;
    public void setMsg(String str){
        this.msg=str;
    }

    public String getMsg(){
        return msg;
    }

    private static volatile Singleton instance=null;

    private Singleton(){}

    static Lock lock=new ReentrantLock();
    public static Singleton getInstance() {
        if(instance==null) {
            lock.lock();
            if (instance == null)
                instance = new Singleton();
            lock.unlock();


            //can write like this too
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }

        }
        return instance;
    }
}
