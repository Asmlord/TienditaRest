/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.tiendita.Service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.entity.Producto;

/**
 *
 * @author ivanr
 */
public interface ProductoService {
        public List<Producto> findAll();
    public List<Producto> findAllCustom();
    public Optional<Producto> findById(long id);
    public Producto add(Producto c);
    public Producto update(Producto c);
    public Producto delete(Producto c);
}
