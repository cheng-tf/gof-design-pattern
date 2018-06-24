package cn.edu.bupt.opensource.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: Computer</p>
 * <p>Description: 门面类（核心） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 23:58</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Computer {

    public static final Logger LOGGER = LoggerFactory.getLogger(Computer.class);

    private ModelCPU cpu;
    private ModelMemory memory;
    private ModelDisk disk;

    public Computer(){
        cpu = new ModelCPU();
        memory = new ModelMemory();
        disk = new ModelDisk();
    }

    public void start() {
        LOGGER.info("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        LOGGER.info("Computer start end");
    }

    public void shutDown() {
        LOGGER.info("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        LOGGER.info("Computer shutDown end...");
    }

}
