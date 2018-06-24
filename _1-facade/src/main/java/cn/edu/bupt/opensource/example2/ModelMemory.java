package cn.edu.bupt.opensource.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: ModelMemory</p>
 * <p>Description: Memory模块 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 23:56</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ModelMemory {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelMemory.class);

    public void start() {
        LOGGER.info("Memory is start...");
    }

    public void shutDown() {
        LOGGER.info("Memory is shutDown...");
    }

}
