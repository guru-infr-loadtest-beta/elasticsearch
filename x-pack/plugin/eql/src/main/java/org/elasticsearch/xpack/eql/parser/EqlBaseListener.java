// ANTLR GENERATED CODE: DO NOT EDIT
package org.elasticsearch.xpack.eql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EqlBaseParser}.
 */
interface EqlBaseListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#singleStatement}.
   * @param ctx the parse tree
   */
  void enterSingleStatement(EqlBaseParser.SingleStatementContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#singleStatement}.
   * @param ctx the parse tree
   */
  void exitSingleStatement(EqlBaseParser.SingleStatementContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#singleExpression}.
   * @param ctx the parse tree
   */
  void enterSingleExpression(EqlBaseParser.SingleExpressionContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#singleExpression}.
   * @param ctx the parse tree
   */
  void exitSingleExpression(EqlBaseParser.SingleExpressionContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#statement}.
   * @param ctx the parse tree
   */
  void enterStatement(EqlBaseParser.StatementContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#statement}.
   * @param ctx the parse tree
   */
  void exitStatement(EqlBaseParser.StatementContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#query}.
   * @param ctx the parse tree
   */
  void enterQuery(EqlBaseParser.QueryContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#query}.
   * @param ctx the parse tree
   */
  void exitQuery(EqlBaseParser.QueryContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#sequence}.
   * @param ctx the parse tree
   */
  void enterSequence(EqlBaseParser.SequenceContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#sequence}.
   * @param ctx the parse tree
   */
  void exitSequence(EqlBaseParser.SequenceContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#join}.
   * @param ctx the parse tree
   */
  void enterJoin(EqlBaseParser.JoinContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#join}.
   * @param ctx the parse tree
   */
  void exitJoin(EqlBaseParser.JoinContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#pipe}.
   * @param ctx the parse tree
   */
  void enterPipe(EqlBaseParser.PipeContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#pipe}.
   * @param ctx the parse tree
   */
  void exitPipe(EqlBaseParser.PipeContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#joinKeys}.
   * @param ctx the parse tree
   */
  void enterJoinKeys(EqlBaseParser.JoinKeysContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#joinKeys}.
   * @param ctx the parse tree
   */
  void exitJoinKeys(EqlBaseParser.JoinKeysContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#span}.
   * @param ctx the parse tree
   */
  void enterSpan(EqlBaseParser.SpanContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#span}.
   * @param ctx the parse tree
   */
  void exitSpan(EqlBaseParser.SpanContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#match}.
   * @param ctx the parse tree
   */
  void enterMatch(EqlBaseParser.MatchContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#match}.
   * @param ctx the parse tree
   */
  void exitMatch(EqlBaseParser.MatchContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#condition}.
   * @param ctx the parse tree
   */
  void enterCondition(EqlBaseParser.ConditionContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#condition}.
   * @param ctx the parse tree
   */
  void exitCondition(EqlBaseParser.ConditionContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#expression}.
   * @param ctx the parse tree
   */
  void enterExpression(EqlBaseParser.ExpressionContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#expression}.
   * @param ctx the parse tree
   */
  void exitExpression(EqlBaseParser.ExpressionContext ctx);
  /**
   * Enter a parse tree produced by the {@code logicalNot}
   * labeled alternative in {@link EqlBaseParser#booleanExpression}.
   * @param ctx the parse tree
   */
  void enterLogicalNot(EqlBaseParser.LogicalNotContext ctx);
  /**
   * Exit a parse tree produced by the {@code logicalNot}
   * labeled alternative in {@link EqlBaseParser#booleanExpression}.
   * @param ctx the parse tree
   */
  void exitLogicalNot(EqlBaseParser.LogicalNotContext ctx);
  /**
   * Enter a parse tree produced by the {@code booleanDefault}
   * labeled alternative in {@link EqlBaseParser#booleanExpression}.
   * @param ctx the parse tree
   */
  void enterBooleanDefault(EqlBaseParser.BooleanDefaultContext ctx);
  /**
   * Exit a parse tree produced by the {@code booleanDefault}
   * labeled alternative in {@link EqlBaseParser#booleanExpression}.
   * @param ctx the parse tree
   */
  void exitBooleanDefault(EqlBaseParser.BooleanDefaultContext ctx);
  /**
   * Enter a parse tree produced by the {@code logicalBinary}
   * labeled alternative in {@link EqlBaseParser#booleanExpression}.
   * @param ctx the parse tree
   */
  void enterLogicalBinary(EqlBaseParser.LogicalBinaryContext ctx);
  /**
   * Exit a parse tree produced by the {@code logicalBinary}
   * labeled alternative in {@link EqlBaseParser#booleanExpression}.
   * @param ctx the parse tree
   */
  void exitLogicalBinary(EqlBaseParser.LogicalBinaryContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#predicated}.
   * @param ctx the parse tree
   */
  void enterPredicated(EqlBaseParser.PredicatedContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#predicated}.
   * @param ctx the parse tree
   */
  void exitPredicated(EqlBaseParser.PredicatedContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#predicate}.
   * @param ctx the parse tree
   */
  void enterPredicate(EqlBaseParser.PredicateContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#predicate}.
   * @param ctx the parse tree
   */
  void exitPredicate(EqlBaseParser.PredicateContext ctx);
  /**
   * Enter a parse tree produced by the {@code valueExpressionDefault}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void enterValueExpressionDefault(EqlBaseParser.ValueExpressionDefaultContext ctx);
  /**
   * Exit a parse tree produced by the {@code valueExpressionDefault}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void exitValueExpressionDefault(EqlBaseParser.ValueExpressionDefaultContext ctx);
  /**
   * Enter a parse tree produced by the {@code comparison}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void enterComparison(EqlBaseParser.ComparisonContext ctx);
  /**
   * Exit a parse tree produced by the {@code comparison}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void exitComparison(EqlBaseParser.ComparisonContext ctx);
  /**
   * Enter a parse tree produced by the {@code arithmeticBinary}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void enterArithmeticBinary(EqlBaseParser.ArithmeticBinaryContext ctx);
  /**
   * Exit a parse tree produced by the {@code arithmeticBinary}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void exitArithmeticBinary(EqlBaseParser.ArithmeticBinaryContext ctx);
  /**
   * Enter a parse tree produced by the {@code arithmeticUnary}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void enterArithmeticUnary(EqlBaseParser.ArithmeticUnaryContext ctx);
  /**
   * Exit a parse tree produced by the {@code arithmeticUnary}
   * labeled alternative in {@link EqlBaseParser#valueExpression}.
   * @param ctx the parse tree
   */
  void exitArithmeticUnary(EqlBaseParser.ArithmeticUnaryContext ctx);
  /**
   * Enter a parse tree produced by the {@code constantDefault}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void enterConstantDefault(EqlBaseParser.ConstantDefaultContext ctx);
  /**
   * Exit a parse tree produced by the {@code constantDefault}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void exitConstantDefault(EqlBaseParser.ConstantDefaultContext ctx);
  /**
   * Enter a parse tree produced by the {@code function}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void enterFunction(EqlBaseParser.FunctionContext ctx);
  /**
   * Exit a parse tree produced by the {@code function}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void exitFunction(EqlBaseParser.FunctionContext ctx);
  /**
   * Enter a parse tree produced by the {@code dereference}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void enterDereference(EqlBaseParser.DereferenceContext ctx);
  /**
   * Exit a parse tree produced by the {@code dereference}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void exitDereference(EqlBaseParser.DereferenceContext ctx);
  /**
   * Enter a parse tree produced by the {@code parenthesizedExpression}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void enterParenthesizedExpression(EqlBaseParser.ParenthesizedExpressionContext ctx);
  /**
   * Exit a parse tree produced by the {@code parenthesizedExpression}
   * labeled alternative in {@link EqlBaseParser#primaryExpression}.
   * @param ctx the parse tree
   */
  void exitParenthesizedExpression(EqlBaseParser.ParenthesizedExpressionContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#functionExpression}.
   * @param ctx the parse tree
   */
  void enterFunctionExpression(EqlBaseParser.FunctionExpressionContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#functionExpression}.
   * @param ctx the parse tree
   */
  void exitFunctionExpression(EqlBaseParser.FunctionExpressionContext ctx);
  /**
   * Enter a parse tree produced by the {@code nullLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void enterNullLiteral(EqlBaseParser.NullLiteralContext ctx);
  /**
   * Exit a parse tree produced by the {@code nullLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void exitNullLiteral(EqlBaseParser.NullLiteralContext ctx);
  /**
   * Enter a parse tree produced by the {@code numericLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void enterNumericLiteral(EqlBaseParser.NumericLiteralContext ctx);
  /**
   * Exit a parse tree produced by the {@code numericLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void exitNumericLiteral(EqlBaseParser.NumericLiteralContext ctx);
  /**
   * Enter a parse tree produced by the {@code booleanLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void enterBooleanLiteral(EqlBaseParser.BooleanLiteralContext ctx);
  /**
   * Exit a parse tree produced by the {@code booleanLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void exitBooleanLiteral(EqlBaseParser.BooleanLiteralContext ctx);
  /**
   * Enter a parse tree produced by the {@code stringLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void enterStringLiteral(EqlBaseParser.StringLiteralContext ctx);
  /**
   * Exit a parse tree produced by the {@code stringLiteral}
   * labeled alternative in {@link EqlBaseParser#constant}.
   * @param ctx the parse tree
   */
  void exitStringLiteral(EqlBaseParser.StringLiteralContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#comparisonOperator}.
   * @param ctx the parse tree
   */
  void enterComparisonOperator(EqlBaseParser.ComparisonOperatorContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#comparisonOperator}.
   * @param ctx the parse tree
   */
  void exitComparisonOperator(EqlBaseParser.ComparisonOperatorContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#booleanValue}.
   * @param ctx the parse tree
   */
  void enterBooleanValue(EqlBaseParser.BooleanValueContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#booleanValue}.
   * @param ctx the parse tree
   */
  void exitBooleanValue(EqlBaseParser.BooleanValueContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#qualifiedNames}.
   * @param ctx the parse tree
   */
  void enterQualifiedNames(EqlBaseParser.QualifiedNamesContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#qualifiedNames}.
   * @param ctx the parse tree
   */
  void exitQualifiedNames(EqlBaseParser.QualifiedNamesContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#qualifiedName}.
   * @param ctx the parse tree
   */
  void enterQualifiedName(EqlBaseParser.QualifiedNameContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#qualifiedName}.
   * @param ctx the parse tree
   */
  void exitQualifiedName(EqlBaseParser.QualifiedNameContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#identifier}.
   * @param ctx the parse tree
   */
  void enterIdentifier(EqlBaseParser.IdentifierContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#identifier}.
   * @param ctx the parse tree
   */
  void exitIdentifier(EqlBaseParser.IdentifierContext ctx);
  /**
   * Enter a parse tree produced by the {@code quotedIdentifier}
   * labeled alternative in {@link EqlBaseParser#quoteIdentifier}.
   * @param ctx the parse tree
   */
  void enterQuotedIdentifier(EqlBaseParser.QuotedIdentifierContext ctx);
  /**
   * Exit a parse tree produced by the {@code quotedIdentifier}
   * labeled alternative in {@link EqlBaseParser#quoteIdentifier}.
   * @param ctx the parse tree
   */
  void exitQuotedIdentifier(EqlBaseParser.QuotedIdentifierContext ctx);
  /**
   * Enter a parse tree produced by the {@code unquotedIdentifier}
   * labeled alternative in {@link EqlBaseParser#unquoteIdentifier}.
   * @param ctx the parse tree
   */
  void enterUnquotedIdentifier(EqlBaseParser.UnquotedIdentifierContext ctx);
  /**
   * Exit a parse tree produced by the {@code unquotedIdentifier}
   * labeled alternative in {@link EqlBaseParser#unquoteIdentifier}.
   * @param ctx the parse tree
   */
  void exitUnquotedIdentifier(EqlBaseParser.UnquotedIdentifierContext ctx);
  /**
   * Enter a parse tree produced by the {@code digitIdentifier}
   * labeled alternative in {@link EqlBaseParser#unquoteIdentifier}.
   * @param ctx the parse tree
   */
  void enterDigitIdentifier(EqlBaseParser.DigitIdentifierContext ctx);
  /**
   * Exit a parse tree produced by the {@code digitIdentifier}
   * labeled alternative in {@link EqlBaseParser#unquoteIdentifier}.
   * @param ctx the parse tree
   */
  void exitDigitIdentifier(EqlBaseParser.DigitIdentifierContext ctx);
  /**
   * Enter a parse tree produced by the {@code decimalLiteral}
   * labeled alternative in {@link EqlBaseParser#number}.
   * @param ctx the parse tree
   */
  void enterDecimalLiteral(EqlBaseParser.DecimalLiteralContext ctx);
  /**
   * Exit a parse tree produced by the {@code decimalLiteral}
   * labeled alternative in {@link EqlBaseParser#number}.
   * @param ctx the parse tree
   */
  void exitDecimalLiteral(EqlBaseParser.DecimalLiteralContext ctx);
  /**
   * Enter a parse tree produced by the {@code integerLiteral}
   * labeled alternative in {@link EqlBaseParser#number}.
   * @param ctx the parse tree
   */
  void enterIntegerLiteral(EqlBaseParser.IntegerLiteralContext ctx);
  /**
   * Exit a parse tree produced by the {@code integerLiteral}
   * labeled alternative in {@link EqlBaseParser#number}.
   * @param ctx the parse tree
   */
  void exitIntegerLiteral(EqlBaseParser.IntegerLiteralContext ctx);
  /**
   * Enter a parse tree produced by {@link EqlBaseParser#string}.
   * @param ctx the parse tree
   */
  void enterString(EqlBaseParser.StringContext ctx);
  /**
   * Exit a parse tree produced by {@link EqlBaseParser#string}.
   * @param ctx the parse tree
   */
  void exitString(EqlBaseParser.StringContext ctx);
}