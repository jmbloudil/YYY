/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public class ComposeExpression extends BinOp {
    public ComposeExpression(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpret(Context c) {
        this.left.interpret(c);
        return this.right.interpret(c);
    }
    
}
