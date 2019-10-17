package application.controller.api;


import application.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/product")
public class ProductApiController {


    @Autowired
    private ProductService productService;


    @GetMapping("")
    public String test() {
        return "Ljava1905e";
    }

}
