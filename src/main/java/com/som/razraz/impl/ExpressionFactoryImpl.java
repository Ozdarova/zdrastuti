package com.som.razraz.impl;

import com.som.razraz.ExpressionFactory;
import com.som.razraz.expressions.CommonExpression;
import com.som.razraz.expressions.FieldExpression;
import com.som.razraz.expressions.ListExpression;
import com.som.razraz.expressions.StartExpression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionFactoryImpl implements ExpressionFactory<CommonExpression, ContextImpl> {

    @Override
    public List<CommonExpression> getExpressionQueue(ContextImpl ctx) {
        List<CommonExpression> result = new ArrayList<>();
        result.add(new StartExpression());

        String path = ctx.getPath();
        for (String lexeme : path.split(".")) {
            result.add(prepareExpression(lexeme));
        }

        return result;
    }

    private CommonExpression prepareExpression(String lexeme) {
        if (lexeme.matches("/\\d/")) {
            ListExpression expression = new ListExpression();
            expression.setParameter(Integer.parseInt(lexeme));
            return expression;
        } else if (lexeme.matches("/\\w/")) {
            FieldExpression expression = new FieldExpression();
            expression.setParameter(lexeme);
            return expression;
        } else {
            throw new IllegalArgumentException(lexeme + " не удалось распознать");
        }
    }

}
