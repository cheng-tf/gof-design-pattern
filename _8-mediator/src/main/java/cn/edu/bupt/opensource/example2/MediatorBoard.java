package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: MediatorBoard</p>
 * <p>Description: 主板类 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:37</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MediatorBoard implements Mediator {

    // 光驱类
    private HardCDDriver cdDriver;

    // CPU类
    private  HardCPU cpu;

    // 显卡类
    private HardVideoCard videoCard;

    // 声卡类
    private HardSoundCard soundCard;

    public void setCdDriver(HardCDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(HardCPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(HardVideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(HardSoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if(colleague == cdDriver){
            this.openCDDriverReadData((HardCDDriver) colleague);
        } else if(colleague == cpu) {
            this.openCPU((HardCPU) colleague);
        }
    }

    /**
     * 处理光驱读取数据后与其他对象的交互
     */
    private void openCDDriverReadData(HardCDDriver cd) {
        this.cpu.executeData(cd.getData());
    }

    /**
     * 处理CPU处理数据后与其他对象的交互
     */
    private void openCPU(HardCPU cpu) {
        this.videoCard.showData(cpu.getVideoData());
        this.soundCard.showData(cpu.getSoundData());
    }

}
