/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public class MultiplyExpression extends BinOp {
    public MultiplyExpression(Expression left, Expression right) {
        super(left, right);
    }
    
    @Override
    public int interpret(Context c) {
        return left.interpret(c) * right.interpret(c);
    }

}
