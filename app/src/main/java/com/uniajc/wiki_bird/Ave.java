package com.uniajc.wiki_bird;

public class Ave {

    private String nombre;
    private String origen;
    private String familia;
    private String canto;
    private String descrip;

     Ave (String nombre, String origen, String familia, String canto, String descrip) {
        this.nombre = nombre;
        this.origen = origen;
        this.familia = familia;
        this.canto = canto;
        this.descrip = descrip;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * @return the canto
     */
    public String getCanto() {
        return canto;
    }

    /**
     * @param canto the canto to set
     */
    public void setCanto(String canto) {
        this.canto = canto;
    }

    /**
     * @return the descrip
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * @param descrip the descrip to set
     */
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

}
