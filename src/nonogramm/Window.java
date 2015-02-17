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
    boolean mouseBool = false;

    public Window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        mouse = new javax.swing.JToggleButton();
        drucken = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        wahl.setFont(new java.awt.Font("Tahoma", 1, 11));
        wahl.setText("Open");
        wahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wahlActionPerformed(evt);
            }
        });

        laden.setFont(new java.awt.Font("Tahoma", 1, 11));
        laden.setText("Load");
        laden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladenActionPerformed(evt);
            }
        });

        speichern.setFont(new java.awt.Font("Tahoma", 1, 11));
        speichern.setText("Save");
        speichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichernActionPerformed(evt);
            }
        });

        bild.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bildMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bildLayout = new javax.swing.GroupLayout(bild);
        bild.setLayout(bildLayout);
        bildLayout.setHorizontalGroup(
            bildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bildLayout.setVerticalGroup(
            bildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
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

        pixel.setMaximum(99);
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

        effect.setFont(new java.awt.Font("Tahoma", 1, 11));
        effect.setText("Do");
        effect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effectActionPerformed(evt);
            }
        });

        mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cursor.png"))); // NOI18N
        mouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouseActionPerformed(evt);
            }
        });

        drucken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print.png"))); // NOI18N
        drucken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                druckenActionPerformed(evt);
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
                                .addComponent(wahl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(laden, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speichern, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(effect, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schwellwert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mouse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pixel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drucken, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(schwellwert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(mouse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wahl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(speichern, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(laden, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(effect, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pixel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drucken, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (bool == false) {
            bool = true;
            effect.setText("Stop");
            mouse.setSelected(false);
            mouseBool=false;
            effect();
        } else {
            bool = false;
            effect.setText("Do");
        }
        
        
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

    private void mouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouseActionPerformed
        if (mouseBool==false) {
            bool=false;
            effect.setText("Do");
            mouseBool=true;
        } else {
            mouseBool=false;
        }
    }//GEN-LAST:event_mouseActionPerformed

    private void bildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bildMouseClicked
        if(mouseBool == true) {
            int panelX = evt.getX();
            int panelY = evt.getY();
            double piFaktor = bi.getWidth() * 1.0 / bild.getWidth();
            int bildX = (int) (panelX * piFaktor);
            int bildY = (int) (panelY * piFaktor);
            if(bi.getRGB(bildX, bildY)==Color.WHITE.getRGB()) {
                bi.setRGB(bildX, bildY, Color.BLACK.getRGB());
            } else {
                bi.setRGB(bildX, bildY, Color.WHITE.getRGB());
            }
            bild.repaint();
        }
    }//GEN-LAST:event_bildMouseClicked

    private void druckenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_druckenActionPerformed
        Printing p = new Printing(bi);
        p.Drucken();
    }//GEN-LAST:event_druckenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    
    public void effect() {
        int schwell = (int)(schwellwert.getValue()/100.0 * 255);
        int pixelNumWidth = pixel.getValue();
        int pixelWidth = bildoriginal.getWidth()/pixelNumWidth;
        int pixelPoints = (pixelWidth/5)*(pixelWidth/5);
        int pixelNumHeight = bildoriginal.getHeight()/pixelWidth;
        int height = pixelNumHeight*pixelWidth;
        int width = pixelNumWidth*pixelWidth;
        
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
    private javax.swing.JButton drucken;
    private javax.swing.JButton effect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton laden;
    private javax.swing.JTextField link;
    private javax.swing.JToggleButton mouse;
    private javax.swing.JSlider pixel;
    private javax.swing.JSlider schwellwert;
    private javax.swing.JButton speichern;
    private javax.swing.JButton wahl;
    // End of variables declaration//GEN-END:variables
}
