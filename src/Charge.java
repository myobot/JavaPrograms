import org.junit.*;

import java.util.Date;

/**
 * Created by WZW on 2017/08/01.
 */
public class Charge {
    @org.junit.Test
    public  void app(){
        System.out.println(charge("20200920"));
        Date date=new Date(2020,9,20);
        Date date2=new Date(2016,8,14);
        long m1=date.getTime();
        long m2=date2.getTime();
        long c;
        if(m1>m2){
            c=(m1-m2)/(24*60*60*1000);
        }
        else{
            c=(m2-m1)/(24*60*60*1000);
        }
        System.out.println(c);


    }
    public boolean charge(String str){
        String syear=str.substring(0,4);
        String smounth=str.substring(4,6);
        String sday=str.substring(6,8);
        int year=Integer.parseInt(syear);
        int mounth=Integer.parseInt(smounth);
        int day=Integer.parseInt(sday);
        int totaldays=getTotalDaysl(year,mounth,day);
        System.out.println(totaldays);
        int p=totaldays/7;
        if(p%2==0&&p!=0){
            if(totaldays%7==0||totaldays%7==6){
                return true;
            }else{
                return false;
            }
        }else{
            if(totaldays%7==0){
                return true;
            }else{
                return false;
            }
        }
    }
    public int getTotalDaysl(int year,int m,int d) {
        int maxyear=year>2016?year:2016;
        int maxmounth=m>8?m:8;
        int maxday=d>14?d:14;
        int minyear=year>2016?2016:year;
        int minmounth=m>8?8:m;
        int minday=d>14?14:d;
        int flag=1;
        int flag2=1;
        if(maxyear==year&&maxmounth==m||maxyear==2016&&maxmounth==8){
            flag=1;
        }else{
            flag=-1;
        }
        if(maxmounth==m&&maxday==d||maxmounth==8&&maxday==14){
            flag2=1;
        }else{
            flag2=-1;
        }
        int cyear=maxyear-minyear;
        int days=0;
        for(int i=1;i<=cyear;i++){
            for(int j=0;j<12;j++) {
                days += getMounthDays(j,minyear+i);
            }
            days+=1;
        }
        for(int i=minmounth;i<maxmounth;i++){
            days+=getMounthDays(i,maxyear)*flag;
        }
        int cday=maxday-minday;
        days+=cday*flag2;
        return days;
    }
    public int getMounthDays(int mounth,int year){
        switch(mounth){
            case 1:return 31;
            case 2:
                int count=0;
                if(year%4==0&&year%100!=0){
                    count++;
                }if(year%400==0){
                    count++;
                }
                return 28+count;
            case 3:return 31;
            case 4:return 30;
            case 5:return 31;
            case 6:return 30;
            case 7:return 31;
            case 8:return 31;
            case 9:return 30;
            case 10:return 31;
            case 11:return 30;
            case 12:return 31;
            default:return 30;
        }
    }

}
