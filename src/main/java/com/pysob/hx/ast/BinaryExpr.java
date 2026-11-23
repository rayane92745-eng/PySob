package com.pysob.hx.ast;

public class BinaryExpr extends Expression {
    public Expression left;
    public String operator;
    public Expression right;

    public BinaryExpr(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
}