package com.example.sheet02;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Método para guardar un producto
    public Product save(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // Método para encontrar un producto por su ID
    public Optional<Product> findById(Long id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    // Método para obtener todos los productos
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }
}
