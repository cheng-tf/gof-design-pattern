package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: VoteStateNormal</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class VoteStateNormal implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 正常投票
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜您投票成功！");
    }

}
