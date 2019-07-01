/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

/**
 *
 * @author hp
 */
public class Qalufication {
    
    private String qulaify;
    private String level;

    public Qalufication(String qulaify, String level) {
        this.qulaify = qulaify;
        this.level = level;
    }

    public String getQulaify() {
        return qulaify;
    }

    public void setQulaify(String qulaify) {
        this.qulaify = qulaify;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
}
