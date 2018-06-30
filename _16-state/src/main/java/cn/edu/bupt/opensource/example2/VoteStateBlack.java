package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: VoteStateBlack</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class VoteStateBlack implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 黑名单
        System.out.println("您已进入黑名单，将禁止登录与使用本系统。");
    }

}
