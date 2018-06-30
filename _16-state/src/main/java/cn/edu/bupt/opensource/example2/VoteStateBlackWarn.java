package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: VoteStateBlack</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class VoteStateBlackWarn implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 黑名单警告
        System.out.println("禁止登陆与使用系统3天。");
    }

}
