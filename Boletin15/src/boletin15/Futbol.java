
package boletin15;

/**
 *
 * @author apenasampedro
 */
/** 
 * Es la clase principal
 * 
 * 
 */
public class Futbol {
     private int id;
    private String nome;
    private String apellido;
    private int edad;

    /**
     *Constructor por defecto
     */
    public Futbol(){
    }

    /**
     *Constructor con parametros
     * @param id
     * @param nome
     * @param apellido
     * @param edad
     */
    public Futbol(int id,String nome,String apellido,int edad){
        this.apellido=apellido;
        this.id=id;
        this.edad=edad;
        this.nome=nome;
        
    }

    /**
     *metodo concentrarse q va a imprimir en pantalla
     */
    public void concentrarse(){
        System.out.println("concentrarse a seleccion");
}

    /**
     *metodo viajar q va a imprimir en pantalla
     */
    public void viajar(){
        System.out.println("Viaja seleccion");
    }

    /**
     * @return el id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
