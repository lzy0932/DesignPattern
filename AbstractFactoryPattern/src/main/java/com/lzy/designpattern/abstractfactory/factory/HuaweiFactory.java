package com.lzy.designpattern.abstractfactory.factory;

import com.lzy.designpattern.abstractfactory.product.HuaweiPhone;
import com.lzy.designpattern.abstractfactory.product.HuaweiRouter;
import com.lzy.designpattern.abstractfactory.product.Phone;
import com.lzy.designpattern.abstractfactory.product.Router;

/**
 * 具体工厂
 */
public class HuaweiFactory implements Factory {
    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public Router produceRouter() {
        return new HuaweiRouter();
    }
}
