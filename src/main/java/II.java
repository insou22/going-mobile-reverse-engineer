public class II
{
    public byte Z;
    public byte aa;
    public int ab;
    public short ac;
    public short ad;
    public byte ae;
    public byte af;
    public int ag;
    public int ah;
    public byte ai;
    public short aj;
    public short ak;
    public byte al;
    public byte am;
    public byte an;
    public boolean ao;
    public byte ap;
    
    public final byte u() {
        return (byte)((this.ab >> 8) / HH.D);
    }
    
    public final void a(final byte al) {
        this.al = al;
        final boolean b = false;
        this.ak = (short)(b ? 1 : 0);
        this.aj = (short)(b ? 1 : 0);
    }
    
    public final void v() {
        if (this.ag < 0) {
            this.ag += HH.E << 8;
            --this.aa;
            if (this.aa < 0) {
                this.aa = 0;
                this.ag = 0;
            }
        }
        else if (this.ag > HH.E << 8) {
            this.ag -= HH.E << 8;
            ++this.aa;
        }
    }
}
