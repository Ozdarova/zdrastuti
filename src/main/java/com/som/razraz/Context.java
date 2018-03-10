package com.som.razraz;

import java.io.Serializable;

public interface Context<M extends Serializable, V extends Serializable, P extends Serializable> {
    M getRepository();
    V getValue();
    P getPath();
}
