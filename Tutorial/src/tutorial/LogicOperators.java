/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author anowak
 */
public class LogicOperators {

    public static void main(String [] args){
        int a=1;
        int b=0;
        System.out.println("In main");
        System.out.println( "test: |  : "+ (a==1 |  (b=foo(2)) == 4));
        System.out.println( "test: || : "+ (a==1 || (b=foo(3)) == 4));
        System.out.println( "test: &  : "+ (a==2 &  (b=foo(4)) == 4));
        System.out.println( "test: && : "+ (a==2 && (b=foo(4)) == 4));
    }
    
    static public int foo(int x) {
        System.out.println("foo: x="+x);
        return x+1;
    }
}
