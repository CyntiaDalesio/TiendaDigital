package ProductShop.Entity;


import ProductShop.Enums.Category;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity

public class Product implements Serializable {
   @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name= "uuid",strategy = "uuid2")
    private String idProduct;

    private Integer codeProduct;
    private String name;
    private Double price;
    private String tradeMark;
    @Enumerated(EnumType.STRING)
    private Category category;
    
    private Integer stock;
    
    private Boolean availableStock;
    
    @OneToOne
    private Photo photo;
    
   
    
    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", CodeProduct=" + codeProduct + ", Name=" + name + ", Price=" + price + ", TradeMark=" + tradeMark +  ", Stock=" + stock + ", availableStock=" + availableStock + '}';
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(Integer codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(Boolean availableStock) {
        this.availableStock = availableStock;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Product(String idProduct, Integer codeProduct, String name, Double price, String tradeMark, Category category, Integer stock, Photo photo) {
     
        this.codeProduct = codeProduct;
        this.name = name;
        this.price = price;
        this.tradeMark = tradeMark;
        this.category = category;
        this.stock = stock;
        this.photo = photo;
    }

}