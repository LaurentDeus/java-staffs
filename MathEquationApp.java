class MathEquationApp {

    public static void main(String[] args) {

        MathEquation addEq = new MathEquation(30, 20, 'd');

        System.out.println();
        System.out.println(addEq.getLeftVal());
        System.out.println(addEq.getRightVal());

        System.out.println(addEq.getOpcode());


    }

}