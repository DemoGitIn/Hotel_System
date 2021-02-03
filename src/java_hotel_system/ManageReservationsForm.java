package java_hotel_system;
import java_hotel_system_interfaces.I_ReservationRepository;
import java_hotel_system_swing.Table;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.util.StringUtils;
import Connectors.Connector;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_hotel_system_entities.Reservation;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ManageReservationsForm extends javax.swing.JFrame {
    
    private I_ReservationRepository rr = new RESERVATION(Connector.getConnection());
    
    RESERVATION reservation = new RESERVATION();
    
    public ManageReservationsForm() {
        initComponents();
        cargarElementos();
        
        tblReservations.setRowHeight(25);       
    }

    private void cargarElementos() {
        //cargar tblClients
        new Table().upload(tblReservations, rr.getAll());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClientID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtReservationID = new javax.swing.JTextField();
        txtRoomNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddReservation = new javax.swing.JButton();
        btnEditReservation = new javax.swing.JButton();
        btnRemoveReservation = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReservations = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        DateChooserDateOut = new com.toedter.calendar.JDateChooser();
        DateChooserDateIn = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(29, 121, 151));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Reservations");

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
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        txtClientID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(29, 121, 151));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client Id:");

        txtReservationID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(29, 121, 151));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Number:");

        jLabel5.setBackground(new java.awt.Color(29, 121, 151));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date In:");

        jLabel6.setBackground(new java.awt.Color(29, 121, 151));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Out:");

        btnAddReservation.setBackground(new java.awt.Color(0, 153, 153));
        btnAddReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddReservation.setText("Add New Reservation");
        btnAddReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReservationActionPerformed(evt);
            }
        });

        btnEditReservation.setBackground(new java.awt.Color(0, 153, 153));
        btnEditReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditReservation.setText("Edit");
        btnEditReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditReservationActionPerformed(evt);
            }
        });

        btnRemoveReservation.setBackground(new java.awt.Color(0, 153, 153));
        btnRemoveReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnRemoveReservation.setText("Remove");
        btnRemoveReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveReservationActionPerformed(evt);
            }
        });

        jButtonClearFields.setBackground(new java.awt.Color(0, 102, 102));
        jButtonClearFields.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonClearFields.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClearFields.setText("Clear Fields");
        jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldsActionPerformed(evt);
            }
        });

        tblReservations.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblReservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblReservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservationsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblReservations);

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

        DateChooserDateOut.setDateFormatString("MM/dd/yyyy");

        DateChooserDateIn.setDateFormatString("MM/dd/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClearFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEditReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReservationID, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateChooserDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateChooserDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtReservationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5))
                            .addComponent(DateChooserDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(DateChooserDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReservationActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //if(!txtReservationID.getText().trim().equals("") && !txtClientID.getText().trim().equals("") && !txtRoomNumber.getText().trim().equals("") 
        //        && DateChooserDateIn.getDate() == null && DateChooserDateOut.getDate() == null){
         
        
        try {
            Reservation reservation = new Reservation(
                    Integer.valueOf(txtClientID.getText().toString()),
                    Integer.valueOf(txtRoomNumber.getText().toString()),
                    dateFormat.format(DateChooserDateIn.getDate()),
                    dateFormat.format(DateChooserDateOut.getDate())
            );

            
           String date_in = dateFormat.format(DateChooserDateIn.getDate());   //NO FUNCIONA
            String date_out = dateFormat.format(DateChooserDateOut.getDate());
            String toDaydate = dateFormat.format( new Date());
            
            Date din = dateFormat.parse(date_in);
            Date dout = dateFormat.parse(date_out);
            Date tdd= dateFormat.parse(toDaydate);
        if(!din.after(tdd) || !date_in.equals(tdd)){ //buscar una excepcion para esto, para que no se agregue la reserva
            
            
            rr.save(reservation);
            }else{    
            JOptionPane.showMessageDialog(rootPane, "The Date In Must Be After Or Equal To Today Date", "Date In Error", JOptionPane.WARNING_MESSAGE); 
    } 
            //cargarElementos();

            //}else{
            //  JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name, Phone Number, DateIn/Out", "Empty Field", JOptionPane.WARNING_MESSAGE);
            //}
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name, Phone Number", "Empty Field", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Select the DateIn/Out", "Empty Field", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "The Date In Must Be After Or Equal To Today Date", "Date In Error", JOptionPane.WARNING_MESSAGE); 
        }
                               
    }//GEN-LAST:event_btnAddReservationActionPerformed

    private void btnEditReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditReservationActionPerformed
        // edit the selected reservation

        //get data from the fields
        //if (!StringUtils.isNullOrEmpty(txtReservationID.getText())) {
        try {
            int reservationId = Integer.valueOf(txtReservationID.getText());
            int clientId = Integer.valueOf(txtClientID.getText());
            int roomNumber = Integer.valueOf(txtRoomNumber.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = dateFormat.format(DateChooserDateIn.getDate());
            String date_out = dateFormat.format(DateChooserDateOut.getDate());

            Reservation reservationToUpdate = rr.getById(reservationId);

            //reservationToUpdate.setClient_id();
            reservationToUpdate.setRoom_number(roomNumber);
            reservationToUpdate.setDate_in(date_in);
            reservationToUpdate.setDate_out(date_out);

            rr.update(reservationToUpdate);

            //cargarElementos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name, Phone Number", "Empty Field", JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Select the DateIn/Out", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditReservationActionPerformed

    private void btnRemoveReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveReservationActionPerformed
        //delete the selected Client
        if (!StringUtils.isNullOrEmpty(txtReservationID.getText())) {
            int id = Integer.valueOf(txtReservationID.getText());

            Reservation reservationToRemove = rr.getById(id);

            rr.remove(reservationToRemove);

            //cargarElementos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Enter the ID", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveReservationActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        //remove text from all jtextfields
        txtReservationID.setText("");
        txtClientID.setText("");
        txtRoomNumber.setText("");
        
        //remove data from jdatechooser
        DateChooserDateIn.setDate(null);
        DateChooserDateOut.setDate(null);
        
        //to set the date to the current day use new Date instead of null
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void tblReservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationsMouseClicked
        DefaultTableModel model =(DefaultTableModel)tblReservations.getModel();

        int rIndex =tblReservations.getSelectedRow();

        //display data
        txtReservationID.setText(model.getValueAt(rIndex, 0).toString());
        txtClientID.setText(model.getValueAt(rIndex, 1).toString());
        txtRoomNumber.setText(model.getValueAt(rIndex, 2).toString());
        
        //display the dateIn & dateOut from jtable to jdatechooser
        try {
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 3).toString());
            DateChooserDateIn.setDate(dateIn); 
            
            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 4).toString());
            DateChooserDateOut.setDate(dateOut);
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblReservationsMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (!StringUtils.isNullOrEmpty(txtReservationID.getText())) {
            int id = Integer.valueOf(txtReservationID.getText());
            List<Reservation> results = new ArrayList<Reservation>();
            results.add(rr.getById(id));
            new Table<Reservation>().upload(tblReservations, results);
        } else {
            System.out.println("..");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        cargarElementos();
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
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReservationsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserDateIn;
    private com.toedter.calendar.JDateChooser DateChooserDateOut;
    private javax.swing.JButton btnAddReservation;
    private javax.swing.JButton btnEditReservation;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveReservation;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblReservations;
    private javax.swing.JTextField txtClientID;
    private javax.swing.JTextField txtReservationID;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables
}
