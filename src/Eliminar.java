
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Eliminar extends javax.swing.JFrame {

    public Eliminar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valorEliminarTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Eliminar por cédula");

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorEliminarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valorEliminarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            FileReader reader = new FileReader("archivo_paciente.txt");
            BufferedReader br = new BufferedReader(reader);

            String linea = br.readLine();
            List<String> acumulado = new ArrayList<String>();
            while (linea != null) {
                acumulado.add(linea);
                linea = br.readLine();
            }
            reader.close();
            br.close();

            File f = new File("archivo_paciente.txt");
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wf = new PrintWriter(bw);
            String[] splitLinea;
            for (String l : acumulado) {
                splitLinea = l.split(",");
                if (splitLinea[1] != null && !splitLinea[1].equals(valorEliminarTxt.getText())) {
                    wf.write(l);
                    wf.println();
                }

            }

            wf.close();
            bw.close();
            JOptionPane.showMessageDialog(null, "¡¡¡Paciente Eliminado exitosamente!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error, consulte con el asesor de TI" + e);
        }

        try {

            FileReader reader = new FileReader("Medicos.txt");
            BufferedReader br = new BufferedReader(reader);

            String linea = br.readLine();
            List<String> acumulado = new ArrayList<String>();
            while (linea != null) {
                acumulado.add(linea);
                linea = br.readLine();
            }
            reader.close();
            br.close();

            File f = new File("Medicos.txt");
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wf = new PrintWriter(bw);
            String[] splitLinea;
            for (String l : acumulado) {
                splitLinea = l.split(",");
                if (splitLinea[1] != null && !splitLinea[1].equals(valorEliminarTxt.getText())) {
                    wf.write(l);
                    wf.println();
                }

            }

            wf.close();
            bw.close();
            JOptionPane.showMessageDialog(null, "¡¡¡Médico Eliminado exitosamente!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error, consulte con el asesor de TI" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField valorEliminarTxt;
    // End of variables declaration//GEN-END:variables
}
