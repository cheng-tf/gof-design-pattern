package cn.edu.bupt.opensource.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: ModelDisk</p>
 * <p>Description: Disk模块 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 23:54</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ModelDisk {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelDisk.class);

    public void start() {
        LOGGER.info("Disk is start...");
    }

    public void shutDown() {
        LOGGER.info("Disk is shutDown...");
    }

}
