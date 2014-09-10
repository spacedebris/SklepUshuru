/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sklep;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author si
 */
public class Sklep extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public Sklep() {
        initComponents();
        try{
            
            Connect.refresh("SELECT * FROM Towary", Sklep.towaryTable);
            Connect.refresh("SELECT * FROM Transakcje", Sklep.transakcjeTable);
            Connect.refresh("SELECT * FROM Klienci", Sklep.klienciTable);
            Connect.refresh("SELECT * FROM Pracownicy", Sklep.pracownicyTable);
            
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Sklep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        towaryTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        dodajTowar = new javax.swing.JButton();
        wyszukajTowarArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pracownicyTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        dodajFakture = new javax.swing.JButton();
        wyszukajPracownikaArea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        dodajKlienta = new javax.swing.JButton();
        wyszukajKlientaArea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        klienciTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        transakcjeTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        dodajTransakcje = new javax.swing.JButton();
        wyszukajTransakcjeArea = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SklepUshuru");
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        towaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id_Towaru", "Nazwa", "Cena_net", "Stawka_VAT"
            }
        ));
        towaryTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(towaryTable);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        dodajTowar.setText("Dodaj");
        dodajTowar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajTowarMouseClicked(evt);
            }
        });
        dodajTowar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajTowarActionPerformed(evt);
            }
        });

        wyszukajTowarArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wyszukajTowarAreaKeyReleased(evt);
            }
        });

        jLabel3.setText("wyszukaj");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(dodajTowar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wyszukajTowarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajTowar)
                    .addComponent(wyszukajTowarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Towary", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        pracownicyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Pracownika", "Nazwisko", "Imie", "Miasto", "Ulica", "Telefon", "Wyplata"
            }
        ));
        pracownicyTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(pracownicyTable);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        dodajFakture.setText("Dodaj");
        dodajFakture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajFaktureMouseClicked(evt);
            }
        });

        wyszukajPracownikaArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wyszukajPracownikaAreaKeyReleased(evt);
            }
        });

        jLabel1.setText("wyszukaj");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(dodajFakture)
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wyszukajPracownikaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajFakture)
                    .addComponent(wyszukajPracownikaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Pracownicy", jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        dodajKlienta.setText("Dodaj");
        dodajKlienta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajKlientaMouseClicked(evt);
            }
        });
        dodajKlienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajKlientaActionPerformed(evt);
            }
        });

        wyszukajKlientaArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wyszukajKlientaAreaKeyReleased(evt);
            }
        });

        jLabel2.setText("wyszukaj");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(dodajKlienta)
                .addGap(233, 233, 233)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wyszukajKlientaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajKlienta)
                    .addComponent(wyszukajKlientaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        klienciTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id_klienta", "Nazwisko", "Imie", "Miasto", "Ulica", "Telefon"
            }
        ));
        jScrollPane3.setViewportView(klienciTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Klienci", jPanel7);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        transakcjeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nr_transakcji", "Id_klienta", "Id_pracownika", "Data_zamówienia", "Data_odbioru", "Sposób_odbioru"
            }
        ));
        transakcjeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transakcjeTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(transakcjeTable);
        if (transakcjeTable.getColumnModel().getColumnCount() > 0) {
            transakcjeTable.getColumnModel().getColumn(0).setHeaderValue("Nr_transakcji");
            transakcjeTable.getColumnModel().getColumn(1).setHeaderValue("Id_klienta");
            transakcjeTable.getColumnModel().getColumn(2).setHeaderValue("Id_pracownika");
            transakcjeTable.getColumnModel().getColumn(3).setHeaderValue("Data_zamówienia");
            transakcjeTable.getColumnModel().getColumn(4).setHeaderValue("Data_odbioru");
            transakcjeTable.getColumnModel().getColumn(5).setHeaderValue("Sposób_odbioru");
        }

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        dodajTransakcje.setText("Dodaj");
        dodajTransakcje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajTransakcjeMouseClicked(evt);
            }
        });

        wyszukajTransakcjeArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wyszukajTransakcjeAreaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(dodajTransakcje)
                .addGap(271, 271, 271)
                .addComponent(wyszukajTransakcjeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajTransakcje)
                    .addComponent(wyszukajTransakcjeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Transakcje", jPanel1);

        jMenu2.setText("Opcje");

        jMenuItem1.setText("Zakończ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pomoc");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dodajTransakcjeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajTransakcjeMouseClicked
        // TODO add your handling code here:
        TRdodaj oknoTransakcji = new TRdodaj();
        oknoTransakcji.setVisible(true);
    }//GEN-LAST:event_dodajTransakcjeMouseClicked

    private void dodajKlientaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajKlientaMouseClicked
        // TODO add your handling code here:
        Kdodaj oknoKlienta = new Kdodaj();
        oknoKlienta.setVisible(true);
    }//GEN-LAST:event_dodajKlientaMouseClicked

    private void dodajFaktureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajFaktureMouseClicked
        // TODO add your handling code here:
        Pdodaj oknoFaktury = new Pdodaj();
        oknoFaktury.setVisible(true);
    }//GEN-LAST:event_dodajFaktureMouseClicked

    private void dodajTowarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajTowarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajTowarActionPerformed

    private void dodajTowarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajTowarMouseClicked
        // TODO add your handling code here:
        Tdodaj oknoTowaru = new Tdodaj();
        oknoTowaru.setVisible(true);

    }//GEN-LAST:event_dodajTowarMouseClicked

    private void dodajKlientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajKlientaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dodajKlientaActionPerformed

    private void wyszukajTowarAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wyszukajTowarAreaKeyReleased
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(towaryTable.getModel());
        towaryTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+wyszukajTowarArea.getText()));
    }//GEN-LAST:event_wyszukajTowarAreaKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * przeszukiwanie jtable
     * @param evt KeyEvent
     */
    private void wyszukajPracownikaAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wyszukajPracownikaAreaKeyReleased
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(pracownicyTable.getModel());
        pracownicyTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+wyszukajPracownikaArea.getText()));
    }//GEN-LAST:event_wyszukajPracownikaAreaKeyReleased

    private void wyszukajKlientaAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wyszukajKlientaAreaKeyReleased
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(klienciTable.getModel());
        klienciTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+wyszukajKlientaArea.getText()));
    }//GEN-LAST:event_wyszukajKlientaAreaKeyReleased

    private void wyszukajTransakcjeAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wyszukajTransakcjeAreaKeyReleased
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(transakcjeTable.getModel());
        transakcjeTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+wyszukajTransakcjeArea.getText()));
    }//GEN-LAST:event_wyszukajTransakcjeAreaKeyReleased

    private void transakcjeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transakcjeTableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 1){
            TRpodglad podgladTR = new TRpodglad();
            
            Sklep.transakcjeTable = (JTable)evt.getSource();
            Object nr_transakcji = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(),0);
            String Snr_transakcji = nr_transakcji.toString();
            Object id_klienta = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 1);
            Object id_pracownika = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 2);
            Object data_zamowienia = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 3);
            Object data_odbioru = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 4);
            Object sposob_odbioru = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 5);
            Object sposob_zaplaty = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 6);
            Object rabat = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 7);
            Object status = (Object)Sklep.transakcjeTable.getValueAt(Sklep.transakcjeTable.getSelectedRow(), 8);
            podgladTR.IdKlientaField.setText(id_klienta.toString());
            podgladTR.IdPracownikaField.setText(id_pracownika.toString());
            podgladTR.dataZamowieniaField.setText(data_zamowienia.toString());
            podgladTR.dataOdbioruField.setText(data_odbioru.toString());
            podgladTR.sposobOdbioruField.setText(sposob_odbioru.toString());
            podgladTR.sposobZaplatyField.setText(sposob_zaplaty.toString());
            podgladTR.RabatField.setText(rabat.toString());
            podgladTR.StatusField.setText(status.toString());
            
            try {
                Connect.refresh("SELECT * FROM Szczegoly_transakcji WHERE nr_transakcji = "+ Snr_transakcji
                        , podgladTR.szczegolyTransakcjiTable);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Sklep.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            podgladTR.setVisible(true);
        }
    }//GEN-LAST:event_transakcjeTableMouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        Runtime rt = Runtime.getRuntime();
        String file = "C:\\Users\\Ushuru\\Documents\\NetBeansProjects\\SklepUshuru\\src\\Instrukcja.pdf";
        try {
            Process p = rt.exec("foxit reader" +file);
            System.out.println("file");
        } catch (IOException ex) {
            Logger.getLogger(Sklep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        
        String filepath = "C:/Users/Ushuru/Documents/NetBeansProjects/SklepUshuru/src/Instrukcja.pdf";
        File file = new File(filepath);
    if (file.toString().endsWith(".pdf")) 
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
        } catch (IOException ex) {
            Logger.getLogger(Sklep.class.getName()).log(Level.SEVERE, null, ex);
        }
    else {
        Desktop desktop = Desktop.getDesktop();
            try {
                desktop.open(file);
            } catch (IOException ex) {
                Logger.getLogger(Sklep.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jMenu3MouseClicked
    
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
            java.util.logging.Logger.getLogger(Sklep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sklep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sklep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sklep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sklep().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dodajFakture;
    private javax.swing.JButton dodajKlienta;
    private javax.swing.JButton dodajTowar;
    private javax.swing.JButton dodajTransakcje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTable klienciTable;
    public static javax.swing.JTable pracownicyTable;
    public static javax.swing.JTable towaryTable;
    public static javax.swing.JTable transakcjeTable;
    private javax.swing.JTextField wyszukajKlientaArea;
    private javax.swing.JTextField wyszukajPracownikaArea;
    private javax.swing.JTextField wyszukajTowarArea;
    private javax.swing.JTextField wyszukajTransakcjeArea;
    // End of variables declaration//GEN-END:variables
}
