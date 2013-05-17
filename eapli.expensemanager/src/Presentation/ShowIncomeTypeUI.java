/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ListIncomeTypeController;
import Model.IncomeType;
import java.util.List;

/**
 *
 * @author Jorge Neves
 */
public class ShowIncomeTypeUI extends BaseUI{

    BaseController controller;
    @Override
    public void doShow() {
        List<IncomeType> listIncomeType;
        
        controller = new ListIncomeTypeController();
        listIncomeType = ((ListIncomeTypeController)controller).getAll();
        for (IncomeType incomeType : listIncomeType) {
            System.out.println(incomeType.getId()+ " - " + incomeType.getDescription());
        }
    }

    @Override
    public String getActionName() {
        return "ShowIncomeTypeUI";
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
    
}
