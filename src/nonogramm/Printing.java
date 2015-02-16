package nonogramm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
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
    private String[] x;
    private String[] y;
    private int maxX;
    private int maxY;
    private final int maxSize = 50;
    
    public Printing(BufferedImage img) {
        this.img=img;
        Riddle();
    }
    
    @Override
    public int print(Graphics gr, PageFormat pageFormat, int pageIndex) {
        if (pageIndex != 0) {
            return NO_SUCH_PAGE;
        }
        
        int offset = 20;
        double x = pageFormat.getImageableX()+offset;
        double y = pageFormat.getImageableY()+offset;
        double w = pageFormat.getImageableWidth()-2*offset;
        double h = pageFormat.getImageableHeight()-2*offset;
        Graphics2D g = (Graphics2D)gr;
        g.translate(x, y);
        
        if(w<h) {
            int fieldWidth = (int)(w/(maxX+img.getWidth()));
            if(fieldWidth > maxSize) {
                fieldWidth = 50;
            }
            int fontHeight = FontHeight(fieldWidth, gr);
            gr.setFont(new Font(Font.MONOSPACED, Font.PLAIN, fontHeight));
            for(int i=0;i<this.x.length;i++) {
                gr.drawString(this.x[i], 0,maxY*fontHeight+i*fontHeight);
            }
            for(int i=0;i<this.y.length;i++) {
                for(int c=0;c<maxY;c++) {
                    gr.drawString(""+this.y[i].charAt(c), maxX*fieldWidth+i*fieldWidth, c*fontHeight);
                }
            }
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
    
    private void Riddle() {
        int w = img.getWidth();
        int h = img.getHeight();
        x = new String[h];
        y = new String[w];
        int counter = 0;
        
        for(int i=0;i<h;i++) {
            x[i]="";
            for(int j=0;j<w;j++) {
                if(img.getRGB(j, i)==Color.BLACK.getRGB()) {
                    counter++;
                } else {
                    if(counter!=0) {
                        x[i]=x[i]+counter;
                    }
                    counter=0;
                }
            }
            if(counter!=0) {
                x[i]=x[i]+counter;
                counter=0;
            }
        }
        for(int j=0;j<w;j++) {
            y[j]="";
            for(int i=0;i<h;i++) {
                if(img.getRGB(j, i)==Color.BLACK.getRGB()) {
                    counter++;
                } else {
                    if(counter!=0) {
                        y[j]=y[j]+counter;
                    }
                    counter=0;
                } 
            }
            if(counter!=0) {
                y[j]=y[j]+counter;
                counter=0;
            }
        }
        maxX=MaxLength(x);
        for(int i=0;i<x.length;i++) {
            while(x[i].length()<maxX) {
                x[i]=" "+x[i];
            }
        }
        maxY=MaxLength(y);
        for(int i=0;i<y.length;i++) {
            while(y[i].length()<maxY) {
                y[i]=" "+y[i];
            }
        }
        System.out.println("Done");
    }
    
    private int MaxLength(String[] array) {
        int max=0;
        for(int i=0;i<array.length;i++) {
            if(max<array[i].length()) {
                max=array[i].length();
            }
        }
        return max;
    }
    
    private int FontHeight(int fontWidth, Graphics gr) {
        int i=2;
        int newWidth;
        while(true) {
            gr.setFont(new Font(Font.MONOSPACED, Font.PLAIN, i));
            FontMetrics metric = gr.getFontMetrics();
            newWidth = metric.stringWidth("1");
            if(fontWidth==newWidth) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }
}
