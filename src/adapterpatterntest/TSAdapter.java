/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterntest;

/**
 *
 * @author rashe
 */
public class TSAdapter extends TS{
    private TS3Adaptee ts3 ;
    public TSAdapter(TS3Adaptee ts3){
        this.ts3 = ts3;
    }
    
    @Override
    double getTemp() {
        
        return (ts3.getTSTemp() * 1.8) + 32;
        
    }
    
    
}
