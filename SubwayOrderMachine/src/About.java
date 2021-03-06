import java.awt.Toolkit;

public class About extends javax.swing.JFrame {
    int page = 1;
    /*
    1 = faiz
    2 = natasha 
    3 = alia
    */
    public About() {
        initComponents();
        icon();
        jPanel4.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        devNatasha = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        devAliya = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        devIkhwan = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buttonLeft = new javax.swing.JButton();
        buttonRight = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        desc = new javax.swing.JLabel();
        buttonDev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subway Order System");
        setMinimumSize(new java.awt.Dimension(920, 650));
        setPreferredSize(new java.awt.Dimension(900, 650));

        jPanel1.setBackground(new java.awt.Color(32, 177, 74));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setText("About");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(380, 10, 130, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 30, 900, 60);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonHome.png"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton);
        homeButton.setBounds(20, 540, 50, 50);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("<html>Subway Food Order System were produced by using NetBeans IDE 8.2. This System were invented to ease the customers and workers to make an order. By using this system, the customers can customise their own sandwich, making sure the customers are content with their meals.</html>");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 90, 830, 70);

        jPanel4.setBackground(new java.awt.Color(32, 177, 74));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 51)));
        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(32, 177, 74));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new java.awt.CardLayout());

        devNatasha.setBackground(new java.awt.Color(32, 177, 74));
        devNatasha.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/natasha.jpg"))); // NOI18N
        devNatasha.add(jLabel2);
        jLabel2.setBounds(0, 0, 240, 300);

        jPanel3.add(devNatasha, "card2");

        devAliya.setBackground(new java.awt.Color(32, 177, 74));
        devAliya.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aliya.jpg"))); // NOI18N
        devAliya.add(jLabel3);
        jLabel3.setBounds(0, 0, 240, 290);

        jPanel3.add(devAliya, "card2");

        devIkhwan.setBackground(new java.awt.Color(32, 177, 74));
        devIkhwan.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikhwan.jpg"))); // NOI18N
        devIkhwan.add(jLabel4);
        jLabel4.setBounds(0, 0, 240, 300);

        jPanel3.add(devIkhwan, "card2");

        jPanel4.add(jPanel3);
        jPanel3.setBounds(40, 40, 250, 300);

        buttonLeft.setFont(new java.awt.Font("Segoe UI Emoji", 1, 11)); // NOI18N
        buttonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonLeft.png"))); // NOI18N
        buttonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLeftActionPerformed(evt);
            }
        });
        jPanel4.add(buttonLeft);
        buttonLeft.setBounds(700, 310, 50, 50);

        buttonRight.setFont(new java.awt.Font("Segoe UI Emoji", 1, 11)); // NOI18N
        buttonRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonRight.png"))); // NOI18N
        buttonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRightActionPerformed(evt);
            }
        });
        jPanel4.add(buttonRight);
        buttonRight.setBounds(770, 310, 50, 50);

        buttonExit.setBackground(new java.awt.Color(255, 255, 255));
        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonX.png"))); // NOI18N
        buttonExit.setToolTipText("Close");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        jPanel4.add(buttonExit);
        buttonExit.setBounds(790, 10, 50, 50);

        desc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel4.add(desc);
        desc.setBounds(320, 70, 420, 130);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 160, 850, 380);

        buttonDev.setBackground(new java.awt.Color(255, 255, 255));
        buttonDev.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonDev.setText("Developer");
        buttonDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDevActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDev);
        buttonDev.setBounds(40, 210, 90, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void icon() // Interface.
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/S.jpeg")));
    }    
    public void dev() // Display image.
    {
        if(page == 1)
        {
            devIkhwan.setVisible(true);
            devNatasha.setVisible(false);
            devAliya.setVisible(false);
            buttonLeft.setVisible(false);
            buttonRight.setVisible(true);
            desc.setText("<html>Faiz Ikhwan Bin Mohd Rafhan Syamil<br>2016647102<br>CS2303B</html>");
            
        }
        if(page == 2)
        {
            devIkhwan.setVisible(false);
            devNatasha.setVisible(true);
            devAliya.setVisible(false);
            buttonLeft.setVisible(true);
            buttonRight.setVisible(true);
            desc.setText("<html>Natasha Aleza Binti Azhar<br>2016647018<br>CS2303B</html>");
            
        }
        if(page == 3)
        {
            devIkhwan.setVisible(false);
            devNatasha.setVisible(false);
            devAliya.setVisible(true);
            buttonRight.setVisible(false);
            buttonLeft.setVisible(true);
            desc.setText("<html>Nor Aliya Binti Mohd Azman<br>2016644954<br>CS2303B</html>");
            
        }
    }    
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:     
        jPanel4.setVisible(false);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDevActionPerformed
        // TODO add your handling code here:
        jPanel4.setVisible(true); 
        dev();
    }//GEN-LAST:event_buttonDevActionPerformed
 
    private void buttonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLeftActionPerformed
        // TODO add your handling code here:
        if(page > 1)
        {
            page--;
        }
        dev();
    }//GEN-LAST:event_buttonLeftActionPerformed

    private void buttonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRightActionPerformed
        // TODO add your handling code here:
        if(page < 3)
        {
            page++;
        }
        dev();
    }//GEN-LAST:event_buttonRightActionPerformed

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDev;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonLeft;
    private javax.swing.JButton buttonRight;
    private javax.swing.JLabel desc;
    private javax.swing.JPanel devAliya;
    private javax.swing.JPanel devIkhwan;
    private javax.swing.JPanel devNatasha;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
