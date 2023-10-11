public class PointAndFacette {

    static class POINT2D {

        protected double x, y;

        public POINT2D(double x, double y) {

            this.x = x;

            this.y = y;

        }

        public double distance(POINT2D other) {

            return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));

        }

        @Override

        public String toString() {

            return "(" + x + ", " + y + ")";

        }

    }

    static class POINT3D extends POINT2D {

        private double z;

        public POINT3D(double x, double y, double z) {

            super(x, y);

            this.z = z;

        }

        public double distance(POINT3D other) {

            return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2) + Math.pow(z - other.z, 2));

        }

        @Override

        public String toString() {

            return "(" + x + ", " + y + ", " + z + ")";

        }

    }

    static class VECTEUR2D {

        private POINT2D start, end;

        public VECTEUR2D(POINT2D start, POINT2D end) {

            this.start = start;

            this.end = end;

        }

        @Override

        public String toString() {

            return "Start: " + start + ", End: " + end;

        }

    }

    static class VECTEUR3D {

        private POINT3D start, end;

        public VECTEUR3D(POINT3D start, POINT3D end) {

            this.start = start;

            this.end = end;

        }

        @Override

        public String toString() {

            return "Start: " + start + ", End: " + end;

        }

    }

    static class FACETTE {

        private VECTEUR3D v1, v2, v3;

        private String color;
    }

    public static void main(String[] args) {

        POINT2D point2D = new POINT2D(1.0, 2.0);
        POINT3D point3D = new POINT3D(1.0, 2.0, 3.0);

        VECTEUR2D vecteur2D = new VECTEUR2D(point2D, new POINT2D(3.0, 4.0));
        VECTEUR3D vecteur3D = new VECTEUR3D(point3D, new POINT3D(3.0, 4.0, 5.0));

        System.out.println("Point 2D: " + point2D);
        System.out.println("Point 3D: " + point3D);

        System.out.println("Vecteur 2D: " + vecteur2D);
        System.out.println("Vecteur 3D: " + vecteur3D);

    }
}
