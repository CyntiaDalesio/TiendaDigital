package ProductShop.Controller;

import ProductShop.Service.PurchaseDetailsService;
import ProductShop.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PurchaseDetailsController {
    
    @Autowired
    private PurchaseDetailsService purchaseDetService;
    @Autowired
    private PurchaseService purchaseService;
    
    
    
    
}