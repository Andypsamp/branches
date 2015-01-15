/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author apenasampedro
 */
public class Jugador extends Futbol {
    private int dorsal;
    private String demarcacion;

    /**
     *Constructor por defecto
     */
    public Jugador(){
        super();
    }

    /**
     *Constructor con parametros
     * @param id
     * @param nome
     * @param apellido
     * @param edad
     * @param dorsal
     * @param demarcacion
     */
    public Jugador(int id,String nome,String apellido,int edad,int dorsal,String demarcacion){
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * @return the demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    /**
     *Metodo concentrarse
     */
    @Override
    public void concentrarse() {
        super.concentrarse(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Metodo viajar q se va a sobrescribir
     */
    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("viajan jugadores");
    }
   
    /**
     *Metodo jugarPartido
     */
    public void jugarPartido(){
}

    /**
     *Metodo  entrenar
     */
    public void entrenar(){
    }
}
