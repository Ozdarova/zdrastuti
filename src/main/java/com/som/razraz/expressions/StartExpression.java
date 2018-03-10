package com.som.razraz.expressions;

import com.som.razraz.impl.ContextImpl;

import java.io.Serializable;
import java.util.HashMap;

public class StartExpression extends CommonExpression {
    @Override
    public void eval(ContextImpl input) {
        input.setValue(input.getRepository());
    }
}
