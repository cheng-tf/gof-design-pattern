package cn.edu.bupt.opensource.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: ModelCPU</p>
 * <p>Description: CPU模块 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 23:48</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ModelCPU {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelCPU.class);

     public void start() {
         LOGGER.info("cpu is start...");
     }

    public void shutDown() {
         LOGGER.info("CPU is shutDown...");
     }

}