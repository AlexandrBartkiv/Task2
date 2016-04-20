package task2pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 19.04.2016.
 */
public class task2 {
    public static BufferedReader stdIn =new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException{
        String[] m1=new String[1000];
        String[] numbers=new String[1000];
        String[] words=new String[1000];
        boolean w = false;
        int q= 1;
        int n= 0;
        int r= 0;
        int t=0;
        do {
            System.out.format("Vvedite slovo %s:", q);
            String s = stdIn.readLine();
                if (s.length()>0) {
                    m1 = s.split(" ");
                    q++;
                }
                else {
                    w=true;
                }
        }
        while(w==true);
        q=0;
        while(q<m1.length) {
            try {
                numbers[n] = Double.parseDouble(m1[q]);
                n++;
            } catch (NumberFormatException e) {
                words[r] = m1[q];
                r++;
            }
            q++;
        }
        System.out.print("Vvedite razdelitel: ");
        String e= stdIn.readLine();
        int o=0;
        while(o<n){
            System.out.format("%s%s",numbers[o],e);
        }
        int l=0;
        while(l<r){
            System.out.format("%s%s",words[l],e);
        }




    }

}
