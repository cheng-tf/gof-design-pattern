package cn.edu.bupt.opensource.example3;

import java.util.Observable;

/**
 * <p>Title: Newspaper</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 12:01</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Newspaper extends Observable {

    // 报纸内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        // 通知所有读者
        // 推模型
        // this.notifyObservers(this.content);
        // 拉模型(默认)
        this.notifyObservers();
    }

}
