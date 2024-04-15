//Todo
/**
encapsulate data
handle div by 0
unknownopcode exception
mutators and constructors
**/



class MathEquation{

public double leftVal;
public double rightVal;
public char opcode;//a,s,d,m,r


public double execute(){

switch(opcode){

case '+':
return leftVal + rightVal;

case '-':
return leftVal - rightVal;

case 'd':
return leftVal / rightVal;// I will Have to handle div by 0

case 'm':
return leftVal * rightVal;

case 'r':
return leftVal % rightVal;

default:
return 0;// need to raise exception UnknownOpcodeException for now zero will do

}


}


}