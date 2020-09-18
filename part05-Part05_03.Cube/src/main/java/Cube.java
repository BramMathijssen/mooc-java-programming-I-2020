/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bram
 */
public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        int volume = edgeLength * edgeLength * edgeLength;
        
        return volume;
    }

    @Override
    public String toString() {
        return "The length of the edge is "  + edgeLength + " and the volume is " + volume();
    }
    
    
    
    
}
