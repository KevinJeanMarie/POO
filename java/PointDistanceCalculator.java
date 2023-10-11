public class PointDistanceCalculator {

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

    public static void main(String[] args) {

        if (args.length == 4 || args.length == 6) {

            double x1 = Double.parseDouble(args[0]);

            double y1 = Double.parseDouble(args[1]);

            double x2 = Double.parseDouble(args[2]);

            double y2 = Double.parseDouble(args[3]);

            if (args.length == 4) {

                POINT2D p1 = new POINT2D(x1, y1);

                POINT2D p2 = new POINT2D(x2, y2);

                System.out.println("Distance between " + p1 + " and " + p2 + " is: " + p1.distance(p2));

            } else {

                double z1 = Double.parseDouble(args[4]);

                double z2 = Double.parseDouble(args[5]);

                POINT3D p1 = new POINT3D(x1, y1, z1);

                POINT3D p2 = new POINT3D(x2, y2, z2);

                System.out.println("Distance between " + p1 + " and " + p2 + " is: " + p1.distance(p2));

            }

        } else {

            System.out.println(
                    "Please provide the coordinates of the points as command line arguments or via the console.");

        }

    }

}