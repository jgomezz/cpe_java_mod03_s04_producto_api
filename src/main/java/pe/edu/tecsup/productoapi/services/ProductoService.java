package pe.edu.tecsup.productoapi.services;

import pe.edu.tecsup.productoapi.entities.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
    void save(Producto producto);
    void deleteById(Long id);
}
