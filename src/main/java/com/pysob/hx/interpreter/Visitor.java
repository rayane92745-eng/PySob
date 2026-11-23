package com.pysob.hx.interpreter;

import com.pysob.hx.ast.*;

public interface Visitor<R> {
    R visitBinaryExpr(BinaryExpr expr);
    // Add other visit methods as AST grows
}