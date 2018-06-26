package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ExportModelData</p>
 * <p>Description: 输出数据 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 12:45</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportModelData {

    // 产品编号
    private String productId;

    // 售价
    private double price;

    // 销售数量
    private double amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
