 
package metodos;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import medicos.medicos;
import visitas.visitas;
 

public class metodos {
    
    
    
  Vector inicial_med = new Vector();
  Vector inicial_vis = new Vector();

public void guardar_med (medicos Nmedico){
   inicial_med.addElement(Nmedico);
}

public void guardar_vis (visitas Nvisitas){
inicial_vis.addElement(Nvisitas);
}


 public void guardar_medico(medicos Nmedico) {

        try {
            FileWriter fw = new FileWriter( "Medicos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("\n"+Nmedico.getCodigo() );
            pw.print(";"+ Nmedico.getCedula());
            pw.print(";"+Nmedico.getNombre());
            pw.print(";"+Nmedico.getApellidos());
            pw.print(";"+Nmedico.getEspecialidad());
            pw.print(";"+Nmedico.getDireccion());
            pw.print(";"+Nmedico.getSalario());
            pw.print(";"+Nmedico.getTelefono());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
 
  public void guardar_visita(visitas Nvisita) {

        try {
            FileWriter fw = new FileWriter("Visitas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("\n" +Nvisita.getNºvisita ());
            pw.print(";" + Nvisita.getFechavisita());
            pw.print(";" + Nvisita.getCódigopaciente());
            pw.print(";" + Nvisita.getCódigomédico());
            pw.print(";" + Nvisita.getMotivovisita());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
 
  public DefaultTableModel lista_visitas() {
        Vector titulos = new Vector();
        titulos.addElement("Nºvisita");
        titulos.addElement("Fechavisita");
        titulos.addElement("Códigopaciente");
        titulos.addElement("Códigomédico");
        titulos.addElement("Motivovisita");
        
        DefaultTableModel tabla_visita = new DefaultTableModel(titulos, 0);

        try {
            FileReader fw = new FileReader("visitas.txt");
            BufferedReader bw = new BufferedReader(fw);
            String fila;
            while ((fila = bw.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(fila, ";");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                tabla_visita.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return tabla_visita;
    }
 
 
  public DefaultTableModel lista_medicos() {

        Vector titulos = new Vector();
        titulos.addElement("Código");
        titulos.addElement("Cédula");
        titulos.addElement("Nombre");
        titulos.addElement("Apellidos");
        titulos.addElement("Especialidad");
        titulos.addElement("Dirección");
        titulos.addElement("Salario");
        titulos.addElement("Tefilalefono");
        DefaultTableModel tabla_medico = new DefaultTableModel(titulos, 0);

        try {
            FileReader fw = new FileReader("Medicos.txt");
            BufferedReader bw = new BufferedReader(fw);
            String fila;
            while ((fila = bw.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(fila, ";");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                tabla_medico.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return tabla_medico;
    }
    
  public void obo_especialidad(JComboBox espe) {
        espe.removeAllItems();
        espe.addItem("Forense");
        espe.addItem("Cirujano");
        espe.addItem("Ginecólogo");
        espe.addItem("Estético");
        espe.addItem("Cardiólogo");
    }
}
