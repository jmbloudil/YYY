/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public class Assign implements Expression {
    private String varName;
    private Expression right;
    
    public Assign(String varName, Expression right) {
        this.varName = varName;
        this.right = right;
    }
    
    @Override
    public int interpret(Context c) {
        int temp = right.interpret(c);
        c.setValue(varName, temp);
        return temp;
    }
    
    
}
