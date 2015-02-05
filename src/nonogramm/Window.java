package nonogramm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Tom Richter
 */
public class Window extends javax.swing.JFrame {
    
    BufferedImage bi = null;
    BufferedImage bildoriginal = null;
    boolean bool = false;

    public Window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        link = new javax.swing.JTextField();
        wahl = new javax.swing.JButton();
        laden = new javax.swing.JButton();
        speichern = new javax.swing.JButton();
        bild = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                zeichneBild(g);
            }
        }
        ;
        schwellwert = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        pixel = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        effect = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wahl.setText("Wählen");
        wahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wahlActionPerformed(evt);
            }
        });

        laden.setText("Laden");
        laden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladenActionPerformed(evt);
            }
        });

        speichern.setText("Speichern");
        speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichernActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bildLayout = new javax.swing.GroupLayout(bild);
        bild.setLayout(bildLayout);
        bildLayout.setHorizontalGroup(
            bildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        bildLayout.setVerticalGroup(
            bildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        schwellwert.setMaximum(255);
        schwellwert.setValue(127);
        schwellwert.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                schwellwertStateChanged(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Schwellwert:");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 24));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 24));

        pixel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pixelStateChanged(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Pixelgröße:");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 24));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 24));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 24));
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.setVerifyInputWhenFocusTarget(false);

        effect.setText("Anwenden");
        effect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wahl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(laden, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speichern, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(effect, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(link))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pixel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schwellwert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(schwellwert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(wahl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speichern, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laden, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(effect, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pixel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wahlActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);
        File f = fc.getSelectedFile();
        link.setText(f.getAbsolutePath());
    }//GEN-LAST:event_wahlActionPerformed

    private void ladenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladenActionPerformed
        bool = false;
        String pfad = link.getText();
        if (pfad != null) {
            try {
                bi = ImageIO.read(new File(pfad));
                bildoriginal = bi;

                bild.repaint();
            } catch (IOException ex) {
                System.out.println("Beim Laden der Datei ist ein Fehler aufgetreten!");
            }
        }
    }//GEN-LAST:event_ladenActionPerformed

    private void speichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speichernActionPerformed

        final JFileChooser fc = new JFileChooser();

        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showSaveDialog(this);
        File f = fc.getSelectedFile();
        System.out.println("Speichern als " + f.getAbsolutePath());

        try {
            ImageIO.write(bi, "png", f);
        } catch (IOException ex) {
            System.out.println("Beim Speichern der Datei ist ein Problem aufgetreten!");
        }
    }//GEN-LAST:event_speichernActionPerformed

    private void effectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effectActionPerformed
        bool = true;
        effect();
    }//GEN-LAST:event_effectActionPerformed

    private void schwellwertStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_schwellwertStateChanged
        if(bool == true) {
            effect();
        }
    }//GEN-LAST:event_schwellwertStateChanged

    private void pixelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pixelStateChanged
        if(bool == true) {
            effect();
        }
    }//GEN-LAST:event_pixelStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    
    public void effect() {
        int schwell = (int)(schwellwert.getValue()/100.0 * Math.sqrt(255*255+255*255+255*255));
        int pixelNumWidth = pixel.getValue();
        int pixelWidth = bildoriginal.getWidth()/pixelNumWidth;
        int pixelPoints = (pixelWidth/5)*(pixelWidth/5);
        int pixelNumHeight = bildoriginal.getHeight()/pixelWidth;
        int height = pixelNumHeight*pixelWidth;
        int width = pixelNumWidth*pixelWidth;
        
        boolean[][] feld = new boolean[pixelNumWidth][pixelNumHeight];
        BufferedImage nono = new BufferedImage(pixelNumWidth, pixelNumHeight, BufferedImage.TYPE_INT_RGB);
        for(int y=0;y<height;y+=pixelWidth) {
            for(int x=0;x<width;x+=pixelWidth) {
                int r=0;
                int g=0;
                int b=0;
                for(int i = 0;i<pixelPoints;i++) {
                    Color c =new Color(bildoriginal.getRGB(x+(int)(Math.random()*pixelWidth), y+(int)(Math.random()*pixelWidth)));
                    r+=c.getRed();
                    g+=c.getGreen();
                    b+=c.getBlue();
                }
                r/=pixelPoints;
                g/=pixelPoints;
                b/=pixelPoints;
                
                int hell=(r+g+b)/3; //0-255
                if(hell>=schwell) {
                    nono.setRGB(x/pixelWidth, y/pixelWidth, Color.WHITE.getRGB());
                } else {
                    nono.setRGB(x/pixelWidth, y/pixelWidth, Color.BLACK.getRGB());
                }
            }
        }
        /*
        for(int y=0;y<pixelNumHeight;y++) {
            for(int x=0;x<pixelNumWidth;x++) {
                if(feld[x][y]==true) {
                    nono.setRGB(x, y, Color.WHITE.getRGB());
                } else {
                    nono.setRGB(x, y, Color.BLACK.getRGB());
                }
            }
        }
                */
        bi = nono;
        bild.repaint();
    }
    
    public void zeichneBild(Graphics g) {
        if (bi != null) {

            int w = bild.getWidth();
            int hneu = bi.getHeight() * w / bi.getWidth();

            g.drawImage(bi, 0, 0, w, hneu, this);
        } else {
            g.setColor(new Color(255, 255, 255));
            g.fillRect(0, 0, bild.getWidth(), bild.getHeight());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bild;
    private javax.swing.JButton effect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton laden;
    private javax.swing.JTextField link;
    private javax.swing.JSlider pixel;
    private javax.swing.JSlider schwellwert;
    private javax.swing.JButton speichern;
    private javax.swing.JButton wahl;
    // End of variables declaration//GEN-END:variables
}
