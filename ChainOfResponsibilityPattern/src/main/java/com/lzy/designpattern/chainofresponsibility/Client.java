package com.lzy.designpattern.chainofresponsibility;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        ClassAdvisor classAdvisor = new ClassAdvisor();
        DepartmentHead departmentHead = new DepartmentHead();
        Dean dean = new Dean();
        classAdvisor.setNext(departmentHead);
        departmentHead.setNext(dean);
        classAdvisor.handleRequest(10);
    }
}
