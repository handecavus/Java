package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood{
    void marinade(){
        System.out.println("Et dünden özel baharatlarla terbiye edildi");
    }
    void grill(){
        System.out.println("Kömür ateşinde yavaş pişirildi");
    }
    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 75;
    }
}
