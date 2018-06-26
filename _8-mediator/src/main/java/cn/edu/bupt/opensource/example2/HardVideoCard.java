package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: HardVideoCard</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:33</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class HardVideoCard extends Colleague {

    public HardVideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     */
    public void showData(String data) {
        System.out.println("你正在观看：" + data);
    }


}
