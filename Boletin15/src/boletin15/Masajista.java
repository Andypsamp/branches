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
public class Masajista extends Futbol {
    private String titulacion;
    private int añosDeExperiencia;

    /**
     *Constructor por defecto
     */
    public Masajista(){
        super();
    }

    /**
     *Constructor con parametros
     * @param id
     * @param nome
     * @param apellido
     * @param edad
     * @param titulacion
     * @param añosDeExperiencia
     */
    public Masajista(int id,String nome,String apellido,int edad,String titulacion,int añosDeExperiencia){
        this.titulacion=titulacion;
        this.añosDeExperiencia=añosDeExperiencia;
    }

    /**
     *Metodo concentrarse
     */
    @Override
    public void concentrarse() {
        super.concentrarse(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Metodo viajar
     */
    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("viajan masajistas");
    }

    /**
     *Metodo darMasajes
     */
    public void darMasajes(){
    }

    /**
     * @return the titulacion
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * @param titulacion the titulacion to set
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * @return the añosDeExperiencia
     */
    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    /**
     * @param añosDeExperiencia the añosDeExperiencia to set
     */
    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }
}
