
import java.awt.Graphics;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bns5273
 */
// all buttons use a custom icon
public class LineButton extends JButton {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(5, 5, this.getWidth() - 5, this.getHeight() - 5);
    }
}
