/*
Esta esta clase anima el color del boton al accer click
 */
package Ani_Panel;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import punto_venta.Admin;
import punto_venta.PanelRound;

/**
 *
 * @author Eduar
 */
public class btn_color {
    private void mostrar_color(PanelRound pane1, JLabel name, String url){
        pane1.setBackground(new Color(102,0,102));
        name.setForeground(Color.white);
        name.setIcon(new ImageIcon(getClass().getResource(url)));
    }
    private void color_prede(PanelRound pane1, JLabel name, String url){
        pane1.setBackground(new Color(0,0,0));
        name.setForeground(Color.white);
        name.setIcon(new ImageIcon(getClass().getResource(url)));
    }
    public void ani_colorA(){
        mostrar_color(Admin.btn_a, Admin.lbl_a, "/Imagenes/home.png");
        color_prede(Admin.btn_b, Admin.lbl_b, "/Imagenes/home.png");
        color_prede(Admin.btn_c, Admin.lbl_c, "/Imagenes/home.png");
        color_prede(Admin.btn_d, Admin.lbl_d, "/Imagenes/home.png");
    }
    public void ani_colorB(){
        mostrar_color(Admin.btn_b, Admin.lbl_b, "/Imagenes/home.png");
        color_prede(Admin.btn_a, Admin.lbl_a, "/Imagenes/home.png");
        color_prede(Admin.btn_c, Admin.lbl_c, "/Imagenes/home.png");
        color_prede(Admin.btn_d, Admin.lbl_d, "/Imagenes/home.png");
    }
    public void ani_colorC(){
        mostrar_color(Admin.btn_c, Admin.lbl_c, "/Imagenes/home.png");
        color_prede(Admin.btn_b, Admin.lbl_b, "/Imagenes/home.png");
        color_prede(Admin.btn_a, Admin.lbl_a, "/Imagenes/home.png");
        color_prede(Admin.btn_d, Admin.lbl_d, "/Imagenes/home.png");
    }
    public void ani_colorD(){
        mostrar_color(Admin.btn_d, Admin.lbl_d, "/Imagenes/home.png");
        color_prede(Admin.btn_b, Admin.lbl_b, "/Imagenes/home.png");
        color_prede(Admin.btn_c, Admin.lbl_c, "/Imagenes/home.png");
        color_prede(Admin.btn_a, Admin.lbl_a, "/Imagenes/home.png");
    }
}
