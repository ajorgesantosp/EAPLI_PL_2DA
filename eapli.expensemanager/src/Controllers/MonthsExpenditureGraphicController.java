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
    
    /**
     * Creates the controller
     */
    public MonthsExpenditureGraphicController() {
        repo = Persistence.PersistenceFactory.buildRepositoryFactory().getExpenseTypeRepo();
    }
    
    /**
     * Receives the month and the year as integers and returns an ArrayList containing the totals and types of expenses during that month
     * @param int month
     * @param int year
     * @return
     */
    public ArrayList<TypeTotalExpense> getMonthExpensesByType(int month, int year) {
        ExpenseRecord rec = new ExpenseRecord();
        return rec.getMonthExpensesByType(month, year);
    }
}
