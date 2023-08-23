/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.tiendita.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tiendita.entity.Categoria;

/**
 *
 * @author ivanr
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    @Query(value = "SELECT c FROM Categoria c WHERE c.estado = '1'", nativeQuery = true)
    List<Categoria> findAllCustom();
}
