package pe.edu.tecsup.productoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.tecsup.productoapi.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
