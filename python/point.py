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

 

class VECTEUR2D:

    def __init__(self, start: POINT2D, end: POINT2D):

        self.start = start

        self.end = end

 

    def __str__(self):

        return f"Start: {self.start}, End: {self.end}"

 

class VECTEUR3D:

    def __init__(self, start: POINT3D, end: POINT3D):

        self.start = start

        self.end = end

 

    def __str__(self):

        return f"Start: {self.start}, End: {self.end}"

 

class FACETTE:

    def __init__(self, v1: VECTEUR3D, v2: VECTEUR3D, v3: VECTEUR3D, color: str):

        self.v1 = v1

        self.v2 = v2

        self.v3 = v3

        self.color = color

 

    def __str__(self):

        return f"V1: {self.v1}, V2: {self.v2}, V3: {self.v3}, Color: {self.color}"

 

# Exemple d'utilisation

if __name__ == "__main__":

    p1 = POINT3D(0, 0, 0)

    p2 = POINT3D(1, 1, 1)

    p3 = POINT3D(2, 2, 2)

 

    v1 = VECTEUR3D(p1, p2)

    v2 = VECTEUR3D(p2, p3)

    v3 = VECTEUR3D(p3, p1)

 

    facette = FACETTE(v1, v2, v3, "#FFFFFF")

    print(facette)