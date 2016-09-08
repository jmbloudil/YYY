/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public abstract class BinOp implements Expression {
    Expression left;
    Expression right;
    
    public BinOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
