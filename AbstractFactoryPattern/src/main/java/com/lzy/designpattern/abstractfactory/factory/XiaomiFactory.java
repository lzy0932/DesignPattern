package com.lzy.designpattern.abstractfactory.factory;

import com.lzy.designpattern.abstractfactory.product.Phone;
import com.lzy.designpattern.abstractfactory.product.Router;
import com.lzy.designpattern.abstractfactory.product.XiaomiPhone;
import com.lzy.designpattern.abstractfactory.product.XiaomiRouter;

/**
 * 具体工厂
 */
public class XiaomiFactory implements Factory {
    @Override
    public Phone producePhone() {
        return new XiaomiPhone();
    }

    @Override
    public Router produceRouter() {
        return new XiaomiRouter();
    }
}
