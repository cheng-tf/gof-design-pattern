package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Director</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 12:31</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Director {

    // 构建器对象
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指导构建器构建最终的产品对象
     */
    public void construct() {
        builder.buildPart();
    }


}
