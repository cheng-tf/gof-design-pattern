package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: VoteStateRepeat</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class VoteStateRepeat implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 重复投票
        System.out.println("请不要重复投票。");
    }

}
