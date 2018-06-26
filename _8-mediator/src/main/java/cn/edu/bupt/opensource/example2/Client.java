package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:46</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 中介者-主板类
        MediatorBoard board = new MediatorBoard();
        // #2 同事类
        HardCDDriver cdDriver = new HardCDDriver(board);
        HardCPU cpu = new HardCPU(board);
        HardVideoCard videoCard = new HardVideoCard(board);
        HardSoundCard soundCard = new HardSoundCard(board);
        // #3 通知中介者
        board.setCdDriver(cdDriver);
        board.setCpu(cpu);
        board.setVideoCard(videoCard);
        board.setSoundCard(soundCard);
        // #4 看电影
        cdDriver.readCD();
    }


}
