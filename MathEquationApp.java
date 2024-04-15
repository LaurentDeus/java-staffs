class MathEquationApp {

    public static void main(String[] args) {

        MathEquation addEq = new MathEquation();

        addEq.setLeftVal(10);
        addEq.setRightVal(20);
        addEq.setOpcode('+');
        System.out.println();
        System.out.println(addEq.execute());

    }

}