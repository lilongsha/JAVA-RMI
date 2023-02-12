package com.mzvzm.rmi.status;

public interface IStatusProcess {
    BaseStatusEnum getType();
    void doProcess();
}
