/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public class VarExpression implements Expression {
    
    String varName;
    public VarExpression(String varName) {
        this.varName = varName;
    }

    @Override
    public int interpret(Context c) {
        return c.getValue(varName);
    }
    
}
