package Presentation;

import Controllers.BaseController;
import Controllers.SelectIncomeTypeController;
import Model.IncomeType;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */
public class SelectIncomeTypeUI extends BaseUI{
    private BaseController controller;
    @Override
    public void doShow() {
        System.out.println("Enter de id Income Type please :");
    }

    @Override
    public String getActionName() {
        return "Select Income Type";
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
    
    public IncomeType getIncomeType(int id){
        controller = new SelectIncomeTypeController();
        return ((SelectIncomeTypeController)controller).getIncomeType(id);
    }
    
    
}
