package br.unisep.edu.pdb3.productservice.repository;

import br.unisep.edu.pdb3.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository
        extends MongoRepository<Product, String> {

}
