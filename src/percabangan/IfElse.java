package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 50000;
        double uangDiDompet = 78000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang belanjaan anda tidak cukup, kurangi belanjaan anda");
        }else if(uangDiDompet>totalBelanja){
            double kembalian = uangDiDompet-totalBelanja;
            System.out.println("Uang anda cukup, kembalian : "+kembalian);
        }else{
            System.out.println("Uang anda PAS");
        }
    }
}
