package pl.sda.arppl4.hibernate.dao;

import pl.sda.arppl4.hibernate.model.Product;

import java.util.List;
import java.util.Optional;

public class ProduktDao implements IProduktDao{

    @Override
    public void dodajProduct(Product product) {
        
    }

    @Override
    public void usunProduct(Product product) {

    }

    @Override
    public Optional<Product> zwrocProduct(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> zwrocListeProduct() {
        return null;
    }

    @Override
    public void updateStudent(Product Product) {

    }
}
