package com.som.razraz;

import java.io.Serializable;

public interface WithReturnType<T extends Serializable> {
    T value();
    Class<T> type();
}
