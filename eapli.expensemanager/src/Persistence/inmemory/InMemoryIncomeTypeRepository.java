/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge Neves e joaofcmoreira
 */
public class InMemoryIncomeTypeRepository implements IncomeTypeRepository{

    private static List<IncomeType> listIncomeType = new ArrayList<IncomeType>();

    public InMemoryIncomeTypeRepository() {
    }

    @Override
    public void save(IncomeType incT) {
        if (incT == null) {
            throw new IllegalArgumentException();
        }

        int last = listIncomeType.size() - 1;
        for (IncomeType incomeType : listIncomeType) {
            if (incomeType.getDescription().equalsIgnoreCase(incT.getDescription())) {
                break;
            }
            if (incomeType.getDescription().equals(listIncomeType.get(last).getDescription())) {
                listIncomeType.add(incT);
            }
        }
    }

    @Override
    public List<IncomeType> getListOfTypes() {
        return listIncomeType;
    }

    @Override
    public IncomeType getIncType(int pos) {
        return listIncomeType.get(pos - 1);
    }


}
