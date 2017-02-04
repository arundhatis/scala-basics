class Calculator {
  def calculate(op1: Int, op2: Int, operand: String) = {
    operand match {
      case "add" => op1 + op2
      case "subtract" => op1 - op2
      case "multiply" => op1 * op2
      case "divide" => op1 / op2
      case _ => -1
    }
  }
}

object Calculator {
  def main(args: Array[String]): Unit = {
    val calculator = new Calculator
    println(calculator.calculate(2, 2, "add"))
    println(calculator.calculate(4, 2, "subtract"))
    println(calculator.calculate(4, 2, "multiply"))
    println(calculator.calculate(10, 2, "divide"))
  }
}

