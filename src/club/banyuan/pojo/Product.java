package club.banyuan.pojo;

public class Product extends pojo.Product {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private Integer categoryLevel1Id;
    private Integer categoryLevel2Id;
    private Integer categoryLevel3Id;
    private String fileName;
    private  Integer isDelete;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public Double getPrice() {
        return price;
    }
    @Override
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public Integer getStock() {
        return stock;
    }
    @Override
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    @Override
    public Integer getCategoryLevel1Id() {
        return categoryLevel1Id;
    }
    @Override
    public void setCategoryLevel1Id(Integer categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }
    @Override
    public Integer getCategoryLevel2Id() {
        return categoryLevel2Id;
    }
    @Override
    public void setCategoryLevel2Id(Integer categoryLevel2Id) {
        this.categoryLevel2Id = categoryLevel2Id;
    }
    @Override
    public Integer getCategoryLevel3Id() {
        return categoryLevel3Id;
    }
    @Override
    public void setCategoryLevel3Id(Integer categoryLevel3Id) {
        this.categoryLevel3Id = categoryLevel3Id;
    }
    @Override
    public String getFileName() {
        return fileName;
    }
    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public Integer getIsDelete() {
        return isDelete;
    }
    @Override
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", categoryLevel1Id='" + categoryLevel1Id + '\'' +
                ", categoryLevel2Id='" + categoryLevel2Id + '\'' +
                ", categoryLevel3Id='" + categoryLevel3Id + '\'' +
                ", fileName='" + fileName + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
