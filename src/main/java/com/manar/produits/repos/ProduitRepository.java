package com.manar.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manar.produits.entities.Produit;

public interface ProduitRepository  extends JpaRepository<Produit, Long> {

}
