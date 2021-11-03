Scanner sc = new Scanner(System.in);
        float a, b,c;
System.out.println("Podaj 1 bok");
    a = sc.nextFloat();
    System.out.println("Podaj 2 bok");
    b = sc.nextFloat();
    System.out.println("Podaj 3 bok");
    c = sc.nextFloat();
    if (a >= b && a >= c){
        if (b+c > a){
            System.out.println("Można utworzyć z nich trójkąt");
            if(c*c+b*b == a*a){
                System.out.println("Jest on prostokątny");
            }else{
                System.out.println("Nie jest on prostokątny");
            }

        }else{
            System.out.println("Nie można z nich utworzyć trójkąta");
        }
    }else if (b >= a && b >= c){
        if (a+c > b){
            System.out.println("Można utworzyć z nich trójkąt");
            if(a*a+c*c == b*b){
                System.out.println("Jest on prostokątny");
            }else{
                System.out.println("Nie jest on prostokątny");
            }

        }else{
            System.out.println("Nie można z nich utworzyć trójkąta");
        }
    }else{
        if (a+b > c){
            System.out.println("Można utworzyć z nich trójkąt");
            if(a*a+b*b == c*c){
                System.out.println("Jest on prostokątny");
            }else{
                System.out.println("Nie jest on prostokątny");
            }
        }else{
            System.out.println("Nie można z nich utworzyć trójkąta");
        }
    }
