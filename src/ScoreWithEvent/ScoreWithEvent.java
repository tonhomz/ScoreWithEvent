package ScoreWithEvent;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prueksa
 */
public class ScoreWithEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ScoreSource source = new ScoreSource();
        Subscriber1 sub1 = new Subscriber1();
        // Subscriber1 sub2 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        
        source.addScoreListener(sub1);
        source.addScoreListener(sub2);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String str = sc.nextLine();
            if(str.equals("")) {
                break;
            }
            source.setScoreLine(str);
        }
   }  
}
