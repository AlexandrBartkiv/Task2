package task2pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class task2 {
    public static BufferedReader stdIn =new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException {
        String[] m1 = new String[100];
        int q = 1;
        boolean x;
        do {
            x = false;
            System.out.format("Vvedite slovo%s :", q);
            String s = stdIn.readLine();
            if (s.length() > 0) {
                m1 = s.split("_");
                m1 = s.split(" ");
                q++;
            } else {
                x = true;
            }


        } while (x == false);
        System.out.print("Vvedite razdelitel:");
        String e=stdIn.readLine();
        Arrays.sort(m1);
        q=0;
        while(q<m1.length)
        System.out.format("%s%s",m1[q],e);
        q++;



    }
}
