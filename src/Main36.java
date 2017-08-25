import java.util.*;
public class Main36{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=in.nextLine();
        }
        boolean flaglex=chargelex(s);
        boolean flaglen=chargelen(s);
        if(flaglex&&flaglen){
            System.out.println("both");
        }else if(flaglex){
            System.out.println("lexicographically");
        }else if(flaglen){
            System.out.println("lengths");
        }else{
            System.out.println("none");
        }
    }
    public static boolean chargelex(String s[]){
        for(int i=0;i<s.length-1;i++){
            if(charge(s[i],s[i+1])){
                return false;
            }
        }
        return true;
    }
    public static boolean charge(String s,String s2){

        char c[]=s.toCharArray();
        char c2[]=s2.toCharArray();
        int n=Math.max(c.length,c2.length);
        for(int i=0;i<n;i++){
            if(i>=Math.min(c.length,c2.length)){
                if(s.length()<s2.length())
                    return false;
                else
                    return true;
            }else if(c[i]>c2[i]){
                return true;
            }else if(c[i]<c2[i]){
                return false;
            }
        }
        return true;

    }
    public static boolean chargelen(String s[]){
        for(int i=0;i<s.length-1;i++){
            if(s[i].length()>s[i+1].length()){
                return false;
            }
        }
        return true;
    }
}