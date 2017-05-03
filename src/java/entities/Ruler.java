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
@NamedQuery(name = "Ruler.findAll", query = "SELECT b FROM Ruler b")})


public class Ruler {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idruler")
    private Integer idruler;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "efecto")
    private String efecto;

    public Ruler(){
    }

    public Integer getIdruler() {
        return idruler;
    }

    public void setIdruler(Integer idruler) {
        this.idruler = idruler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
    
    
    
}
