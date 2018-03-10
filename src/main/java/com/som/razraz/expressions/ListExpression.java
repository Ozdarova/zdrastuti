package com.som.razraz.expressions;

import com.som.razraz.WithParameter;
import com.som.razraz.impl.ContextImpl;

import java.io.Serializable;
import java.util.List;

public class ListExpression extends CommonExpression implements WithParameter<Integer> {
    private Integer parameter;

    @Override
    public void eval(ContextImpl input) {
        Serializable value = input.getValue();
        List<Serializable> list = (List<Serializable>) value;
        Serializable serializable = list.get(getParameter());
        input.setValue(serializable);
    }

    @Override
    public Integer getParameter() {
        return this.parameter;
    }

    @Override
    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }
}
