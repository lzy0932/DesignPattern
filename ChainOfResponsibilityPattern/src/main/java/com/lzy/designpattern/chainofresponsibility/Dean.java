package com.lzy.designpattern.chainofresponsibility;

/**
 * 具体处理者
 */
public class Dean extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 15) {
            System.out.println("院长批准你请假" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，无法批准！");
            }
        }
    }
}
