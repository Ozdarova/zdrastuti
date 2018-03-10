package com.som.razraz;

import java.util.List;

public interface ExpressionFactory<T extends Expression, C extends Context> {
    List<T> getExpressionQueue(C ctx);
}
