/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pavel
 */
class Context {
    
    Map<String, Integer> mapa = new HashMap<String, Integer>();
    
    public int getValue(String varName) {
        return mapa.get(varName);
    }
    
    public void setValue(String varName, int value){
        mapa.put(varName, value);
    }
    
}
