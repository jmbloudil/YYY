/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public class MinusExpression extends BinOp {
 
    public MinusExpression(Expression left, Expression right) {
        super(left, right);
    }
    
    @Override
    public int interpret(Context c) {
        return left.interpret(c) - right.interpret(c);
    }

}
