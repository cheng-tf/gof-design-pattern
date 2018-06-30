package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:22</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 计算基本奖金(被装饰类)
        Component component = new ConcreteComponent();

        Decorator decorator1 = new DecoratorMonthPrize(component);
        Decorator decorator2 = new DecoratorSumPrize(decorator1);
        System.out.println("孙中山应得奖金：" + decorator2.calPrize("孙中山", null, null));
        System.out.println("华盛顿应得奖金：" + decorator2.calPrize("华盛顿", null, null));

        Decorator decorator3 = new DecoratorGroupPrize(decorator2);
        System.out.println("卢梭应得奖金：" + decorator3.calPrize("卢梭", null, null));


    }

}


