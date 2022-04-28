package druhypolrok.tyzden17;

public class OpakovanieIfElse {
    public static void main(String[] args) {
        naseIfElse(10);
    }
    public static void naseIfElse(int gay){
        int hodina = gay;
        if(hodina<15) {
            System.out.println("je" + hodina + "hodin"+"a je dopoludna");
        }else if(hodina<10) {
            System.out.println("je" + hodina + "Hodina"+"a je popoludnie");
        }else{
            System.out.println("je" + hodina + "hodina"+"a je noc");
        }
    }
}
