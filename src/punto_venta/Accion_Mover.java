/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_venta;
import javax.swing.JPanel;
import punto_venta.PanelRound;

/**
 *
 * @author Eduar
 */
public class Accion_Mover {
    public void animar(PanelRound pane2){
        if (pane2.getX() <= -pane2.getWidth()) {
            // Si el PanelRound2 está cerrado o está cerrándose, lo abrimos
            Animacion.Animacion.mover_derecha(pane2.getX(), 0, 10, 12, pane2);
        } else {
            // Si el PanelRound2 está abierto o está abriéndose, lo cerramos
            Animacion.Animacion.mover_izquierda(pane2.getX(), -pane2.getWidth(), 12, 12, pane2);
        }
    }
    public void panel_hide(JPanel... pane2){
        for (int i=0;i<pane2.length;i++){
            pane2[i].setVisible(false);
        }
    }
}
