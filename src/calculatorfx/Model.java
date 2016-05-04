/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

/**
 *
 * @author Omar
 */
public class Model {
    public float calculate(long num1, long num2, String operator){
        switch (operator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if(num2 == 0)
                    return 0;
                
                return num1 / num2;
            default:
                return 0;
        }
    }
}
