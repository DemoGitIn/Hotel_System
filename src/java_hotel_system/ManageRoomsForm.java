package java_hotel_system;
import javax.swing.JFrame;
import Connectors.Connector;
import com.mysql.cj.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java_hotel_system_entities.Room;
import java_hotel_system_interfaces.I_RoomRepository;
import java_hotel_system_swing.Table;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageRoomsForm extends javax.swing.JFrame {
    
    private I_RoomRepository rr = new ROOMS(Connector.getConnection());

    ROOMS room = new ROOMS(); 
    
    public ManageRoomsForm() {
        initComponents();
        room.fillRooms_TYPE_JCombobox(cmbType);
        uploadData();
        
        tblRooms.setRowHeight(30);
    }
    
    private void uploadData() {
        new Table().upload(tblRooms, rr.getAll());
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAddRoom = new javax.swing.JButton();
        btnEditRoom = new javax.swing.JButton();
        btnRemoveRoom = new javax.swing.JButton();
        btnClearFields = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        cmbType = new javax.swing.JComboBox<>();
        btnShowRoomTypes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnYes = new javax.swing.JRadioButton();
        btnNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1171, 589));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(29, 121, 151));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Rooms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(29, 121, 151));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 121, 151));
        jLabel2.setText("Number:");

        jLabel3.setBackground(new java.awt.Color(29, 121, 151));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 121, 151));
        jLabel3.setText("Type:");

        txtRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(29, 121, 151));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 121, 151));
        jLabel5.setText("Phone Number:");

        btnAddRoom.setBackground(new java.awt.Color(0, 153, 153));
        btnAddRoom.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddRoom.setText("Add New Room");
        btnAddRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });

        btnEditRoom.setBackground(new java.awt.Color(0, 153, 153));
        btnEditRoom.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditRoom.setText("Edit");
        btnEditRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRoomActionPerformed(evt);
            }
        });

        btnRemoveRoom.setBackground(new java.awt.Color(0, 153, 153));
        btnRemoveRoom.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnRemoveRoom.setText("Remove");
        btnRemoveRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveRoomActionPerformed(evt);
            }
        });

        btnClearFields.setBackground(new java.awt.Color(0, 102, 102));
        btnClearFields.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClearFields.setForeground(new java.awt.Color(255, 255, 255));
        btnClearFields.setText("Clear Fields");
        btnClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFieldsActionPerformed(evt);
            }
        });

        tblRooms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRooms);

        btnSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSearch.setText("Search by ID");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        cmbType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });

        btnShowRoomTypes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowRoomTypes.setText("Show Types");
        btnShowRoomTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRoomTypesActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(29, 121, 151));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(29, 121, 151));
        jLabel6.setText("Reserved:");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnYes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnYes.setText("Yes");

        btnNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNo.setText("No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnYes)
                .addGap(32, 32, 32)
                .addComponent(btnNo)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYes)
                    .addComponent(btnNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClearFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addGap(65, 65, 65))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                            .addComponent(txtRoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnShowRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnEditRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRemoveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnShowRoomTypes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        Room room = new Room(
            Integer.valueOf(cmbType.getSelectedItem().toString()),
            txtPhone.getText()
            );
            rr.save(room);
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void btnEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRoomActionPerformed
        // edit the selected room

        //get data from the fields
        if (!StringUtils.isNullOrEmpty(txtRoomNumber.getText())) {
            int roomNumber = Integer.valueOf(txtRoomNumber.getText());
            int type = Integer.valueOf(cmbType.getSelectedItem().toString());
            String phone = txtPhone.getText();
            String isReserved = "No";
            
            if(btnYes.isSelected()){
                isReserved = "Yes";
            }        

            Room roomToUpdate = rr.getByR_number(roomNumber);

            roomToUpdate.setType(type);
            roomToUpdate.setPhone(phone);
            roomToUpdate.setReserved(isReserved);

            rr.update(roomToUpdate);
            
            if(phone.trim().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Enter the Room Phone Number", "Empty Field", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Enter the Room Number", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditRoomActionPerformed

    private void btnRemoveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveRoomActionPerformed
    //delete the selected Room
        if (!StringUtils.isNullOrEmpty(txtRoomNumber.getText())) {
            int roomNumber = Integer.valueOf(txtRoomNumber.getText());

            Room roomToRemove = rr.getByR_number(roomNumber);

            rr.remove(roomToRemove);

            uploadData();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Enter the Room Number", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveRoomActionPerformed

    private void btnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldsActionPerformed
        //remove text from all jtextfields
        txtRoomNumber.setText("");
        txtPhone.setText("");
        cmbType.setSelectedIndex(0);
        btnNo.setSelected(true);
    }//GEN-LAST:event_btnClearFieldsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (!StringUtils.isNullOrEmpty(txtRoomNumber.getText())) {
            int roomNumber = Integer.valueOf(txtRoomNumber.getText());
            List<Room> results = new ArrayList<Room>();
            results.add(rr.getByR_number(roomNumber));
            new Table<Room>().upload(tblRooms, results);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Enter the Room Number", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
    
    }//GEN-LAST:event_cmbTypeActionPerformed

    private void btnShowRoomTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRoomTypesActionPerformed
        ALL_ROOMS_TYPE_FORM roomTypesForm = new ALL_ROOMS_TYPE_FORM();
        roomTypesForm.setVisible(true);
        roomTypesForm.pack();
        roomTypesForm.setLocationRelativeTo(null);
        roomTypesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnShowRoomTypesActionPerformed

    private void tblRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomsMouseClicked
        DefaultTableModel model =(DefaultTableModel)tblRooms.getModel();
        
        int rIndex =tblRooms.getSelectedRow();
        
        txtRoomNumber.setText(model.getValueAt(rIndex, 0).toString());
        cmbType.setSelectedItem(model.getValueAt(rIndex, 1));
        txtPhone.setText(model.getValueAt(rIndex, 2).toString());
        
        String isReserved = model.getValueAt(rIndex, 3).toString();
        
        if(isReserved.equals("Yes")){
            btnYes.setSelected(true);
        }else if(isReserved.equals("No")){
            btnNo.setSelected(true);
        }
    }//GEN-LAST:event_tblRoomsMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        uploadData();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnClearFields;
    private javax.swing.JButton btnEditRoom;
    private javax.swing.JRadioButton btnNo;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveRoom;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowRoomTypes;
    private javax.swing.JRadioButton btnYes;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRooms;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables
}
