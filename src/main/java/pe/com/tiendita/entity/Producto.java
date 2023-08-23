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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Entity(name="Producto")
@Table(name="t_producto")
public class Producto implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nompro")
    private String nombre;
    @Column(name="preproc")
    private double preciocompra;
    @Column(name="preprov")
    private double precioventa;
    @Column(name="canpro")
    private double cantidad;
    @Column(name="estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="codcat", nullable = false)
    private Categoria categoria;
}
