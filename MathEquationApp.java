class MathEquationApp{

public static void main(String[] args){

MathEquation addEq = new MathEquation();

addEq.leftVal = 10;
addEq.rightVal = 20;
addEq.opcode = '+';

System.out.println(addEq.execute());

}


}