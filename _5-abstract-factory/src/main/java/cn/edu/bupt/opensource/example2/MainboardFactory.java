package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: MainboardFactory</p>
 * <p>Description: 主板的简单工厂 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:16</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MainboardFactory {

    /**
     * 创建主板接口对象
     */
    public static Mainboard createMainboard(int mainboardType) {
        Mainboard mainboard = null;
        if(mainboardType == 1) {
            mainboard = new MainboardGA(1156);
        } else if(mainboardType == 2) {
            mainboard = new MainboardMSI(939);
        }
        return mainboard;
    }

}
