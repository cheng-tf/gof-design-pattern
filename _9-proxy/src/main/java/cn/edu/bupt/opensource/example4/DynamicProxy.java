package cn.edu.bupt.opensource.example4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>Title: DynamicProxy</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 10:43</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class DynamicProxy implements InvocationHandler {


    // 被代理的对象
    private OrderApi order = null;

    /**
     * 获取绑定好代理与具体目标对象后的目标对象的接口
     * @return
     */
    public OrderApi getProxyInterface(Order order) {
        // 设置被代理的对象，便于invoke
        this.order = order;
        // 关联代理与真正的目标对象
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
                order.getClass().getClassLoader(),
                order.getClass().getInterfaces(),
                this);
        return orderApi;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("set")) {
            if(order.getUser() != null && order.getUser().equals(args[1])) {
                return method.invoke(order, args);
            } else {
                System.out.println("对不起，" + args[1] +"，您无权修改本订单中的数据");
            }
        } else {
            return method.invoke(order, args);
        }
        return null;
    }

}
