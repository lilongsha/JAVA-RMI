package com.mzvzm.rmi.server.status.impl;

import com.mzvzm.rmi.status.BaseStatusEnum;
import com.mzvzm.rmi.status.IStatusProcess;

public class StatusOneProcess implements IStatusProcess {
    @Override
    public BaseStatusEnum getType() {
        return BaseStatusEnum.STATUS_1;
    }

    @Override
    public void doProcess() {
        System.out.println(BaseStatusEnum.STATUS_1);
    }
}
