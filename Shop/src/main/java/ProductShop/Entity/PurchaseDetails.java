package ProductShop.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class PurchaseDetails implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idDetails;
    private Double priceUnit;
    private Double subtotal;
    private Integer quantity;
    @OneToOne
    private Product product;
//    @OneToOne
//    private Purchase purchase;
    
    

    public PurchaseDetails() {
    }

    public PurchaseDetails(Double priceUnit, Double subtotal, Integer quantity, Product product) {
        this.priceUnit = priceUnit;
        this.subtotal = subtotal;
        this.quantity = quantity;
        this.product = product;
//        this.purchase = purchase;
        
    }

    

    public String getIdDetails() {
        return idDetails;
    }

    public void setIdDetails(String idDetails) {
        this.idDetails = idDetails;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

//    public Purchase getPurchase() {
//        return purchase;
//    }
//
//    public void setPurchase(Purchase purchase) {
//        this.purchase = purchase;
//    }

    
}
