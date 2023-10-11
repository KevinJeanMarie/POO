import sys

import math

 

class POINT2D:

    def __init__(self, x=0, y=0):

        self.x = x

        self.y = y

 

    def distance(self, other):

        return math.sqrt((self.x - other.x)**2 + (self.y - other.y)**2)

 

    def __str__(self):

        return f"({self.x}, {self.y})"

 

class POINT3D(POINT2D):

    def __init__(self, x=0, y=0, z=0):

        super().__init__(x, y)

        self.z = z

 

    def distance(self, other):

        return math.sqrt((self.x - other.x)**2 + (self.y - other.y)**2 + (self.z - other.z)**2)

 

    def __str__(self):

        return f"({self.x}, {self.y}, {self.z})"

 

if __name__ == "__main__":

    if len(sys.argv) == 5 or len(sys.argv) == 7:

        x1, y1, x2, y2 = map(float, sys.argv[1:5])

        if len(sys.argv) == 5:

            p1 = POINT2D(x1, y1)

            p2 = POINT2D(x2, y2)

            print(f"Distance between {p1} and {p2} is: {p1.distance(p2)}")

        else:

            z1, z2 = map(float, sys.argv[5:7])

            p1 = POINT3D(x1, y1, z1)

            p2 = POINT3D(x2, y2, z2)

            print(f"Distance between {p1} and {p2} is: {p1.distance(p2)}")

    else:

        print("Please provide the coordinates of the points as command line arguments or via the console.")