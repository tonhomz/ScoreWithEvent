package ScoreWithEvent;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prueksa
 */
public class ScoreSource {
    
    private ArrayList<ScoreListener> listeners;
    public ScoreSource() {
            listeners = new ArrayList<>();
    }
    public void setScoreLine(String str) {
        fireScoreEvent(new ScoreEvent(this, str));
    }
    public void addScoreListener(ScoreListener l) {
        listeners.add(l);
    }
    public void removeScoreListener(ScoreListener l) {
        listeners.remove(l);
    }
    public void fireScoreEvent(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
            ScoreListener l = listeners.get(i);
            l.scoreChange(e);
        }
    }
}
