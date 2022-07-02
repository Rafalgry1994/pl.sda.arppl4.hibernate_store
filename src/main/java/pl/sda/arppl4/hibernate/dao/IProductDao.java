package pl.sda.arppl4.hibernate.dao;

import pl.sda.arppl4.hibernate.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProduktDao {


    public void dodajProduct(Product product);


    public void usunProduct(Product product);


    public Optional<Product> zwrocProduct(Long id);


    public List<Product> zwrocListeProduct();


    public void updateStudent(Product Product);


}

