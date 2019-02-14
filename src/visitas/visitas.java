 
package visitas;

 
public class visitas {
      
    private String Nvisita;
    private String Fechavisita;
    private String Códigopaciente;
    private String Códigomédico;
    private String Motivovisita;

    public visitas() {
    }

    public visitas(String Nºvisita, String Fechavisita, String Códigopaciente, String Códigomédico, String Motivovisita) {
        this.Nvisita = Nºvisita;
        this.Fechavisita = Fechavisita;
        this.Códigopaciente = Códigopaciente;
        this.Códigomédico = Códigomédico;
        this.Motivovisita = Motivovisita;
    }

    public String getNºvisita() {
        return Nvisita;
    }

    public void setNºvisita(String Nºvisita) {
        this.Nvisita = Nºvisita;
    }

    public String getFechavisita() {
        return Fechavisita;
    }

    public void setFechavisita(String Fechavisita) {
        this.Fechavisita = Fechavisita;
    }

    public String getCódigopaciente() {
        return Códigopaciente;
    }

    public void setCódigopaciente(String Códigopaciente) {
        this.Códigopaciente = Códigopaciente;
    }

    public String getCódigomédico() {
        return Códigomédico;
    }

    public void setCódigomédico(String Códigomédico) {
        this.Códigomédico = Códigomédico;
    }

    public String getMotivovisita() {
        return Motivovisita;
    }

    public void setMotivovisita(String Motivovisita) {
        this.Motivovisita = Motivovisita;
    }
    
    
    
    
}
