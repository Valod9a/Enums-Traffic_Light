package app.util;

import java.util.Scanner;

public class ScanAnswer {

    int answer;

    public int Answer(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void setAnswer(){
        answer = Answer();
    }

    public int getAnswer(){
        return answer;
    }
}
