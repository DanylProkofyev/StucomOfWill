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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author X6095888Z
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})

public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    //@JoinColumn(name = "pass", referencedColumnName = "nombre")
    //TODO @OneToMany(optional = false)
    

}
