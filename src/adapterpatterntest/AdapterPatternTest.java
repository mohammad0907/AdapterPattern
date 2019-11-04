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
public class AdapterPatternTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TS ts1 = new TS1();
        System.out.println(ts1.getTemp() + " F");
        TS ts2 = new TS2();
        System.out.println(ts2.getTemp() + " F");
        TS ts3 = new TSAdapter(new TS3Adaptee());
        System.out.println(ts3.getTemp() + " F");
        
        
    }
    
}
