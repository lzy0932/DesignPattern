package com.lzy.designpattern.composite.organization;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 */
public class Company extends Organization {
    private List<Organization> childOrgs = new ArrayList<>();

    public Company(String name) {
        super(name);
    }

    public void addOrg(Organization organization) {
        childOrgs.add(organization);
    }

    public void remove(Organization organization) {
        childOrgs.remove(organization);
    }

    @Override
    public void inform(String info) {
        System.out.println(info + "-" + getName());
        childOrgs.forEach(org -> org.inform(info + "-"));
    }
}
