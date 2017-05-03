/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author X2382383C
 */

@Entity
@Table(name = "batalla")
@XmlRootElement
@NamedQueries({
@NamedQuery(name = "Carta.findAll", query = "SELECT b FROM Carta b")})

public class Cartas {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcarta")
    private Integer idcarta;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "coste")
    private Integer coste;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "efecto")
    private String efecto;
    @Column(name = "ataque")
    private Integer ataque;
    @Column(name = "defensa")
    private Integer defensa;

    public Cartas() {
    }
    public Integer getIdcarta() {
        return idcarta;
    }
    public void setIdcarta(Integer idcarta) {
        this.idcarta = idcarta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCoste() {
        return coste;
    }
    public void setCoste(Integer coste) {
        this.coste = coste;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEfecto() {
        return efecto;
    }
    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
    public Integer getAtaque() {
        return ataque;
    }
    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }
    public Integer getDefensa() {
        return defensa;
    }
    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }
}
