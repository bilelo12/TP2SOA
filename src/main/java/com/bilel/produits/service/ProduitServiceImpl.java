package com.bilel.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilel.produits.entities.Categorie;
import com.bilel.produits.entities.Produit;
import com.bilel.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	ProduitRepository produitRepository;

@Override
public Produit saveProduit(Produit p) {
	
	return produitRepository.save(p);
}
@Override
public Produit updateProduit(Produit p) {
	// TODO Auto-generated method stub
	return produitRepository.save(p);
}
@Override
public void deleteProduit(Produit p) {
	// TODO Auto-generated method stub
}
@Override
public void deleteProduitById(Long id) {
	// TODO Auto-generated method stub
	
}
@Override
public Produit getProduit(Long id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Produit> getAllProduits() {
	// TODO Auto-generated method stub
	return produitRepository.findAll();
}
@Override
public List<Produit> findByNomProduit(String nom) {
	// TODO Auto-generated method stub
	return produitRepository.findByNomProduitContains(nom);
}
@Override
public List<Produit> findByNomProduitContains(String nom) {
	// TODO Auto-generated method stub
	return produitRepository.findByNomProduitContains(nom);
}
@Override
public List<Produit> findByNomPrix(String nom, Double prix) {
	// TODO Auto-generated method stub
	return produitRepository.findByNomPrix(nom, prix);
}
@Override
public List<Produit> findByCategorie(Categorie categorie) {
	// TODO Auto-generated method stub
	return produitRepository.findByCategorie(categorie);
}
@Override
public List<Produit> findByCategorieIdCat(Long id) {
	// TODO Auto-generated method stub
	return produitRepository.findByCategorieIdCat(id);
}
@Override
public List<Produit> findByOrderByNomProduitAsc() {
	// TODO Auto-generated method stub
	return produitRepository.findByOrderByNomProduitAsc();
}
@Override
public List<Produit> trierProduitsNomsPrix() {
	// TODO Auto-generated method stub
	return produitRepository.trierProduitsNomsPrix();
}
}