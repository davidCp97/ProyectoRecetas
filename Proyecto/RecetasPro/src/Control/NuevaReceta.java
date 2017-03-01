/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Mensajes.InOut;
import Modelo.Conexion;
import Modelo.CrearReceta;
import java.util.ArrayList;

/**
 *
 * @author ingenieria
 */
public class NuevaReceta extends javax.swing.JInternalFrame {

    ArrayList<String> ingre = new ArrayList<>();//Variable Global de Lista de ingredientes.

    /**
     * Creates new form NuevaReceta
     */
    public NuevaReceta() {
        initComponents();
        CrearReceta cre = new CrearReceta(); //Se llama la clase Receta para llenar inicialmente el listado de ingredientes.
        jTextAreaListaIngredientes.setText(cre.mostrarIngredientes());//Se llena TextArea de lista de ingredientes.
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombreReceta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTiempoCoccion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jButtonPaso1 = new javax.swing.JButton();
        jButtonAgregarReceta = new javax.swing.JButton();
        jComboBoxIngredientes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButtonAgregarIngrediente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaListaIngredientesReceta = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombreIngrediente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListaIngredientes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButtonIngredienteNuevo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Receta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Paso 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Paso 2");

        jLabel6.setText("Nombre:");

        jLabel7.setText("Descripción:");

        jTextFieldNombreReceta.setText("a");
        jTextFieldNombreReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreRecetaActionPerformed(evt);
            }
        });

        jLabel8.setText("Tiempo de cocción:");

        jTextFieldTiempoCoccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTiempoCoccionActionPerformed(evt);
            }
        });

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescripcion);

        jButtonPaso1.setText("Siguiente");
        jButtonPaso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaso1ActionPerformed(evt);
            }
        });

        jButtonAgregarReceta.setText("Agregar Receta");
        jButtonAgregarReceta.setEnabled(false);
        jButtonAgregarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarRecetaActionPerformed(evt);
            }
        });

        jComboBoxIngredientes.setEnabled(false);

        jLabel9.setText("Agrega los ingredientes");

        jButtonAgregarIngrediente.setText("Añadir");
        jButtonAgregarIngrediente.setEnabled(false);
        jButtonAgregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarIngredienteActionPerformed(evt);
            }
        });

        jTextAreaListaIngredientesReceta.setEditable(false);
        jTextAreaListaIngredientesReceta.setColumns(20);
        jTextAreaListaIngredientesReceta.setRows(5);
        jTextAreaListaIngredientesReceta.setEnabled(false);
        jScrollPane3.setViewportView(jTextAreaListaIngredientesReceta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNombreReceta))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldTiempoCoccion))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel7)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButtonPaso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonAgregarIngrediente))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel5)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButtonAgregarReceta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldNombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldTiempoCoccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPaso1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAgregarIngrediente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAgregarReceta)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Agregar ingrediente");

        jLabel2.setText("Nombre:");

        jTextAreaListaIngredientes.setEditable(false);
        jTextAreaListaIngredientes.setColumns(20);
        jTextAreaListaIngredientes.setRows(5);
        jTextAreaListaIngredientes.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaListaIngredientes);

        jLabel3.setText("Ingredientes actuales");

        jButtonIngredienteNuevo.setText("Agregar");
        jButtonIngredienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngredienteNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldNombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonIngredienteNuevo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIngredienteNuevo))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón Agregar nuevo ingrediente
    private void jButtonIngredienteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngredienteNuevoActionPerformed
        String nomIngrediente = jTextFieldNombreIngrediente.getText(); //Se trae el Nombre del TextField
        CrearReceta crear = new CrearReceta();
        crear.insertarIngrediente(nomIngrediente);//Se llama el método que registra un ingrediente nuevo a la BD
        jTextAreaListaIngredientes.setText(crear.mostrarIngredientes());//Se actualiza el TextArea con los ingredientes nuevos.

        jComboBoxIngredientes.removeAllItems();//Se Borra el listado actual de ingredientes del Combobox
        Conexion conex = new Conexion();
        ArrayList nuev = new ArrayList<>(conex.consultaIngredientes()); //Se trae una lista de los ingredientes nuevos
        
        for (int i = 0; i < nuev.size(); i++) { //Se llena durante el ciclo el Combobox con la lista de ingredientes.
            String a = nuev.get(i).toString();
            jComboBoxIngredientes.addItem(a);
        }

    }//GEN-LAST:event_jButtonIngredienteNuevoActionPerformed

    private void jTextFieldTiempoCoccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTiempoCoccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTiempoCoccionActionPerformed

    private void jButtonPaso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaso1ActionPerformed
        // TODO add your handling code here:

        String nombre = this.jTextFieldNombreReceta.getText(); //Se trae el Nombre del TextField
        String TiempoCoccion = this.jTextFieldTiempoCoccion.getText();//Se trae el Tiempo del TextField
        String Descripcion = this.jTextAreaDescripcion.getText();//Se trae la descripción del TextArea
        
        if (nombre.equals("") || TiempoCoccion.equals("") || Descripcion.equals("")) { //Se valida que los campos estén vacíos
            InOut ver = new InOut();
            ver.mostrarDatos("Ingrese todos los datos."); //Si están vacíos, se envía un mensaje de alerta.
        } else {//Si los campos tienen datos, se procede al else
            jComboBoxIngredientes.removeAllItems();//Se borran los ingredientes actuales del Combobox
            Conexion conex = new Conexion();
            ArrayList nuev = new ArrayList<>(conex.consultaIngredientes());//Se trae una lista de los ingredientes nuevos
            for (int i = 0; i < nuev.size(); i++) {//Se llena durante el ciclo el Combobox con la lista de ingredientes.
                String a = nuev.get(i).toString();
                jComboBoxIngredientes.addItem(a);
            }
            jTextAreaDescripcion.setEnabled(false); //Se deshabilitan los campos del primer paso, se habilitan los del 2.
            jTextFieldNombreReceta.setEnabled(false);
            jTextFieldTiempoCoccion.setEnabled(false);
            jButtonPaso1.setEnabled(false);
            jComboBoxIngredientes.setEnabled(true);
            jButtonAgregarIngrediente.setEnabled(true);
            jButtonAgregarReceta.setEnabled(true);
        }


    }//GEN-LAST:event_jButtonPaso1ActionPerformed

    private void jButtonAgregarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarRecetaActionPerformed

        // TODO add your handling code here:
        if (jTextAreaListaIngredientesReceta.equals("")) {//Se valida que los campos estén vacíos
            InOut ver = new InOut();
            ver.mostrarDatos("Ingrese todos los datos.");//Si están vacíos, se envía un mensaje de alerta.
        } else {
            jTextAreaDescripcion.setEnabled(true);//Se deshabilitan los campos del segundo paso, se habilitan los del 1.
            jTextFieldNombreReceta.setEnabled(true);
            jTextFieldTiempoCoccion.setEnabled(true);
            jButtonPaso1.setEnabled(true);
            jComboBoxIngredientes.setEnabled(false);
            jButtonAgregarIngrediente.setEnabled(false);
            jButtonAgregarReceta.setEnabled(false);

            CrearReceta crear = new CrearReceta(); //Se crea el objeto para poder llamar el método de Ingreso de Nueva Receta:
            crear.IngresoTablaReceta(jTextFieldNombreReceta.getText(), jTextAreaDescripcion.getText(), jTextFieldTiempoCoccion.getText(), ingre);
            ingre.clear();//Se Borra la lista actual de ingredientes seleccionados.
        }


    }//GEN-LAST:event_jButtonAgregarRecetaActionPerformed

    private void jTextFieldNombreRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreRecetaActionPerformed

    private void jButtonAgregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarIngredienteActionPerformed
        // TODO add your handling code here:
        String total = jTextAreaListaIngredientesReceta.getText(); //Se guarda en un String los ingredientes actuales.
        String valor = jComboBoxIngredientes.getSelectedItem().toString(); //Se guarda en un String el ingrediente seleccionado.

        total = total + " " + valor; //Se agrega el ingrediente seleccionado a la colección de seleccionados previamente.
        jTextAreaListaIngredientesReceta.setText(total); //Se actualiza la lista de ingredientes seleccionados.
        ingre.add(valor);//Se agrega el ingrediente seleccionado a la variable Global que tiene todos los ingredientes seleccionados.
    }//GEN-LAST:event_jButtonAgregarIngredienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarIngrediente;
    private javax.swing.JButton jButtonAgregarReceta;
    private javax.swing.JButton jButtonIngredienteNuevo;
    private javax.swing.JButton jButtonPaso1;
    private javax.swing.JComboBox<String> jComboBoxIngredientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextArea jTextAreaListaIngredientes;
    private javax.swing.JTextArea jTextAreaListaIngredientesReceta;
    private javax.swing.JTextField jTextFieldNombreIngrediente;
    private javax.swing.JTextField jTextFieldNombreReceta;
    private javax.swing.JTextField jTextFieldTiempoCoccion;
    // End of variables declaration//GEN-END:variables
}