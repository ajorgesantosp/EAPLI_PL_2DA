/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loadProperties();
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }

    private static Properties applicationProperties = new Properties();
 
    public static Properties getApplicationProperties() {
        return applicationProperties;
    }
 
    private static void loadProperties() {
        FileInputStream propertiesStream = null;
        try {
            
            propertiesStream = new FileInputStream("./src/Presentation/properties.properties");
            applicationProperties.load(propertiesStream);
 
        } catch (IOException ex) {
            //default values
            applicationProperties.setProperty("persistence.repositoryFactory", "eapli.expensemanager.persistence.HibernateRepoFactory");
 
            Logger.getLogger(ExpenseManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (propertiesStream != null) {
                try {
                    propertiesStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(ExpenseManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
