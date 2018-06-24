package cn.edu.bupt.opensource.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: Client</p>
 * <p>Description: 客户端 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 11:27</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        LOGGER.info("=================");
        computer.shutDown();
    }

}
