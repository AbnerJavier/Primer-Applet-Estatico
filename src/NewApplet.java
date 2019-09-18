import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;

public class NewApplet extends Applet {
    private Image image;
    public void init() {
       image = getImage(getCodeBase(), "jm.jpg");
        setSize(500, 500);
    }

    public void paint(Graphics g)
    {
        g.drawImage(image, 0, 0, this);
        //Oreja I.
        g.setColor(Color.GREEN);
        g.fillOval(60, 15+170, 50, 110);
        
        //Patas
        g.setColor(Color.RED);
        g.fillRect(135, 155+170, 23, 60);
        g.setColor(Color.GREEN);
        g.fillRect(207, 155+170, 23, 60);

        //Cuerpo
        g.setColor(Color.CYAN);
        g.fillRect(130, 100+170, 100, 55);
        //Cabeza
        
        g.setColor(Color.yellow);
        g.fillOval(80, 20+170, 100, 100);
        //Oreja D.
        
        g.setColor(Color.RED);
        g.fillOval(140, 15+170, 50, 110);
        //Trompa
        
        g.setColor(Color.CYAN);
        g.fillOval(80, 75+170, 40, 40);
        g.setColor(Color.RED);
        g.fillOval(70, 100+170, 40, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(60, 125+170, 40, 40);
        g.setColor(Color.BLUE);
        g.fillOval(50, 150+170, 40, 40);
    }
}
