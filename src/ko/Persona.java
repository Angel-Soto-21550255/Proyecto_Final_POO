/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ko;

import java.util.Date;

/**
 *
 * @author angel
 */
public class Persona {
   
   
    
    private int ID;
    private int TipoID;
    private String Nombre;
    private String Apellido;
    private Date Nacimiento;
    private char Genero;
    private String TipoSangre;
    private double Peso;
    private double Estatura;
    
   // constantes 
    
    static final int SIN_RGISTRO = 0;
    static final int REGISTRO_CIVIL = 1;
    static final int TARGETA_IDENTIDAD = 2;
    static final int CEDULA_CIUDADANA = 3;
    static final int PASAPORTE = 4;
    static final int CEDULA_EXTRANJERA = 5;
           
    
    // CONSTRUCTOR sin ARGUMENTO
    
       public Persona() {
        this.ID = 0;
        this.TipoID = SIN_RGISTRO;
        this.Nombre = "";
        this.Apellido = "";
        this.Nacimiento = null;
        this.Genero = ' ';
        this.TipoSangre = "";
        this.Peso = 0.0;
        this.Estatura = 0.0;
    }
    
    
    
    // CONSTRUCTOR CON ARGUMENTO

    public Persona(int ID, int TipoID, String Nombre, String Apellido, Date Nacimiento, char Genero, String TipoSangre, double Peso, double Estatura) {
        this.ID = ID;
        this.TipoID = TipoID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacimiento = Nacimiento;
        this.Genero = Genero;
        this.TipoSangre = TipoSangre;
        this.Peso = Peso;
        this.Estatura = Estatura;
    }
    
    // CONSTRUCTOR COPIA
        public Persona(Persona per) {
        this.ID = per.ID;
        this.TipoID = per.TipoID;
        this.Nombre = per.Nombre;
        this.Apellido = per.Apellido;
        this.Nacimiento = per.Nacimiento;
        this.Genero = per.Genero;
        this.TipoSangre = per.TipoSangre;
        this.Peso = per.Peso;
        this.Estatura = per.Estatura;
    }
       
    //Metodos get y set

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTipoID() {
        return TipoID;
    }

    public void setTipoID(int TipoID) {
        this.TipoID = TipoID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }
    
    
}
