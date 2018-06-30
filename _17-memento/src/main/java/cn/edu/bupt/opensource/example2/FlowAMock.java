package cn.edu.bupt.opensource.example2;

import java.io.Serializable;

/**
 * <p>Title: FlowAMock</p>
 * <p>Description: 原发器 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 14:57</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class FlowAMock implements Serializable {

    // 流程名称
    private String flowName;

    // 中间结果1
    private int tmpResult;

    // 中间结果2
    private String tmpState;

    public FlowAMock(String flowName) {
        this.flowName = flowName;
    }

    /**
     * 流程：第一阶段
     */
    public void runPhaseOne() {
        tmpResult = 3;
        tmpState = "PhaseOne";
    }

    /**
     * 流程：第二阶段(方案1)
     */
    public void runPhaseTwoScheme1() {
        this.tmpState += ", Scheme1";
        System.out.println(this.tmpState + " : now run " + this.tmpResult);
        this.tmpResult += 11;
    }

    /**
     * 流程：第二阶段(方案2
     */
    public void runPhaseTwoScheme2() {
        this.tmpState += ", Scheme2";
        System.out.println(this.tmpState + " : now run " + this.tmpResult);
        this.tmpResult += 22;
    }


    /**
     * 创建备忘录对象
     */
    public FlowAMockMemento createMemento() {
        return new MementoImpl(this.tmpResult, this.tmpState);
    }

    /**
     * 重新设置原发器的状态，恢复为备忘录对象记录的状态
     */
    public void setMemento(FlowAMockMemento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.tmpResult = mementoImpl.getTmpResult();
        this.tmpState = mementoImpl.getTmpState();
    }

    private static class MementoImpl implements FlowAMockMemento {

        // 中间结果1
        private int tmpResult;

        // 中间结果2
        private String tmpState;

        public MementoImpl(int tmpResult, String tmpState) {
            this.tmpResult = tmpResult;
            this.tmpState = tmpState;
        }

        public int getTmpResult() {
            return tmpResult;
        }

        public String getTmpState() {
            return tmpState;
        }
    }












}
