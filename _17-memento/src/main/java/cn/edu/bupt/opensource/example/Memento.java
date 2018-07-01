package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Memento</p>
 * <p>Description: 备忘录的窄接口(用于标识类型) </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 14:22</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 备忘录模式
 *  定义：在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，从而以后可恢复为原状态。
 *  角色：
 *      1）Memento：备忘录，存储原发器内部的状态；只能由原发器对象访问其内部数据。
 *      2）Originator：原发器(发起人)，使用备忘录保存、恢复其状态；一般存有私有静态的内部类(备忘录的实现)。
 *      3）Caretaker：备忘录管理者(负责人)，用于保存备忘录对象，并不对其内容进行操作、检查。
 *  举例：仿真系统开发
 *  认识：
 *      1）功能：在不破坏封装的前提下，捕获一个对象的内部状态。    捕获--->恢复
 *      2）备忘录对象：记录原发器需要保存的状态的对象；
 *          A.一般只让原发器对象操作，通常作为原发器的私有内部类来实现。
 *          B.此对象通常保存在原发器对象之外，为了与外部交互，通常实现一个窄接口，用于标识对象类型。
 *      3）原发器对象：需要被保存、恢复状态的对象。
 *          A.一般包含备忘录对象的实现
 *          B.应提供捕获某个时刻对象内部状态的方法，即创建备忘录对象，并设置备忘状态数据，然后将此对象交由Caretaker管理。
 *      4）管理者对象：负责保存备忘录对象
 *          A.不是必须的
 *          B.可管理多个备忘录对象，而狭义的管理者对象只管理同一类的备忘录对象。
 *          C.基本功能：存入、保存、取出备忘录对象；类似于缓存或对象实例池。
 *          D.注意：其不能访问备忘录的数据(窄接口限制)。
 *      5）窄接口与宽接口
 *          A.窄接口：对于Caretaker而言。仅是一个类型标识，人无任何方法。
 *          B,宽接口：对于Originator而言，眼瞎访问所需数据、恢复状态。
 *      6）使用备忘录的潜在代价：标准是采用缓存实现，适用于备忘数据不过大的情况，否则开销很大，
 *      7）增量存储：仅存储原发器内部相对于上一次存储状态后的增量改变；适用于顺序可控的环境。
 *      8）结合原型模式
 *          A.若原发器对象中的不部分、或全部状态需要保存恢复，则最简洁的方式：直接克隆一个原发器对象。实现Cloneable接口。
 *          B.此时，在备忘录对象中，存储是原发器对象的实例。
 *      9）离线存储
 *      10）再次实现可撤销操作（存储恢复式）
 *  优点：
 *      1）封装性好
 *      2）简化了原发器
 *      3）窄接口与宽接口
 *  缺点：
 *      1）可能导致高开销
 *  本质：保存、恢复内部状态
 *
 */
public interface Memento {

}