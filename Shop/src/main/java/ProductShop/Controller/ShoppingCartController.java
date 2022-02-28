/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductShop.Controller;

import ProductShop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Cyntia
 */
@Controller
@RequestMapping("/carts")

public class ShoppingCartController {
 @Autowired
    private ProductService productService;

    @GetMapping("/ShoppingCart")
    public String index() {

        return "users/ShoppingCart.html";
    }
   @GetMapping("/cart/{idProduct}")
    public String addProduct(@PathVariable String idProduct) {
        return "redirect:/carts/ShoppingCart";
    }


}
