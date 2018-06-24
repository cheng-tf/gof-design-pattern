package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Facade</p>
 * <p>Description: 门面类（核心） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 11:53</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Facade {

    public void generate() {
        new ModelController().generate();
        new ModelService().generate();;
        new ModelDAO().generate();
    }

}
