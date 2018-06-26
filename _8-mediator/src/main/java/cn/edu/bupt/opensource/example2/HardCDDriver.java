package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: HardCDDriver</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:24</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class HardCDDriver extends Colleague {

    public HardCDDriver(Mediator mediator) {
        super(mediator);
    }

    // 光驱读取出的数据
    private String data = "";

    public String getData() {
        return data;
    }

    /**
     * 读取光盘
     */
    public void readCD() {
        // #1 视频数据+音频数据
        this.data = "设计模式,值得好好研究";
        // #2 通知主板，状态已改变
        this.getMediator().changed(this);
    }

}
