/**
 * Created by WZW on 2017/08/01.
 */
public class WorkThread implements Runnable {
    private String message;
    public WorkThread(String message){
        this.message=message;
    }
    @Override
    public void run() {
        synchronized(this) {
            System.out.println(message);
        }
    }
}
