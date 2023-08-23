/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.tiendita.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ivanr
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Categoria")
@Table(name="t_categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codcat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nomcat")
    private String nombre;
    @Column(name="estcat")
    private boolean estado;  
}
