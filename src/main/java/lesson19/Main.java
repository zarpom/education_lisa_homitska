package lesson19;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        double [] solution = main.getSolutionForSqrtTask(2, -7, 6);
        System.out.println(solution[0] + " " + solution[1]);
        //2X^2 - 7X + 6 = 0
        //2.0 0.0
        

    }

    double [] getSolutionForSqrtTask(double a, double b, double c) {//погана назва методу
        double discr = getDiscr(a,b,c);
        double [] solution = new double[2];
        if (discr >= 1) {
            solution[0] = getFistRoot(a,b, discr);
            solution[1] = getSecondRoot(a,b, discr);
        } 
        return solution;
    }
    double getDiscr(double a, double b , double  c){
        return b * b - (4 * a * c);
    }
    double getFistRoot(double  a, double b, double discr){
        return (b * (-1) + Math.sqrt(discr)) / (2 * a);
    }
    double getSecondRoot(double  a, double b, double discr){
        return (b * (-1) - Math.sqrt(discr)) / (2 * a);
    }

}
