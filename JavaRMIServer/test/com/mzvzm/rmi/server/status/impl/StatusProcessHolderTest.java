package com.mzvzm.rmi.server.status.impl;

import com.mzvzm.rmi.status.BaseStatusEnum;
import com.mzvzm.rmi.status.IStatusProcess;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class StatusProcessHolderTest {

    @Test
    public void getProcessByMapTest() {
        StatusProcessMapHolder holder = new StatusProcessMapHolder();
        Optional<IStatusProcess> process = holder.getProcess(BaseStatusEnum.STATUS_2);
        process.ifPresent(IStatusProcess::doProcess);
    }

    @Test
    public void getProcessByArrayTest() {
        StatusProcessArrayHolder holder = new StatusProcessArrayHolder();
        Optional<IStatusProcess> process = holder.getProcess(BaseStatusEnum.STATUS_1);
        process.ifPresent(IStatusProcess::doProcess);
    }
}
