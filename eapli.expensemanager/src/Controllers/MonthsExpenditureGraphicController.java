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
 * @author noobshark & PIPOKID
 */
public class MonthsExpenditureGraphicController extends BaseController{
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
    
    public ArrayList<TypeTotalExpense> getMonthExpensesbyType(int month, int year) {
        ExpenseRecord rec = new ExpenseRecord();
        return rec.getMonthExpensesbyType(month, year);
    }
}
