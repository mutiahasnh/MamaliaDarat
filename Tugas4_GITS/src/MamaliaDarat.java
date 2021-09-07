public class MamaliaDarat {
    public static void main(String[] x){
        System.out.println("\n Demo Kelas Method dan Data");

        Kucing kucing1=new Kucing();
        System.out.println(kucing1.mengeong());

        kucing1.setWarna("Oren");
        System.out.println("warna kucing1="+kucing1.getWarna());

        Kucing kucing2=new Kucing();
        kucing2.setWarna("Putih");
        System.out.println("warna kucing2="+kucing2.getWarna());

        Anjing anjing1 = new Anjing();
        System.out.println(anjing1.gukguk());

        anjing1.setWarna("Coklat");
        System.out.println("Warna anjing1="+anjing1.getWarna());

        Anjing anjing2 = new Anjing();
        anjing2.setWarna("Hitam");
        System.out.println("Warna anjing2="+anjing2.getWarna());

    }
}

class Kucing{
    //attribut
    String warna;
    String buntut;
    int jumlahKaki;

    //method fungsi
    public String mengeong(){
        return "ngeong";
    }
    public String getWarna(){
        return this.warna;
    }
    //method prosedur
    public void setWarna(String w){
        this.warna=w;
    }
}

class Anjing {
    //attribut
    String warna;
    String buntut;
    int jumlahKaki;

    //method fungsi
    public String gukguk() {
        return "gukgukguk";
    }

    public String getWarna() {
        return this.warna;
    }

    //method prosedur
    public void setWarna(String w) {
        this.warna = w;

    }
}