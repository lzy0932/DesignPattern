package com.lzy.designpattern.composite.organization;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Company company = new Company("公司");
        company.addOrg(new Department("部门1"));
        company.addOrg(new Department("部门2"));
        company.inform("放假");
    }
}
