/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Omar
 */
public class MainController {

    @FXML
    private Label result;
    private long num1 = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    public void proccessNumbers(ActionEvent e) {
        if (start) {
            result.setText("");
            start = false;
        }
        
        String value = ((Button) e.getSource()).getText();
        result.setText(result.getText() + value);

    }

    @FXML
    public void proccessOperators(ActionEvent e) {
        String value = ((Button) e.getSource()).getText();
        if(!value.equals("=")){
            if(!operator.isEmpty())
                return;
            
            operator = value;
            num1 = Long.parseLong(result.getText());
            result.setText("");
        }else{
            if(operator.isEmpty())
                return;
            
            long num2 = Long.parseLong(result.getText());
            Model model = new Model();
            float out = model.calculate(num1, num2, operator);
            result.setText(String.valueOf(out));
            operator = "";
            start = true;
        }
    }
}
