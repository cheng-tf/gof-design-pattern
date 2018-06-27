package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Newspaper</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 12:01</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Newspaper extends Subject {

    // 报纸内容
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // 通知所有读者
        this.notifyObservers();
    }
}
