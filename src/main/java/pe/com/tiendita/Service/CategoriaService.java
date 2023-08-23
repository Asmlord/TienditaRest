/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.tiendita.Service;

import java.util.List;
import java.util.Optional;
import pe.com.tiendita.entity.Categoria;

/**
 *
 * @author ivanr
 */
public interface CategoriaService {
    public List<Categoria> findAll();
    public List<Categoria> findAllCustom();
    public Optional<Categoria> findById(long id);
    public Categoria add(Categoria c);
    public Categoria update(Categoria c);
    public Categoria delete(Categoria c);
}
