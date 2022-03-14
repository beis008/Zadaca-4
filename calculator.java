package OOP;

    public class Calculator {
        int numbA;
        int numbB;
        double pi = 3.14;
        double rad;
        int n;

        public Calculator(int numbA, int numbB, double pi, double rad) {
            this.numbA = numbA;
            this.numbB = numbB;
            this.rad = rad;
            this.n = n;

        }
        public double getNumbA() {
            return numbA;
        }
        public void setNumbA(int numbA) {
            this.numbA = numbA;
        }
        public double getNumbB() {
            return numbB;
        }
        public void setNumbB(int numbB) {
            this.numbB = numbB;
        }
        public void setRad(double rad) {
            this.rad = rad;
        }
        public double getRad() {
            return rad;
        }
        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }
        int addition() {
            return this.numbA + this.numbB;
        }
        int subtraction() {
            return this.numbA - this.numbB;
        }
        double multiplication() {
            return this.numbA * this.numbB;
        }
        double division() {
            return this.numbA / this.numbB;
        }
        double circleSurface(){
            return this.rad * this.rad * this.pi;
        }
    }
}
