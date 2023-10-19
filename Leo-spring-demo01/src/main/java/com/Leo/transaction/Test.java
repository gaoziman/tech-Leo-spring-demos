package com.Leo.transaction;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023/8/28 19:59
 * @description :
 */
public class Test {

    @Transactional(propagation = Propagation.REQUIRED)
    public void method() {
        /* 做业务 */
        MethodOne mb = new MethodOne();
        MethodOne mc = new MethodOne();
        mb.bMethod();
        mc.cMethod();
    }

}
