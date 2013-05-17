/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import java.math.BigDecimal;

import java.util.List;

/**
 *
 * @author antoniopedro
 * @author joasdavid
 */
public interface IncomeRepository {
    public void save(Income income);
    public List<Income> getAll();
    public BigDecimal getTotal();
}
