package com.som.razraz;

import java.io.Serializable;

public interface PathService<R extends Serializable, C extends Context> {
    R process(C s);
}
