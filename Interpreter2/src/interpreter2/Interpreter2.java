/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter2;

/**
 *
 * @author pavel
 */
public class Interpreter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context c = new Context();
        c.setValue("x", 3);
        Expression e = new MultiplyExpression(
                new PlusExpression(
                        new NumberExpression(3), 
                        new NumberExpression(2)), 
                new VarExpression("x"));
        System.out.println(e.interpret(c));
    
    
        c = new Context();
        e = new ComposeExpression(new Assign("x", new NumberExpression(3)), 
                new MultiplyExpression(
                new PlusExpression(
                        new NumberExpression(3), 
                        new NumberExpression(2)), 
                new VarExpression("x")));
        System.out.println(e.interpret(c));
    
    }
    
}
