/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing_codigo;

import javax.swing.JComponent;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Eduar
 */
public class Menu extends JComponent{
    private MigLayout layout;
    private String[][]menuItems=new String[][]{
        {"1"},
        {"2","3","4"}    
    };
    public Menu(){
    layout=new MigLayout("wrap 1, fillx, gapy 0, insert 2", "fill");
    setLayout(layout);
    }
}
