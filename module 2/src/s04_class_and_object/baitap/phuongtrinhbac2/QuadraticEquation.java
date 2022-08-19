package s04_class_and_object.baitap.phuongtrinhbac2;

public class QuadraticEquation {
        double a,b,c;
        public QuadraticEquation() {
        }
        public QuadraticEquation(double a,double b,double c){
            this.a = a;
            this.b =b;
            this.c=c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }
        public double getDiscrimiamant() {
            return b*b-4*a*c;
        }
        public  double getRoot1() {
            if(this.getDiscrimiamant()<0) return 0;
            return ((-b+Math.sqrt(this.getDiscrimiamant()))/(2*a));
        }

        public double getRoot2(){
            if(this.getDiscrimiamant()<0) return 0;
            return ((-b-Math.sqrt(this.getDiscrimiamant()))/(2*a));
        }
    }
