package CustomerMenu;
import CustomerMenu.Productinformation.i_bath;
import CustomerMenu.Productinformation.i_kitchen;
import CustomerMenu.Productinformation.i_pool;
import CustomerMenu.Productinformation.i_roof;
import CustomerMenu.Productinformation.i_sink;
import CustomerMenu.Productinformation.i_toilet;
import CustomerMenu.Productinformation.i_wall;
import CustomerMenu.Productinformation.infoFloorCleaner;
import javax.swing.JOptionPane;


public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txtHeading = new javax.swing.JLabel();
        txtHome = new javax.swing.JLabel();
        txtReview = new javax.swing.JLabel();
        txtAbout = new javax.swing.JLabel();
        txtMenu = new javax.swing.JLabel();
        txtContact = new javax.swing.JLabel();
        panelLG = new javax.swing.JPanel();
        txtLogin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtRegister = new javax.swing.JLabel();
        panelAdmin = new javax.swing.JPanel();
        txtCustName = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        btnExit1 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        pnlCarts = new javax.swing.JPanel();
        txtCart = new javax.swing.JLabel();
        pnlQuotes = new javax.swing.JPanel();
        txtQuotations = new javax.swing.JLabel();
        pnlOrders = new javax.swing.JPanel();
        txtOrders = new javax.swing.JLabel();
        pnlSignOut = new javax.swing.JPanel();
        txtSignOut = new javax.swing.JLabel();
        pnlQuotes1 = new javax.swing.JPanel();
        txtQuotations1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        pnlFloor = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        addFloor = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        counterFC = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        infoFloorCleaner = new javax.swing.JLabel();
        pnlWall = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        addWall = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        infoWallCleaner = new javax.swing.JLabel();
        pnlBath = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        addBath = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        infoBathCleaner = new javax.swing.JLabel();
        pnlKitchen = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        addKichen = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        infoKitchenCleaner = new javax.swing.JLabel();
        pnlPool = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        addPool = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        counterFC3 = new javax.swing.JTextField();
        infoPoolCleaner = new javax.swing.JLabel();
        pnlRoof = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        addRoof = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        counterFC4 = new javax.swing.JTextField();
        infoRoofCleaner = new javax.swing.JLabel();
        pnlSink = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        addSink = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        counterFC2 = new javax.swing.JTextField();
        infoSinkCleaner = new javax.swing.JLabel();
        pnlToilet = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        addToilet = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        counterFC1 = new javax.swing.JTextField();
        infoToiletCleaner = new javax.swing.JLabel();
        pnlOders = new javax.swing.JPanel();
        txtOrders1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlCart = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnCheckOutt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        pnlQuots = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        pnlSignOut1 = new javax.swing.JPanel();
        txtSignOut1 = new javax.swing.JLabel();
        pnlAbout = new javax.swing.JPanel();
        txtAbout1 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        pnlContactUs = new javax.swing.JPanel();
        txtContact1 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        pnlReview = new javax.swing.JPanel();
        txtReview1 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 51, 102));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHeading.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtHeading.setForeground(new java.awt.Color(204, 204, 204));
        txtHeading.setText("BEST BRIGHTNESS");
        panel.add(txtHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        txtHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHome.setForeground(new java.awt.Color(204, 204, 204));
        txtHome.setText("HOME");
        txtHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHomeMouseClicked(evt);
            }
        });
        panel.add(txtHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtReview.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtReview.setForeground(new java.awt.Color(204, 204, 204));
        txtReview.setText("FAQ");
        txtReview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReviewMouseClicked(evt);
            }
        });
        panel.add(txtReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        txtAbout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAbout.setForeground(new java.awt.Color(204, 204, 204));
        txtAbout.setText("ABOUT");
        txtAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAboutMouseClicked(evt);
            }
        });
        panel.add(txtAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        txtMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\icons8-menu-30.png")); // NOI18N
        panel.add(txtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 39));

        txtContact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContact.setForeground(new java.awt.Color(204, 204, 204));
        txtContact.setText("CONTACT US");
        txtContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContactMouseClicked(evt);
            }
        });
        panel.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        panelLG.setBackground(new java.awt.Color(0, 51, 102));

        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(204, 204, 204));
        txtLogin.setText("Login");
        txtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLoginMouseClicked(evt);
            }
        });

        txtRegister.setBackground(new java.awt.Color(0, 0, 0));
        txtRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRegister.setForeground(new java.awt.Color(0, 51, 102));
        txtRegister.setText("Register");
        txtRegister.setAutoscrolls(true);
        txtRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtRegister)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLGLayout = new javax.swing.GroupLayout(panelLG);
        panelLG.setLayout(panelLGLayout);
        panelLGLayout.setHorizontalGroup(
            panelLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLGLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(txtLogin)
                .addGap(22, 22, 22)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelLGLayout.setVerticalGroup(
            panelLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLGLayout.createSequentialGroup()
                .addGroup(panelLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLogin)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        panel.add(panelLG, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, -1, -1));

        panelAdmin.setBackground(new java.awt.Color(0, 51, 102));

        txtCustName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCustName.setForeground(new java.awt.Color(204, 204, 204));
        txtCustName.setText("Lerato Mdluli");

        profile.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\icons8-user-25.png")); // NOI18N

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCustName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profile)
                    .addComponent(txtCustName))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel.add(panelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 140, -1));
        panelAdmin.setVisible(false);

        btnExit1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\NetBeansProjects\\3DevsDesign\\src\\main\\java\\DEVSICONS\\BB_devs_Icons\\SystemLogin\\icons8-exit-26.png")); // NOI18N
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit1MouseClicked(evt);
            }
        });
        panel.add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 120));

        sidePanel.setBackground(new java.awt.Color(0, 51, 102));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCarts.setBackground(new java.awt.Color(17, 76, 135));
        pnlCarts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCart.setForeground(new java.awt.Color(204, 204, 204));
        txtCart.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-cart-24 (1).png")); // NOI18N
        txtCart.setText("VIEW CART");
        txtCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCartMouseClicked(evt);
            }
        });
        pnlCarts.add(txtCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, -1, -1));

        sidePanel.add(pnlCarts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 51));

        pnlQuotes.setBackground(new java.awt.Color(17, 76, 135));

        txtQuotations.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQuotations.setForeground(new java.awt.Color(204, 204, 204));
        txtQuotations.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-edit-property-24 (1).png")); // NOI18N
        txtQuotations.setText("TRANSACTION HISTORY");

        javax.swing.GroupLayout pnlQuotesLayout = new javax.swing.GroupLayout(pnlQuotes);
        pnlQuotes.setLayout(pnlQuotesLayout);
        pnlQuotesLayout.setHorizontalGroup(
            pnlQuotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuotesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtQuotations)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlQuotesLayout.setVerticalGroup(
            pnlQuotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuotesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(txtQuotations)
                .addGap(14, 14, 14))
        );

        sidePanel.add(pnlQuotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        pnlOrders.setBackground(new java.awt.Color(17, 76, 135));
        pnlOrders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrders.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOrders.setForeground(new java.awt.Color(204, 204, 204));
        txtOrders.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-purchased-24 (1).png")); // NOI18N
        txtOrders.setText("MANAGE ORDERS");
        txtOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOrdersMouseClicked(evt);
            }
        });
        pnlOrders.add(txtOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        sidePanel.add(pnlOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 52));

        pnlSignOut.setBackground(new java.awt.Color(17, 76, 135));

        txtSignOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSignOut.setForeground(new java.awt.Color(204, 204, 204));
        txtSignOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\icons8-log-out-24.png")); // NOI18N
        txtSignOut.setText("SIGN OUT");
        txtSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSignOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSignOutLayout = new javax.swing.GroupLayout(pnlSignOut);
        pnlSignOut.setLayout(pnlSignOutLayout);
        pnlSignOutLayout.setHorizontalGroup(
            pnlSignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSignOut)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        pnlSignOutLayout.setVerticalGroup(
            pnlSignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignOutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtSignOut)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        sidePanel.add(pnlSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 210, 60));

        pnlQuotes1.setBackground(new java.awt.Color(17, 76, 135));

        txtQuotations1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQuotations1.setForeground(new java.awt.Color(204, 204, 204));
        txtQuotations1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-edit-property-24 (1).png")); // NOI18N
        txtQuotations1.setText("VIEW QUOTATIONS");
        txtQuotations1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuotations1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlQuotes1Layout = new javax.swing.GroupLayout(pnlQuotes1);
        pnlQuotes1.setLayout(pnlQuotes1Layout);
        pnlQuotes1Layout.setHorizontalGroup(
            pnlQuotes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuotes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtQuotations1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnlQuotes1Layout.setVerticalGroup(
            pnlQuotes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuotes1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(txtQuotations1)
                .addGap(14, 14, 14))
        );

        sidePanel.add(pnlQuotes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, -1));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 550));

        pnlFloor.setBackground(new java.awt.Color(236, 236, 236));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Floor Cleaner");

        addFloor.setBackground(new java.awt.Color(0, 51, 102));
        addFloor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addFloor.setForeground(new java.awt.Color(204, 204, 204));
        addFloor.setText("ADD TO CART");
        addFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFloorActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 132, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("R89.99");

        jLabel47.setText("Qty");

        infoFloorCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoFloorCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoFloorCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFloorLayout = new javax.swing.GroupLayout(pnlFloor);
        pnlFloor.setLayout(pnlFloorLayout);
        pnlFloorLayout.setHorizontalGroup(
            pnlFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFloorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFloorLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoFloorCleaner))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFloorLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterFC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addFloor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFloorLayout.setVerticalGroup(
            pnlFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFloorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(infoFloorCleaner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFloorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(counterFC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFloor)
                .addContainerGap())
        );

        pnlWall.setBackground(new java.awt.Color(236, 236, 236));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Wall Cleaner");

        addWall.setBackground(new java.awt.Color(0, 51, 102));
        addWall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addWall.setForeground(new java.awt.Color(204, 204, 204));
        addWall.setText("ADD TO CART");
        addWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWallActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 123, Short.MAX_VALUE))
        );

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("R73.99");

        jLabel48.setText("Qty");

        infoWallCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoWallCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoWallCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlWallLayout = new javax.swing.GroupLayout(pnlWall);
        pnlWall.setLayout(pnlWallLayout);
        pnlWallLayout.setHorizontalGroup(
            pnlWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWallLayout.createSequentialGroup()
                .addGroup(pnlWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWallLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlWallLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(infoWallCleaner))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWallLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(pnlWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlWallLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addWall, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlWallLayout.setVerticalGroup(
            pnlWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWallLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(infoWallCleaner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(12, 12, 12)
                .addComponent(addWall)
                .addContainerGap())
        );

        pnlBath.setBackground(new java.awt.Color(236, 236, 236));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Bathroom Cleaner");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        addBath.setBackground(new java.awt.Color(0, 51, 102));
        addBath.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBath.setForeground(new java.awt.Color(204, 204, 204));
        addBath.setText("ADD TO CART");
        addBath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBathActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("R66.99");

        jLabel49.setText("Qty");

        infoBathCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoBathCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBathCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBathLayout = new javax.swing.GroupLayout(pnlBath);
        pnlBath.setLayout(pnlBathLayout);
        pnlBathLayout.setHorizontalGroup(
            pnlBathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBathLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBathLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(infoBathCleaner))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBathLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBathLayout.setVerticalGroup(
            pnlBathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBathLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(infoBathCleaner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBath)
                .addContainerGap())
        );

        pnlKitchen.setBackground(new java.awt.Color(236, 236, 236));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Kitchen Cleaner");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        addKichen.setBackground(new java.awt.Color(0, 51, 102));
        addKichen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addKichen.setForeground(new java.awt.Color(204, 204, 204));
        addKichen.setText("ADD TO CART");
        addKichen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKichenActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("R91.99");

        jLabel50.setText("Qty");

        infoKitchenCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoKitchenCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoKitchenCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlKitchenLayout = new javax.swing.GroupLayout(pnlKitchen);
        pnlKitchen.setLayout(pnlKitchenLayout);
        pnlKitchenLayout.setHorizontalGroup(
            pnlKitchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKitchenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKitchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKitchenLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKitchenLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(infoKitchenCleaner)
                        .addGap(6, 6, 6))
                    .addComponent(addKichen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlKitchenLayout.setVerticalGroup(
            pnlKitchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKitchenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKitchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(infoKitchenCleaner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKitchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addKichen)
                .addContainerGap())
        );

        pnlPool.setBackground(new java.awt.Color(236, 236, 236));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Pool Cleaner");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(20, 20, 20))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        addPool.setBackground(new java.awt.Color(0, 51, 102));
        addPool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addPool.setForeground(new java.awt.Color(204, 204, 204));
        addPool.setText("ADD TO CART");
        addPool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPoolActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("R51.99");

        jLabel53.setText("Qty");

        infoPoolCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoPoolCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoPoolCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPoolLayout = new javax.swing.GroupLayout(pnlPool);
        pnlPool.setLayout(pnlPoolLayout);
        pnlPoolLayout.setHorizontalGroup(
            pnlPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPoolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPoolLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoPoolCleaner))
                    .addComponent(addPool, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(pnlPoolLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterFC3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlPoolLayout.setVerticalGroup(
            pnlPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPoolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPoolCleaner)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(counterFC3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53))
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPool)
                .addContainerGap())
        );

        pnlRoof.setBackground(new java.awt.Color(236, 236, 236));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("Roof Cleaner");

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        addRoof.setBackground(new java.awt.Color(0, 51, 102));
        addRoof.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addRoof.setForeground(new java.awt.Color(204, 204, 204));
        addRoof.setText("ADD TO CART");
        addRoof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoofActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("R88.99");

        jLabel54.setText("Qty");

        infoRoofCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoRoofCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoRoofCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRoofLayout = new javax.swing.GroupLayout(pnlRoof);
        pnlRoof.setLayout(pnlRoofLayout);
        pnlRoofLayout.setHorizontalGroup(
            pnlRoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoofLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRoofLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(infoRoofCleaner))
                    .addGroup(pnlRoofLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterFC4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addRoof, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlRoofLayout.setVerticalGroup(
            pnlRoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoofLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoRoofCleaner)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRoofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(counterFC4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54))
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addRoof)
                .addContainerGap())
        );

        pnlSink.setBackground(new java.awt.Color(236, 236, 236));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Sink Cleaner");

        addSink.setBackground(new java.awt.Color(0, 51, 102));
        addSink.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addSink.setForeground(new java.awt.Color(204, 204, 204));
        addSink.setText("ADD TO CART");
        addSink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSinkActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("R67.99");

        jLabel52.setText("Qty");

        infoSinkCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoSinkCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoSinkCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSinkLayout = new javax.swing.GroupLayout(pnlSink);
        pnlSink.setLayout(pnlSinkLayout);
        pnlSinkLayout.setHorizontalGroup(
            pnlSinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSinkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSinkLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoSinkCleaner))
                    .addComponent(addSink, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(pnlSinkLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterFC2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlSinkLayout.setVerticalGroup(
            pnlSinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSinkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoSinkCleaner)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(counterFC2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSink)
                .addContainerGap())
        );

        pnlToilet.setBackground(new java.awt.Color(236, 236, 236));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Toilet Cleaner");

        addToilet.setBackground(new java.awt.Color(0, 51, 102));
        addToilet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addToilet.setForeground(new java.awt.Color(204, 204, 204));
        addToilet.setText("ADD TO CART");
        addToilet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToiletActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addGap(0, 129, Short.MAX_VALUE))
        );

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("R49.99");

        jLabel51.setText("Qty");

        infoToiletCleaner.setIcon(new javax.swing.ImageIcon("C:\\Users\\jiliy\\Documents\\BB_devs_Icons\\Customer\\icons8-information-19.png")); // NOI18N
        infoToiletCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoToiletCleanerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlToiletLayout = new javax.swing.GroupLayout(pnlToilet);
        pnlToilet.setLayout(pnlToiletLayout);
        pnlToiletLayout.setHorizontalGroup(
            pnlToiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToiletLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlToiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlToiletLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoToiletCleaner))
                    .addGroup(pnlToiletLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterFC1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addToilet, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlToiletLayout.setVerticalGroup(
            pnlToiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToiletLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlToiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoToiletCleaner)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlToiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(counterFC1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51))
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToilet)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(pnlFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pnlWall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(pnlBath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pnlKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(pnlToilet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pnlSink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pnlRoof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pnlPool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlWall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlToilet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRoof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", pnlHome);

        pnlOders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrders1.setBackground(new java.awt.Color(0, 0, 0));
        txtOrders1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtOrders1.setText("MANAGE ORDERS");
        pnlOders.add(txtOrders1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P216151", "Floor Cleaner", "5", "180.99"},
                {"P232232", "Pool Cleaner", "8", "195.99"},
                {"P152468", "Roof Cleaner", "9", "369.20"},
                {"P568711", "Kitchen Cleaner", "6", "90.00"}
            },
            new String [] {
                "ProductID", "Product Name", "Quantity ", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        pnlOders.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 970, 125));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("TOTAL(R) :");
        pnlOders.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, 20));
        pnlOders.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 270, -1));

        jButton23.setBackground(new java.awt.Color(0, 153, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(204, 204, 204));
        jButton23.setText("PROCESS ORDER");
        pnlOders.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, -1));

        jButton24.setBackground(new java.awt.Color(204, 0, 0));
        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton24.setForeground(new java.awt.Color(204, 204, 204));
        jButton24.setText("REMOVE");
        pnlOders.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Product ID");
        pnlOders.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, 20));

        jLabel3.setText("..................................................");
        pnlOders.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("TOTAL(R) :");
        pnlOders.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, 20));

        jLabel5.setText("..................................................");
        pnlOders.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, 10));

        jTabbedPane1.addTab("tab2", pnlOders);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("CART");

        btnCheckOutt.setBackground(new java.awt.Color(0, 0, 102));
        btnCheckOutt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCheckOutt.setForeground(new java.awt.Color(204, 204, 204));
        btnCheckOutt.setText("CHECKOUT");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout pnlCartLayout = new javax.swing.GroupLayout(pnlCart);
        pnlCart.setLayout(pnlCartLayout);
        pnlCartLayout.setHorizontalGroup(
            pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCheckOutt)
                    .addGroup(pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        pnlCartLayout.setVerticalGroup(
            pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCheckOutt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", pnlCart);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel12.setText("QUOTATION");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Floor Cleaner", "89.99", "4", "359.96"},
                {"Wall Cleaner", "73.99", "3", "221.97"},
                {"Bathroom Cleaner", "66.99", "2", "133.98"}
            },
            new String [] {
                "Product Name", "Price", "Quantity", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("SUBTOTAL");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("TOTAL AMOUNT");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel89.setText("DISCOUNT");

        jTextField10.setText("715,91");

        jTextField11.setText("536,93");

        jTextField12.setText("25%");

        jLabel90.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(204, 204, 204));
        jLabel90.setText("Best Brightness PTY LTD ");

        jLabel91.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel91.setText("Lerato Mdluli");

        jLabel92.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel92.setText("157 DR Pixley Ka Seme St");

        jLabel93.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel93.setText("NNL1@GMAIL.COM");

        jLabel94.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel94.setText("Note: This quotation is not a bill or contract or bill,It is our best estimate at the");

        jLabel95.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel95.setText("total price for the products displayed above.The customer will be billed upon the");

        jLabel96.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel96.setText("acceptance of this quote");

        pnlSignOut1.setBackground(new java.awt.Color(17, 76, 135));

        txtSignOut1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSignOut1.setForeground(new java.awt.Color(204, 204, 204));
        txtSignOut1.setText("CUSTOMER DETAILS");
        txtSignOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSignOut1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSignOut1Layout = new javax.swing.GroupLayout(pnlSignOut1);
        pnlSignOut1.setLayout(pnlSignOut1Layout);
        pnlSignOut1Layout.setHorizontalGroup(
            pnlSignOut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignOut1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSignOut1)
                .addContainerGap())
        );
        pnlSignOut1Layout.setVerticalGroup(
            pnlSignOut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignOut1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(txtSignOut1)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlQuotsLayout = new javax.swing.GroupLayout(pnlQuots);
        pnlQuots.setLayout(pnlQuotsLayout);
        pnlQuotsLayout.setHorizontalGroup(
            pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuotsLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(pnlSignOut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(818, Short.MAX_VALUE))
            .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlQuotsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlQuotsLayout.createSequentialGroup()
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlQuotsLayout.createSequentialGroup()
                            .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel95)
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlQuotsLayout.createSequentialGroup()
                            .addGap(520, 520, 520)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlQuotsLayout.setVerticalGroup(
            pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuotsLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(pnlSignOut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlQuotsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(48, 48, 48)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel93)
                    .addGap(1, 1, 1)
                    .addComponent(jLabel92)
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlQuotsLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel94))
                        .addComponent(jLabel16)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlQuotsLayout.createSequentialGroup()
                            .addComponent(jLabel95)
                            .addGap(2, 2, 2)
                            .addComponent(jLabel96))
                        .addGroup(pnlQuotsLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel89)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(12, 12, 12)
                    .addGroup(pnlQuotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addComponent(jLabel90)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab4", pnlQuots);

        txtAbout1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtAbout1.setText("ABOUT");

        jTextArea1.setBackground(new java.awt.Color(243, 243, 243));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Best Brightness Pongola Shop\n\nBestBrightness is a store operating at Pongola in the Northern part of KwaZulu Natal.\n\nThe store specializes in selling house hold cleaning detergents, equipment, tissue papers and plastics ( from different inventories). Best brightness shop is a retail store buying products \n\nfrom different suppliers and sell at a profit. \n\nDue to online pervasiveness, Bestbrightness has seen the need for enabling their prospective .customers to access product ranges and prices online. Customers may also send reviews on their \n\nproducts of choice. \n");

        javax.swing.GroupLayout pnlAboutLayout = new javax.swing.GroupLayout(pnlAbout);
        pnlAbout.setLayout(pnlAboutLayout);
        pnlAboutLayout.setHorizontalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(txtAbout1)
                .addContainerGap(512, Short.MAX_VALUE))
            .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAboutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlAboutLayout.setVerticalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtAbout1)
                .addContainerGap(489, Short.MAX_VALUE))
            .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAboutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab5", pnlAbout);

        txtContact1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtContact1.setText("CONTACT US");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("TEL: +27 31 005 9923 \n\nEMAIL: enquires@bestbrightness.com\n\nFAX: +27 86 523 6647\n\nWHATSAPP: +27 84 559 5487\n\nFACEBOOK: BEST BRIGHTNESS_01");

        javax.swing.GroupLayout pnlContactUsLayout = new javax.swing.GroupLayout(pnlContactUs);
        pnlContactUs.setLayout(pnlContactUsLayout);
        pnlContactUsLayout.setHorizontalGroup(
            pnlContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactUsLayout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(txtContact1)
                .addContainerGap(493, Short.MAX_VALUE))
            .addGroup(pnlContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContactUsLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlContactUsLayout.setVerticalGroup(
            pnlContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactUsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtContact1)
                .addContainerGap(479, Short.MAX_VALUE))
            .addGroup(pnlContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContactUsLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab6", pnlContactUs);

        txtReview1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtReview1.setText("Frequently Asked Questions");

        jTextArea2.setBackground(new java.awt.Color(243, 243, 243));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Q: What types of cleaning detergents do you offer?\nA: We offer a wide range of cleaning detergents, including eco-friendly, multi-purpose, and specialty products\n\nQ: How can I determine the right detergent for my needs?\nA: Our knowledgeable staff can assist you in selecting the ideal detergent based on your cleaning requirements and preferences.\n\nQ: Do you provide bulk purchasing options?\nA: Yes, we offer bulk discounts for larger orders to help you save on your cleaning supplies. \n\nQ: What are your store hours and locations?\nA: Our store locations and hours can be found on our website, or you can contact us for assistance.\n\nQ: Are your cleaning detergents safe for use around pets and children?\nA: Many of our products are designed to be pet and child-friendly, but we recommend checking the labels for specific safety information.\n\nQ: Can I return or exchange a cleaning detergent if I'm not satisfied?\nA: Yes, we have a hassle-free return policy. If you're not satisfied with your purchase, please contact us for return or exchange instructions.\n\nQ: Are there any special offers or promotions available?\nA: We frequently run promotions and discounts. Keep an eye on our website or subscribe to our newsletter to stay updated on our latest deals.\n\nQ: Do you offer eco-friendly or biodegradable cleaning detergent options?\nA: Yes, we carry a selection of eco-friendly and biodegradable cleaning detergents for environmentally conscious customers.");

        javax.swing.GroupLayout pnlReviewLayout = new javax.swing.GroupLayout(pnlReview);
        pnlReview.setLayout(pnlReviewLayout);
        pnlReviewLayout.setHorizontalGroup(
            pnlReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReviewLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(txtReview1)
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(pnlReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlReviewLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlReviewLayout.setVerticalGroup(
            pnlReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReviewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtReview1)
                .addContainerGap(474, Short.MAX_VALUE))
            .addGroup(pnlReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlReviewLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab7", pnlReview);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 81, 1050, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public void isShow(int num)
    {
        if (txtLogin.isShowing()) 
        {
            JOptionPane.showMessageDialog(null, "Please Login");
        } 
        
        else 
        {
            jTabbedPane1.setSelectedIndex(num);  
        }
        
    }
    
    public void addToCart()
    {
        if (txtLogin.isShowing()) 
        {
            JOptionPane.showMessageDialog(null, "Please Login");
        } 
        
        else 
        {
            JOptionPane.showMessageDialog(null,"Added To Cart");  
        }
    }
  //MOUSE CLICKED  
    private void txtCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCartMouseClicked
        isShow(2);   
    }//GEN-LAST:event_txtCartMouseClicked

    private void txtRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterMouseClicked
        RegisterPage reg = new RegisterPage();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtRegisterMouseClicked

    private void txtLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMouseClicked
       LoginPage loginPage = new LoginPage();
       loginPage.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_txtLoginMouseClicked

    
    
    //TABBED PANE CODING HERE 
    private void txtHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHomeMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_txtHomeMouseClicked

    private void txtAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAboutMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_txtAboutMouseClicked

    private void txtContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_txtContactMouseClicked

    private void txtReviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReviewMouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_txtReviewMouseClicked

    
    
    //INFORMATION BUTTON CODE HERE
    private void infoFloorCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoFloorCleanerMouseClicked
        infoFloorCleaner ifc = new infoFloorCleaner();
        ifc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoFloorCleanerMouseClicked

    private void infoWallCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoWallCleanerMouseClicked
        i_wall wall = new i_wall();
        wall.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoWallCleanerMouseClicked

    private void infoBathCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBathCleanerMouseClicked
        i_bath bath = new i_bath();
        bath.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoBathCleanerMouseClicked

    private void infoKitchenCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoKitchenCleanerMouseClicked
        i_kitchen kitchen = new i_kitchen();
        kitchen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoKitchenCleanerMouseClicked

    private void infoToiletCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoToiletCleanerMouseClicked
        i_toilet toilet = new i_toilet();
        toilet.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoToiletCleanerMouseClicked

    private void infoSinkCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoSinkCleanerMouseClicked
        i_sink sink = new i_sink();
        sink.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoSinkCleanerMouseClicked

    private void infoRoofCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoRoofCleanerMouseClicked
        i_roof roof = new i_roof();
        roof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoRoofCleanerMouseClicked

    private void infoPoolCleanerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPoolCleanerMouseClicked
        i_pool pool = new i_pool();
        pool.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_infoPoolCleanerMouseClicked

    
    
    //ADD TO CART BUTTON CODE HERE
    private void addFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFloorActionPerformed
        addToCart();
        
    }//GEN-LAST:event_addFloorActionPerformed

    private void addWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWallActionPerformed
        addToCart();
    }//GEN-LAST:event_addWallActionPerformed

    private void addBathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBathActionPerformed
        addToCart();
    }//GEN-LAST:event_addBathActionPerformed

    private void addKichenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKichenActionPerformed
        addToCart();
    }//GEN-LAST:event_addKichenActionPerformed

    private void txtOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOrdersMouseClicked
        isShow(1);
    }//GEN-LAST:event_txtOrdersMouseClicked

    
    private void txtSignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSignOutMouseClicked
        if (!txtLogin.isShowing()){ 
        
        int response = JOptionPane.showConfirmDialog(
        this, // Parent component
        "Are you sure you want to sign out?", // Message
        "Sign Out Confirmation", // Title
        JOptionPane.YES_NO_OPTION // Option type
        );

        if (response == JOptionPane.YES_OPTION) {
            // User clicked 'Yes,' perform sign-out actions
            panelLG.setVisible(true);
            panelAdmin.setVisible(false);
        } else {
            // User clicked 'No' or closed the dialog, do nothing
        }

        } 
        
        else 
        {
            JOptionPane.showMessageDialog(null,"You are currently not logged into your account");  
        }
    }//GEN-LAST:event_txtSignOutMouseClicked

    private void txtSignOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSignOut1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSignOut1MouseClicked

    private void btnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExit1MouseClicked

    private void txtQuotations1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuotations1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuotations1MouseClicked

    
    private void addToiletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToiletActionPerformed
        addToCart();
    }//GEN-LAST:event_addToiletActionPerformed

    private void addSinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSinkActionPerformed
        addToCart();
    }//GEN-LAST:event_addSinkActionPerformed

    private void addRoofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoofActionPerformed
        addToCart();
    }//GEN-LAST:event_addRoofActionPerformed

    private void addPoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPoolActionPerformed
        addToCart();
    }//GEN-LAST:event_addPoolActionPerformed

    
    
    
    
    public static void main(String args[]) {
  
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBath;
    private javax.swing.JButton addFloor;
    private javax.swing.JButton addKichen;
    private javax.swing.JButton addPool;
    private javax.swing.JButton addRoof;
    private javax.swing.JButton addSink;
    private javax.swing.JButton addToilet;
    private javax.swing.JButton addWall;
    private javax.swing.JButton btnCheckOutt;
    private javax.swing.JLabel btnExit1;
    private javax.swing.JTextField counterFC;
    private javax.swing.JTextField counterFC1;
    private javax.swing.JTextField counterFC2;
    private javax.swing.JTextField counterFC3;
    private javax.swing.JTextField counterFC4;
    private javax.swing.JLabel infoBathCleaner;
    private javax.swing.JLabel infoFloorCleaner;
    private javax.swing.JLabel infoKitchenCleaner;
    private javax.swing.JLabel infoPoolCleaner;
    private javax.swing.JLabel infoRoofCleaner;
    private javax.swing.JLabel infoSinkCleaner;
    private javax.swing.JLabel infoToiletCleaner;
    private javax.swing.JLabel infoWallCleaner;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel panel;
    public static volatile javax.swing.JPanel panelAdmin;
    public static volatile javax.swing.JPanel panelLG;
    private javax.swing.JPanel pnlAbout;
    private javax.swing.JPanel pnlBath;
    private javax.swing.JPanel pnlCart;
    private javax.swing.JPanel pnlCarts;
    private javax.swing.JPanel pnlContactUs;
    public javax.swing.JPanel pnlFloor;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlKitchen;
    private javax.swing.JPanel pnlOders;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlPool;
    private javax.swing.JPanel pnlQuotes;
    private javax.swing.JPanel pnlQuotes1;
    private javax.swing.JPanel pnlQuots;
    private javax.swing.JPanel pnlReview;
    private javax.swing.JPanel pnlRoof;
    private javax.swing.JPanel pnlSignOut;
    private javax.swing.JPanel pnlSignOut1;
    private javax.swing.JPanel pnlSink;
    private javax.swing.JPanel pnlToilet;
    private javax.swing.JPanel pnlWall;
    private javax.swing.JLabel profile;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel txtAbout;
    private javax.swing.JLabel txtAbout1;
    private javax.swing.JLabel txtCart;
    private javax.swing.JLabel txtContact;
    private javax.swing.JLabel txtContact1;
    private javax.swing.JLabel txtCustName;
    private javax.swing.JLabel txtHeading;
    private javax.swing.JLabel txtHome;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtOrders;
    private javax.swing.JLabel txtOrders1;
    private javax.swing.JLabel txtQuotations;
    private javax.swing.JLabel txtQuotations1;
    private javax.swing.JLabel txtRegister;
    private javax.swing.JLabel txtReview;
    private javax.swing.JLabel txtReview1;
    private javax.swing.JLabel txtSignOut;
    private javax.swing.JLabel txtSignOut1;
    // End of variables declaration//GEN-END:variables
}
