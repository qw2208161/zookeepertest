package cn.suanfa;

import java.util.List;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-03-25 22:07:56
 */

public class ad {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<String> getXxx() {
        return xxx;
    }

    public void setXxx(List<String> xxx) {
        this.xxx = xxx;
    }

    private int num;
    private List<String> xxx;

    public ad(int num, List<String> xxx) {
        this.num = num;
        this.xxx = xxx;
    }
}
