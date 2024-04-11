/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package real_estate_management;

/**
 *
 * @author ishaa
 */
public class EDIT_REMOVE_PROPERTY_SELLER_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form EDIT_REMOVE_PROPERTY_SELLER_WINDOW
     */
    public EDIT_REMOVE_PROPERTY_SELLER_WINDOW() {
        initComponents();
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
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_House_Name = new javax.swing.JTextField();
        jButton_Remove_Property = new javax.swing.JButton();
        jButton_Edit_Property = new javax.swing.JButton();
        jTextField_Size = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_HouseNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_StreetName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Locality = new javax.swing.JTextField();
        jTextField_City = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_State = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_PostalCode = new javax.swing.JTextField();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jSpinner_Bedrooms = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox_isRERAApproved = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox_Category = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField_House_Name1 = new javax.swing.JTextField();
        jButton_Edit_Remove_Property_Search = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSpinner1_Floors = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(724, 768));

        jPanel_Title.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROPERTY");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel1)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Description / Comment:");

        jTextField_House_Name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_House_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_House_NameActionPerformed(evt);
            }
        });

        jButton_Remove_Property.setBackground(new java.awt.Color(240, 240, 240));
        jButton_Remove_Property.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton_Remove_Property.setText("Remove");
        jButton_Remove_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_PropertyActionPerformed(evt);
            }
        });

        jButton_Edit_Property.setBackground(new java.awt.Color(240, 240, 240));
        jButton_Edit_Property.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton_Edit_Property.setText("Edit");
        jButton_Edit_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_PropertyActionPerformed(evt);
            }
        });

        jTextField_Size.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Size.setActionCommand("<Not Set>");
        jTextField_Size.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SizeActionPerformed(evt);
            }
        });
        jTextField_Size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SizeKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Size (sq. ft.):");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Status:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("House No.:");

        jTextField_HouseNo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_HouseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_HouseNoActionPerformed(evt);
            }
        });
        jTextField_HouseNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_HouseNoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Street Name:");

        jTextField_StreetName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_StreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StreetNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Locality:");

        jTextField_Locality.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_Locality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LocalityActionPerformed(evt);
            }
        });

        jTextField_City.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CityActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("City:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("State:");

        jTextField_State.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Postal Code:");

        jTextField_PostalCode.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_PostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PostalCodeActionPerformed(evt);
            }
        });
        jTextField_PostalCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PostalCodeKeyTyped(evt);
            }
        });

        jComboBox_Status.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Under Construction", "Ready to Move" }));

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Description);

        jSpinner_Bedrooms.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Bedrooms:");

        jCheckBox_isRERAApproved.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jCheckBox_isRERAApproved.setText("RERA Approved");
        jCheckBox_isRERAApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_isRERAApprovedActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Category:");

        jComboBox_Category.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sell", "Rent" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Name:");

        jTextField_House_Name1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField_House_Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_House_Name1ActionPerformed(evt);
            }
        });

        jButton_Edit_Remove_Property_Search.setBackground(new java.awt.Color(240, 240, 240));
        jButton_Edit_Remove_Property_Search.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton_Edit_Remove_Property_Search.setText("Search");
        jButton_Edit_Remove_Property_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_Remove_Property_SearchActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setText("Floor(s):");

        jSpinner1_Floors.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Size)
                            .addComponent(jTextField_HouseNo)
                            .addComponent(jTextField_StreetName)
                            .addComponent(jTextField_Locality)
                            .addComponent(jTextField_City)
                            .addComponent(jTextField_State)
                            .addComponent(jTextField_PostalCode)
                            .addComponent(jComboBox_Status, 0, 233, Short.MAX_VALUE)
                            .addComponent(jTextField_House_Name1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_House_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Edit_Remove_Property_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Edit_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1_Floors, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBox_isRERAApproved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jButton_Remove_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_House_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Edit_Remove_Property_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_House_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jSpinner1_Floors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jComboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox_isRERAApproved))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_HouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Locality, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_State, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_PostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Remove_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(413, 413, 413))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_House_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_House_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_House_NameActionPerformed

    private void jButton_Remove_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_PropertyActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton_Remove_PropertyActionPerformed

    private void jButton_Edit_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_PropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Edit_PropertyActionPerformed

    private void jTextField_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SizeActionPerformed

    private void jTextField_SizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SizeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_SizeKeyTyped

    private void jTextField_HouseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_HouseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_HouseNoActionPerformed

    private void jTextField_StreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StreetNameActionPerformed

    private void jTextField_LocalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LocalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LocalityActionPerformed

    private void jTextField_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CityActionPerformed

    private void jTextField_StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StateActionPerformed

    private void jTextField_PostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PostalCodeActionPerformed

    private void jCheckBox_isRERAApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_isRERAApprovedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_isRERAApprovedActionPerformed

    private void jTextField_House_Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_House_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_House_Name1ActionPerformed

    private void jButton_Edit_Remove_Property_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_Remove_Property_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Edit_Remove_Property_SearchActionPerformed

    private void jTextField_HouseNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HouseNoKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();

        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_HouseNoKeyTyped

    private void jTextField_PostalCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PostalCodeKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();

        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PostalCodeKeyTyped


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
            java.util.logging.Logger.getLogger(EDIT_REMOVE_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDIT_REMOVE_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDIT_REMOVE_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDIT_REMOVE_PROPERTY_SELLER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EDIT_REMOVE_PROPERTY_SELLER_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Edit_Property;
    private javax.swing.JButton jButton_Edit_Remove_Property_Search;
    private javax.swing.JButton jButton_Remove_Property;
    private javax.swing.JCheckBox jCheckBox_isRERAApproved;
    private javax.swing.JComboBox<String> jComboBox_Category;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1_Floors;
    private javax.swing.JSpinner jSpinner_Bedrooms;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_City;
    private javax.swing.JTextField jTextField_HouseNo;
    private javax.swing.JTextField jTextField_House_Name;
    private javax.swing.JTextField jTextField_House_Name1;
    private javax.swing.JTextField jTextField_Locality;
    private javax.swing.JTextField jTextField_PostalCode;
    private javax.swing.JTextField jTextField_Size;
    private javax.swing.JTextField jTextField_State;
    private javax.swing.JTextField jTextField_StreetName;
    // End of variables declaration//GEN-END:variables
}
