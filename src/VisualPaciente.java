/*
Crear un Sistema  llamado  Hospital 
Objetivo:  “Centro de albergue y tratamiento de enfermos” Según la OMS, un hospital es una “parte integrante de una organización médica y social, cuya misión es proporcionar a la población asistencia médica y sanitaria tanto curativa como preventiva, y cuyos servicios externos se irradian .
 Con los siguientes registros:
Pacientes
Médicos
Visitas
Cada registro tendrá los siguientes campos, determinando el tipo de datos que corresponde a cada campo
Pacientes: Nombre,  cedula, Códigodelpaciente,
 Fecha nacimiento ,Sexo,Provincia, Dirección,  
y Teléfono. Fecha de nacimiento paciente 
(se debe llevar el historial de peso, presión  
durante las 10 últimas visitas.) 
Historial médico con cada enfermedad que tiene
Médicos: Código del médico,   cedula, nombre, apellidos, especialidad, dirección, salario, teléfono 
Visitas : Nºdevisita, Fecha de visita, Código del paciente, Código del médico, Motivo de visita.
 


El sistema deberá de tener las siguientes opciones en
el  menú:
1.Insertar  : insertará los datos de todos los 
registros
2. Eliminar: podrá borrar un registro o todos 
los registros
3. Modificar: si se ingresó un dato erróneo 
esta opción permitirá modificarlos
4. Reportes: 
Pacientes (datos generales)
Visitas (quienes lo han visitado
Médico (datos generales)
Historial médico por paciente
 */

import java.io.*;
import com.sun.glass.events.KeyEvent;
import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;
import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.DocumentFilter;

public class VisualPaciente extends javax.swing.JFrame {

    public void IngresarDatosPaciente(String paciente) {

        try {

            FileReader reader = new FileReader(paciente);
            BufferedReader br = new BufferedReader(reader);

            String linea = br.readLine();
            List<String> acumulado = new ArrayList<String>();
            while (linea != null) {
                acumulado.add(linea);
                linea = br.readLine();
            }
            reader.close();
            br.close();

            File f = new File(paciente);
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wf = new PrintWriter(bw);

            for (String l : acumulado) {
                wf.write(l);
                wf.println();
            }

            String sexo;
            if (MasculinoPaciente.isSelected()) {
                sexo = "masculino";
            } else {
                sexo = "femenino";
            }
            wf.write(nombrePaciente.getText() + ",");
            wf.write(cedulaPaciente.getText() + ",");
            wf.write(codigoPaciente.getText() + ",");
            wf.write(fechaPaciente.getText() + ",");
            wf.write(sexo + ",");
            wf.write(SeleccionarProvincia.getSelectedItem().toString() + ",");
            wf.write(DireccionPaciente.getText() + ",");
            wf.write(TelefonoPaciente.getText() + ",");
            wf.println();

            wf.close();
            bw.close();

            JOptionPane.showMessageDialog(null, "¡¡¡Paciente agregado exitosamente!!");
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error, consulte con el asesor de TI" + e);
        }
        return;

    }

    public VisualPaciente() {
        initComponents();
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog3 = new datechooser.beans.DateChooserDialog();
        tituloPaciente = new javax.swing.JLabel();
        nombreCompleto = new javax.swing.JLabel();
        nombrePaciente = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        cedulaPaciente = new javax.swing.JTextField();
        codigo = new javax.swing.JLabel();
        codigoPaciente = new javax.swing.JTextField();
        lblErrorLetra = new javax.swing.JLabel();
        FechaNacimiento = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        MasculinoPaciente = new javax.swing.JRadioButton();
        FemeninoPaciente = new javax.swing.JRadioButton();
        Provincia = new javax.swing.JLabel();
        SeleccionarProvincia = new javax.swing.JComboBox<>();
        Direccion = new javax.swing.JLabel();
        DireccionPaciente = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        TelefonoPaciente = new javax.swing.JTextField();
        Agregarboton = new javax.swing.JButton();
        jbhistorialMedico = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaPaciente = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloPaciente.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloPaciente.setText("Registro Paciente");

        nombreCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreCompleto.setText("Nombre completo:");

        nombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePacienteActionPerformed(evt);
            }
        });
        nombrePaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePacienteKeyTyped(evt);
                LimiteCaracteresNombrePaciente(evt);
            }
        });

        cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedula.setText("Cédula: ");

        cedulaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaPacienteActionPerformed(evt);
            }
        });
        cedulaPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validarCedula(evt);
            }
        });

        codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigo.setText("Código:");

        codigoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPacienteActionPerformed(evt);
            }
        });

        FechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FechaNacimiento.setText("Fecha de Nacimiento:");

        sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexo.setText("Sexo:");

        buttonGroup2.add(MasculinoPaciente);
        MasculinoPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MasculinoPaciente.setText("Masculino");

        buttonGroup2.add(FemeninoPaciente);
        FemeninoPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FemeninoPaciente.setText("Femenino");

        Provincia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Provincia.setText("Provincia: ");

        SeleccionarProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "San José", "Alajuela", "Cartago", "Heredia ", "Guanacaste", "Puntarenas", "Limón" }));
        SeleccionarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarProvinciaActionPerformed(evt);
            }
        });

        Direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Direccion.setText("Dirección: ");

        Telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Telefono.setText("Teléfono: ");

        TelefonoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoPacienteActionPerformed(evt);
            }
        });
        TelefonoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoPacienteKeyTyped(evt);
            }
        });

        Agregarboton.setBackground(new java.awt.Color(0, 153, 51));
        Agregarboton.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        Agregarboton.setText("Agregar");
        Agregarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarbotonActionPerformed(evt);
            }
        });

        jbhistorialMedico.setBackground(new java.awt.Color(102, 153, 255));
        jbhistorialMedico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbhistorialMedico.setText("Historial Médico");
        jbhistorialMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarHistorialMedico(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cough (2).png"))); // NOI18N

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(FechaNacimiento)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Provincia)
                                .addGap(14, 14, 14)
                                .addComponent(SeleccionarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(Direccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DireccionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(Telefono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agregarboton)
                            .addComponent(TelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(fechaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(sexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MasculinoPaciente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FemeninoPaciente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nombreCompleto)
                                            .addComponent(lblErrorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cedula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(codigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codigoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jbhistorialMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(tituloPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tituloPaciente)))
                        .addGap(49, 49, 49)
                        .addComponent(lblErrorLetra)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreCompleto)
                                    .addComponent(nombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cedula)
                                    .addComponent(cedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigo)
                                    .addComponent(codigoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sexo)
                                        .addComponent(MasculinoPaciente)
                                        .addComponent(FemeninoPaciente))
                                    .addComponent(FechaNacimiento)))
                            .addComponent(fechaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DireccionPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Provincia)
                                .addComponent(SeleccionarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Telefono)
                                .addComponent(Direccion)))
                        .addGap(25, 25, 25)
                        .addComponent(Agregarboton)
                        .addGap(2, 2, 2)
                        .addComponent(jbhistorialMedico))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaPacienteActionPerformed
     
    }//GEN-LAST:event_cedulaPacienteActionPerformed

    private void nombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePacienteActionPerformed

    }//GEN-LAST:event_nombrePacienteActionPerformed

    private void validarCedula(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validarCedula
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_validarCedula

    private void nombrePacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePacienteKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACKSPACE)) {
            evt.consume();

            lblErrorLetra.setText("Escribe solo letras");

        } else {
            lblErrorLetra.setText("");

        }
    }//GEN-LAST:event_nombrePacienteKeyTyped

    private void SeleccionarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarProvinciaActionPerformed
     
    }//GEN-LAST:event_SeleccionarProvinciaActionPerformed

    private void TelefonoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoPacienteActionPerformed
       
    }//GEN-LAST:event_TelefonoPacienteActionPerformed

    private void TelefonoPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoPacienteKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoPacienteKeyTyped

    private void LimiteCaracteresNombrePaciente(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimiteCaracteresNombrePaciente
      
    }//GEN-LAST:event_LimiteCaracteresNombrePaciente

    private void AgregarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarbotonActionPerformed
        IngresarDatosPaciente("archivo_paciente.txt");
    }//GEN-LAST:event_AgregarbotonActionPerformed

    public void limpiarCampos() {
        nombrePaciente.setText("");
        cedulaPaciente.setText("");
        codigoPaciente.setText("");
        DireccionPaciente.setText("");
        buttonGroup2.clearSelection();
        TelefonoPaciente.setText("");
        SeleccionarProvincia.setSelectedIndex(0);
    }

    private void iniciarHistorialMedico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarHistorialMedico
        HistorialMedicoPaciente hmp = new HistorialMedicoPaciente();
        hmp.setVisible(true);
    }//GEN-LAST:event_iniciarHistorialMedico

    private void codigoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPacienteActionPerformed
       
    }//GEN-LAST:event_codigoPacienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
          dispose();
 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregarboton;
    private javax.swing.JLabel Direccion;
    private javax.swing.JTextField DireccionPaciente;
    private javax.swing.JLabel FechaNacimiento;
    private javax.swing.JRadioButton FemeninoPaciente;
    private javax.swing.JRadioButton MasculinoPaciente;
    private javax.swing.JLabel Provincia;
    private javax.swing.JComboBox<String> SeleccionarProvincia;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField TelefonoPaciente;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cedula;
    private javax.swing.JTextField cedulaPaciente;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoPaciente;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private datechooser.beans.DateChooserDialog dateChooserDialog3;
    private datechooser.beans.DateChooserCombo fechaPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbhistorialMedico;
    private javax.swing.JLabel lblErrorLetra;
    private javax.swing.JLabel nombreCompleto;
    private javax.swing.JTextField nombrePaciente;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tituloPaciente;
    // End of variables declaration//GEN-END:variables
}
