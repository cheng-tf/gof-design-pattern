package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: VoteStateSpite</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class VoteStateSpite implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 恶意投票
        // 取消用户投票资格，并无效其投票
        if(voteManager.getMapVote().get(user) != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("您有恶意刷票行为，取消投票资格。");
    }

}
