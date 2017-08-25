import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by WZW on 2017/08/08.
 * 当前界面有显示下载进度的ProgressBar，请写一个下载线程，以10s的时间完成ProgressBar其进度显示工作；
 */
public class Main23 {
    public static void main(String args[]){
        Thread thread=new Thread(new ProgressBar());
        thread.start();
    }

}
class CalauteNow implements Callable<Integer>{

    static int now=0;
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        now+=10;
        return now;
    }
}
class ProgressBar implements Runnable{
    int now=0;

    @Override
    public void run() {
        try {
            while (now <= 100) {
                Double persent = (now * 1.0 / 100.0) * 100;
                DecimalFormat decimalFormat=new DecimalFormat("0.00");
                System.out.print("\r完成度：" + decimalFormat.format(persent) + "%  ");
                for (int i = 0; i < persent / 5; i++) {
                    System.out.print(">");
                }
                CalauteNow calauteNow = new CalauteNow();
                FutureTask<Integer> task = new FutureTask<Integer>(calauteNow);
                Thread thread = new Thread(task);
                thread.start();
                now = task.get();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
