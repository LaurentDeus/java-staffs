//Todo
/**
 * encapsulate data
 * handle div by 0
 * unknownopcode exception
 * mutators,accessors and constructors
 **/

class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opcode;// a,s,d,m,r

    public MathEquation(double lv, double rv, char opcode) {
        this.leftVal = lv;
        this.rightVal = rv;
        this.opcode = opcode;

    }

    public double getLeftVal() {
        return this.leftVal;
    }

    public double getRightVal() {
        return this.rightVal;
    }

    public char getOpcode() {
        return this.opcode;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setOpcode(char opcode) {
        this.opcode = opcode;
    }

    public double execute() {

        switch (opcode) {

            case 'a':
                return leftVal + rightVal;

            case 's':
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