package impl.verifier

import impl.logic.Symbol
import syntax._

/**
 * An SMT-LIB declaration.
 */
sealed trait SmtDeclaration {
  def fmt: String = this match {
    case SmtDeclaration.Relation2(s, sort, var1, var2, formula) =>
      smt"(define-fun $s (($var1 $sort) ($var2 $sort)) Bool" + "\n    " + formula.fmt(1) + ")\n"

    case SmtDeclaration.Relation3(s, sort, var1, var2, var3, formula) =>
      smt"(define-fun $s (($var1 $sort) ($var2 $sort) ($var3 $sort)) Bool" + "\n    " + formula.fmt(1) + ")\n"

    case SmtDeclaration.Datatype(s, variants) =>
      smt"(declare-datatypes () (($s " + variants.map(_.s).mkString(" ") + ")))\n"
  }
}

object SmtDeclaration {

  /**
   * A 2-ary boolean function declaration.
   */
  case class Relation2(name: Symbol.PredicateSymbol, sort: Symbol.LatticeSymbol, var1: Symbol.VariableSymbol, var2: Symbol.VariableSymbol, formula: SmtFormula) extends SmtDeclaration

  /**
   * A 3-ary boolean function declaration.
   */
  case class Relation3(name: Symbol.PredicateSymbol, sort: Symbol.LatticeSymbol, var1: Symbol.VariableSymbol, var2: Symbol.VariableSymbol, var3: Symbol.VariableSymbol, formula: SmtFormula) extends SmtDeclaration

  /**
   * A datatype declaration.
   */
  case class Datatype(name: Symbol.LatticeSymbol, variants: List[Symbol.NamedSymbol]) extends SmtDeclaration

}
