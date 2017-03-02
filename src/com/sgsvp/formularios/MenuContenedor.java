
package com.sgsvp.formularios;

import javax.swing.JOptionPane;
import com.sgsvp.controladores.ImagenFondo;
/**
 *
 * @author jhernandez
 */
public class MenuContenedor extends javax.swing.JFrame {

    /**
     * Creates new form MenuContenedor
     */
    public MenuContenedor() {
        initComponents();
        escritorio.setBorder(new ImagenFondo());
        this.setExtendedState(MenuContenedor.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de venta ");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(70, 99, 138));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(4, 35, 50));
        jMenuBar1.setBorder(null);

        jMenu11.setBackground(new java.awt.Color(2, 175, 223));
        jMenu11.setBorder(null);
        jMenu11.setForeground(new java.awt.Color(255, 255, 255));
        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/spreadsheet-6x.png"))); // NOI18N
        jMenu11.setText(" SGSVP 2016");
        jMenu11.setActionCommand(" SGSVP 2016  ");
        jMenu11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu11.setFocusable(false);
        jMenu11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jMenu11.setOpaque(true);
        jMenu11.setRequestFocusEnabled(false);
        jMenu11.setRolloverEnabled(false);
        jMenuBar1.add(jMenu11);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/cog-6x.png"))); // NOI18N
        jMenu1.setText("Referenciales");

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/layers-3x.png"))); // NOI18N
        jMenu3.setText("Administración");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem3.setText("Entidad financiera");
        jMenuItem3.setEnabled(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem10.setText("Tipo de documentos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem4.setText("Tipo de persona");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem11.setText("Tipo de cobro");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem5.setText("Clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem12.setText("Tipo de pago");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem8.setText("Cargar datos de la empresa");
        jMenuItem8.setEnabled(false);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem6.setText("Reportes de proveedor");
        jMenuItem6.setEnabled(false);
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem7.setText("Reportes de cliente");
        jMenu3.add(jMenuItem7);

        jMenu1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/layers-3x.png"))); // NOI18N
        jMenu4.setText("Gesrtionar usuario");

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/people-3x.png"))); // NOI18N
        jMenuItem15.setText("Registrar recursos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/people-3x.png"))); // NOI18N
        jMenuItem13.setText("Asignar usuario");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/people-3x.png"))); // NOI18N
        jMenuItem16.setText("Registrar perfil");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/shield-3x.png"))); // NOI18N
        jMenuItem14.setText("Asignar login");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenu1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/layers-3x.png"))); // NOI18N
        jMenu5.setText("Clasificar productos");

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/box-3x.png"))); // NOI18N
        jMenuItem19.setText("Registrar producto");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/box-3x.png"))); // NOI18N
        jMenuItem20.setText("Clase de producto");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/box-3x.png"))); // NOI18N
        jMenuItem21.setText("Depósito");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/box-3x.png"))); // NOI18N
        jMenuItem22.setText("Motivo");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem22);

        jMenu17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/layers-3x.png"))); // NOI18N
        jMenu17.setText("Verificar stock");

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/clipboard-3x.png"))); // NOI18N
        jMenuItem23.setText("Registrar stock producto");
        jMenu17.add(jMenuItem23);

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/clipboard-3x.png"))); // NOI18N
        jMenuItem24.setText("Realizar ajuste stock producto");
        jMenu17.add(jMenuItem24);

        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/clipboard-3x.png"))); // NOI18N
        jMenuItem25.setText("Registrar stock materia prima");
        jMenu17.add(jMenuItem25);

        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/clipboard-3x.png"))); // NOI18N
        jMenuItem26.setText("Realizar ajuste stock materia prima");
        jMenu17.add(jMenuItem26);

        jMenu5.add(jMenu17);

        jMenu1.add(jMenu5);

        jMenuItem50.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/account-logout-3x.png"))); // NOI18N
        jMenuItem50.setText("Salir");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem50);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/document-6x.png"))); // NOI18N
        jMenu2.setText("Compras");

        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem27.setText("Compras");
        jMenu2.add(jMenuItem27);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem17.setText("Productos Maestros");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem1.setText("----------------------");
        jMenu2.add(jMenuItem1);

        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem28.setText("Reportes de compra");
        jMenu2.add(jMenuItem28);

        jMenuBar1.add(jMenu2);

        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/grid-four-up-6x.png"))); // NOI18N
        jMenu7.setText("Producción");

        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem29.setText("Producción");
        jMenu7.add(jMenuItem29);

        jMenuItem30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem30.setText("Materia prima");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem30);

        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem31.setText("Unidad de medida");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem31);

        jMenuItem32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem32.setText("Reservas");
        jMenu7.add(jMenuItem32);

        jMenuItem33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem33.setText("Reporte de materia prima");
        jMenu7.add(jMenuItem33);

        jMenuItem34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem34.setText("Reporte de producción");
        jMenu7.add(jMenuItem34);

        jMenuItem35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem35.setText("Reportes de reservas");
        jMenu7.add(jMenuItem35);

        jMenuBar1.add(jMenu7);

        jMenu8.setForeground(new java.awt.Color(255, 255, 255));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/file-6x.png"))); // NOI18N
        jMenu8.setText("Ventas");

        jMenuItem36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem36.setText("Pedidos del cliente");
        jMenu8.add(jMenuItem36);

        jMenuItem37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem37.setText("Ventas");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem37);

        jMenuItem38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem38.setText("Generar cuentas a cobrar");
        jMenu8.add(jMenuItem38);

        jMenuItem39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem39.setText("Ventas de pago");
        jMenu8.add(jMenuItem39);

        jMenuItem40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/file-3x.png"))); // NOI18N
        jMenuItem40.setText("Reporte pedido");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem40);

        jMenuItem41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/file-3x.png"))); // NOI18N
        jMenuItem41.setText("Reportes de las ventas");
        jMenu8.add(jMenuItem41);

        jMenuBar1.add(jMenu8);

        jMenu9.setForeground(new java.awt.Color(255, 255, 255));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/calculator-6x.png"))); // NOI18N
        jMenu9.setText("Cobranza");

        jMenuItem47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem47.setText("Caja");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem47);

        jMenuItem44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem44.setText("Cobros");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem44);

        jMenuItem46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem46.setText("Caja chica");
        jMenu9.add(jMenuItem46);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem2.setText("Caja chica concepto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenuItem45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem45.setText("Movimientos de cobros");
        jMenu9.add(jMenuItem45);

        jMenuItem42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem42.setText("Aperturas y cierres de caja");
        jMenu9.add(jMenuItem42);

        jMenuItem43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem43.setText("Cobros de facturas de consumo y otros servicios");
        jMenu9.add(jMenuItem43);

        jMenuItem48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem48.setText("Reporte de aperturas y cierres de caja");
        jMenu9.add(jMenuItem48);

        jMenuItem49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem49.setText("Reporte de cobros de facturas y otros servicios");
        jMenu9.add(jMenuItem49);

        jMenuBar1.add(jMenu9);

        jMenu10.setForeground(new java.awt.Color(255, 255, 255));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/credit-card-6x.png"))); // NOI18N
        jMenu10.setText("Tesorería");

        jMenuItem51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem51.setText("Pagos");
        jMenu10.add(jMenuItem51);

        jMenuItem52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/chevron-right-3x.png"))); // NOI18N
        jMenuItem52.setText("Asignación y reposición de fondo Fijo");
        jMenu10.add(jMenuItem52);

        jMenuBar1.add(jMenu10);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/info-6x.png"))); // NOI18N
        jMenu6.setText("Ayuda");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sgsvp/resource/command-3x.png"))); // NOI18N
        jMenuItem9.setText("Acerca de...");
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FrmTipoDocumento frmTipoDocumento = new FrmTipoDocumento();
        this.escritorio.add(frmTipoDocumento);
        frmTipoDocumento.show();       // Muestra el formulario Tipo de Documento
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       FrmTipoCobro tipoCobro = new FrmTipoCobro();
        this.escritorio.add(tipoCobro);
        tipoCobro.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      FrmIngresoCliente ingresoCliente = new FrmIngresoCliente();
        this.escritorio.add(ingresoCliente);
        ingresoCliente.show();       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       FrmTipoPago tipoPago = new FrmTipoPago();
        this.escritorio.add(tipoPago);
        tipoPago.show(); 
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
       
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
       
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
       
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
       
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
       
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this, "Desea Salir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {//si quiere cerrar
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
       
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
    
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
       
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
       
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        FrmIngresoProductos frmIngresoProductos = new FrmIngresoProductos();
        this.escritorio.add(frmIngresoProductos);
        frmIngresoProductos.show();      
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        FrmFactura frmFactura= new FrmFactura();
        this.escritorio.add(frmFactura);
        frmFactura.show();  
    }//GEN-LAST:event_jMenuItem37ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuContenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
