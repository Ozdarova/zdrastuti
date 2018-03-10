package com.som.razraz.expressions;

import com.som.razraz.WithParameter;
import com.som.razraz.impl.ContextImpl;

import java.io.Serializable;
import java.util.HashMap;

public class FieldExpression extends CommonExpression implements WithParameter<String> {
    private String parameter;

    @Override
    public void eval(ContextImpl input) {
        HashMap<String, Serializable> inValue = (HashMap<String, Serializable>) input.getValue();
        Serializable outValue = inValue.get(parameter);
        input.setValue(outValue);
    }

    @Override
    public String getParameter() {
        return this.parameter;
    }

    @Override
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
