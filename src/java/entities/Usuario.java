/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author X6095888Z
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    ,@NamedQuery(name = "Usuario.findByPuntos", query = "SELECT u FROM Usuario u WHERE u.puntos = :puntos")
    ,@NamedQuery(name = "Trainer.findAllOrder", query = "SELECT u FROM Usuario u order by u.puntos desc")})

public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contra")
    private String contra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntos")
    private int puntos;
    @OneToMany(mappedBy = "usuario")
    private Collection<Cartas> coleccionCartas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jugador1")
    private Collection<Batalla> battleCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jugador2")
    private Collection<Batalla> battleCollection1;
    @OneToMany(mappedBy = "ganador")
    private Collection<Batalla> battleCollection2;
    @JoinColumn(name = "ruler", referencedColumnName = "idruler")
    @ManyToOne
    private int ruler;

    public Usuario() {
    }

    public Usuario(String nombre, String contra, int puntos, Collection<Cartas> coleccionCartas, Collection<Batalla> battleCollection, Collection<Batalla> battleCollection1, Collection<Batalla> battleCollection2, int ruler) {
        this.nombre = nombre;
        this.contra = contra;
        this.puntos = puntos;
        this.coleccionCartas = coleccionCartas;
        this.battleCollection = battleCollection;
        this.battleCollection1 = battleCollection1;
        this.battleCollection2 = battleCollection2;
        this.ruler = ruler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getRuler() {
        return ruler;
    }

    public void setRuler(int ruler) {
        this.ruler = ruler;
    }

    public Collection<Cartas> getColeccionCartas() {
        return coleccionCartas;
    }

    public void setColeccionCartas(Collection<Cartas> coleccionCartas) {
        this.coleccionCartas = coleccionCartas;
    }

    public Collection<Batalla> getBattleCollection() {
        return battleCollection;
    }

    public void setBattleCollection(Collection<Batalla> battleCollection) {
        this.battleCollection = battleCollection;
    }

    public Collection<Batalla> getBattleCollection1() {
        return battleCollection1;
    }

    public void setBattleCollection1(Collection<Batalla> battleCollection1) {
        this.battleCollection1 = battleCollection1;
    }

    public Collection<Batalla> getBattleCollection2() {
        return battleCollection2;
    }

    public void setBattleCollection2(Collection<Batalla> battleCollection2) {
        this.battleCollection2 = battleCollection2;
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
