public enum Days {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    public int dayIndex;

    Days(int i) {
        this.dayIndex = i;
    }

    public int getDay(){
        return this.dayIndex;
    }

    public void getDayName(){

        switch (this.dayIndex){
            case 1:
                System.out.println("PAZARTESI");
                break;
            case 2:
                System.out.println("SALI");
                break;
            case 3:
                System.out.println("CARSAMBA");
                break;
            case 4:
                System.out.println("PERSEMBE");
                break;
            case 5:
                System.out.println("CUMA");
                break;
            case 6:
                System.out.println("CUMARTESI");
                break;
            case 7:
                System.out.println("PAZAR");
                break;
        }
    }
}
