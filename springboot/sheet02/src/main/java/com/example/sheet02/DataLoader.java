package com.example.sheet02;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear y guardar un nuevo producto
        Product product = new Product(null, "Producto Ejemplo", 100.0, 10);
        productRepository.save(product);

        // Recuperar el producto por su ID
        Product retrievedProduct = productRepository.findById(product.getId()).orElse(null);
        System.out.println("Producto recuperado: " + retrievedProduct);
    }
}
