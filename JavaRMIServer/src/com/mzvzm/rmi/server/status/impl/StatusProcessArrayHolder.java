package com.mzvzm.rmi.server.status.impl;

import com.mzvzm.rmi.status.BaseStatusEnum;
import com.mzvzm.rmi.status.IStatusProcess;

import java.util.ArrayList;
import java.util.Optional;

public class StatusProcessArrayHolder {
    private static final ArrayList<IStatusProcess> STATUS_PROCESS_SERVICES = new ArrayList<>();

    static {
        STATUS_PROCESS_SERVICES.add(new StatusOneProcess());
        STATUS_PROCESS_SERVICES.add(new StatusTwoProcess());
    }

    public Optional<IStatusProcess> getProcess(BaseStatusEnum type) {
        Optional<IStatusProcess> result = Optional.empty();
        for (IStatusProcess service : STATUS_PROCESS_SERVICES) {
            if (service.getType().equals(type)) {
                result = Optional.of(service);
                break;
            }
        }
        return result;
    }
}
