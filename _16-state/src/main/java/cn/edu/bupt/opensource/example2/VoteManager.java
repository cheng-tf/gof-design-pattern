package cn.edu.bupt.opensource.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: VoteManager</p>
 * <p>Description: 投票上下文 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class VoteManager {

    // 状态处理对象
    private VoteState voteState = null;

    // 用户投票结果
    private Map<String, String> mapVote = new HashMap<>();

    // 用户投票次数(内部状态)
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    /**
     * 投票
     */
    public void vote(String user, String voteItem) {
        // #1 增加投票次数
        Integer voteCount = mapVoteCount.get(user);
        if(voteCount == null) {
            voteCount = 0;
        }
        voteCount++;
        mapVoteCount.put(user, voteCount);
        // #2 判断用户投票类型：正常/重复/恶意投票/黑名单
        if(voteCount == 1) {
            voteState = new VoteStateNormal();
        } else if(voteCount >= 2 && voteCount < 5) {
            voteState = new VoteStateRepeat();
        } else if(voteCount >= 5 && voteCount < 8) {
            voteState = new VoteStateSpite();
        } else if(voteCount == 8) {
            voteState = new VoteStateBlack();
        }
        // #3 转调状态对象进行相应操作
        voteState.vote(user, voteItem, this);
    }



}
