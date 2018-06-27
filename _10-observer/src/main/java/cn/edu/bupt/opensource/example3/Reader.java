package cn.edu.bupt.opensource.example3;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>Title: Reader</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 11:58</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Reader implements Observer {

    // 读者姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object obj) {
        // 推模型
        System.out.println(name + "收到了报纸，目标推送的内容是：" + obj);
        // 拉模型
        System.out.println(name + "收到了报纸，主动到目标对象拉取的内容是：" + ((Newspaper) o).getContent());
    }
}
