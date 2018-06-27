package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 12:03</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 报纸/目标对象
        Newspaper subject = new Newspaper();
        // 读者/观察者对象
        Reader reader1 = new Reader();
        reader1.setName("张三");
        Reader reader2 = new Reader();
        reader2.setName("李四");
        Reader reader3 = new Reader();
        reader3.setName("王五");
        // 注册观察者
        subject.addObserver(reader1);
        subject.addObserver(reader2);
        subject.addObserver(reader3);
        // 新报纸
        subject.setContent("本期内容为观察者模式。");
    }

}
