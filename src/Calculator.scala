class Calculator {
  val add: (Int, Int) => Int = _ + _
  val subtract: (Int, Int) => Int = _ - _
  val multiply: (Int, Int) => Int= _*_
  val divide: (Int, Int) => Int = _ / _

  def calculate(op1: Int, op2: Int, operator: String) = {
    operator match {
      case "add" => add(op1, op2)
      case "subtract" => subtract(op1, op2)
      case "multiply" => multiply(op1, op2)
      case "divide" => divide(op1, op2)
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

