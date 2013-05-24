/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Model.Income;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
class ListIncomesUI extends BaseUI{

     Controllers.ListIncomeController listControllerIncome = new Controllers.ListIncomeController();
    
        public void show() {       
        
            for (Income obj : listControllerIncome.getAllIncomes()) {
                System.out.println(obj);
            }
    }

    protected BaseController getController() {
        return listControllerIncome;
    }   

    @Override
    public void doShow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getActionName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected BaseController controller() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
