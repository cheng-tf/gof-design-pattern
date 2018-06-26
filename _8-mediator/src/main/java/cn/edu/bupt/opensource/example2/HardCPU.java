package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: HardCPU</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class HardCPU extends Colleague {

    public HardCPU(Mediator mediator) {
        super(mediator);
    }

    // 分解出的视频数据
    private String videoData = "";

    // 分解出的音频数据
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    /**
     * 处理数据
     */
    public void executeData(String data) {
        String[] strArr = data.split(",");
        this.videoData = strArr[0];
        this.soundData = strArr[1];
        this.getMediator().changed(this);
    }






}
