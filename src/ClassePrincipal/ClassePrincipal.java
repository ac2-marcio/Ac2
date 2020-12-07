/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassePrincipal;

import View.ViewMenu;
import conexoes.MySQL;

/**
 *
 * @author João Vitor
 */
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewMenu menu = new ViewMenu();
        menu.setVisible(true);
    }
    
}
