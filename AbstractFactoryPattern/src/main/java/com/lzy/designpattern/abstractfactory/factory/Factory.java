package com.lzy.designpattern.abstractfactory.factory;

import com.lzy.designpattern.abstractfactory.product.Phone;
import com.lzy.designpattern.abstractfactory.product.Router;

/**
 * 抽象工厂
 */
public interface Factory {
    Phone producePhone();

    Router produceRouter();
}
