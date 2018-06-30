package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 13:47</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for(int i = 0; i < 8; i++) {
            voteManager.vote("梁启超", "袁世凯");
        }


    }

}
