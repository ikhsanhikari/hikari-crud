package com.hikari.crud.core;

/**
 * Created by hikari on 15/11/2018.
 */
public class JsonWrapper {
    private Object data;
    private int itemsSize;
    private String ActionType;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getItemsSize() {
        return itemsSize;
    }

    public void setItemsSize(int itemsSize) {
        this.itemsSize = itemsSize;
    }

    public String getActionType() {
        return ActionType;
    }

    public void setActionType(String actionType) {
        ActionType = actionType;
    }

    public JsonWrapper(Object data, int itemsSize, String actionType) {
        this.data = data;
        this.itemsSize = itemsSize;
        ActionType = actionType;
    }
}
