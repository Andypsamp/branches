
package boletin15;

/**
 *
 * @author apenasampedro
 *
 * Clase
 */
public class Entrenador extends Futbol {
    private String idFederacion;
    
    /**
     *Constructor por defecto
     */
    public Entrenador(){
        super();
    }

    /**
     *
     * @param id
     * @param nome
     * @param apellido
     * @param edad
     * @param idFederacion
     */
    public Entrenador(int id,String nome,String apellido,int edad,String idFederacion){
        super(id,nome,apellido,edad);
        this.idFederacion=idFederacion;
    }

    /**
     *Metodo viajar.<br>
     */
    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
       
    }

    /**
     *
     */
    @Override
    public void concentrarse() {
        super.concentrarse(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("viajan entrenadores ");
    }

    /**
     *Metodo dirigirPartido<br>
     */
    public void dirigirPartido(){
    }
    /**
     * Metodo dirigirEntrenamiento<br>
     */
    public void dirigirEntrenamiento(){
        
    }
    /**
     *Atributo idFederacion q devuelve un String.<br>
     * @return the idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * @param idFederacion the idFederacion to set
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
}
