package percabangan;

public class Switch {
    public static void main(String[] args) {
       char nilai='D';
       switch (nilai){
           case 'A':
               System.out.println("Mhs      : \"Terima kasih pak\"");
               System.out.println("Dosen    : \"Selamat ya !!\"");
               break;
           case 'B':
               System.out.println("Mhs      : \"Kenapa ulun kada dapat A, pak?\"");
               System.out.println("Dosen    : \"asdfghjkl\"");
               break;
           case 'C':
               System.out.println("Mhs      : \"Ulun turun tarus Pak, tugas menggawi tarus\"");
               System.out.println("Dosen    : \"Tapi bisa lah menjawab ujian chunnin?\"");
               System.out.println("Mhs      : \"55555555\"");
               break;
           default:
               System.out.println("Mhs      : \"Ulun turun tarus Pak, tugas menggawi tarus\"");
               System.out.println("Dosen    : \"Bujur jua kah?\"");
               System.out.println("Dosen    : \"*memeriksa berkas\"");
               System.out.println("Dosen    : \"*Menceleng\"");
               System.out.println("Mhs      : \"Kabur...\"");
               break;

        }
    }
}
