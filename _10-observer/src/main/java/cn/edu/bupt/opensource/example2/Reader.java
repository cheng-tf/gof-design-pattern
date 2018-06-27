package cn.edu.bupt.opensource.example2;

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
    public void update(Subject subject) {
        // 拉方式
        System.out.println(name + "收到了报纸，内容是：" + ((Newspaper) subject).getContent());
    }
}
