package nonogramm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.*;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;

/**
 *
 * @author Tom Richter
 */
public class Printing implements Printable{
    
    protected BufferedImage img;
    public Printing(BufferedImage img) {
        this.img=img;
    }
    
    @Override
    public int print(Graphics gr, PageFormat pageFormat, int pageIndex) {
        if (pageIndex != 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g = (Graphics2D) gr;

        double x = pageFormat.getImageableX();
        double y = pageFormat.getImageableY();
        double w = pageFormat.getImageableWidth();
        double h = pageFormat.getImageableHeight();

        double sx = w / img.getWidth();
        double sy = h / img.getHeight();

        g.translate(x, y);
        g.scale(sx, sy);

        gr.drawImage(img, 0, 0, Color.WHITE, null);

        return PAGE_EXISTS;
    }
}
