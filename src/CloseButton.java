
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
public class CloseButton extends JButton {

    private BufferedImage bi;

    public CloseButton() throws IOException {
        try {
            this.bi = ImageIO.read(new File("src/close.png"));

        } catch (IOException e) {
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(this.bi, 1, 1, this.getWidth() - 1, this.getHeight() - 1, 0, 0, 74, 8, null);
    }
}
