package juego_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

public class panel extends JPanel {

    //instancia a la persona en posicion (X,Y) => (0,0)
    int limite_derecha;
    protected objetos persona1 = new objetos(0, 15);
    protected objetos persona2 = new objetos(0, 115);
    protected objetos persona3 = new objetos(0, 220);
    protected objetos persona4 = new objetos(0, 315);
    protected objetos persona5 = new objetos(0, 420);
    protected Timer timer;
    crono c = new crono();
    int x1;
    int x2;
    int x3;
    int x4;
    int x5;

    boolean x1_1 = false;
    boolean x2_2 = false;
    boolean x3_3 = false;
    boolean x4_4 = false;
    boolean x5_5 = false;

    //Constructor
    public panel(Dimension d) {

        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(new Color(0, 200, 234));
        persona1.LimitesX(getWidth());
        persona2.LimitesX(getWidth());
        persona3.LimitesX(getWidth());
        persona4.LimitesX(getWidth());
        persona5.LimitesX(getWidth());
        
        //para la animación
        timer = new Timer(16, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                x1 = persona1.mover();
                if (x1 == persona1.LimitesX(getWidth())) {
                    x1_1 = true;

                }

                x2 = persona2.mover();
                if (x2 == persona2.LimitesX(getWidth())) {
                    x2_2 = true;

                }
                x3 = persona3.mover();
                if (x3 == persona4.LimitesX(getWidth())) {
                    x3_3 = true;

                }
                x4 = persona4.mover();
                if (x4 == persona4.LimitesX(getWidth())) {
                    x4_4 = true;

                }
                x5 = persona5.mover();
                if (x5 == persona5.LimitesX(getWidth())) {
                    x5_5 = true;

                }

                repaint();
                if(x1_1 == true){
                    c.jB_pararActionPerformed(e);
                }
            }
        }
        );
    }

    //Controla el inicio y fin de la animación
    public void animar(boolean turnOnOff, boolean t1, boolean t2, boolean t3, boolean t4, ActionEvent e) {
        if (turnOnOff) {

            persona1.VelocidadX();
            timer.start();

        }
        if (t1) {
            persona2.VelocidadX();
            timer.start();
        }
        if (t2) {
            persona3.VelocidadX();
            timer.start();
        }
        if (t3) {
            persona4.VelocidadX();
            timer.start();
        }
        if (t4) {
            persona5.VelocidadX();
            timer.start();
        }
        c.jB_empezarActionPerformed(e);
        

    }
    //pinta la animación
   
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

            persona1.dibujar(g);
            persona2.dibujar(g);
            persona3.dibujar(g);
            persona4.dibujar(g);
            persona5.dibujar(g);

        
            
    }

}
