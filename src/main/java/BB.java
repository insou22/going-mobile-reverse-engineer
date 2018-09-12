import javax.microedition.lcdui.*;
import java.io.*;

public final class BB extends II
{
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[][] c;
    public static final short[] d;
    public static final short[] e;
    public static final short[] f;
    public static final byte[][] g;
    public static final int[] h;
    public static final byte[] i;
    private HH aq;
    public static byte j;
    public static byte k;
    public static short l;
    public static short m;
    public static short n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public byte s;
    public byte t;
    public byte u;
    public byte v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int A;
    public int B;
    public byte C;
    public byte D;
    public byte E;
    public byte F;
    public boolean G;
    public short H;
    private boolean ar;
    public static byte[][][] I;
    public static byte[][] J;
    public static byte[][] K;
    public byte L;
    public short[] M;
    public short[] N;
    public byte O;
    public byte[] P;
    public int Q;
    public byte R;
    public short[] S;
    public short[] T;
    public byte[] U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    
    public BB(final HH aq) {
        this.aq = aq;
        BB.j = HH.D;
        BB.k = HH.E;
        BB.l = HH.F;
        BB.n = 1536;
        this.s = -1;
        this.u = -2;
        this.C = -1;
        this.D = 0;
        this.G = false;
        this.t = 0;
        this.H = 0;
        this.ar = false;
        this.M = new short[8];
        this.N = new short[8];
        this.P = new byte[8];
        this.T = new short[8];
        this.S = new short[8];
        this.U = new byte[8];
        super.ac = 0;
        super.ad = 0;
        super.ap = 0;
        super.ao = true;
        super.ai = 20;
        BB.m = (short)(BB.k >> 1 << 8);
    }
    
    public final void a() {
        if (BB.I == null) {
            BB.I = new byte[1][15][4];
        }
        if (BB.J == null) {
            BB.J = new byte[1][15];
        }
        if (BB.K == null) {
            BB.K = new byte[1][15];
        }
        this.a("/player.bin");
    }
    
    public final short b() {
        return (short)(super.ab >> 8);
    }
    
    public final short c() {
        return (short)(super.aa * BB.k + (super.ag >> 8));
    }
    
    public final byte d() {
        return (byte)(((super.ab >> 8) + 8) / BB.j);
    }
    
    public final byte e() {
        return (byte)(((super.ab >> 8) - 8) / BB.j);
    }
    
    public final short a(final boolean b) {
        byte b2 = (byte)(17 * BB.k);
        byte b3 = (byte)(4 * BB.k / 44);
        if (b) {
            b3 = (byte)(18 * BB.k / 44);
        }
        if (super.ag > b3 << 8) {
            if ((DD.e[this.d()] & 1 << super.aa + 2) > 0 || (DD.e[this.e()] & 1 << super.aa + 2) > 0) {
                b2 = (byte)((super.aa + 1) * BB.k);
            }
        }
        else if ((DD.e[this.d()] & 1 << super.aa + 1) > 0 || (DD.e[this.e()] & 1 << super.aa + 1) > 0) {
            b2 = (byte)(super.aa * BB.k);
        }
        final short n = (short)this.aq.D(b2, this.aq.C());
        final short b4 = this.aq.B();
        this.G = false;
        if (b4 < n) {
            this.G = true;
            return b4;
        }
        return n;
    }
    
    public final boolean f() {
        final int n2;
        final int n = (n2 = super.ab >> 8) / BB.j;
        final byte b;
        if ((b = (byte)(n2 % BB.j)) < 10) {
            if (this.aq.T.f[n - 1][super.aa + 1] != 19) {
                return false;
            }
        }
        else if (b > BB.j - 10 && this.aq.T.f[n + 1][super.aa + 1] != 19) {
            return false;
        }
        return this.aq.T.f[n][super.aa + 1] == 19;
    }
    
    public final boolean g() {
        return !this.aq.T.b(this.u() - 1, super.aa + 1) && ((super.ab >> 8) - 8) % BB.j < 8;
    }
    
    public final boolean h() {
        return !this.aq.T.b(this.u() + 1, super.aa + 1) && ((super.ab >> 8) + 8) % BB.j > BB.j - 8;
    }
    
    public final void i() {
        if (this.aq.cu == -1) {
            this.a((byte)2);
            this.aq.cu = (super.ao ? -4 : -3);
            super.ac = 3584;
            super.ad = 0;
            this.s = 0;
            this.aq.B(0, -1);
            return;
        }
        super.ab += this.V;
        super.ag += this.W;
        this.v();
        if (this.c() + HH.I > this.X) {
            this.a((byte)3);
            super.ad = 0;
            final HH aq = this.aq;
            final HH aq2 = this.aq;
            final boolean b = false;
            aq2.cu = (b ? 1 : 0);
            aq.cv = (b ? 1 : 0);
        }
    }
    
    public final void j() {
        if (this.u == 0) {
            final short a = this.a(true);
            super.ac -= 128;
            super.ag -= super.ac;
            this.v();
            if (this.c() >= a) {
                super.aa = (byte)(a / BB.k);
                super.ag = (short)(a % BB.k);
            }
            this.y += this.A;
            this.z += this.B;
            if (this.z < this.x || (this.a(this.y - this.w) < 1280 && this.a(this.z - this.x) < 1280)) {
                if (this.F == 97) {
                    this.u = 1;
                }
                else {
                    this.u = 3;
                    if (this.s == -1) {
                        super.ac = (short)(1320 * BB.k / 44);
                        this.u = 2;
                    }
                }
                int n = 9 * BB.j / 44;
                if (!super.ao) {
                    n = -n;
                }
                final byte b = (byte)(6 * BB.k / 44);
                final int n2 = (super.ab >> 8) + n << 8;
                final int n3 = super.aa * BB.k + (super.ag >> 8) + b << 8;
                this.A = (this.w - n2) / 10;
                this.B = (this.x - n3) / 10;
            }
        }
        else if (this.u == 1) {
            super.aj = 1;
            super.ab += this.A;
            super.ag += this.B;
            this.v();
            super.ac = 0;
            if (this.c() << 8 < this.x || (this.a((this.b() << 8) - this.w) < 1280 && this.a((this.c() << 8) - this.x) < 1280)) {
                this.a((byte)3);
                this.u = -2;
                this.v = 0;
                HH.y = false;
                final HH aq = this.aq;
                final HH aq2 = this.aq;
                final boolean b2 = false;
                aq2.cu = (b2 ? 1 : 0);
                aq.cv = (b2 ? 1 : 0);
            }
        }
        else if (this.u == 2) {
            super.aj = 1;
            super.ac -= 128;
            super.ag -= super.ac;
            this.v();
            if (super.ac < 0) {
                this.u = 3;
            }
        }
        else if (this.u == 3) {
            final int n4 = (this.x >> 8) - this.c();
            final int n5 = (this.w >> 8) - this.b();
            final int n6 = (BB.j + (BB.j >> 1)) * (BB.j + (BB.j >> 1)) + (BB.k + (BB.k >> 1)) * (BB.k + (BB.k >> 1));
            this.u = 5;
            super.ad = 0;
            super.ac = 0;
            if (n5 * n5 + n4 * n4 > n6) {
                super.ad = (short)(n5 << 4);
                super.ac = (short)(n4 << 4);
                this.u = 4;
            }
        }
        else if (this.u == 4) {
            final int n7 = (this.x >> 8) - this.c();
            final int n8 = (this.w >> 8) - this.b();
            if (n8 * n8 + n7 * n7 > (BB.j + (BB.j >> 1)) * (BB.j + (BB.j >> 1)) + (BB.k + (BB.k >> 1)) * (BB.k + (BB.k >> 1))) {
                super.ab += super.ad;
                super.ag += super.ac;
                this.v();
                return;
            }
            this.u = 5;
            super.ac = 0;
            super.ad = 0;
        }
        else if (this.u == 5) {
            super.aj = 1;
            int n9 = 0;
            int n10 = 0;
            final int n11 = this.c() - (this.x >> 8) + 6 * BB.k / 44;
            final int n12;
            int n13;
            if ((n12 = (super.ao ? ((this.w >> 8) - (this.b() + 9)) : (this.b() - 9 - (this.w >> 8)))) == 0) {
                n13 = 2000;
            }
            else {
                n13 = (n11 << 8) / n12;
            }
            if (n13 < -1945 || n13 > 1945) {
                n9 = 2880;
                n10 = 0;
            }
            else if (n13 > 616) {
                n9 = 2781;
                n10 = 447;
            }
            else if (n13 > 333) {
                n9 = 2494;
                n10 = 864;
            }
            else if (n13 > -10) {
                n9 = 2036;
                n10 = 1222;
            }
            else if (n13 > -334) {
                n9 = 2036;
                n10 = -1222;
            }
            else if (n13 > -617) {
                n9 = 2494;
                n10 = -864;
            }
            else if (n13 > -1946) {
                n9 = 2781;
                n10 = -447;
            }
            if (super.ao) {
                super.ab += n9;
            }
            else {
                super.ab -= n9;
            }
            super.ag += n10;
            super.ac = 447;
            this.v();
            if (n13 < 0 && n13 > -150) {
                this.a((byte)2);
                super.am = 0;
                this.u = -1;
                this.v = 15;
                final HH aq3 = this.aq;
                final HH aq4 = this.aq;
                final boolean b3 = false;
                aq4.cu = (b3 ? 1 : 0);
                aq3.cv = (b3 ? 1 : 0);
            }
        }
    }
    
    public final void k() {
        this.a((byte)2);
        this.s = 0;
        super.ap = 0;
    }
    
    public final void l() {
        this.aq.d = true;
        if (super.ac <= -BB.m) {
            super.ac = (short)(-BB.m);
        }
        if (super.al == 10 && super.am == 2) {
            this.aq.w();
            if (this.aq.cR) {
                this.aq.cR = false;
            }
            ++HH.dl;
            return;
        }
        if (super.al == 10) {
            final HH aq = this.aq;
            final HH aq2 = this.aq;
            final boolean b = false;
            aq2.cu = (b ? 1 : 0);
            aq.cv = (b ? 1 : 0);
            final HH aq3 = this.aq;
            aq3.cw &= 0xFFFFFF7F;
            return;
        }
        if (super.ai <= 0 && super.al != 10) {
            this.aq.a.c(0);
            super.ai = 0;
            super.am = 1;
            this.a((byte)10);
            ++HH.dl;
            return;
        }
        if (this.u >= 0) {
            this.j();
            this.t();
            return;
        }
        if (super.al == 6) {
            this.i();
            this.t();
            this.m();
            return;
        }
        if (super.al == 11) {
            final HH aq4 = this.aq;
            final HH aq5 = this.aq;
            final boolean b2 = false;
            aq5.cu = (b2 ? 1 : 0);
            aq4.cv = (b2 ? 1 : 0);
            super.ad = 0;
            this.D = 1;
            this.q();
        }
        else if (super.al == 9) {
            if (++super.an > 6) {
                if (this.s == -1) {
                    this.a((byte)0);
                }
                else {
                    super.ad = 0;
                    super.ac = 0;
                    this.a((byte)3);
                    this.s = 0;
                }
            }
            else {
                this.aq.cu = 0;
            }
        }
        if (this.aq.cu == -4 || this.aq.cv == -4 || (super.al == 8 && super.ao)) {
            if (super.al == 4) {
                this.aq.cu = 0;
            }
            if (!super.ao || super.al != 1) {
                if (this.s == 2) {
                    BB.n = 768;
                }
                else if (super.al == 8) {
                    BB.n = 384;
                }
                else if (this.s > -1) {
                    BB.n = 1536;
                }
                else {
                    this.a((byte)1);
                    BB.n = 1536;
                    super.am = 0;
                }
                super.ad = BB.n;
                super.ao = true;
            }
        }
        else if (this.aq.cu == -3 || this.aq.cv == -3 || (super.al == 8 && !super.ao)) {
            if (super.al == 4) {
                this.aq.cu = 0;
            }
            if (super.ao || super.al != 1) {
                if (this.s == 2) {
                    BB.n = 768;
                }
                else if (super.al == 8) {
                    BB.n = 384;
                }
                else if (this.s > -1) {
                    BB.n = 1536;
                }
                else {
                    this.a((byte)1);
                    BB.n = 1536;
                    super.am = 0;
                }
                super.ad = (short)(-BB.n);
                super.ao = false;
            }
        }
        else if (this.aq.cu == 0) {
            if (this.s == 2) {
                super.ad = (short)(super.ao ? 768 : -768);
            }
            else if (this.s >= 0) {
                if (super.ad > 0) {
                    super.ad -= 196;
                }
                else if (super.ad < 0) {
                    super.ad += 196;
                }
                if (super.ad <= 196 && super.ad >= -196) {
                    super.ad = 0;
                }
            }
            else {
                super.ad = 0;
            }
            if (super.al == 1) {
                this.a((byte)0);
            }
        }
        if (this.aq.cu == -1) {
            if (this.s == -1) {
                super.ac = 3584;
                ++this.s;
            }
            else if (this.s == 0) {
                if (HH.x) {
                    super.ac = 3584;
                }
                else {
                    super.ac = 3072;
                    super.am = 1;
                    this.a((byte)13);
                }
                ++this.s;
            }
            this.aq.B(0, -1);
        }
        if (super.al == 4 && this.s >= 0) {
            if (super.ak > 2) {
                this.a((byte)2);
            }
            super.am = 0;
            return;
        }
        if (super.ad != 0) {
            super.ae = (super.ao ? this.d() : this.e());
            if (super.ag < BB.n) {
                super.af = super.aa;
            }
            else {
                super.af = (byte)(super.aa + 1);
            }
            if (super.ae >= 0 && super.ae <= 27 && this.aq.T.b(super.ae, super.af) && (super.aa < 17 || (super.aa == 17 && super.ag == 0))) {
                final int ab = super.ab;
                super.ab += super.ad;
                super.ae = (super.ao ? this.d() : this.e());
                if (this.aq.G() != -1) {
                    super.ab -= super.ad * 3 / 2;
                    if (!this.aq.T.b((super.ab >> 8) / BB.j, super.af)) {
                        super.ab = ab;
                    }
                }
                else if (this.aq.D()) {
                    super.ab -= super.ad;
                }
                else if (!this.aq.T.b(super.ae, super.af)) {
                    super.ab -= super.ad;
                }
            }
            else {
                super.ad = 0;
                if (super.ao) {
                    if (this.d() == super.ae) {
                        super.ab = super.ae * BB.j - 8 - 1 << 8;
                    }
                }
                else if (this.e() == super.ae) {
                    super.ab = super.ae * BB.j + BB.j + 8 + 1 << 8;
                }
            }
            if (super.ae >= 27) {
                this.ar = true;
            }
            if (super.ae == 0) {
                this.ar = true;
            }
        }
        if (this.C >= 0 && super.al != 11) {
            this.s();
        }
        final short a;
        if ((a = this.a(false)) - this.c() > BB.k >> 1) {
            this.G = false;
        }
        if (this.Y && !this.G) {
            this.Y = false;
            if (this.s == -1) {
                super.ag = 0;
            }
        }
        if (this.G && this.s == -1) {
            this.Y = this.G;
            super.aa = (byte)(a / BB.k);
            super.ag = (short)(a % BB.k << 8);
            super.ab += this.H << 8;
            super.ac = 0;
            if (!this.aq.T.b(this.e(), super.aa)) {
                super.ab = this.b() + 1 << 8;
            }
            else if (!this.aq.T.b(this.d(), super.aa)) {
                super.ab = this.b() - 1 << 8;
            }
        }
        else {
            if ((this.s >= 0 || this.c() < a) && super.ap == 0) {
                if (this.s == 2) {
                    super.ac = -768;
                }
                else {
                    super.ac -= 384;
                }
                super.ag -= super.ac;
                if (super.ac > 0 && (!this.aq.T.b(this.d(), super.aa) || !this.aq.T.b(this.e(), super.aa))) {
                    super.ag += super.ac;
                    super.ac = 0;
                }
                if (super.ag < 0) {
                    super.ag += BB.k << 8;
                    --super.aa;
                    if (super.aa < 0) {
                        super.aa = 0;
                        super.ag = 0;
                    }
                    if (super.aa == 0) {
                        this.ar = true;
                    }
                }
                else if (super.ag > BB.k << 8) {
                    super.ag -= BB.k << 8;
                    ++super.aa;
                }
                if (this.s == -1) {
                    this.s = 0;
                }
                if (super.al != 11 && super.al != 14) {
                    if (this.s == 0) {
                        this.a((byte)2);
                    }
                    if (this.aq.cu == -3 || !super.ao) {
                        super.ao = false;
                    }
                    else if (this.aq.cu == -4 || super.ao) {
                        super.ao = true;
                    }
                    if (super.ac <= 0 && this.s == 1 && !HH.x && super.al == 12) {
                        this.s = 2;
                    }
                    else if (super.ac <= -1024 && this.s != 2) {
                        this.a((byte)3);
                    }
                }
            }
            if (super.ap == 0) {
                if (super.al != 11 && super.ac < 0 && super.al != 10) {
                    for (byte b3 = 0; b3 < HH.aZ; ++b3) {
                        if (this.aq.ag[b3].al != 2 && this.aq.k(b3) && this.aq.ag[b3].b() > this.c()) {
                            this.a((byte)3);
                            if (this.b() > this.aq.ag[b3].c()) {
                                this.aq.ag[b3].x = -10;
                                if (this.aq.T.b((super.ab >> 8) / BB.j + 1, super.aa + 1) && this.aq.T.b((super.ab >> 8) / BB.j, super.aa + 1)) {
                                    super.ac = 0;
                                    super.ad = 0;
                                    this.s = 0;
                                    if (this.aq.T.b((super.ab >> 8) / BB.j + 1, super.aa)) {
                                        super.ab += 510;
                                    }
                                    if (!this.aq.T.b((super.ab >> 8) / BB.j + 1, super.aa)) {
                                        super.ab -= 510;
                                    }
                                }
                                else {
                                    this.s = -1;
                                }
                            }
                            else {
                                this.aq.ag[b3].x = 10;
                                if (this.aq.T.b((super.ab >> 8) / BB.j - 1, super.aa + 1) && this.aq.T.b((super.ab >> 8) / BB.j, super.aa + 1)) {
                                    super.ac = 0;
                                    super.ad = 0;
                                    this.s = 0;
                                    if (this.aq.T.b((super.ab >> 8) / BB.j - 1, super.aa)) {
                                        super.ab -= 510;
                                    }
                                    if (!this.aq.T.b((super.ab >> 8) / BB.j - 1, super.aa)) {
                                        super.ab += 510;
                                    }
                                }
                                else {
                                    this.s = -1;
                                }
                            }
                        }
                    }
                }
                if (this.c() >= a && super.ac < 0) {
                    super.aa = (byte)(a / BB.k);
                    super.ag = (short)(a % BB.k << 8);
                    this.ar = true;
                    super.ac = 0;
                    this.s = -1;
                    if (super.al == 3 || super.al == 2 || (super.al >= 11 && super.al <= 14)) {
                        if (this.s == 2) {
                            this.s = 1;
                        }
                        this.a((byte)4);
                        super.am = 1;
                    }
                }
            }
        }
        if (super.al == 10) {
            return;
        }
        this.t();
        if (this.t == 0) {
            final int n = super.ab >> 8;
            if (this.s >= 0 && super.ac < 0) {
                for (int i = 3; i >= 0; --i) {
                    final boolean ao;
                    final int n2;
                    if (this.aq.bb[i] != -1 && (((ao = (this.aq.bd[i] - this.aq.bb[i] > 0)) && n > this.aq.bb[i] && n < this.aq.bd[i]) || (!ao && n < this.aq.bb[i] && n > this.aq.bd[i])) && this.a((n2 = this.aq.bg[i] * n / this.aq.bf[i] + this.aq.bh[i]) - (this.c() + (HH.I >> 1) << 8)) < -super.ac) {
                        final int n3 = n2 - (HH.I << 8);
                        super.aa = (byte)((n3 >> 8) / BB.k);
                        super.ag = (short)((n3 >> 8) % BB.k << 8);
                        this.s = -1;
                        this.a((byte)6);
                        final boolean b4 = false;
                        super.ac = (short)(b4 ? 1 : 0);
                        super.ad = (short)(b4 ? 1 : 0);
                        super.ao = ao;
                        final int n4 = (this.a(this.aq.bd[i] - this.aq.bb[i]) << 8) / 2304;
                        this.V = (this.aq.bf[i] << 8) / n4;
                        this.W = this.aq.bg[i] / n4;
                        this.X = this.aq.be[i];
                        break;
                    }
                }
            }
        }
        else {
            --this.t;
        }
        this.m();
    }
    
    public final void m() {
        final byte u = this.u();
        final byte b = (byte)((this.c() + HH.I) / BB.k);
        if (this.v > 0) {
            HH.y = true;
            if (--this.v <= 0) {
                this.u = -2;
                this.v = 0;
                HH.y = false;
            }
        }
        final short a = this.aq.T.a(u, b);
        HH.z = false;
        if (a >= 56 && a <= 61) {
            this.u = -1;
            this.v = 10;
        }
        else if (a == 26) {
            super.ac = 3584;
            this.s = 0;
            this.aq.Z = 1;
            super.am = 1;
            this.a((byte)2);
            this.aq.e(super.ab, this.c() << 8, 30);
            if (!HH.e) {
                super.ai -= 4;
            }
            this.u = -2;
            this.v = 0;
            HH.y = false;
        }
        else if (a == -125) {
            HH.z = true;
            HH.B = false;
            HH.A = -1;
        }
        else {
            final byte ac;
            byte b2 = (byte)((ac = (byte)(b - 1)) + 2);
            while (b2 >= ac) {
                final short a2;
                if ((a2 = this.aq.T.a(u, b2)) == 99 || a2 == 100) {
                    this.aq.af = this.aq.V;
                    this.aq.ab = u;
                    this.aq.ac = ac;
                    if (u < 1) {
                        this.aq.ad = 0;
                    }
                    else {
                        this.aq.ad = (short)(-BB.j * (u - 1));
                    }
                    if (ac < 6) {
                        this.aq.ae = 0;
                        break;
                    }
                    this.aq.ae = (short)(-BB.k * (ac - 5));
                    break;
                }
                else if (a2 >= 77 && a2 <= 96 && this.aq.h(a2 - 77)) {
                    this.aq.cB = true;
                    this.aq.cH = HH.cy[a2 - 77];
                    this.aq.r(HH.cz[a2 - 77]);
                    this.aq.g(a2 - 77);
                    if (HH.cz[a2 - 77] == 112 && (this.aq.bv & 0x2) == 0x0) {
                        this.aq.dB = 248;
                        HH.dx = 16;
                        return;
                    }
                    this.aq.dB = 233 + (a2 - 77);
                    HH.dx = (byte)(a2 - 77);
                    return;
                }
                else if (a2 >= -118 && a2 <= -99 && this.aq.h(a2 + 118 + 20)) {
                    if (a2 + 118 == 18 && (this.O & 0x20) == 0x0) {
                        return;
                    }
                    if (a2 + 118 == 19 && (this.aq.h(4) || this.aq.h(5) || this.aq.h(6) || this.aq.h(7) || this.aq.h(9) || this.aq.h(10))) {
                        return;
                    }
                    this.aq.cB = true;
                    this.aq.cH = HH.cy[a2 + 118 + 20];
                    this.aq.r(HH.cz[a2 + 118 + 20]);
                    this.aq.g(a2 + 118 + 20);
                    return;
                }
                else {
                    if (a2 == -94 && !this.aq.h(11) && this.aq.h(30)) {
                        this.aq.cB = true;
                        this.aq.cH = HH.cy[30];
                        this.aq.r(HH.cz[30]);
                        this.aq.g(30);
                        return;
                    }
                    --b2;
                }
            }
        }
        if (super.aa >= 17 && this.aq.cS) {
            this.aq.cR = true;
            this.a((byte)10);
            super.am = 1;
            return;
        }
        if (this.ar) {
            this.ar = false;
            if (this.d() == 0 && !super.ao) {
                this.aq.j(2);
                return;
            }
            if (this.e() >= 27 && super.ao) {
                this.aq.j(5);
                return;
            }
            if (super.aa >= 17 && super.ac <= 0) {
                this.aq.j(6);
                return;
            }
            if (super.aa == 0 && super.ag < 1280) {
                this.aq.j(1);
            }
        }
    }
    
    public final void n() {
        if (super.am == 2) {
            return;
        }
        if (super.al == 14) {
            super.ac = 0;
        }
        ++super.ak;
        if (super.ak > BB.K[super.Z][super.al]) {
            super.ak = 0;
            ++super.aj;
            if (super.aj >= BB.J[super.Z][super.al]) {
                if (super.am == 0) {
                    super.aj = 0;
                }
                else {
                    --super.aj;
                    super.am = 2;
                    this.r();
                }
            }
            this.aq.d = true;
        }
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3) {
        this.a(graphics, n, n2, n3, 0);
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        HH.v = (short)n2;
        HH.w = (short)n3;
        final int n5 = (super.ab >> 8) - (HH.H >> 1) + HH.v;
        int n6 = super.aa * BB.k + (super.ag >> 8) + HH.w + HH.J;
        if (super.al == 6) {
            n6 += BB.k >> 1;
        }
        if (this.u >= 0) {
            byte b = (byte)(26 * BB.j / 44);
            if (!super.ao) {
                b = (byte)(BB.j - b);
            }
            final byte b2 = (byte)(10 * BB.k / 44);
            int n7 = n5 + b - 9 << 8;
            int n8 = n6 + b2 - 9 << 8;
            final int n9 = this.y + (HH.v << 8);
            final int n10 = this.z + (HH.w << 8);
            if (this.u == 0) {
                n8 += 2304;
            }
            int n11;
            if (super.ao) {
                n11 = n9 - 1216;
            }
            else {
                n11 = n9 - 2432;
            }
            final int n12 = (n11 - n7) / 19;
            final int n13 = (n10 - n8) / 19;
            for (int i = 0; i < 20; ++i) {
                final int n14 = n8;
                final int n15 = n7 >> 8;
                final int n16 = n14 >> 8;
                if (n15 < 240 && n16 < 320 && n15 + 19 >= 0 && n16 + 19 >= 0) {
                    this.aq.b(graphics, n15, n16 + n4, 19, 19);
                    graphics.drawImage(HH.aK, n15, n16 - 114 - 0 + n4, 0);
                }
                n7 += n12;
                n8 += n13;
            }
            final int n17 = n7 - n12 >> 8;
            final int n18 = (n8 - n13 >> 8) - 9;
            if (n17 < 240 && n18 < 320 && n17 + 19 >= 0 && n18 + 19 >= 0) {
                this.aq.b(graphics, n17, n18 + n4, 19, 19);
                if (super.ao) {
                    graphics.drawImage(HH.aK, n17, n18 - 95 - 0 + n4, 20);
                }
                else {
                    EE.b.drawImage(HH.aK, n17, n18 - 95 - 0 + n4, 20, 8192);
                }
            }
        }
        if (n6 + HH.I > BB.l && n6 < 320 && this.E % 2 == 0) {
            final byte[] array = BB.c[BB.I[super.Z][super.al][super.aj]];
            if (n5 + (array[4] & 0xFF) < 240 && n6 - 0 + (array[5] & 0xFF) < 320 && n5 + (array[4] & 0xFF) + (array[2] & 0xFF) >= 0 && n6 - 0 + (array[5] & 0xFF) + (array[3] & 0xFF) >= 0) {
                this.aq.b(graphics, n5 + (array[4] & 0xFF), n6 + (array[5] & 0xFF) + n4, array[2] & 0xFF, (array[3] & 0xFF) - 0);
                if (super.ap == 0 && super.ao) {
                    graphics.drawImage(HH.aG, n5 + (array[4] & 0xFF) - (array[0] & 0xFF), n6 - 0 + (array[5] & 0xFF) - (array[1] & 0xFF) + n4, 20);
                }
                else {
                    this.aq.a(graphics, n5 + (array[4] & 0xFF) - (HH.aG.getWidth() - (array[0] & 0xFF) - (array[2] & 0xFF)), n6 + (array[5] & 0xFF) - (array[1] & 0xFF) + n4, 0);
                }
            }
        }
        if (this.L == 0) {
            return;
        }
        final byte b3 = BB.a[BB.I[super.Z][super.al][super.aj]];
        int n19 = BB.b[BB.I[super.Z][super.al][super.aj]];
        if (super.al == 6) {
            n19 += BB.k >> 1;
        }
        if (b3 == 44 || n19 == 44) {
            return;
        }
        final int width = HH.aH.getWidth();
        int n20;
        if (super.ao) {
            n20 = (super.ab >> 8) + HH.v + b3;
        }
        else {
            n20 = (super.ab >> 8) + HH.v - b3 - width;
        }
        final int n21 = super.aa * BB.k + (super.ag >> 8) + HH.w + HH.J + n19;
        final byte b4 = (byte)(this.L - 1);
        this.aq.b(graphics, n20, n21 + n4, width, 25);
        if (super.ao) {
            graphics.drawImage(HH.aH, n20, n21 - b4 * 25 - 0 + n4, 20);
            return;
        }
        EE.b.drawImage(HH.aH, n20, n21 - b4 * 25 - 0 + n4, 20, 8192);
    }
    
    public final void o() {
        if (super.ao) {
            int d = this.d();
            if ((super.ab >> 8) % BB.j > BB.j >> 1) {
                ++d;
            }
            for (int i = d; i < d + 3; ++i) {
                for (byte aa = super.aa; aa >= super.aa - 3; --aa) {
                    final short a;
                    if (i >= 0 && aa >= 0 && ((a = this.aq.T.a(i, aa)) == 97 || a == 98)) {
                        this.aq.a(i, aa, a);
                    }
                }
            }
        }
        else {
            int e = this.e();
            if ((super.ab >> 8) % BB.j < BB.j >> 1) {
                --e;
            }
            for (int j = e; j > e - 3; --j) {
                for (byte aa2 = super.aa; aa2 >= super.aa - 3; --aa2) {
                    final short a2;
                    if (j >= 0 && aa2 >= 0 && ((a2 = this.aq.T.a(j, aa2)) == 97 || a2 == 98)) {
                        this.aq.a(j, aa2, a2);
                    }
                }
            }
        }
    }
    
    public final void p() {
        final byte b = this.P[this.L];
        if (super.al != 6 && super.al != 7 && super.al != 12 && super.al != 13) {
            this.a((byte)7);
            super.am = 0;
        }
        if (this.M[this.L] <= 0) {
            return;
        }
        if (this.aq.a.i) {
            this.aq.a.c(2);
        }
        switch (this.L) {
            case 0: {}
            case 1: {
                this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048, 0 + b);
            }
            case 2: {
                this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048, 3 + b);
            }
            case 3: {
                this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048, 6 + b);
            }
            case 4: {
                this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048, 9 + b);
                if (this.M[this.L] > 0 && b == 2) {
                    this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048, 9 + b);
                    return;
                }
                break;
            }
            case 5: {
                this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048 + this.M[this.L] % 2 * 1024, 12 + b);
            }
            case 6: {
                this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048, 15 + b);
            }
            case 7: {
                this.aq.e(super.ab + (super.ao ? 4608 : -4608), (this.c() << 8) + 2048, 18 + b);
                break;
            }
        }
    }
    
    public final void q() {
        if (super.al >= 4 && super.al != 11) {
            return;
        }
        this.aq.m(-1);
        if (super.al != 11) {
            super.am = 1;
            this.a((byte)8);
        }
        for (int i = 2; i >= 0; --i) {
            if (this.aq.bE[i] != -1) {
                final int n = this.aq.bE[i] * BB.j + (BB.j - 19 >> 1);
                final byte b = (byte)(this.aq.bF[i] * BB.k);
                if (this.a(n - this.b()) <= 3 * BB.j >> 1) {
                    if (this.a(b - this.c()) <= BB.k) {
                        if (this.aq.a(n, b, 19, 19, (super.ab >> 8) + (super.ao ? BB.o[this.D] : (-BB.o[this.D] - BB.q[this.D])), this.c() + BB.p[this.D], BB.q[this.D], BB.r[this.D])) {
                            int a = this.aq.T.a(this.aq.bE[i], this.aq.bF[i]);
                            a -= 36;
                            if (a == 2 && (this.aq.bv & 1 << a) > 0) {
                                this.aq.cB = true;
                                this.aq.dh = 32;
                                final HH aq = this.aq;
                                aq.cK |= 0x20;
                                this.aq.cH = HH.cy[33];
                                this.aq.r(HH.cz[33]);
                                this.aq.dB = 256;
                                HH.dx = 15;
                            }
                            final HH aq2 = this.aq;
                            aq2.bv &= (byte)~(1 << a);
                            if (a == 0) {
                                this.aq.e(this.aq.X, this.aq.V);
                            }
                        }
                    }
                }
            }
        }
        for (short n2 = (short)(HH.aZ - 1); n2 >= 0; --n2) {
            final byte z;
            if ((z = this.aq.ag[n2].Z) != -1) {
                if (this.aq.ag[n2].al != 5) {
                    final short n3 = (short)(this.aq.ag[n2].c() - FF.a[z]);
                    final short n4 = (short)(this.aq.ag[n2].b() + FF.b[z]);
                    final byte b2 = FF.c[z];
                    final byte b3 = FF.d[z];
                    if (this.a(n3 - this.b()) <= 3 * BB.j >> 1) {
                        if (this.a(n4 - this.c()) <= BB.k) {
                            if (this.aq.a(n3, n4, b2, b3, (super.ab >> 8) + (super.ao ? BB.o[this.D] : (-BB.o[this.D] - BB.q[this.D])), this.c() + BB.p[this.D], BB.q[this.D], BB.r[this.D])) {
                                if (!this.aq.ag[n2].H || super.al != 11) {
                                    if (super.al == 11) {
                                        this.aq.ag[n2].H = true;
                                    }
                                    if (super.al == 11) {
                                        final FF f = this.aq.ag[n2];
                                        f.ai -= BB.i[this.P[1]];
                                    }
                                    else {
                                        final FF f2 = this.aq.ag[n2];
                                        f2.ai -= BB.i[this.P[0]];
                                    }
                                    if (this.aq.ag[n2].al != 2) {
                                        if (this.aq.ag[n2].ab > super.ab) {
                                            this.aq.ag[n2].x = 10;
                                        }
                                        else {
                                            this.aq.ag[n2].x = -10;
                                        }
                                    }
                                    if (this.aq.ag[n2].ai <= 0) {
                                        short v = this.aq.V;
                                        if (this.aq.cU) {
                                            v = 0;
                                        }
                                        final int n5 = n2 + v * 10 >> 5;
                                        final int[] bu = this.aq.bu;
                                        final int n6 = n5;
                                        bu[n6] &= ~(1 << n2 + v * 10 - (n5 << 5));
                                        this.aq.ag[n2].a((byte)5);
                                        this.aq.ag[n2].am = 1;
                                        if (z != 4) {
                                            ++HH.dn;
                                            if (this.aq.Y) {
                                                final HH aq3 = this.aq;
                                                if (++aq3.Z > 10) {
                                                    this.aq.Z = 10;
                                                }
                                            }
                                            if (this.aq.X != 0) {
                                                for (byte b4 = 0; b4 < FF.k[this.aq.ag[n2].w]; ++b4) {
                                                    this.aq.c(this.aq.ag[n2].c(), this.aq.ag[n2].b(), 0);
                                                }
                                            }
                                        }
                                    }
                                    else if (this.aq.ag[n2].al != 2) {
                                        this.aq.ag[n2].a((byte)4);
                                        this.aq.ag[n2].an = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.s == -1) {
            this.aq.cu = 0;
        }
    }
    
    public final void r() {
        this.D = 0;
        if (super.al == 7 || super.al == 8 || super.al == 9 || super.al == 0 || super.al == 4) {
            this.a(super.am = 0);
            return;
        }
        if (super.al == 13) {
            super.am = 0;
            this.a((byte)12);
            return;
        }
        if (super.al == 14) {
            super.am = 0;
            this.a((byte)11);
        }
    }
    
    public final void s() {
        final byte c = (byte)(this.C + 1);
        this.C = c;
        if (c > 15) {
            this.C = -1;
            this.D = 0;
        }
    }
    
    public final void t() {
        final short n = (short)(this.c() + 7 + 37);
        for (int i = 11; i >= 0; --i) {
            final byte b = this.aq.cj[i];
            final int n2 = this.aq.cf[i];
            final short n3 = this.aq.ch[i];
            if (b != -1) {
                if (super.ai != 20 || b != 2) {
                    final int n4 = BB.j * 5 << 7;
                    if (n3 == 0) {
                        if (this.a(n2 - super.ab) > n4) {
                            continue;
                        }
                        if (this.a((this.aq.cg[i] >> 8) - n) > HH.I) {
                            continue;
                        }
                    }
                    short n5;
                    if (n2 > super.ab) {
                        n5 = (short)(n3 - 256);
                    }
                    else {
                        n5 = (short)(n3 + 256);
                    }
                    int n6;
                    if ((n6 = n2 + n5) >= BB.j * 27 + (BB.j >> 1) << 8) {
                        n6 = BB.j * 27 + (BB.j >> 1) << 8;
                    }
                    final int a;
                    if ((a = this.a(n6 - super.ab)) <= BB.j << 6) {
                        if (b <= 1) {
                            final HH aq = this.aq;
                            aq.aW += 10 * this.aq.Z;
                            HH.dp += 10 * this.aq.Z;
                            if (this.aq.aW > 999999) {
                                this.aq.aW = 999999;
                            }
                        }
                        else if (b == 2) {
                            super.ai += 4;
                            if (super.ai > 20) {
                                super.ai = 20;
                            }
                        }
                        else {
                            this.b(1);
                        }
                        this.aq.cj[i] = -1;
                        return;
                    }
                    final int n7 = this.aq.cg[i] - (this.c() + (BB.k >> 1) << 8);
                    if (a != 0) {
                        final int[] cg = this.aq.cg;
                        final int n8 = i;
                        cg[n8] += n7 * n5 * ((n5 >= 0) ? -1 : 1) / a;
                    }
                    this.aq.cf[i] = n6;
                    this.aq.ch[i] = n5;
                }
            }
        }
    }
    
    private void b(final int n) {
        int n2 = 1;
        short n3 = 9999;
        for (int i = 1; i < 8; ++i) {
            if (i != 6 && (this.O & 1 << i) > 0 && this.M[i] < n3 && this.M[i] != BB.d[i * 3 + this.P[i]]) {
                n3 = this.M[i];
                n2 = i;
            }
        }
        final short[] m = this.M;
        final int n4 = n2;
        m[n4] += (short)(n * BB.f[n2]);
        if (this.M[n2] > BB.d[n2 * 3 + this.P[n2]]) {
            this.M[n2] = BB.d[n2 * 3 + this.P[n2]];
        }
    }
    
    private void a(final String s) {
        final byte[] array = new byte[4];
        try {
            final InputStream resourceAsStream = array.getClass().getResourceAsStream(s);
            for (int i = 0; i < 15; ++i) {
                final byte b = (byte)resourceAsStream.read();
                final byte b2 = (byte)resourceAsStream.read();
                BB.J[0][i] = b;
                BB.K[0][i] = b2;
                this.a(resourceAsStream, array, b);
                System.arraycopy(array, 0, BB.I[0][i], 0, b);
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
        a = new byte[] { -2, -2, -2, 2, 0, -1, 1, -1, -2, 0, 0, -1, 0, 44, 44, 44, 44, 44, 44, -2, -3, 0, 0, 0, 44, 44, 44, 44 };
        b = new byte[] { 15, 13, 13, 12, 13, 14, 15, 7, 7, 12, 17, 20, 12, 44, 44, 44, 44, 44, 44, 14, 15, 12, 13, 13, 44, 44, 44, 44 };
        c = new byte[][] { { 0, 0, 20, 35, 11, 9 }, { 0, 119, 20, 36, 11, 8 }, { 20, 119, 20, 36, 11, 8 }, { 20, 0, 25, 35, 8, 9 }, { 0, -101, 30, 31, 5, 8 }, { 108, 0, 27, 37, 7, 7 }, { 57, 120, 23, 34, 9, 10 }, { 0, 79, 20, 40, 10, 1 }, { 30, -101, 25, 31, 9, 4 }, { -121, 0, 23, 39, 7, 5 }, { 68, -102, 23, 29, 10, 15 }, { 40, 119, 17, 36, 13, 8 }, { 91, 35, 20, 43, 10, 1 }, { 0, 35, 30, 44, 0, 0 }, { 111, 39, 44, 42, 0, 2 }, { 108, 121, 43, 28, 1, 16 }, { 125, 81, 24, 36, 8, 2 }, { 20, 79, 44, 40, 0, 0 }, { 64, 79, 36, 41, 7, 3 }, { 45, 0, 26, 35, 9, 9 }, { 80, 120, 28, 34, 7, 10 }, { 100, 81, 25, 40, 6, 3 }, { 30, 35, 31, 44, 1, 0 }, { 61, 35, 31, 44, 1, 0 }, { 91, -102, 24, 33, 11, 9 }, { 71, 0, 37, 35, 7, 9 }, { 115, -107, 41, 27, 2, 16 }, { 115, -80, 40, 11, 1, 33 } };
        d = new short[] { 0, 0, 0, 100, 150, 200, 35, 45, 60, 25, 30, 40, 40, 55, 70, 200, 250, 300, 1, 1, 1, 70, 90, 110 };
        e = new short[] { 0, 50, 20, 15, 20, 100, 1, 30 };
        f = new short[] { 0, 15, 7, 5, 8, 30, 1, 10 };
        g = new byte[][] { { 0, 4, 16, 20, 16, 5, 4, 5 }, { 0, 4, 16, 20, 16, 5, 4, 5 }, { 0, 4, 16, 20, 16, 5, 4, 5 } };
        h = new int[] { 50, 800, 2500, 18000, 0 };
        i = new byte[] { 3, 8, 8 };
        o = new byte[] { 14, -11 };
        p = new byte[] { 4, 17 };
        q = new byte[] { 10, 20 };
        r = new byte[] { 10, 50 };
    }
}
