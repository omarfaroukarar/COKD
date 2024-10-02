package com.solar.code.repository;

import com.solar.code.model.Categoria; // Keep this import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findBySku(String sku);

    @Query("SELECT c FROM Categoria c WHERE c.sku=?1")
    List<Categoria> findByCategoria(Categoria categoria);
}
