package com.som.razraz;

import java.io.Serializable;

public interface WithParameter<T extends Serializable> {
    T getParameter();
    void setParameter(T parameter);
}
