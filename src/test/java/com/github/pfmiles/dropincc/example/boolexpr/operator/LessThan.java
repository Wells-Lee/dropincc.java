package com.github.pfmiles.dropincc.example.boolexpr.operator;

import com.github.pfmiles.dropincc.example.boolexpr.Operator;

/**
 * @author pf-miles Aug 20, 2012 4:16:06 PM
 */
public class LessThan implements Operator {

    public Boolean compute(Object left, Object right) {
        if (!(left instanceof Comparable) || !(right instanceof Comparable))
            throw new RuntimeException("Comparable operands required.");
        if (left instanceof Number && right instanceof Number) {
            return ((Number) left).doubleValue() < ((Number) right).doubleValue();
        } else {
            return ((Comparable) left).compareTo((Comparable) right) < 0;
        }
    }

}
