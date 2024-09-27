package by.teachmeskills.eshop.controllers;

import by.teachmeskills.eshop.entities.Cart;
import by.teachmeskills.eshop.services.CartService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static by.teachmeskills.eshop.EshopConstants.PRODUCT_ID_PARAM;
import static by.teachmeskills.eshop.EshopConstants.SHOPPING_CART;
import static by.teachmeskills.eshop.PagesPathEnum.CART_PAGE;

@RestController
@SessionAttributes({SHOPPING_CART})
@RequestMapping("/cart")
public class CartController {
    private static final String SHOPPING_CART = "cart";
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public ModelAndView addProductToCart(@RequestParam(PRODUCT_ID_PARAM) String id, @ModelAttribute(SHOPPING_CART) Cart shopCart) throws Exception {
        int productId = Integer.parseInt(id);
        return cartService.addProductToCart(productId, shopCart);
    }

    @GetMapping("/open")
    public ModelAndView redirectToShoppingCart() {
        return new ModelAndView(CART_PAGE.getPath());
    }

    @GetMapping("/remove")
    public ModelAndView removeProductFromShoppingCart(@RequestParam(PRODUCT_ID_PARAM) String id, @ModelAttribute(SHOPPING_CART) Cart shopCart) throws Exception {
        int productId = Integer.parseInt(id);
        return cartService.removeProductFromShoppingCart(productId, shopCart);
    }

    @GetMapping("/checkout")
    public ModelAndView checkoutProduct() {
        return new ModelAndView(CART_PAGE.getPath());
    }

    @ModelAttribute(SHOPPING_CART)
    public Cart shoppingCart() {
        return new Cart();
    }
}
