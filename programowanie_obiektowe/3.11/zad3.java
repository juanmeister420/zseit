Scanner sc = new Scanner(System.in);
int d;
    System.out.println("Podaj liczbę odpowidająca dniu tygodnia");
    d = sc.nextInt();

        switch (d){
            case 1: System.out.println("Poniedziałek");break;
            case 2: System.out.println("Wtorek");break;
            case 3: System.out.println("środa");break;
            case 4: System.out.println("Czwartek");break;
            case 5: System.out.println("Piątek");break;
            case 6: System.out.println("Sobota");break;
            case 7: System.out.println("Niedziela");break;
            default: System.out.println("Nie jest to żaden dzień tygodnia");
        }
