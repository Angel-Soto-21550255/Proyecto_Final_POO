
package ko;

import java.util.Date;

/**
 *
 * @author angel
 */
public class Empleado extends Persona {
  //Atributos
    private int NumeroCarnet;
    
    //Costructor sin argumentos
    public Empleado(){
    super(); // lamar constructor de la clase oadre
    this.NumeroCarnet = 0;
    
    }
    //Costructor con argumentos
     public Empleado(int ID, int TipoID, String Nombre, String Apellido, Date Nacimiento, char Genero, String TipoSangre, double Peso, double Estatura,int Numerocarnet){
    super( ID, TipoID,  Nombre, Apellido, Nacimiento, Genero, TipoSangre, Peso, Estatura); // lamar constructor de la clase oadre
    this.NumeroCarnet = NumeroCarnet;
     }
      
    //Costructor completos
     public Empleado(Empleado emp){
    super(emp); // lamar constructor de la clase oadre
    this.NumeroCarnet = emp.NumeroCarnet;
     }

    public Empleado(int ID, int TIPODOCUMENTO, int CARNET, String NOMBRE, String APELLIDOS, Date FECHANACIMIENTO, String TIPOSANGRE, char GENERO, double PESO, double ESTATURA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumeroCarnet() {
        return NumeroCarnet;
    }

    public void setNumeroCarnet(int NumeroCarnet) {
        this.NumeroCarnet = NumeroCarnet;
    }
     
     
}
