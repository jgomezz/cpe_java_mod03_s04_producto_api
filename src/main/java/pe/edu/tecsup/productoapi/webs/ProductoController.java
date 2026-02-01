package pe.edu.tecsup.productoapi.webs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.tecsup.productoapi.entities.Producto;
import pe.edu.tecsup.productoapi.services.ProductoService;

import java.util.List;

@Slf4j
@RestController
public class ProductoController {

    @Value("${app.storage.path}")
    private String STORAGEPATH;

    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    /**
     * READ --> GET
     * @return  Lista de productos
     */
    @GetMapping("/productos")
    public List<Producto> productos() {
        List<Producto> productos = productoService.findAll();
        return productos;
    }

}
