package userinterface;

public class StartupFrame extends javax.swing.JFrame {

    public StartupFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Background1 = new keeptoo.KGradientPanel();
        Loadingbar = new javax.swing.JProgressBar();
        Loadinglabel = new javax.swing.JLabel();
        Companyname = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setPreferredSize(new java.awt.Dimension(900, 500));

        Background1.setkEndColor(new java.awt.Color(0, 204, 204));
        Background1.setPreferredSize(new java.awt.Dimension(950, 551));
        Background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Background1.add(Loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 460, 10));

        Loadinglabel.setText("Loading...");
        Background1.add(Loadinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 60, 20));

        Companyname.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        Companyname.setForeground(new java.awt.Color(102, 0, 102));
        Companyname.setText("TimeTicker");
        Background1.add(Companyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 80, 40));

        Percentage.setText("0 %");
        Background1.add(Percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Adobe_Express_20220618_1139550.5482756120279315.png"))); // NOI18N
        Background1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 510, 460));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        StartupFrame s = new StartupFrame();
        s.setVisible(true);
        try {
            for(int i=0; i<=100; i++)
            {
               Thread.sleep(40);
               s.Loadingbar.setValue(i);
               
               s.Percentage.setText(Integer.toString(i)+"%");
            }
        
        } catch (Exception ex)
        {
        
        }
        new NewInterface().setVisible(true);
        s.dispose();
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private keeptoo.KGradientPanel Background1;
    private javax.swing.JLabel Companyname;
    private javax.swing.JProgressBar Loadingbar;
    private javax.swing.JLabel Loadinglabel;
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
