
package com.sgsvp.formularios;

import com.sgsvp.controladores.BD;
import com.sgsvp.entidades.GenerarCodigos;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class FrmIngresoProductos extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    /** Creates new form IngresoProductos */
    public FrmIngresoProductos() {
        initComponents();
         this.setLocation(150,15 );
         bloquear();
         cargar("");
    }
     void bloquear(){
    txtcod.setEnabled(false);
    txtdes.setEnabled(false);
    txtpre.setEnabled(false);
    txtiva.setEnabled(false);
    txtstock.setEnabled(false);
    btnguardar.setEnabled(false);
    btnnuevo.setEnabled(true);
    btncancelar.setEnabled(false);
    btnactualizar.setEnabled(false);
    
    }
    void limpiar(){
    txtcod.setText("");
    txtdes.setText("");
    txtpre.setText("");
    txtiva.setText("");
    txtstock.setText("");
    }
    void desbloquear(){
    txtcod.setEnabled(true);
    txtdes.setEnabled(true);
    txtpre.setEnabled(true);
    txtiva.setEnabled(true);
    txtstock.setEnabled(true);
    
    btnguardar.setEnabled(true);
    btnnuevo.setEnabled(false);
    btncancelar.setEnabled(true);
    }
    void cargar(String valor) {
        try{
            String [] titulos={"Codigo","Descripcion","Precio","IVA","Stock"};
            String [] registros= new String[5];
            model=new DefaultTableModel(null,titulos);
            
            String cons="select * from producto WHERE CONCAT (id_prod,prod_desc,'',prod_precio_1) LIKE '%"+valor+"%'";
            Statement st= cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next()){
                registros[0]=rs.getString("id_prod");
                registros[1]=rs.getString("prod_desc");
                registros[2]=rs.getString("prod_precio_1");
                registros[3]=rs.getString("prod_iva");
                registros[4]=rs.getString("prod_stock");
                
                model.addRow(registros);      
                }
            tbproductos.setModel(model);
            tbproductos.getColumnModel().getColumn(0).setPreferredWidth(150);
            tbproductos.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbproductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            }catch(Exception e){
                System.out.println(e.getMessage());
                 }
     
    }
        void BuscarProductoEditar(String cod) {
        
        try{
           
            String codi="",desc="",prec="",iva="",stock="";
            String cons="select * from producto WHERE id_prod='"+cod+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next())
            {
                codi=rs.getString("id_prod");
                desc=rs.getString("prod_desc");
                prec=rs.getString("prod_precio_1");
                iva=rs.getString("prod_iva");
                stock=rs.getString("prod_stock");
           
            }
            txtcod.setText(codi);
            txtdes.setText(desc);
            txtpre.setText(prec);
            txtiva.setText(iva);
            txtstock.setText(stock);
            
            }catch(Exception e)
            {
            System.out.println(e.getMessage());
            }
     
    }
        void codigos(){
           
        int j;
        int cont=1;
        String num="";
        String c="";
         String SQL="select max(id_prod) from producto";
       // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next())
            {              
                 c=rs.getString(1);
            }
            
           
            if(c==null){
                txtcod.setText("0001");
            }
            else{
                char r1=c.charAt(2);
            char r2=c.charAt(3);
            char r3=c.charAt(4);
            char r4=c.charAt(5);
            String r="";
            r=""+r1+r2+r3+r4;
                 j=Integer.parseInt(r);
                 GenerarCodigos gen= new GenerarCodigos();
                 gen.generar(j);
                 txtcod.setText(gen.serie());
                
            
            }
       
          
                  
           
           
         
        } catch (SQLException ex) {
          // Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
        }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnactualizar = new javax.swing.JMenuItem();
        mneliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        mnactualizar.setText("Modificar");
        mnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnactualizarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnactualizar);

        mneliminar.setText("Eliminar");
        mneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneliminar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO DE PRODUCTOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Producto"));

        jLabel1.setText("Codigo:");

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion:");

        txtdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio:");

        txtpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreActionPerformed(evt);
            }
        });

        jLabel5.setText("Stock:");

        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });

        txtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtivaActionPerformed(evt);
            }
        });

        jLabel6.setText("IVA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setText("Grabar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnactualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbproductos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tbproductos);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/magnifying-glass-4x.png"))); // NOI18N
        jLabel4.setText("BUSCAR:");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        jButton1.setText("Mostrar Todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 655, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
// TODO add your handling code here:
    txtcod.transferFocus();
}//GEN-LAST:event_txtcodActionPerformed

private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_btnsalirActionPerformed

private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
// TODO add your handling code here:
    desbloquear();
    limpiar();
    txtcod.requestFocus();
   codigos();
}//GEN-LAST:event_btnnuevoActionPerformed

private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
// TODO add your handling code here:
    bloquear();
}//GEN-LAST:event_btncancelarActionPerformed

private void txtdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesActionPerformed
// TODO add your handling code here:
    txtdes.transferFocus();
}//GEN-LAST:event_txtdesActionPerformed

private void txtpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreActionPerformed
// TODO add your handling code here:
    txtpre.transferFocus();
}//GEN-LAST:event_txtpreActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    cargar("");
}//GEN-LAST:event_jButton1ActionPerformed

private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
// TODO add your handling code here:
    cargar(txtbuscar.getText());
}//GEN-LAST:event_txtbuscarKeyReleased

private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
// TODO add your handling code here:
       int filasel= tbproductos.getSelectedRow();
       try {
           if(filasel==-1)
           {
            JOptionPane.showMessageDialog(null, "Seleccione algun dato");
           }
           else
           {
             String  cod=(String)tbproductos.getValueAt(filasel, 0);
             String eliminarSQL="DELETE FROM producto WHERE id_prod = '"+cod+"'";
             try {
             PreparedStatement pst  = cn.prepareStatement(eliminarSQL);
          pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminado");
            cargar("");
            } 
            catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
           }
           } 
       catch (Exception e)
       {
       }
}//GEN-LAST:event_mneliminarActionPerformed

private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
// TODO add your handling code here:
    String cod,des,pre,iva,stock;
            String sql="";
            cod=txtcod.getText();
            des=txtdes.getText();
            pre=txtpre.getText();
            iva=txtiva.getText();
            stock=txtstock.getText();
            sql="INSERT INTO producto (id_prod,prod_desc,prod_precio_1,prod_iva,prod_stock) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, cod);
            pst.setString(2, des);
            pst.setString(3, pre);
            pst.setString(4, iva);
            pst.setString(5, stock);
            int n=pst.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            bloquear();
            }
            cargar("");
        } catch (SQLException ex) {
            Logger.getLogger(FrmIngresoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnguardarActionPerformed

private void mnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnactualizarActionPerformed
// TODO add your handling code here:
    
    try {
        int filaMod=tbproductos.getSelectedRow();
        if(filaMod==-1)
        {
        JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
        }
        else
        {
        
        btnactualizar.setEnabled(true);
        String cod=(String)tbproductos.getValueAt(filaMod, 0);
        desbloquear();
        BuscarProductoEditar(cod);
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_mnactualizarActionPerformed

private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
// TODO add your handling code here:
     String sql="UPDATE producto SET prod_precio_1 = '"+txtpre.getText()+"',prod_iva = '"+txtiva.getText()+"',prod_desc ='"+txtdes.getText()+"',prod_stock = '"+txtstock.getText()+"' WHERE id_prod = '"+txtcod.getText()+"'"; 
    try {
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.executeUpdate();
       JOptionPane.showMessageDialog(null, "Actualizado");
       cargar("");
       bloquear();
       limpiar();
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
    }
}//GEN-LAST:event_btnactualizarActionPerformed

private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtstockActionPerformed

    private void txtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtivaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mnactualizar;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JTable tbproductos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtpre;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
  Connection cn= BD.getConnection();
}
