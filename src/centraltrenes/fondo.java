package centraltrenes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class fondo extends JPanel {

    private Image fondo = null;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
    }

    public void setImage(String panel) {
        if (panel != null) {
            fondo = new ImageIcon(getClass().getResource(panel)).getImage();
              
        }
    }

}
