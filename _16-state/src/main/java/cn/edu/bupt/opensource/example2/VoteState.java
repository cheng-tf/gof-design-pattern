package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: VoteState</p>
 * <p>Description: 状态接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:30</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface VoteState {

    /**
     * 定义状态对应的行为
     * @param user          投票人
     * @param voteItem      投票项
     * @param voteManager   投票上下文
     */
    void vote(String user, String voteItem, VoteManager voteManager);

}
