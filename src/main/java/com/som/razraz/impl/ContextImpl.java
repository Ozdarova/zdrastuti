package com.som.razraz.impl;

import com.som.razraz.Context;

import java.io.Serializable;
import java.util.HashMap;

public class ContextImpl implements Context<HashMap<String, Serializable>, Serializable, String> {
    private HashMap<String, Serializable> source;
    private Serializable value;
    private String path;

    @Override
    public HashMap<String, Serializable> getRepository() {
        return this.source;
    }

    public void setSource(HashMap<String, Serializable> source) {
        this.source = source;
    }

    @Override
    public Serializable getValue() {
        return this.value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }

    @Override
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
