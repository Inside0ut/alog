package com.example.demo1.Dao;

import com.example.demo1.buisness.Produit;

import java.util.List;



public class TestDao {

    public static void main(String[] args) {
        ProduitDaoImpl pdao= new ProduitDaoImpl();
        Produit prod= pdao.getProduit(2L);
        System.out.println(prod);
        prod.setNomProduit("toto");
        pdao.updateProduit(prod);
        System.out.println("after update " +prod);


    }

}