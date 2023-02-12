package com.mzvzm.rmi.status;

import com.sun.istack.internal.NotNull;

import java.util.Optional;

public enum BaseStatusEnum {
    STATUS_1(1, "状态1"),
    STATUS_2(2, "状态2"),
    STATUS_3(3, "状态3");

    private Integer value;
    private String message;

    private BaseStatusEnum(Integer value, String message){
        this.value = value;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public Optional<String> getMessage(@NotNull Integer value) {
        Optional<String> result = Optional.empty();
        for (BaseStatusEnum status : BaseStatusEnum.values()) {
            if (value.equals(status.value)) {
                result = Optional.of(status.message);
            }
        }
        return result;
    }

    public Integer getValue() {
        return this.value;
    }

    public Optional<Integer> getValue(@NotNull String message) {
        Optional<Integer> result = Optional.empty();
        for (BaseStatusEnum status : BaseStatusEnum.values()) {
            if (message.equals(status.message)) {
                result = Optional.of(status.value);
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "{\"value\":\"" + value + "\",\"message\":\"" + message + "\"}";
    }
}
