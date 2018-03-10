package com.som.razraz.impl;

import com.som.razraz.PathService;
import com.som.razraz.expressions.CommonExpression;

import java.util.List;
import java.util.Objects;

public abstract class PathServiceImpl<T extends ContextImpl> implements PathService<String, T> {
    private T context;
    private ExpressionFactoryImpl expressionFactory;

    @Override
    public String process(T ctx) {
        if (!Objects.equals(this.context, ctx)) {
            this.context = ctx;
        }
        List<CommonExpression> expressionList = expressionFactory.getExpressionQueue(this.context);
        for (CommonExpression expression : expressionList) {
            expression.eval(this.context);
        }

        return (String) ctx.getValue();
    }
}
