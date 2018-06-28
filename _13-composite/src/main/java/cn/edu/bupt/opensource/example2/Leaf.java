package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Leaf</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 17:34</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Leaf extends Component {

    // 叶子对象名称
    private String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + name);
    }

}
