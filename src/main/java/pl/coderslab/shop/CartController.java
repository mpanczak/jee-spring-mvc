package pl.coderslab.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    private Cart cart;
    ProduktDao produktDao = new ProduktDao();

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @RequestMapping("/addtocart/{id}/{quantiy}")
    @ResponseBody
    public String addtocart(@PathVariable long id, @PathVariable int quantiy) {
        Product product = produktDao.getProductById(id);

        for (int i = 0; i < cart.getCartItems().size(); i++) {
            if (cart.getCartItems().get(i).getProduct().getId() == id) {
                cart.getCartItems().get(i).quantity += quantiy;
                return "addtocart";
            }
        }

        cart.addToCart(new CartItem(product, quantiy ));
        return "addtocart";
    }

    @GetMapping("/show")
    public String showCart(Model model){
        List<CartItem> cartItems = cart.getCartItems();

        double totalSum = 0;
        int allProd = 0;

        for (CartItem item : cartItems) {
            double cost = item.product.getPrice() * item.quantity;
            allProd += item.quantity;
            totalSum += cost;
        }

        model.addAttribute("cartItems", cartItems);
        model.addAttribute("prodQuant", cartItems.size());
        model.addAttribute("allProd", allProd);
        model.addAttribute("total", totalSum);
        return "cart";
    }
}
