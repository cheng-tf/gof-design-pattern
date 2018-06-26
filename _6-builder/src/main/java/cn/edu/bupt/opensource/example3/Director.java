package cn.edu.bupt.opensource.example3;

import java.util.Collection;
import java.util.Map;

/**
 * <p>Title: Director</p>
 * <p>Description: 指导者 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 14:39</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Director {

    // 构建器
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指导构建器构建最终的输出文件的对象
     * @param head
     * @param mapData
     * @param tail
     */
    public void construct(ExportModelHead head, Map<String, Collection<ExportModelData>> mapData, ExportModelTail tail) {
        builder.buildHead(head);
        builder.buildBody(mapData);
        builder.buildTail(tail);
    }


}
