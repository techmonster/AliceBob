package holloway.nate.AliceBob;

import java.util.Scanner;

/**
 * Created by nathanielholloway on 9/10/16.
 * this is the Display class
 */
class Display {
    Scanner sc;

    String displayPrompt(){
        sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        return sc.next();
    }
    void displayGreeting(String msg){
        System.out.println(msg);
    }
}
