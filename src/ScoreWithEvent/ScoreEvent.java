package ScoreWithEvent;

import java.util.EventObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prueksa
 */
public class ScoreEvent extends EventObject {
    private String someData;
    
    public ScoreEvent(Object o, String str) {
        super(o);
        someData = str;
    }
    
     public String getSomeData() {
        return someData;
    }  
}
