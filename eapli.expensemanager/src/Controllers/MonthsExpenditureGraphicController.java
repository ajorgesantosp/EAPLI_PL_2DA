/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.ExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author FILIPE
 */
public class MonthsExpenditureGraphicController {
    /*
     * Construtor base da classe
     */
    
    private ExpenseTypeRepository repo;
    public MonthsExpenditureGraphicController() {
        repo = new ExpenseTypeRepository();
    }
    
    /*
     * Método que cria o formato do gráfico e devolve-o para posterior impressão
     */
    
    public ArrayList<String> createGraphic(int month, int year) {
        MonthExpenditureController mec = new MonthExpenditureController();
        ArrayList<String> graphic = new ArrayList<String>();
        ArrayList<ExpenseType> expensetypes = (ArrayList<ExpenseType>) repo.getListOfTypes();
        ArrayList<Expense> expenses = mec.getAnyMonthExpenses(month,year);
        ArrayList<BigDecimal> totals = new ArrayList<BigDecimal>();
        BigDecimal total;
        for(ExpenseType typeexp : expensetypes) {
            total = null;
            for(Expense exp : expenses) {
                if(typeexp.equals(exp.getExpenseType())) {
                    total.add(exp.getAmount());
                }
            }
            totals.add(total);
        }
        BigDecimal max = totals.get(0);
        int position = 0;
        for(int j = 1 ; j < expensetypes.size(); j++) {
            if(totals.get(j).compareTo(max) == 1) {
                max = totals.get(j);
                position = j;
            }
        }
        int size = expensetypes.size();
        BigDecimal temp1 = null;
        ExpenseType temp2 = null;
        for(int j = 0; j < size; j++) {
            for(int k = 1; k < (size-1); k++) {
                if(totals.get(k-1).compareTo(totals.get(k))==-1) {
                    temp1 = totals.get(k-1);
                    totals.set(k-1, totals.get(k));
                    totals.set(k, temp1);
                    temp2 = expensetypes.get(k-1);
                    expensetypes.set(k-1, expensetypes.get(k));
                    expensetypes.set(k, temp2);
                }
            }
        }
        max = totals.get(0);
        for(int j = 0; j < size; j++) {
            BigDecimal x = new BigDecimal(40);
            int count = totals.get(j).divide(x).intValueExact();
            String e = expensetypes.get(j).getDescription() + " - ";
            for(int i = 0; i <count ; i++) {
                e.concat("*");
            }
            graphic.add(e);
        }
        graphic.add("* = " + max.divide(new BigDecimal(40)));
        return graphic;
    }
}
