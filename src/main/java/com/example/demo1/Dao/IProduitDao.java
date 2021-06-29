package com.example.demo1.Dao;


import com.example.demo1.buisness.Produit;

import java.util.List;



public interface IProduitDao {
    public Produit save(Produit p);
    public List<Produit> produitsParMC(String mc);
    public Produit getProduit(Long id);
    public Produit updateProduit(Produit p);
    public void deleteProduit(Long id);
}