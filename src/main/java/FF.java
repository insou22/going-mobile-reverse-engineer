import javax.microedition.lcdui.*;
import java.io.*;

public final class FF extends II
{
    public static byte[] a;
    public static byte[] b;
    public static byte[] c;
    public static byte[] d;
    public static byte[] e;
    public static byte[] f;
    public static byte[] g;
    public static byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final short[] n;
    public static final byte[] o;
    public static byte[][][] p;
    public static byte[][] q;
    public static byte[][] r;
    public static byte s;
    public static byte t;
    public static short u;
    public boolean v;
    public byte w;
    private HH I;
    public byte x;
    public boolean y;
    public boolean z;
    public boolean A;
    public short B;
    public short C;
    public byte D;
    public byte E;
    public short F;
    public int G;
    public boolean H;
    
    public FF(final HH i) {
        this.I = i;
        FF.s = HH.D;
        FF.t = HH.E;
        FF.u = HH.F;
        super.Z = -1;
        super.ap = 0;
        this.F = 0;
        super.ao = true;
        this.v = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.C = 0;
    }
    
    public final void a() {
        if (FF.p == null) {
            FF.p = new byte[5][8][5];
        }
        if (FF.q == null) {
            FF.q = new byte[5][8];
        }
        if (FF.r == null) {
            FF.r = new byte[5][8];
        }
        if (FF.a == null) {
            FF.a = new byte[5];
        }
        if (FF.b == null) {
            FF.b = new byte[5];
        }
        if (FF.c == null) {
            FF.c = new byte[5];
        }
        if (FF.d == null) {
            FF.d = new byte[5];
        }
        if (FF.e == null) {
            FF.e = new byte[5];
        }
        if (FF.f == null) {
            FF.f = new byte[5];
        }
        if (FF.g == null) {
            FF.g = new byte[5];
        }
        if (FF.h == null) {
            FF.h = new byte[5];
        }
        this.b("/enemy.bin");
        this.a("/enemy_spr_box.bin");
    }
    
    public final short b() {
        return (short)(super.aa * FF.t + (super.ag >> 8) + FF.t - HH.I);
    }
    
    public final short c() {
        return (short)(super.ab >> 8);
    }
    
    public final byte d() {
        return (byte)(((super.ab >> 8) + 12) / FF.s);
    }
    
    public final byte e() {
        return (byte)(((super.ab >> 8) - 12) / FF.s);
    }
    
    public final int a(final boolean b) {
        final int n = (super.ab >> 8) / FF.s;
        final int width = HH.aI.getWidth();
        boolean b2 = false;
        if (b) {
            this.B = this.I.T.a(n, super.aa);
        }
        short n2;
        for (n2 = (short)(super.aa + 1); n2 < 18; ++n2) {
            if ((DD.e[n] & 1 << n2) > 0) {
                n2 *= FF.t;
                b2 = true;
                break;
            }
        }
        if (!b2) {
            n2 = (short)(18 * FF.t);
        }
        final int n3 = super.ab >> 8;
        for (int i = 0; i < 50; ++i) {
            if (this.I.bm[i] != -1 && this.I.bk[i] <= n3 + 8) {
                if (this.I.bk[i] + width >= n3 - 8) {
                    if (this.I.bl[i] < n2 && this.I.bl[i] > super.aa * FF.t) {
                        n2 = this.I.bl[i];
                    }
                }
            }
        }
        return n2;
    }
    
    public final boolean f() {
        final int width = HH.aI.getWidth();
        final int n = HH.aI.getHeight() >> 3;
        final byte s = FF.s;
        final byte t = FF.t;
        final int n2 = super.ab >> 8;
        final short n3 = (short)(this.b() + HH.I - FF.t);
        final byte b = (byte)(t - 1);
        for (int i = 49; i >= 0; --i) {
            if (this.I.bm[i] >= 0) {
                if (this.a(this.I.bk[i] - n2) <= s) {
                    if (this.I.bl[i] == n3) {
                        if (this.I.a(this.I.bk[i], this.I.bl[i], width, n, n2 - 8, n3, 16, b)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final void g() {
        final int n = this.a(true) / FF.t;
        this.A = false;
        this.y = false;
        this.z = false;
        if ((super.aa + 1 < n && super.Z != 3) || super.al == 2) {
            this.a((byte)2);
            super.ac += 256;
            super.ag += super.ac;
            this.v();
            if (super.aa + 1 == n && super.ac > 0) {
                this.a((byte)0);
                super.ac = 0;
                super.ag = 0;
            }
            if (this.I.a(this.c() - FF.a[super.Z], this.b() + FF.b[super.Z], FF.c[super.Z], FF.d[super.Z], this.I.ah.b() - 11, this.I.ah.c() + HH.J + 7, 18, 37)) {
                super.ad = 0;
                if (super.ac > 0) {
                    super.ac = (short)(-super.ac / 2);
                    if (this.I.ah.b() < this.c()) {
                        super.ad = 510;
                        super.ao = false;
                    }
                    else {
                        super.ad = -510;
                        super.ao = true;
                    }
                }
                else {
                    super.ac = (short)(-super.ac);
                }
            }
        }
        if (super.ad != 0) {
            super.ae = (super.ao ? this.d() : this.e());
            super.af = super.aa;
            final int ab = super.ab;
            super.ab += (super.ao ? (FF.s << 7) : (-(FF.s << 7)));
            final int n2 = this.a(false) / FF.t;
            this.z = false;
            if (n2 > n) {
                this.z = true;
            }
            if (this.x != 0 && this.z) {
                super.ad = 0;
            }
            super.ab = ab;
            if (super.ae > 0 && super.ae < 27 && this.I.T.b(super.ae, super.af)) {
                super.ab += super.ad;
                if (this.f()) {
                    super.ab -= super.ad;
                    if (super.al != 2) {
                        this.y = true;
                    }
                }
            }
            else {
                this.A = true;
            }
        }
    }
    
    public final void h() {
        if (super.al == 5) {
            if (super.am == 2) {
                super.Z = -1;
            }
            return;
        }
        if (super.al == 4 && this.x == 0) {
            if (++super.an > FF.m[super.Z]) {
                super.ad = 0;
                if (super.Z != 1) {
                    super.am = 2;
                }
                this.a((byte)0);
            }
            return;
        }
        if (super.al == 7 || super.al == 6) {
            return;
        }
        if (this.a(this.I.ah.b() - this.c()) > 240 || this.a(this.I.ah.c() - this.b()) > 320) {
            final boolean b = false;
            super.ac = (short)(b ? 1 : 0);
            super.ad = (short)(b ? 1 : 0);
            return;
        }
        if (super.Z == 3 && (this.a(this.I.ah.b() - this.c()) > 240 || this.a(this.I.ah.c() - this.b()) > 320)) {
            return;
        }
        this.g();
        if (this.x != 0 && super.Z != 3) {
            super.ad = (short)(this.x << 8);
            super.ac = 0;
            this.a((byte)4);
            if (this.x > 0) {
                --this.x;
                super.ao = true;
            }
            else {
                ++this.x;
                super.ao = false;
            }
            if (this.A) {
                super.ad = 0;
            }
            return;
        }
        this.H = false;
        final short n = (short)(this.I.ah.b() - this.c());
        final short n2 = (short)(this.I.ah.c() + FF.t - HH.I - this.b());
        final byte s = FF.s;
        final byte b2 = (byte)(FF.s * 3);
        if (super.Z == 0) {
            if (this.y) {
                super.ao = !super.ao;
                this.F = 10;
            }
            else if (this.A) {
                if (this.B == -96) {
                    super.ac = -510;
                    this.a((byte)2);
                    return;
                }
                super.ao = !super.ao;
                this.F = 10;
            }
            else if (this.z) {
                if (this.B == -97) {
                    super.ac = -768;
                    super.ad = (short)(FF.n[super.Z] << 2);
                    if (!super.ao) {
                        super.ad *= -1;
                    }
                    this.a((byte)2);
                    return;
                }
                if (this.B != -96) {
                    super.ao = !super.ao;
                    this.F = 10;
                }
            }
            if (super.al == 2) {
                return;
            }
            if (n < b2 && n > s && this.a(n2) < FF.t && this.F == 0) {
                if (super.al != 1) {
                    this.a((byte)1);
                }
                super.ad = FF.n[super.Z];
                super.ao = true;
            }
            else if (n < -s && n > -b2 && this.a(n2) < FF.t && this.F == 0) {
                if (super.al != 1) {
                    this.a((byte)1);
                }
                super.ad = (short)(-FF.n[super.Z]);
                super.ao = false;
            }
            else if (this.a(n) <= s && n2 == 0) {
                super.ad = 0;
                this.I.a(super.ab, this.b() + (FF.t >> 1) << 8, 21, super.ao, false, 0, this.w);
                super.Z = -1;
                short v = this.I.V;
                if (this.I.cU) {
                    v = 0;
                }
                final int n3 = this.D + v * 10 >> 5;
                final int[] bu = this.I.bu;
                final int n4 = n3;
                bu[n4] &= ~(1 << this.D + v * 10 - (n3 << 5));
            }
            else {
                this.j();
            }
            if (this.F != 0) {
                --this.F;
            }
        }
        else if (super.Z == 1 && super.al != 2) {
            if (this.B == -95) {
                if (n2 < 0 && this.a(n) > FF.s / 2) {
                    super.ac = -3584;
                    super.ad = 0;
                    this.a((byte)2);
                }
            }
            else if (this.y) {
                super.ao = !super.ao;
            }
            else if (this.A) {
                if (this.B == -96 && this.a(n) > FF.s / 2) {
                    super.ac = -1700;
                    this.a((byte)2);
                    return;
                }
                super.ao = !super.ao;
            }
            else if (this.z) {
                if (this.B == -97 && this.a(n) > FF.s / 2) {
                    super.ac = -3584;
                    super.ad = (short)(FF.n[super.Z] << 2);
                    if (!super.ao) {
                        super.ad *= -1;
                    }
                    this.a((byte)2);
                    return;
                }
                if (this.B != -96) {
                    super.ao = !super.ao;
                }
            }
            if (super.al == 2) {
                return;
            }
            if (this.a(n) <= s && this.a(n2) <= s && this.a(n2) < FF.t) {
                super.ad = 0;
                this.k();
                return;
            }
            this.j();
        }
        else if (super.Z == 2) {
            if (this.y) {
                super.ad = 0;
                super.am = 1;
                this.a((byte)0);
                super.ao = !super.ao;
            }
            else if (this.A) {
                super.ad = 0;
                super.am = 1;
                this.a((byte)0);
                super.ao = !super.ao;
            }
            else if (this.z) {
                super.ad = 0;
                super.am = 1;
                this.a((byte)0);
                super.ao = !super.ao;
            }
            final int n5 = this.a(this.G - super.ab) >> 8;
            if (this.E == 0) {
                if (((n > 0 && super.ao) || (n < 0 && !super.ao)) && this.a(n2) < FF.t && this.a(n) < FF.s * 3) {
                    super.ad = 0;
                    this.E = 1;
                    this.F = 0;
                    this.C = 0;
                    return;
                }
                if (((this.G > super.ab && !super.ao) || (this.G < super.ab && super.ao)) && n5 >= FF.s * 3) {
                    super.ad = 0;
                    super.am = 1;
                    this.a((byte)0);
                    super.ao = !super.ao;
                    return;
                }
                if (super.al != 0 || (super.am == 2 && super.al == 0)) {
                    this.j();
                }
            }
            else if (this.E == 1) {
                if (this.F < FF.l[this.w]) {
                    this.l();
                    return;
                }
                if (super.am == 2 && super.al == 0) {
                    this.E = 0;
                    return;
                }
                if (super.al != 0) {
                    super.am = 1;
                    this.a((byte)0);
                }
            }
        }
        else if (super.Z == 3) {
            if (this.E == 0) {
                if (this.F < FF.l[this.w]) {
                    this.l();
                }
                else {
                    this.F = 0;
                    this.E = 1;
                }
            }
            if (this.E == 1) {
                final short f = this.F;
                this.F = (short)(f + 1);
                if (f > 10) {
                    if (super.ao && !this.v) {
                        this.v = true;
                    }
                    else if (super.ao) {
                        final boolean b3 = false;
                        super.ao = b3;
                        this.v = b3;
                    }
                    else {
                        super.ao = true;
                    }
                    this.E = 0;
                    this.F = 0;
                }
            }
        }
        else if (super.Z == 4) {
            if (this.y) {
                super.ao = !super.ao;
            }
            else if (this.A) {
                super.ao = !super.ao;
            }
            else if (this.z) {
                super.ao = !super.ao;
            }
            this.j();
        }
    }
    
    public final void i() {
        if (super.am == 2) {
            return;
        }
        if (super.Z == -1) {
            final boolean b = false;
            super.ak = (short)(b ? 1 : 0);
            super.aj = (short)(b ? 1 : 0);
            return;
        }
        ++super.ak;
        if (super.ak > FF.r[super.Z][super.al]) {
            super.ak = 0;
            ++super.aj;
            if (super.aj >= FF.q[super.Z][super.al]) {
                if (super.am == 0) {
                    super.aj = 0;
                }
                else {
                    --super.aj;
                    super.am = 2;
                }
                if (super.al == 6 || super.al == 7) {
                    this.a((byte)0);
                }
                if (super.al == 3) {
                    this.a((byte)0);
                    if (super.Z == 1) {
                        super.ao = !super.ao;
                        this.F = 20;
                    }
                }
            }
            this.I.d = true;
        }
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        this.a(graphics, n, n2, n3, n4, 0);
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5) {
        HH.v = (short)n3;
        HH.w = (short)n4;
        final int n6 = this.c() + HH.v - (HH.H >> 1);
        final int n7 = this.b() + HH.w;
        if (n6 < -HH.H || n6 >= 240 || n7 < -HH.I || n7 >= 320) {
            return;
        }
        if ((n2 & 0x1) > 0 && n7 + HH.I > FF.u && n7 < 320) {
            this.I.b(graphics, n6, n7 + n5, HH.H, HH.I - 0);
            if (super.ap == 0 && super.ao) {
                int n8 = 0;
                if (this.v) {
                    n8 = HH.I << 1;
                }
                graphics.drawImage(HH.aF[super.Z], n6, n7 - FF.p[super.Z][super.al][super.aj] * HH.I - 0 - n8 + n5, 20);
                return;
            }
            this.I.c(graphics, n, n6, n7 + n5, 0);
        }
    }
    
    public final void j() {
        if (super.al != 1) {
            this.a((byte)1);
        }
        super.am = 0;
        super.ad = (short)(super.ao ? FF.n[super.Z] : (-FF.n[super.Z]));
    }
    
    public final void k() {
        if (super.al == 3) {
            return;
        }
        if (this.I.ah.al == 10) {
            return;
        }
        super.ao = false;
        if (this.I.ah.b() - this.c() > 0) {
            super.ao = true;
        }
        if (--this.C < 0) {
            this.C = FF.o[super.Z];
            if (this.I.X != 0) {
                this.a((byte)3);
            }
            if (this.I.ah.E > 0) {
                return;
            }
            if (this.I.a(this.I.ah.b() - 11, this.I.ah.c() + 7 + HH.J, 18, 37, this.c() + (super.ao ? FF.e[super.Z] : (-FF.e[super.Z] - FF.g[super.Z])), this.b() + FF.f[super.Z], FF.g[super.Z], FF.h[super.Z]) && this.I.X != 0) {
                if (!HH.e) {
                    final BB ah = this.I.ah;
                    ah.ai -= FF.j[this.w];
                }
                this.I.Z = 1;
                this.I.ah.a((byte)9);
                this.I.ah.an = 0;
                if (this.I.ah.s == 2) {
                    this.I.ah.s = 1;
                }
            }
        }
    }
    
    public final void l() {
        final short c = (short)(this.C - 1);
        this.C = c;
        if (c < 0) {
            this.a((byte)3);
            super.am = 1;
            if (this.w == 6 || this.w == 9 || this.w == 12 || this.w == 15 || this.w == 18 || this.w == 21) {
                this.I.a(super.ab, this.b() + (HH.I >> 1) << 8, 0, super.ao, this.v, super.ap, this.w);
            }
            else if (this.w == 7 || this.w == 10 || this.w == 13 || this.w == 16 || this.w == 19 || this.w == 22) {
                this.I.a(super.ab, this.b() + (HH.I >> 1) << 8, 6, super.ao, this.v, super.ap, this.w);
            }
            else if (this.w == 7 || this.w == 10 || this.w == 13) {
                this.I.a(super.ab, this.b() + (HH.I >> 1) << 8, 18, super.ao, this.v, super.ap, this.w);
            }
            else if (this.w == 17 || this.w == 20 || this.w == 23) {
                this.I.a(super.ab, this.b() + (HH.I >> 1) << 8, 3, super.ao, this.v, super.ap, this.w);
            }
            this.C = FF.o[super.Z];
            ++this.F;
        }
    }
    
    private void a(final InputStream inputStream, final byte[] array, final int n, final boolean b) {
        byte b2;
        if (b) {
            b2 = HH.H;
        }
        else {
            b2 = HH.I;
        }
        try {
            for (int i = 0; i < n; ++i) {
                array[i] = (byte)inputStream.read();
                array[i] = (byte)(array[i] * b2 / 44);
            }
        }
        catch (IOException ex) {}
    }
    
    public final void a(final String s) {
        final byte[] array = new byte[5];
        try {
            final InputStream resourceAsStream = array.getClass().getResourceAsStream(s);
            this.a(resourceAsStream, array, 5, true);
            System.arraycopy(array, 0, FF.a, 0, array.length);
            this.a(resourceAsStream, array, 5, false);
            System.arraycopy(array, 0, FF.b, 0, array.length);
            this.a(resourceAsStream, array, 5, true);
            System.arraycopy(array, 0, FF.c, 0, array.length);
            this.a(resourceAsStream, array, 5, false);
            System.arraycopy(array, 0, FF.d, 0, array.length);
            this.a(resourceAsStream, array, 5, true);
            System.arraycopy(array, 0, FF.e, 0, array.length);
            this.a(resourceAsStream, array, 5, false);
            System.arraycopy(array, 0, FF.f, 0, array.length);
            this.a(resourceAsStream, array, 5, true);
            System.arraycopy(array, 0, FF.g, 0, array.length);
            this.a(resourceAsStream, array, 5, false);
            System.arraycopy(array, 0, FF.h, 0, array.length);
            resourceAsStream.close();
        }
        catch (IOException ex) {}
    }
    
    private void b(final String s) {
        final byte[] array = new byte[5];
        try {
            final InputStream resourceAsStream = array.getClass().getResourceAsStream(s);
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 8; ++j) {
                    final byte b = (byte)resourceAsStream.read();
                    final byte b2 = (byte)resourceAsStream.read();
                    FF.q[i][j] = b;
                    FF.r[i][j] = b2;
                    this.a(resourceAsStream, array, b);
                    System.arraycopy(array, 0, FF.p[i][j], 0, b);
                }
            }
            resourceAsStream.close();
        }
        catch (IOException ex) {}
    }
    
    private void a(final InputStream inputStream, final byte[] array, final int n) {
        try {
            for (int i = 0; i < n; ++i) {
                array[i] = (byte)inputStream.read();
            }
        }
        catch (IOException ex) {}
    }
    
    public final int a(final int n) {
        if (n < 0) {
            return n * -1;
        }
        return n;
    }
    
    static {
        i = new byte[] { 6, 10, 16, 5, 8, 10, 5, 5, 5, 15, 15, 15, 22, 22, 22, 5, 5, 5, 5, 5, 5, 5, 5, 5, 3, 0, 0 };
        j = new byte[] { 1, 3, 4, 4, 5, 6, 1, 3, 1, 1, 3, 1, 1, 3, 1, 1, 3, 4, 2, 3, 4, 2, 3, 4, 0, 2, 4 };
        k = new byte[] { 1, 2, 3, 1, 2, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3, 0 };
        l = new byte[] { 0, 0, 0, 0, 0, 0, 3, 1, 1, 3, 1, 1, 3, 1, 1, 3, 1, 1, 3, 1, 1, 3, 1, 1 };
        m = new byte[] { 10, 10, 10, 10, 10 };
        n = new short[] { 1024, 512, 768, 0, 512 };
        o = new byte[] { 0, 20, 5, 5, 0 };
    }
}
