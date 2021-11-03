Scanner sc = new Scanner(System.in);
        float a, b,c;
System.out.println("Podaj 1 liczbę: ");
    a = sc.nextFloat();
    System.out.println("Podaj 2 liczbę: ");
    b = sc.nextFloat();
    System.out.println("Podaj 3 liczbę: ");
    c = sc.nextFloat();
    if(a>b&&a>c){
        System.out.println("Największa jest liczba: "+a);
    }else if (b>a&& b>c) {
        System.out.println("Największa jest liczba: " + b);
    }else if (c>a&& c>b) {
        System.out.println("Największa jest liczba: "+c);
    }
