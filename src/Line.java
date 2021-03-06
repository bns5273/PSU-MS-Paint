
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bns5273
 */
public class Line extends Shape {

    public void drawS(Graphics g, int x, int y, int wid, int hig, Color c, BasicStroke bas, boolean fill, float tran, GradientPaint gp, TexturePaint tx) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(c);
        g2d.setStroke(bas);
        AlphaComposite ac = AlphaComposite.getInstance(3, tran);
        g2d.setComposite(ac);
        if (gp != null) {
            g2d.setPaint(gp);
        }
        g2d.drawLine(x, y, wid, hig);
    }
}