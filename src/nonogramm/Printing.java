package nonogramm;

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

        double x = pageFormat.getImageableX();
        double y = pageFormat.getImageableY();
        double w = pageFormat.getImageableWidth();
        double h = pageFormat.getImageableHeight();
        Graphics2D g = (Graphics2D)gr;
        g.translate(x, y);

        if(w<h) {
            double sw = w / img.getWidth();
            int nh = (int)(sw * img.getHeight());
            gr.drawImage(img, 0, 0, (int)w, nh, null); 
        } else {
            double sh = h / img.getHeight();
            int nw = (int)(sh * img.getWidth());
            gr.drawImage(img, 0, 0, (int)h, nw, null); 
        }

        

        return PAGE_EXISTS;
    }
    
    public void Drucken() {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
                 System.out.println("The job did not successfully complete");
             }
         }
    }
}
