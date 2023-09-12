package Q230828;
import java.util.*;
import java.io.*;
public class Gugudan {
    public static void gugudan(int i) {
        if (i >= 10) return; // void에서 return; -> 강제 종료, i가 10 이상이면 강제 종료한다.(기저 조건)
        System.out.println(NUM + " * " + i + " = " + (NUM * i));
        gugudan(i + 1);
    }

    public static int NUM = 5;
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 10; i++) {
            System.out.println(NUM + " * " + i + " = " + (NUM * i));
        }
    }
}

