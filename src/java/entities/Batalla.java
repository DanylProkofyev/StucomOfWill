/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author X6095888Z
 */
@Entity
@Table(name = "batalla")
@XmlRootElement
@NamedQueries({
@NamedQuery(name = "Batalla.findAll", query = "SELECT b FROM Batalla b"),
@NamedQuery(name = "Batalla.findByIdbattle", query = "SELECT b FROM Batalla b WHERE b.idbatalla = :idbatalla")})

public class Batalla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbatalla")
    private Integer idbatalla;
    @JoinColumn(name = "jugador1", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Usuario jugador1;
    @JoinColumn(name = "jugador2", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Usuario jugador2;
    @JoinColumn(name = "ganador", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Usuario ganador;

    public Batalla() {
    }

    public Integer getIdbatalla() {
        return idbatalla;
    }

    public void setIdbatalla(Integer idbatalla) {
        this.idbatalla = idbatalla;
    }

    public Usuario getJugador1() {
        return jugador1;
    }

    public void setJugador1(Usuario jugador1) {
        this.jugador1 = jugador1;
    }

    public Usuario getJugador2() {
        return jugador2;
    }

    public void setJugador2(Usuario jugador2) {
        this.jugador2 = jugador2;
    }

    public Usuario getGanador() {
        return ganador;
    }

    public void setGanador(Usuario ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
}
