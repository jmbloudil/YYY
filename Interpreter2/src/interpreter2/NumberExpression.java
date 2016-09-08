/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public class NumberExpression implements Expression {
    int value;
    
    public NumberExpression(int value) {
        this.value = value;
    }
    
    @Override
    public int interpret(Context c) {
        return value;
    }
    
}
