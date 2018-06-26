package cn.edu.bupt.opensource.example3;

import java.util.Collection;
import java.util.Map;

/**
 * <p>Title: Builder</p>
 * <p>Description: 构建器接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 14:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface Builder {

    /**
     * 构建输出文件的Head部件
     */
    void buildHead(ExportModelHead head);

    /**
     * 构建输出文件的Body部件
     */
    void buildBody(Map<String, Collection<ExportModelData>> mapData);

    /**
     * 构建输出文件的Tail部件
     */
    void buildTail(ExportModelTail tail);

}
