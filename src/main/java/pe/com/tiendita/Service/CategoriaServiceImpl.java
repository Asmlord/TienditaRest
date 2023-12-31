/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.tiendita.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tiendita.entity.Categoria;
import pe.com.tiendita.repository.CategoriaRepository;

/**
 *
 * @author ivanr
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;
    
    @Override
    public List<Categoria> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Categoria add(Categoria c) {
        return repositorio.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        Categoria objcategoria = repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcategoria);
        return repositorio.save(objcategoria);
    }

    @Override
    public Categoria delete(Categoria c) {
        Categoria objcategoria = repositorio.getById(c.getCodigo());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }
    
}
