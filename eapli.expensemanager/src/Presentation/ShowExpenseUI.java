/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.Expense;

/**
 * 
 * @author Paulo Gandra Sousa
 */
class ShowExpenseUI {
	public static void show(Expense e) {
		System.out.printf("Description: %s%s\nDate: %s\nAmount: %.2f€\n",
				e.getDescription(), e.getExpenseType() == null ? "" : "\nType: "
						+ e.getExpenseType().getDescription(), e.getDate(),
				e.getAmount());
	}
}
