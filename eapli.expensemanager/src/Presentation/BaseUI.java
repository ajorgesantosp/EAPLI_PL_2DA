package Presentation;

/**
 * Classe abstracta necessária, principalmente, para as interfaces acessíveis
 * directamente a partir do menu
 *
 * @author gilfmc & RitaNogueira
 */
public abstract class BaseUI {

    /**
     * Inicia a interface, este método é chamado quando o utilizador escolhe a
     * opção associada a este
     */
    public abstract void doShow();

    /**
     * Nome da acção associada a esta interface, utilizado no menu
     * @return nome da acção
     */
    public abstract String getActionName();
    
    /**
     * Mostrar ...
     */
    public void showBalance(){
        
    }
}

