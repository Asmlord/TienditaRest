/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.tiendita.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.tiendita.Service.CategoriaService;
import pe.com.tiendita.entity.Categoria;

/**
 *
 * @author ivanr
 */
@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {
    @Autowired
    private CategoriaService servicio;
    
    @GetMapping
    public List<Categoria> findAll(){
        return servicio.findAll();
    }
}
