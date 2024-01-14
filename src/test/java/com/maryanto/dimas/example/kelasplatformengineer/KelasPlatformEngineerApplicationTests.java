package com.maryanto.dimas.example.kelasplatformengineer;

import com.maryanto.dimas.example.kelasplatformengineer.service.ProductService;
import com.maryanto.dimas.example.kelasplatformengineer.model.Products;
import com.maryanto.dimas.example.kelasplatformengineer.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Collections;
import java.util.List; 
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class KelasPlatformEngineerApplicationTests {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void getAllProducts() {

        // Act
        Iterable<Products> result = productService.getAll();

        // Assert
        assertEquals(0, ((List<Products>) result).size());
    }
}
