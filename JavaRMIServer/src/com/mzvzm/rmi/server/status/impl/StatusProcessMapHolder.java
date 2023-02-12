package com.mzvzm.rmi.server.status.impl;

import com.mzvzm.rmi.status.BaseStatusEnum;
import com.mzvzm.rmi.status.IStatusProcess;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class StatusProcessMapHolder {
    private static final Map<BaseStatusEnum, IStatusProcess> STATUS_PROCESS_SERVICES = new ConcurrentHashMap<>();

    static {
        STATUS_PROCESS_SERVICES.put(BaseStatusEnum.STATUS_1, new StatusOneProcess());
        STATUS_PROCESS_SERVICES.put(BaseStatusEnum.STATUS_2, new StatusTwoProcess());
    }

    public Optional<IStatusProcess> getProcess(BaseStatusEnum type) {
        return Optional.of(STATUS_PROCESS_SERVICES.get(type));
    }

}
