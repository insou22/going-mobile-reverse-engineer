import java.util.*;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public final class HH
{
    public ratchetandclank a;
    public byte b;
    public byte c;
    public boolean d;
    public static boolean e;
    public boolean f;
    public byte g;
    public byte h;
    public byte i;
    public byte j;
    public int k;
    public boolean l;
    public byte m;
    public byte n;
    public byte o;
    public boolean p;
    public byte q;
    public boolean r;
    public int s;
    public static short t;
    public static short u;
    public static int v;
    public static int w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public static byte A;
    public static boolean B;
    public static int C;
    public static byte D;
    public static byte E;
    public static byte F;
    public int G;
    public static byte H;
    public static byte I;
    public static byte J;
    public byte K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final byte[] R;
    public int S;
    public DD T;
    public Random U;
    public short V;
    public short W;
    public byte X;
    public boolean Y;
    public byte Z;
    public byte aa;
    public byte ab;
    public byte ac;
    public short ad;
    public short ae;
    public short af;
    public FF[] ag;
    public BB ah;
    public JJ[] ai;
    public JJ[] aj;
    public static Image ak;
    public static Image al;
    public static Image am;
    public static Image an;
    public static Image ao;
    public static Image ap;
    public static Image aq;
    public static Image ar;
    public static Image as;
    public static Image at;
    public static Image au;
    public static Image av;
    public static Image aw;
    public static Image ax;
    public static Image ay;
    public static Image az;
    public static Image aA;
    public static Image aB;
    public static Image aC;
    public static Image aD;
    public static Image aE;
    public static Image[] aF;
    public static Image aG;
    public static Image aH;
    public static Image aI;
    public static Image aJ;
    public static Image aK;
    public static Image aL;
    public static Image aM;
    public static Image aN;
    public static Image aO;
    public byte aP;
    public static final String[] aQ;
    public byte aR;
    public byte aS;
    public int aT;
    public byte aU;
    public byte aV;
    public int aW;
    public int aX;
    public int[] aY;
    public static byte aZ;
    public static byte ba;
    public short[] bb;
    public short[] bc;
    public short[] bd;
    public short[] be;
    public short[] bf;
    public int[] bg;
    public int[] bh;
    public short[] bi;
    public short[] bj;
    public short[] bk;
    public short[] bl;
    public byte[] bm;
    public short[] bn;
    public short[] bo;
    public short[] bp;
    public short[] bq;
    public boolean[] br;
    public boolean[] bs;
    public int[] bt;
    public int[] bu;
    public byte bv;
    public int bw;
    public int bx;
    public byte by;
    public int bz;
    public int bA;
    public byte[] bB;
    public byte[] bC;
    public byte[] bD;
    public byte[] bE;
    public byte[] bF;
    public byte[] bG;
    public byte[] bH;
    public int[] bI;
    public byte bJ;
    public byte bK;
    public byte bL;
    public static final byte[] bM;
    public static final byte[] bN;
    public byte bO;
    public byte bP;
    public static byte bQ;
    public static byte bR;
    public int bS;
    public int bT;
    public int bU;
    public int bV;
    public byte bW;
    public byte bX;
    public boolean bY;
    public byte bZ;
    public byte ca;
    public byte cb;
    public byte cc;
    public byte cd;
    public byte ce;
    public int[] cf;
    public int[] cg;
    public short[] ch;
    public short[] ci;
    public byte[] cj;
    public static final int[] ck;
    public short[] cl;
    public short[] cm;
    public short[] cn;
    public short[] co;
    public byte[] cp;
    public int cq;
    public long cr;
    public long cs;
    public byte ct;
    private byte ea;
    private byte eb;
    private byte ec;
    public int cu;
    public int cv;
    public int cw;
    public long cx;
    public static final byte[] cy;
    public static final short[] cz;
    public static final byte[] cA;
    public boolean cB;
    public boolean cC;
    public String cD;
    public int cE;
    public int cF;
    public int cG;
    public byte cH;
    public int cI;
    public int cJ;
    public int cK;
    public int cL;
    public int cM;
    public int cN;
    public short cO;
    public byte[] cP;
    public short[] cQ;
    public boolean cR;
    public boolean cS;
    public byte cT;
    public boolean cU;
    public boolean cV;
    public boolean cW;
    public byte cX;
    public boolean cY;
    public byte cZ;
    public byte da;
    public int[] db;
    public short[][] dc;
    public byte[][] dd;
    public final byte[] de;
    public final byte[] df;
    public final byte[][] dg;
    public int dh;
    public byte di;
    public static byte dj;
    public int dk;
    public static int dl;
    public static int dm;
    public static int dn;
    public static int doo;
    public static int dp;
    public static int dq;
    public static int dr;
    public static int ds;
    public static int dt;
    public static int du;
    public static long dv;
    public static final long[] dw;
    public static byte dx;
    public static int dy;
    public static int dz;
    public static byte dA;
    public int dB;
    public static int dC;
    public static int dD;
    public static boolean dE;
    public static boolean dF;
    public static boolean dG;
    public static boolean dH;
    public static int[] dI;
    public static int[] dJ;
    public static boolean[] dK;
    public static final short[][] dL;
    public static final byte[] dM;
    public static final byte[] dN;
    public static final byte[] dO;
    public static final byte[] dP;
    public static final byte[] dQ;
    public static final byte[] dR;
    private int[] ed;
    private int[] ee;
    public int dS;
    public int dT;
    public boolean dU;
    public long dV;
    public int dW;
    public boolean dX;
    public int dY;
    public boolean dZ;
    
    public final void a(final int n, final int n2) {
        for (int i = 0; i < 8; ++i) {
            if (this.bi[i] == -1) {
                this.bi[i] = (short)(n * HH.D + (HH.D >> 1));
                this.bj[i] = (short)(n2 * HH.E + (HH.E >> 1));
                return;
            }
        }
    }
    
    public final void a(final Graphics graphics) {
        graphics.setClip(0, (int)HH.F, 240, 320 - HH.F);
        for (int i = 0; i < 8; ++i) {
            if (this.bi[i] == -1) {
                return;
            }
            final int n = this.bi[i] + HH.v;
            final int n2 = this.bj[i] + HH.w;
            if (n < 240 && n2 < 320 && n + 22 >= 0 && n2 + 22 >= 0) {
                graphics.drawImage(HH.at, n, n2, 3);
            }
        }
    }
    
    public final void a(final Graphics graphics, int n, int n2, int n3, int n4) {
        if (n < 0) {
            n3 -= -n;
            n = 0;
        }
        if (n2 < 0) {
            n4 -= -n2;
            n2 = 0;
        }
        if (n + n3 > 240) {
            n3 = 240 - n;
        }
        if (n2 + n4 > 320) {
            n4 = 320 - n2;
        }
        graphics.setClip(n, n2, n3, n4);
    }
    
    public final void b(final Graphics graphics, int n, int f, int n2, int n3) {
        if (n < 0) {
            n2 -= -n;
            n = 0;
        }
        if (f < HH.F) {
            n3 -= HH.F - f;
            f = HH.F;
        }
        if (n + n2 > 240) {
            n2 = 240 - n;
        }
        if (f + n3 > 320) {
            n3 = 320 - f;
        }
        graphics.setClip(n, f, n2, n3);
    }
    
    public final void a() {
        final short b = this.ah.b();
        final short n = (short)(this.ah.c() + HH.J);
        final int n2 = HH.at.getWidth() >> 1;
        for (int i = 0; i < 8; ++i) {
            if (this.bi[i] == -1) {
                return;
            }
            if (this.a(b - 11, n + 7, 18, 37, this.bi[i] - n2 + 10, this.bj[i] - n2, (n2 << 1) - 20, n2 << 1)) {
                this.ah.ad = 0;
                this.ah.ac = (short)(-BB.n);
                this.ah.a((byte)3);
                this.ah.t = 10;
                this.ah.s = 0;
                return;
            }
        }
    }
    
    public final void b(final Graphics graphics) {
        if (this.bW == -1) {
            return;
        }
        final int n = this.bW * HH.D + HH.v + (HH.D - 19 >> 1);
        final int n2 = this.bX * HH.E + HH.w + (HH.E - 19 >> 1);
        if (n >= 240 || n + 19 < 0 || n2 >= 320 || n2 + 19 < 0) {
            return;
        }
        this.b(graphics, n, n2, 19, 19);
        graphics.drawImage(HH.aK, n, n2 - 475, 0);
    }
    
    public final void b() {
        if (this.bW == -1) {
            return;
        }
        if (this.a(this.ah.b() - 11, this.ah.c() + HH.J + 7, 18, 37, this.bW * HH.D, this.bX * HH.E, 19, 19)) {
            final byte b = -1;
            this.bX = b;
            this.bW = b;
            this.bY = false;
            this.cB = true;
            this.cH = HH.cy[34];
            this.r(HH.cz[34]);
        }
    }
    
    public final void c(final Graphics graphics) {
        if (this.cb == -1) {
            return;
        }
        final int width = HH.aw.getWidth();
        final int n = HH.aw.getHeight() / 2;
        final byte j = HH.J;
        final int n2 = this.cb * HH.D + HH.v;
        final int n3 = this.cc * HH.E + HH.w + j;
        if (n2 >= 240 || n2 + width < 0 || n3 >= 320 || n3 + n < 0) {
            return;
        }
        if (0 < n) {
            this.b(graphics, n2, n3, width, n - 0);
            graphics.drawImage(HH.aw, n2, n3 - this.cd * n - 0, 0);
        }
    }
    
    public final void c() {
        --this.ce;
        if (this.ce == 0) {
            this.ce = 36;
        }
        if (this.cd == 1) {
            if (this.ce % 18 == 0) {
                this.cd = 0;
            }
        }
        else if (this.ce % 36 == 0) {
            this.cd = 1;
        }
    }
    
    public final void d() {
        HH.doo = 10000;
        HH.dm = 0;
        HH.dl = 0;
        HH.dn = 0;
        HH.dt = 0;
        HH.dp = 0;
        HH.dq = 0;
        HH.du = 0;
        HH.dv = 0L;
        HH.dy = 0;
        HH.dA = 0;
        HH.dC = 0;
        HH.dD = 0;
        HH.dE = false;
        HH.dF = false;
        HH.dH = false;
        HH.dG = false;
        this.f();
    }
    
    public final int e() {
        int n = 0;
        for (int i = this.ag.length - 1; i >= 0; --i) {
            if (this.ag[i].Z != 4) {
                if (this.ag[i].Z != -1) {
                    ++n;
                }
            }
        }
        return n;
    }
    
    public final void b(final int n, final int n2) {
        HH.dI[n] = this.e();
    }
    
    public final void f() {
        for (int i = HH.dI.length - 1; i >= 0; --i) {
            HH.dK[i] = false;
            HH.dI[i] = 0;
            HH.dJ[i] = 0;
        }
    }
    
    public static final void a(final byte b) {
        switch (b) {
            case 0: {}
            case 1: {
                if (!HH.dH && HH.dC != 0 && HH.dC == HH.dD) {
                    HH.dE = true;
                }
                if (HH.dn == 0) {
                    HH.dF = true;
                }
                for (int i = HH.dI.length - 1; i >= 0; --i) {
                    if (HH.dI[i] > 0) {
                        HH.dm += HH.dI[i];
                    }
                }
                if (HH.dt == HH.dn && HH.dn > 0 && HH.dm == 0) {
                    HH.dG = true;
                }
                HH.doo = HH.dn * 100;
                HH.dy += HH.doo;
                HH.dr = HH.dp * 1;
                HH.ds = HH.dq * 1000;
                HH.dy += HH.dr;
                HH.dy += HH.ds;
                if (HH.dv < HH.dw[HH.dx]) {
                    HH.du = (int)((HH.dw[HH.dx] - HH.dv) / 1000L * 10L);
                }
                HH.dy += HH.du;
            }
            case 2: {
                if (HH.dF) {
                    HH.dy += 100000;
                }
                if (HH.dE) {
                    HH.dy += 100000;
                }
                if (HH.dG) {
                    HH.dy += 10000;
                    break;
                }
                break;
            }
        }
    }
    
    public HH(final ratchetandclank a) {
        this.i = 0;
        this.k = 240;
        this.S = 0;
        this.V = -1;
        this.W = -1;
        this.X = 1;
        this.Y = false;
        this.Z = 1;
        this.aa = -1;
        this.af = 0;
        this.bJ = 0;
        this.bK = 0;
        this.bL = 0;
        this.bY = true;
        this.eb = 0;
        this.ec = 0;
        this.cv = 0;
        this.cw = 0;
        this.cx = 0L;
        this.cB = false;
        this.cC = false;
        this.cE = -1;
        this.cF = -1;
        this.cH = 0;
        this.cP = new byte[] { 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 10, 12, 11, 13 };
        this.cQ = new short[] { 0, 2, 0, 1, 0, 2, 4, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0 };
        this.cR = false;
        this.cS = false;
        this.cU = false;
        this.cV = false;
        this.cW = false;
        this.cY = false;
        this.de = new byte[] { 2, 18, 4, 7, 5, 1, 13, 10, 9, 12, 6, 15, 11, 8, 16, 17 };
        this.df = new byte[] { 1, 1, 2, 1, 3, 8, 1, 2, 3, 3, 6, 2, 5, 2, 1, 2 };
        this.dg = new byte[][] { { 0 }, { 1 }, { 2, 3 }, { 4 }, { 5, 6, 7 }, { 8, 9, 10, 11, 12, 13, 14, 15 }, { 16 }, { 17, 18 }, { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32 }, { 33, 34, 35, 36, 37 }, { 38, 39 }, { 40 }, { 41, 42 } };
        this.dS = -1;
        this.dT = -1;
        this.dU = false;
        this.dV = 0L;
        this.dW = -1;
        this.dX = false;
        Display.getDisplay((MIDlet)(this.a = a));
    }
    
    public final void a(final int n) throws Exception {
        switch (n) {
            case 4: {
                try {
                    ratchetandclank.h = new AA("/f3.v", 13, 1);
                    ratchetandclank.g = ratchetandclank.h;
                    ratchetandclank.f = new AA("/f4.v", 17, 1);
                    ratchetandclank.e = ratchetandclank.g;
                }
                catch (IOException ex) {}
                this.a.b.d(2);
            }
            case 5: {
                this.U = new Random();
                HH.dj = 0;
                (HH.aF = new Image[5])[0] = Image.createImage("/en_disdro.png");
                this.a.b.d(2);
            }
            case 6: {
                HH.aF[1] = Image.createImage("/en_micbot.png");
                this.a.b.d(2);
            }
            case 7: {
                HH.aF[2] = Image.createImage("/en_patbot.png");
                this.a.b.d(2);
            }
            case 8: {
                HH.aF[3] = Image.createImage("/en_turret.png");
                this.a.b.d(2);
            }
            case 9: {
                HH.aF[4] = Image.createImage("/en_boar.png");
                this.a.b.d(2);
            }
            case 10: {
                HH.ak = Image.createImage("/arrows.png");
                HH.as = Image.createImage("/prtrts.png");
                this.a.b.d(2);
            }
            case 11: {
                HH.al = Image.createImage("/hud.png");
                HH.am = Image.createImage("/energy.png");
                this.a.b.d(2);
            }
            case 12: {
                HH.ap = Image.createImage("/wpnhud.png");
                this.a.b.d(2);
            }
            case 13: {
                HH.ao = Image.createImage("/menuhl.png");
                this.a.b.d(2);
            }
            case 14: {
                HH.an = Image.createImage("/diabox.png");
                this.a.b.d(2);
            }
            case 15: {
                HH.az = Image.createImage("/bltctr.png");
                this.a.b.d(2);
            }
            case 16: {
                HH.aD = Image.createImage("/icons.png");
                this.a.b.d(2);
            }
            case 17: {
                HH.aB = Image.createImage("/doors.png");
                this.a.b.d(2);
            }
            case 18: {
                HH.aL = Image.createImage("/explod.png");
                this.a.b.d(2);
            }
            case 19: {
                HH.aI = Image.createImage("/box.png");
                this.a.b.d(2);
            }
            case 20: {
                HH.aH = Image.createImage("/weapon.png");
                this.a.b.d(2);
            }
            case 21: {
                HH.aK = Image.createImage("/bolts.png");
                this.a.b.d(2);
            }
            case 22: {
                HH.aC = Image.createImage("/pltfrm.png");
                this.a.b.d(2);
            }
            case 23: {
                HH.aJ = Image.createImage("/strtpt.png");
                this.a.b.d(2);
            }
            case 24: {
                HH.aM = Image.createImage("/cnnbse.png");
                this.a.b.d(2);
            }
            case 25: {
                HH.aN = Image.createImage("/cnnprj.png");
                this.a.b.d(2);
            }
            case 26: {
                HH.aO = Image.createImage("/cnnbrl.png");
                this.a.b.d(2);
            }
            case 27: {
                HH.au = Image.createImage("/maxmil.png");
                this.a.b.d(2);
            }
            case 28: {
                HH.aq = Image.createImage("/mpicns.png");
                this.a.b.d(2);
            }
            case 29: {
                HH.ax = Image.createImage("/flmbot.png");
                this.a.b.d(2);
            }
            case 30: {
                this.a.b.d(2);
            }
            case 31: {
                HH.aA = Image.createImage("/wpnmnu.png");
                this.a.b.d(2);
            }
            case 32: {
                HH.at = Image.createImage("/spike.png");
                this.a.b.d(2);
            }
            case 33: {
                HH.av = Image.createImage("/payola.png");
                this.a.b.d(2);
            }
            case 34: {
                HH.aw = Image.createImage("/bncbot.png");
                this.a.b.d(2);
            }
            case 35: {
                HH.ar = Image.createImage("/menuhd.png");
                this.a.b.d(2);
            }
            case 36: {
                HH.aG = Image.createImage("/ratcht.png");
                this.a.b.d(2);
            }
            case 37: {
                HH.aE = Image.createImage(HH.aQ[3]);
                this.a.b.d(2);
            }
            case 38: {
                this.G = 0;
                while (this.G < 320 - HH.E * 2) {
                    this.G += HH.E;
                }
                this.G += 12;
                this.p = false;
                HH.dz = 0;
                HH.t = (short)(28 * -HH.D + 240);
                HH.u = (short)(18 * -HH.E + 320);
                if (13 > HH.F) {
                    HH.F = 19;
                }
                this.T = new DD(this);
                this.a.b.d(7);
            }
            case 39: {
                (this.ah = new BB(this)).a();
                this.a.b.d(5);
            }
            case 40: {
                this.ag = new FF[HH.aZ];
                for (byte b = (byte)(HH.aZ - 1); b >= 0; --b) {
                    this.ag[b] = new FF(this);
                }
                this.ag[0].a();
                this.a.b.d(5);
                this.ai = new JJ[10];
                for (int i = 9; i >= 0; --i) {
                    this.ai[i] = new JJ(this);
                }
                this.aj = new JJ[10];
                for (int j = 9; j >= 0; --j) {
                    this.aj[j] = new JJ(this);
                }
                this.a.b.d(2);
            }
            case 41: {
                this.bG = new byte[4];
                this.bH = new byte[4];
                this.bI = new int[5];
                this.bE = new byte[3];
                this.bF = new byte[3];
                this.bB = new byte[3];
                this.bC = new byte[3];
                this.bD = new byte[3];
                this.bb = new short[4];
                this.bc = new short[4];
                this.bd = new short[4];
                this.be = new short[4];
                this.bf = new short[4];
                this.bg = new int[4];
                this.bh = new int[4];
                this.bi = new short[8];
                this.bj = new short[8];
                this.bk = new short[50];
                this.bl = new short[50];
                this.bm = new byte[50];
                this.bn = new short[50];
                this.bo = new short[50];
                this.bt = new int[10];
                this.bp = new short[50];
                this.br = new boolean[50];
                this.bq = new short[50];
                this.bs = new boolean[6];
                this.bu = new int[2];
                this.cf = new int[12];
                this.cg = new int[12];
                this.cj = new byte[12];
                this.ch = new short[12];
                this.ci = new short[12];
                this.cl = new short[4];
                this.cm = new short[4];
                this.cn = new short[4];
                this.co = new short[4];
                this.cp = new byte[4];
                HH.dI = new int[12];
                HH.dJ = new int[12];
                HH.dK = new boolean[12];
                this.db = new int[13];
                this.dc = new short[62][3];
                this.dd = new byte[43][2];
                this.aY = new int[8];
                this.a.b.d(5);
            }
            case 42: {
                this.t();
                this.aP = 3;
                this.a.b.d(5);
                this.a.d.c();
                break;
            }
        }
    }
    
    public final void b(final int n) {
        if (this.l) {
            return;
        }
        if (this.S > 0) {
            return;
        }
        if (this.dV > 0L && System.currentTimeMillis() - this.dV < 1000L) {
            return;
        }
        int n2;
        if (n == 50) {
            n2 = -1;
        }
        else if (n == 56) {
            n2 = -2;
        }
        else if (n == 52) {
            n2 = -3;
        }
        else if (n == 54) {
            n2 = -4;
        }
        else if (n == 53) {
            n2 = -5;
        }
        else {
            n2 = n;
        }
        this.d = true;
        switch (this.b) {
            case 0:
            case 16:
            case 17:
            case 24: {
                this.A(n, n2);
            }
            case 4: {
                this.h(n, n2);
            }
            case 5: {
                this.i(n, n2);
            }
            case 6: {
                this.j(n, n2);
            }
            case 7: {
                this.z(n, n2);
            }
            case 8: {
                this.y(n, n2);
            }
            case 9: {
                this.w(n, n2);
            }
            case 10: {
                this.o(n, n2);
            }
            case 11: {
                this.k(n, n2);
            }
            case 3: {
                this.m(n, n2);
            }
            case 12: {
                this.l(n, n2);
            }
            case 13: {
                this.p(n, n2);
            }
            case 1: {
                this.t(n, n2);
            }
            case 2: {
                this.q(n, n2);
            }
            case 14: {
                this.s(n, n2);
            }
            case 15:
            case 19: {
                this.r(n, n2);
            }
            case 18: {
                this.n(n, n2);
            }
            case 21: {
                this.x(n, n2);
            }
            case 22: {
                this.v(n, n2);
            }
            case 23: {
                this.u(n, n2);
                break;
            }
        }
    }
    
    public final void c(int n) {
        if (this.l) {
            return;
        }
        if (this.S > 0) {
            return;
        }
        if (n == 50) {
            n = -1;
        }
        else if (n == 52 || n == 49) {
            n = -3;
        }
        else if (n == 54 || n == 51) {
            n = -4;
        }
        else if (n == 56) {
            n = -2;
        }
        this.B(n, n);
    }
    
    public final void d(final Graphics graphics) {
        ratchetandclank.f.a(ratchetandclank.n[7]);
        ratchetandclank.f.a(ratchetandclank.n[8]);
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        final int a = this.a.b.a(graphics, ratchetandclank.n[38]);
        ratchetandclank.e = ratchetandclank.h;
        this.a.b.a(graphics, ratchetandclank.n[42], HH.D + (HH.D >> 1), this.db[3] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[41], HH.D + (HH.D >> 1), this.db[2] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[3], HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[39], HH.D + (HH.D >> 1), this.db[0] = HH.ao.getHeight() / 2 + (a + ratchetandclank.h.a), 0, this.ct == 0), 0, this.ct == 1), 0, this.ct == 2), 0, this.ct == 3);
        this.a.b.a(graphics, 7, 8, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
        graphics.setColor(255, 255, 255);
        this.a(graphics, ratchetandclank.n[213 + this.m], this.G - 13, this.a.b.b(), 240 - this.a.b.b());
    }
    
    public final int g() {
        return HH.ap.getWidth();
    }
    
    public final int h() {
        return HH.ap.getHeight();
    }
    
    public final int i() {
        return HH.ap.getWidth() - 20;
    }
    
    public final int j() {
        return 240 - HH.ap.getWidth() >> 1;
    }
    
    public final int k() {
        return 3 * HH.aE.getHeight() / 16 - 8;
    }
    
    public final void e(final Graphics graphics) {
        graphics.drawImage(HH.ap, this.j(), this.k(), 0);
    }
    
    public final void f(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[27]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        this.db[0] = i;
        this.a.b.a(graphics, this.a.k ? ratchetandclank.n[28] : ratchetandclank.n[29], HH.D + (HH.D >> 1), i, 0, this.ct == 0);
        this.a.b.a(graphics, 7, 8, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
    }
    
    public final void g(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[283]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        this.db[0] = i;
        this.a.b.a(graphics, (byte)2, HH.D + (HH.D >> 1), this.db[2] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, (byte)1, HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, (byte)0, HH.D + (HH.D >> 1), i, 0, this.ct == 0), 0, this.ct == 1), 0, this.ct == 2);
        this.a.b.a(graphics, 7, 8, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
    }
    
    public final void h(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[47]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        if (this.ea != 7) {
            this.ah.L = (byte)(this.ea + 1);
        }
        this.ah.a(graphics, 0, 0, -20);
        graphics.setClip(0, 0, 240, 320);
        int n;
        if (this.ea == 7) {
            n = this.a.b.a(graphics, 57, this.ah.Q, HH.D + (HH.D >> 1), this.a.b.a(graphics, 56, this.aW, HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[295], HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[58], HH.D + (HH.D >> 1), i, 0, false), 0, true), 0, false), 0, false);
        }
        else if ((this.ah.O & 1 << this.ea + 1) != 0x0) {
            n = this.a.b.a(graphics, 57, this.aY[this.ea + 1], HH.D + (HH.D >> 1), this.a.b.a(graphics, 56, this.aW, HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[49 + this.ea], HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[58], HH.D + (HH.D >> 1), i, 0, false), 0, true), 0, false), 0, false);
        }
        else {
            n = this.a.b.a(graphics, 57, BB.h[this.ea], HH.D + (HH.D >> 1), this.a.b.a(graphics, 56, this.aW, HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[49 + this.ea], HH.D + (HH.D >> 1), i + ratchetandclank.e.a, 0, true), 0, false), 0, false);
        }
        final int n2 = n + HH.ao.getHeight();
        this.db[0] = n2;
        this.a.b.a(graphics, ratchetandclank.n[10], HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[11], HH.D + (HH.D >> 1), n2, 0, this.ct == 0), 0, this.ct == 1);
        ratchetandclank.e = ratchetandclank.g;
        this.a.b.a(graphics, HH.D + (HH.D >> 1), this.db[this.ct]);
        this.a.b.a(graphics, 7, 8, this);
    }
    
    public final void i(final Graphics graphics) {
        final int width = HH.aD.getWidth();
        final int n = HH.aD.getHeight() / 12;
        int n2 = (240 - 7 * width) / 2;
        final int i = this.a.b.i();
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.a.b.a(graphics, ratchetandclank.n[26]);
        ratchetandclank.e = ratchetandclank.h;
        final int n3 = i;
        this.e(graphics);
        int n4 = n3 + (n + 4);
        if (this.ct != 7) {
            this.ah.L = (byte)(this.ct + 1);
        }
        this.ah.a(graphics, 0, 0, -20);
        graphics.setClip(0, 0, 240, 320);
        if ((this.ct == 2 && this.h(3) && this.h(8)) || (this.ct == 3 && this.h(8))) {
            n4 += 15;
            ratchetandclank.e = ratchetandclank.g;
            graphics.setColor(12632256);
            final int a = this.a(graphics, ratchetandclank.n[49 + this.ct], 120, n4, 17, this.i());
            ratchetandclank.e = ratchetandclank.h;
            this.a(graphics, ratchetandclank.n[253], 120, this.a(graphics, this.a(ratchetandclank.n[56], new Object[] { new Integer(this.aW) }), 120, a, 17, this.i()), 17, this.i());
        }
        else if (this.ct == 7) {
            final int a2 = this.a.b.a(graphics, 57, this.ah.Q, HH.D + (HH.D >> 1), this.a.b.a(graphics, 56, this.aW, HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[295], HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[58], HH.D + (HH.D >> 1), n4, 0, false), 0, true), 0, false), 0, false);
            if (this.ah.Q <= 0) {
                this.a.b.a(graphics, ratchetandclank.n[257], HH.D + (HH.D >> 1), a2, 0, false);
            }
        }
        else if ((this.ah.O & 1 << this.ct + 1) > 0) {
            final int a3 = this.a.b.a(graphics, 57, this.aY[this.ct + 1], HH.D + (HH.D >> 1), this.a.b.a(graphics, 56, this.aW, HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[49 + this.ct], HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[58], HH.D + (HH.D >> 1), n4, 0, false), 0, true), 0, false), 0, false);
            if (this.ah.M[this.ct + 1] < BB.d[3 * (this.ct + 1) + this.ah.P[this.ct + 1]]) {
                this.a.b.a(graphics, this.a(ratchetandclank.n[255], new Object[] { new Integer(this.ah.M[this.ct + 1]), new Integer(BB.d[3 * (this.ct + 1) + this.ah.P[this.ct + 1]]) }), HH.D + (HH.D >> 1), a3, 0, false);
            }
            else {
                this.a.b.a(graphics, ratchetandclank.n[257], HH.D + (HH.D >> 1), a3, 0, false);
            }
        }
        else {
            n4 += 15;
            this.a.b.a(graphics, 57, BB.h[this.ct], HH.D + (HH.D >> 1), this.a.b.a(graphics, 56, this.aW, HH.D + (HH.D >> 1), this.a.b.a(graphics, ratchetandclank.n[49 + this.ct], HH.D + (HH.D >> 1), n4, 0, true), 0, false), 0, false);
        }
        int n5;
        if ((n5 = this.ct + 1) == 7) {
            --n5;
            if ((this.ah.O & 0x20) == 0x0) {
                --n5;
            }
        }
        if (this.ct == 7) {
            --n5;
            if ((this.ah.O & 0x80) == 0x0) {
                --n5;
            }
            if ((this.ah.O & 0x20) == 0x0) {
                --n5;
            }
        }
        this.a.b.b(graphics, n5, 5 + (((this.ah.O & 0x20) > 0) ? 1 : 0) + (((this.ah.O & 0x80) > 0) ? 1 : 0));
        this.a.b.a(graphics, 254, 8, this);
        graphics.setClip(0, i, 240, n);
        if (this.di > 6) {
            EE.b.fillTriangle(n2 - 10, i + 1, n2 - 15, i + (n >> 1), n2 - 10, i + n - 1, -14894388);
            EE.b.drawTriangle(n2 - 9, i, n2 - 16, i + (n >> 1), n2 - 9, i + n, -14581353);
        }
        for (int j = 0; j < 4 + (((this.ah.O & 0x20) > 0) ? 1 : 0); ++j) {
            graphics.drawImage(HH.aD, n2, i - j * n, 0);
            n2 += width;
        }
        if ((this.ah.O & 0x20) <= 0) {
            n2 += width;
        }
        if ((this.ah.O & 0x80) > 0) {
            graphics.drawImage(HH.aD, n2, i - 6 * n, 0);
        }
        final byte b = (byte)(n2 + width);
        graphics.drawImage(HH.aD, (int)b, i - 11 * n, 0);
        if (this.di > 6) {
            EE.b.fillTriangle(b + width + 9, i + 1, b + width + 9, i + n, b + width + 15, i + (n >> 1), -14894388);
            EE.b.drawTriangle(b + width + 9, i, b + width + 9, i + n, b + width + 16, i + (n >> 1), -14581353);
        }
        graphics.setColor(16777215);
        final int n6 = (240 - 7 * width) / 2;
        if (this.ct > 5) {
            graphics.drawRect(n6 + (this.ct - 1) * width, i + 1, width, n - 2);
            return;
        }
        graphics.drawRect(n6 + this.ct * width, i + 1, width, n - 2);
    }
    
    public final void a(final Graphics graphics, final byte b) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[296]);
        graphics.setColor(16777215);
        ratchetandclank.e = ratchetandclank.h;
        graphics.getFont();
        int n = this.a.b.i();
        switch (b) {
            case 0: {
                n += 26;
                this.a(graphics, ratchetandclank.n[this.dB], 50, n, 17, this.i());
                break;
            }
            case 1: {
                graphics.setClip(0, 0, 240, 320);
                n -= 2;
                this.a(graphics, ratchetandclank.n[301] + " " + this.a.b.c((int)HH.dw[HH.dx]), 120, this.a(graphics, ratchetandclank.n[300] + " " + this.a.b.c((int)HH.dv), 120, this.a(graphics, ratchetandclank.n[299] + " " + HH.dq, 120, this.a(graphics, ratchetandclank.n[298] + " " + HH.dp, 120, this.a(graphics, ratchetandclank.n[297] + " " + HH.dn, 120, n, 17, this.i()), 17, this.i()), 17, this.i()), 17, this.i()), 17, this.i());
                break;
            }
            case 2: {
                if (HH.dF) {
                    n = this.a.b.a(graphics, ratchetandclank.n[302], 120, n, 17, false);
                }
                if (HH.dE) {
                    n = this.a.b.a(graphics, ratchetandclank.n[303], 120, n, 17, false);
                }
                if (HH.dG) {
                    this.a.b.a(graphics, ratchetandclank.n[304], 120, n, 17, false);
                    break;
                }
                break;
            }
        }
        if (b > 0) {
            this.a.b.a(graphics, ratchetandclank.n[305] + " " + HH.dy, 120, 216, 17, true);
        }
        this.a.b.a(graphics, 9, -1, this);
    }
    
    public final void j(final Graphics graphics) {
        try {
            this.a.b.a(graphics, (byte)0);
            graphics.setClip(0, 0, 240, 320);
            final int a = this.a.b.a(graphics, ratchetandclank.n[12]);
            final int n = Math.min(240, 320) * 1024 / 176;
            short n2 = -1000;
            short n3 = 1000;
            for (int i = 0; i <= 19; ++i) {
                if (n3 > this.dc[i][1]) {
                    n3 = this.dc[i][1];
                }
                if (n2 < this.dc[i][1]) {
                    n2 = this.dc[i][1];
                }
            }
            final short n4 = (short)((240 - (n2 - n3) * n / 1024) / 2 - n3 * n / 1024);
            short n5 = -1000;
            short n6 = 1000;
            for (int j = 0; j <= 19; ++j) {
                if (n6 > this.dc[j][2]) {
                    n6 = this.dc[j][2];
                }
                if (n5 < this.dc[j][2]) {
                    n5 = this.dc[j][2];
                }
            }
            final int n7 = a + (320 - a - HH.an.getHeight() - HH.E - (n5 - n6) * n / 1024) / 2 - n6 * n / 1024 - 5;
            graphics.drawImage(HH.an, 120, 320 - this.a.b.a() - HH.an.getHeight() + 5, 17);
            graphics.setClip(0, 319, 1, 1);
            ratchetandclank.e = ratchetandclank.h;
            final int a2 = this.a(graphics, ratchetandclank.n[14 + this.cP[this.ct] - 1], 120, 0, 17, HH.an.getWidth());
            graphics.setClip(0, 0, 240, 320);
            this.a(graphics, ratchetandclank.n[14 + this.cP[this.ct] - 1], 120, 320 - this.a.b.a() - HH.an.getHeight() + (HH.an.getHeight() - a2) / 2 + 6, 17, HH.an.getWidth());
            final byte b = this.dd[this.dg[0][0]][0];
            final short n8 = (short)(this.dc[b][1] * n / 1024 - 9 - this.dc[0][1] * n / 1024);
            final short n9 = (short)(this.dc[b][2] * n / 1024 - 9 - this.dc[0][2] * n / 1024);
            for (int k = 0; k < 16; ++k) {
                if ((this.cK & 1 << this.de[k]) != 0x0) {
                    for (byte b2 = 0; b2 < this.df[k]; ++b2) {
                        final byte b3 = this.dd[this.dg[k][b2]][0];
                        final byte b4 = this.dd[this.dg[k][b2]][1];
                        final short n10 = (short)(this.dc[b3][1] * n / 1024 + n4 - n8);
                        final short n11 = (short)(this.dc[b3][2] * n / 1024 + n7 - n9);
                        final short n12 = (short)(this.dc[b4][1] * n / 1024 + n4 - n8);
                        final short n13 = (short)(this.dc[b4][2] * n / 1024 + n7 - n9);
                        graphics.setColor(36, 86, 100);
                        if (this.dc[b3][1] == this.dc[b4][1]) {
                            graphics.drawLine(n10 - 1, (int)n11, n12 - 1, (int)n13);
                            graphics.drawLine(n10 + 1, (int)n11, n12 + 1, (int)n13);
                        }
                        else {
                            graphics.drawLine((int)n10, n11 - 1, (int)n12, n13 - 1);
                            graphics.drawLine((int)n10, n11 + 1, (int)n12, n13 + 1);
                        }
                        graphics.setColor(20, 186, 204);
                        graphics.drawLine((int)n10, (int)n11, (int)n12, (int)n13);
                    }
                }
            }
            boolean b5 = false;
            int n14 = 0;
            int n15 = 0;
            byte b6 = 0;
            for (int l = 0; l <= 19; ++l) {
                final short n16 = this.dc[l][0];
                final short n17 = (short)(this.dc[l][1] * n / 1024 + n4 + 8);
                final short n18 = (short)(this.dc[l][2] * n / 1024 + n7 + 8);
                if ((n16 >= 0 && n16 <= 16) || (((n16 >= 17 && n16 <= 18) || (n16 == 19 && this.cK != 1572865)) && (this.cK & 1 << n16) > 0)) {
                    int n19 = 1;
                    if (n16 >= 0 && n16 <= 16 && (this.cK & 1 << n16) > 0) {
                        n19 = 0;
                    }
                    if (n16 == 17) {
                        n19 = 6;
                    }
                    else if (n16 == 18) {
                        n19 = 2;
                    }
                    else if (n16 == 19) {
                        n19 = 4;
                    }
                    if (n16 == 17 && this.di > 10) {
                        ++n19;
                    }
                    if ((this.dh & 1 << n16) > 0 && this.di > 5) {
                        graphics.setColor(255, 0, 0);
                        graphics.setClip(0, 0, 240, 320);
                        if (n16 == 19 || n16 == 17) {
                            graphics.fillArc(n17 - HH.aq.getWidth() / 2 - 2, n18 - HH.aq.getHeight() / 16 - 2, HH.aq.getWidth() + 4, HH.aq.getHeight() / 8 + 4, 0, 360);
                        }
                        else {
                            graphics.fillArc(n17 - HH.aq.getWidth() / 4 - 2, n18 - HH.aq.getHeight() / 32 - 2, HH.aq.getWidth() / 2 + 4, HH.aq.getHeight() / 16 + 4, 0, 360);
                        }
                    }
                    graphics.setClip(n17 - HH.aq.getWidth() / 2, n18 - HH.aq.getHeight() / 16, HH.aq.getWidth(), HH.aq.getHeight() / 8);
                    graphics.drawImage(HH.aq, n17 - HH.aq.getWidth() / 2, n18 - HH.aq.getHeight() / 16 - n19 * HH.aq.getHeight() / 8, 0);
                    if (this.ct == n16) {
                        b5 = true;
                        b6 = (byte)n16;
                        n14 = n17;
                        n15 = n18;
                    }
                }
            }
            if (b5) {
                graphics.setColor(255, 255, 255);
                graphics.setClip(0, 0, 240, 320);
                if (b6 == 19 || b6 == 17 || b6 == 18) {
                    graphics.drawRect(n14 - HH.aq.getWidth() / 2 - 2, n15 - HH.aq.getHeight() / 16 - 2, HH.aq.getWidth() + 4, HH.aq.getHeight() / 8 + 4);
                }
                else {
                    graphics.drawRect(n14 - HH.aq.getWidth() / 4 - 2, n15 - HH.aq.getHeight() / 32 - 2, HH.aq.getWidth() / 2 + 4, HH.aq.getHeight() / 16 + 4);
                }
            }
            graphics.setClip(0, 0, 240, 320);
            if (this.cP[this.ct] < 11) {
                ratchetandclank.e = ratchetandclank.h;
                final byte b7 = HH.R[this.cP[this.ct] - 1];
                final short n20 = (short)(this.dc[5][2] * n / 1024 + n7 + 8);
                graphics.drawImage(HH.az, (240 - HH.an.getWidth()) / 2, (int)n20, 0);
                graphics.setColor(1370860);
                final String string = this.i(this.cP[this.ct]) + "/" + b7;
                ratchetandclank.e.a(graphics, string, (240 - HH.an.getWidth()) / 2 + (HH.az.getWidth() - ratchetandclank.e.a(string)) / 2, n20 + HH.az.getHeight() - ratchetandclank.e.a - 2, 0);
            }
        }
        catch (Exception ex) {}
        this.a.b.a(graphics, 7, -1, this);
    }
    
    public final void k(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[43]);
        ratchetandclank.e = ratchetandclank.h;
        this.a(graphics, ratchetandclank.n[285], 120, this.a.b.i(), 17, this.i());
        this.a.b.a(graphics, 9, -1, this);
    }
    
    public final void l(final Graphics graphics) {
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(0);
        graphics.fillRect(0, 0, 240, 320);
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        final int n = this.a.b.a(graphics, ratchetandclank.n[75]) + (ratchetandclank.e.a >> 1);
        graphics.setClip(98, n, 44, 44);
        graphics.drawImage(HH.ay, 98, n - this.n * 44, 0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        graphics.setColor(16777215);
        ratchetandclank.e = ratchetandclank.h;
        int a = this.a.b.a(graphics, ratchetandclank.n[299] + " " + this.v(), 120, this.a.b.a(graphics, ratchetandclank.n[306] + " " + this.a.b.c(this.cq), 120, this.a.b.i(), 17, false), 17, false);
        a += 6;
        this.a.b.a(graphics, ratchetandclank.n[307] + " " + HH.dz, 120, a, 17, true);
        this.a.b.a(graphics, 9, -1, this);
    }
    
    public final void m(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[308]);
        final int i = this.a.b.i();
        ratchetandclank.e = ratchetandclank.h;
        this.a(graphics, ratchetandclank.n[309], 120, i - 10 + 54, 33, this.i());
        this.a.b.a(graphics, 9, -1, this);
    }
    
    public final void n(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[75]);
        final int i = this.a.b.i();
        ratchetandclank.e = ratchetandclank.h;
        int n;
        if (this.V < 11) {
            n = this.a(graphics, ratchetandclank.n[251], (240 - this.i()) / 2, i, 0, this.i());
        }
        else {
            n = this.a(graphics, ratchetandclank.n[252], (240 - this.i()) / 2, i, 0, this.i());
        }
        final Object[] array = { new Integer(HH.ck[this.V]) };
        this.cD = null;
        this.a(graphics, this.cD = this.a(ratchetandclank.n[250], array), (240 - this.i()) / 2, n, 0, this.i());
        this.a.b.a(graphics, 9, -1, this);
    }
    
    public final void o(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[24]);
        ratchetandclank.e = ratchetandclank.h;
        int n = this.k() + this.h() / 10;
        if (this.cV) {
            n = this.a(graphics, ratchetandclank.n[228], (240 - this.i()) / 2, n, 0, this.i());
        }
        if (this.cW) {
            n = this.a(graphics, ratchetandclank.n[230], (240 - this.i()) / 2, n, 0, this.i());
        }
        int n2 = this.a(graphics, ratchetandclank.n[229], (240 - this.i()) / 2, n, 0, this.i());
        if (this.cY) {
            final Object[] array = { new String(ratchetandclank.n[this.ah.L + 48]) };
            this.cD = null;
            this.cD = this.a(ratchetandclank.n[231], array);
            n2 = this.a(graphics, this.cD, (240 - this.i()) / 2, n2, 0, this.i());
        }
        final Object[] array2 = { new Integer(HH.ck[this.V]) };
        this.cD = null;
        this.a(graphics, this.cD = this.a(ratchetandclank.n[249], array2), (240 - this.i()) / 2, n2, 0, this.i());
        this.a.b.a(graphics, 9, 8, this);
    }
    
    public final void b(final Graphics graphics, final byte b) {
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(0);
        graphics.fillRect(0, 0, 240, 320);
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[24]);
        int a = this.k() + this.h() / 10;
        for (byte b2 = 0; b2 < 12; ++b2) {
            if ((this.cK & 1 << 20 + b2) != 0x0 && (a = this.a.b.a(graphics, ratchetandclank.n[60 + b2], HH.D + (HH.D >> 1), a, 0, this.ct == b2)) >= this.k() + this.h() - 2 * this.h() / 10) {
                if (b2 >= this.ct) {
                    break;
                }
                this.e(graphics);
                a = this.k() + this.h() / 10;
            }
        }
        if (this.ct != 11 && (this.cK & 1 << this.ct + 21) != 0x0) {
            final int n = this.j() + this.g() - 7;
            final int n2 = this.k() + this.h() - 20;
            EE.b.fillTriangle(n, n2, n - 10, n2, n - 5, n2 + 10, -15222068);
        }
        if (this.ct != 0 && (this.cK & 1 << this.ct + 19) != 0x0) {
            final int n3 = this.j() + this.g() - 7;
            final int n4 = this.k() + 20;
            EE.b.fillTriangle(n3, n4, n3 - 10, n4, n3 - 5, n4 - 10, -15222068);
        }
        this.a.b.a(graphics, 7, 8, this);
    }
    
    public final void p(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[282]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        this.db[0] = i;
        this.a.b.a(graphics, ratchetandclank.n[10], HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[11], HH.D + (HH.D >> 1), i, 0, this.ct == 0), 0, this.ct == 1);
        this.a.b.a(graphics, 7, -1, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
    }
    
    public final void q(final Graphics graphics) {
        HH.aD.getWidth();
        HH.aD.getHeight();
        final int n = HH.F >> 1;
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(0);
        ratchetandclank.e = ratchetandclank.h;
        int n2 = 160 + n;
        if (this.X == 11) {
            n2 -= n;
        }
        graphics.drawImage(HH.aA, 120, n2, 3);
        graphics.setColor(2446442);
        final int n3 = n2 - 174;
        for (int i = 1; i <= 7; ++i) {
            if ((this.ah.O & 1 << i) == 0x0) {
                this.b(graphics, -12 + 3 * HH.dL[i - 1][0] / 2, n3 + 3 * HH.dL[i - 1][1] / 2);
            }
            if (this.ah.L > 0) {
                this.a(graphics, -12 + 3 * HH.dL[this.ah.L - 1][0] / 2, n3 + 3 * HH.dL[this.ah.L - 1][1] / 2);
            }
        }
        final int n4 = 160 - 3 * ratchetandclank.e.a / 2 + n;
        graphics.setColor(16777215);
        final int a = this.a(graphics, ratchetandclank.n[310] + " " + (this.ah.P[this.ah.L] + 1), 120, this.a(graphics, ratchetandclank.n[48 + this.ah.L], 120, n4, 17, 2 * HH.aA.getWidth() / 4), 17, 2 * HH.aA.getWidth() / 4);
        if (this.ah.L != 6) {
            this.a(graphics, ratchetandclank.n[232] + ": " + this.ah.M[this.ah.L], 120, a, 17, 2 * HH.aA.getWidth() / 4);
        }
    }
    
    public final void a(final Graphics graphics, final int n, final int n2) {
        graphics.setColor(1240814);
        for (int i = 0; i < 7; ++i) {
            graphics.drawLine(3 * HH.dM[i] / 2 + n, 3 * HH.dN[i] / 2 + n2, 3 * HH.dM[i + 1] / 2 + n, 3 * HH.dN[i + 1] / 2 + n2);
            graphics.drawLine(3 * HH.dO[i] / 2 + n, 3 * HH.dP[i] / 2 + n2, 3 * HH.dO[i + 1] / 2 + n, 3 * HH.dP[i + 1] / 2 + n2);
        }
        graphics.drawLine(3 * HH.dM[7] / 2 + n, 3 * HH.dN[7] / 2 + n2, 3 * HH.dM[0] / 2 + n, 3 * HH.dN[0] / 2 + n2);
        graphics.drawLine(3 * HH.dO[7] / 2 + n, 3 * HH.dP[7] / 2 + n2, 3 * HH.dO[0] / 2 + n, 3 * HH.dP[0] / 2 + n2);
    }
    
    public final void b(final Graphics graphics, final int n, final int n2) {
        if (this.ed == null) {
            this.ed = new int[8];
        }
        if (this.ee == null) {
            this.ee = new int[8];
        }
        for (int i = 0; i < 8; ++i) {
            this.ed[i] = 3 * HH.dQ[i] / 2 + n;
            this.ee[i] = 3 * HH.dR[i] / 2 + n2;
        }
        EE.b.fillPolygon(this.ed, 0, this.ee, 0, 8, -14330774);
    }
    
    public final void r(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[59]);
        ratchetandclank.e = ratchetandclank.h;
        this.a.b.a(graphics, -1, 8, this);
    }
    
    public final void s(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[44]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        this.db[0] = i;
        this.a.b.a(graphics, ratchetandclank.n[10], HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[11], HH.D + (HH.D >> 1), i, 0, this.ct == 0), 0, this.ct == 1);
        this.a.b.a(graphics, 7, 8, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
    }
    
    public final void t(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[281]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        this.db[0] = i;
        this.a.b.a(graphics, ratchetandclank.n[280], HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[40], HH.D + (HH.D >> 1), i, 0, this.ct == 0) + 5, 0, this.ct == 1);
        this.a.b.a(graphics, 7, -1, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
    }
    
    public final void u(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[45]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        this.db[0] = i;
        this.a.b.a(graphics, ratchetandclank.n[10], HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[11], HH.D + (HH.D >> 1), i, 0, this.ct == 0), 0, this.ct == 1);
        this.a.b.a(graphics, 7, 8, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
    }
    
    public final void v(final Graphics graphics) {
        this.a.b.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.e(graphics);
        this.a.b.a(graphics, ratchetandclank.n[46]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.a.b.i();
        this.db[0] = i;
        this.a.b.a(graphics, ratchetandclank.n[10], HH.D + (HH.D >> 1), this.db[1] = HH.ao.getHeight() / 2 + this.a.b.a(graphics, ratchetandclank.n[11], HH.D + (HH.D >> 1), i, 0, this.ct == 0), 0, this.ct == 1);
        this.a.b.a(graphics, 7, 8, this);
        this.a.b.a(graphics, HH.D >> 1, this.db[this.ct]);
    }
    
    public final void w(final Graphics graphics) {
        if (this.S > 0) {
            return;
        }
        if (this.l) {
            return;
        }
        if (this.dS != -1 || this.dT != -1 || this.dX) {
            graphics.setClip(0, 0, 240, 320);
            graphics.setColor(0);
            graphics.fillRect(0, 0, 240, 320);
            this.d = true;
            System.gc();
            return;
        }
        if (HH.aE == null) {
            return;
        }
        switch (this.b) {
            case 4: {
                this.d(graphics);
            }
            case 5: {
                this.f(graphics);
            }
            case 6: {
                this.g(graphics);
            }
            case 7: {
                this.v(graphics);
            }
            case 8: {
                this.u(graphics);
            }
            case 9: {
                this.s(graphics);
            }
            case 10: {
                this.k(graphics);
            }
            case 11: {
                this.i(graphics);
            }
            case 3: {
                this.j(graphics);
            }
            case 12: {
                this.h(graphics);
            }
            case 13: {
                this.r(graphics);
            }
            case 1: {
                this.b(graphics, HH.dj);
            }
            case 2: {
                this.l(graphics);
            }
            case 14: {
                this.o(graphics);
            }
            case 15: {
                this.n(graphics);
            }
            case 19: {
                this.m(graphics);
            }
            case 18: {
                this.a(graphics, HH.dA);
            }
            case 21: {
                this.t(graphics);
            }
            case 22: {
                this.q(graphics);
            }
            case 23: {
                this.p(graphics);
            }
            default: {
                if (this.cR) {
                    this.ah.E = 1;
                }
                graphics.setColor(0);
                this.T.a(graphics);
                this.G(graphics);
                this.z(graphics);
                this.B(graphics);
                this.C(graphics);
                this.A(graphics);
                if (this.bW != -1) {
                    this.b(graphics);
                }
                if (this.bZ != -1) {
                    this.D(graphics);
                }
                if (this.cb != -1) {
                    this.c(graphics);
                }
                this.E(graphics);
                this.a(graphics);
                if (this.b == 16 && this.g == 4) {
                    this.c(graphics, this.i);
                }
                if (this.X == 12) {
                    this.F(graphics);
                }
                if (this.dW != -1) {
                    this.ct = (byte)this.dW;
                    this.q(graphics);
                    this.b = 22;
                    this.dW = -1;
                }
                if (this.b == 16 || this.b == 17 || this.b == 24) {
                    if (this.b == 24) {
                        this.F(graphics);
                        for (int i = 9; i >= 0; --i) {
                            this.ai[i].a(graphics);
                        }
                    }
                    graphics.setClip(0, 0, 240, (int)HH.F);
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, 240, (int)HH.F);
                    graphics.setClip(0, 320 - HH.F, 240, (int)HH.F);
                    graphics.setColor(0);
                    graphics.fillRect(0, 320 - HH.F, 240, (int)HH.F);
                    this.a.b.a(graphics, -1, -1, this);
                }
                else {
                    this.y(graphics);
                    this.x(graphics);
                }
                if (this.cC) {
                    this.H(graphics);
                    this.cF = this.a(graphics, this.cE);
                }
                if (this.X == 11) {
                    graphics.setClip(0, 320 - HH.F, 240, (int)HH.F);
                    graphics.setColor(0);
                    graphics.fillRect(0, 320 - HH.F, 240, (int)HH.F);
                    ratchetandclank.e = ratchetandclank.h;
                    graphics.setColor(1882828);
                    ratchetandclank.e.a(graphics, ratchetandclank.n[311] + " " + String.valueOf(this.da), 120, 320 - HH.F + 3, 17);
                }
            }
        }
    }
    
    public final void b(final byte b) {
        switch (b) {
            case 0: {
                this.ah.n();
                this.d = true;
                final BB ah = this.ah;
                ah.ab += 1536;
                if (this.ah.ab >> 8 > 9 * HH.D) {
                    ++this.g;
                    final BB ah2 = this.ah;
                    this.ah.getClass();
                    ah2.ac = -3584;
                    this.ah.ad = 512;
                    return;
                }
                break;
            }
            case 1: {
                this.ah.n();
                this.ah.a((byte)2);
                this.d = true;
                final BB ah3 = this.ah;
                ah3.ac += 256;
                final BB ah4 = this.ah;
                ah4.ag += this.ah.ac;
                final BB ah5 = this.ah;
                ah5.ab += this.ah.ad;
                this.ah.v();
                if (this.ah.c() >= this.ah.a(false) && this.ah.ac > 0) {
                    this.ah.a((byte)4);
                    this.ah.ag = 0;
                    final BB ah6 = this.ah;
                    this.ah.getClass();
                    ah6.ac = -3584;
                    ++this.g;
                    return;
                }
                break;
            }
            case 2: {
                if (this.h >= 4) {
                    ++this.g;
                    this.ah.a((byte)1);
                    return;
                }
                this.ah.n();
                this.ah.a((byte)2);
                this.d = true;
                final BB ah7 = this.ah;
                ah7.ac += 256;
                final BB ah8 = this.ah;
                ah8.ag += this.ah.ac;
                this.ah.v();
                if (this.ah.c() >= this.ah.a(false) && this.ah.ac > 0) {
                    this.ah.a((byte)4);
                    this.ah.ag = 0;
                    final BB ah9 = this.ah;
                    this.ah.getClass();
                    ah9.ac = -3584;
                    this.ah.am = 0;
                    ++this.h;
                    return;
                }
                break;
            }
            case 3: {
                this.ah.n();
                this.d = true;
                final BB ah10 = this.ah;
                ah10.ab += 1536;
                if (this.ah.ab >> 8 > 11 * HH.D + (HH.D >> 1)) {
                    ++this.g;
                    this.ah.a((byte)0);
                    this.ah.am = 0;
                    this.ah.n();
                    break;
                }
                break;
            }
        }
    }
    
    public final void c(final byte b) {
        switch (b) {
            case 0: {
                this.U();
                this.ah.n();
                if (this.ah.s != -1) {
                    final short a = this.ah.a(false);
                    this.d = true;
                    final BB ah = this.ah;
                    ah.ab += this.ah.ad;
                    final BB ah2 = this.ah;
                    ah2.ac += 256;
                    final BB ah3 = this.ah;
                    ah3.ag += this.ah.ac;
                    this.ah.v();
                    if (this.ah.c() >= a) {
                        this.ah.a((byte)4);
                        this.ah.ag = 0;
                        this.ah.s = -1;
                    }
                }
                else if (this.ah.aa <= 8 && this.ah.ab >> 8 < 13 * HH.D) {
                    if (this.ah.ab >> 8 > 11 * HH.D + (HH.D >> 1)) {
                        this.ah.a((byte)0);
                        this.ah.am = 0;
                        this.q = 4;
                        return;
                    }
                    this.ah.a((byte)1);
                    this.ah.am = 0;
                    this.q = 3;
                    return;
                }
                else {
                    if (this.ah.ab >> 8 < 10 * HH.D + (HH.D >> 1)) {
                        this.q = 2;
                        final BB ah4 = this.ah;
                        this.ah.getClass();
                        ah4.ac = -3584;
                        return;
                    }
                    this.ah.a((byte)1);
                    this.ah.am = 0;
                    this.ah.ao = false;
                    this.ah.ad = 0;
                    this.ah.ac = 0;
                    this.r = false;
                    ++this.q;
                }
                this.U();
            }
            case 1: {
                final short a2 = this.ah.a(false);
                this.ah.n();
                this.d = true;
                if (this.r) {
                    final short a3 = this.ah.a(false);
                    this.d = true;
                    final BB ah5 = this.ah;
                    ah5.ab += this.ah.ad;
                    final BB ah6 = this.ah;
                    ah6.ac += 256;
                    final BB ah7 = this.ah;
                    ah7.ag += this.ah.ac;
                    this.ah.v();
                    if (this.ah.c() >= a3) {
                        this.ah.a((byte)1);
                        this.ah.ag = 0;
                        this.r = false;
                    }
                }
                else {
                    if (this.ah.c() < a2) {
                        this.ah.a((byte)3);
                        this.r = true;
                    }
                    final BB ah8 = this.ah;
                    ah8.ab -= 1536;
                    if (this.ah.ab >> 8 < 10 * HH.D + (HH.D >> 1)) {
                        this.ah.a((byte)0);
                        ++this.q;
                        final BB ah9 = this.ah;
                        this.ah.getClass();
                        ah9.ac = -3584;
                    }
                }
                this.U();
            }
            case 2: {
                this.ah.n();
                this.ah.a((byte)2);
                this.d = true;
                final BB ah10 = this.ah;
                ah10.ac += 256;
                final BB ah11 = this.ah;
                ah11.ag += this.ah.ac;
                this.ah.v();
                if (this.ah.c() >= this.ah.a(false) && this.ah.ac > 0) {
                    this.ah.a((byte)4);
                    this.ah.ag = 0;
                    final BB ah12 = this.ah;
                    this.ah.getClass();
                    ah12.ac = -3584;
                    this.ah.am = 0;
                    if (this.ah.aa <= 8) {
                        ++this.q;
                        this.ah.ao = true;
                        this.ah.a((byte)1);
                    }
                }
                this.U();
            }
            case 3: {
                this.ah.n();
                this.d = true;
                final BB ah13 = this.ah;
                ah13.ab += 1536;
                if (this.ah.ab >> 8 > 11 * HH.D + (HH.D >> 1)) {
                    this.ah.a((byte)0);
                    this.ah.am = 0;
                    ++this.q;
                }
                this.U();
            }
            case 4: {
                if (this.s < 50) {
                    ++this.s;
                    this.U();
                    return;
                }
                this.bI[4] = 0;
                DD.d[DD.i[this.V]][14][8] = -126;
                DD.d[DD.i[this.V]][14][9] = -125;
                this.T.f[14][9] = 22;
                this.T.f[13][9] = 22;
                this.T.f[12][9] = 20;
                this.T.f[15][9] = 21;
                final int[] e = DD.e;
                final int n = 12;
                e[n] |= 0x200;
                final int[] e2 = DD.e;
                final int n2 = 13;
                e2[n2] |= 0x200;
                final int[] e3 = DD.e;
                final int n3 = 14;
                e3[n3] |= 0x200;
                final int[] e4 = DD.e;
                final int n4 = 15;
                e4[n4] |= 0x200;
                ++this.q;
            }
            case 5: {
                this.cB = true;
                this.cH = HH.cy[32];
                this.r(HH.cz[32]);
                final BB ah14 = this.ah;
                this.ah.getClass();
                ah14.ac = -3172;
                this.ah.ad = 512;
                ++this.q;
            }
            case 6: {
                if (this.cC) {
                    break;
                }
                this.ah.n();
                this.ah.a((byte)2);
                this.d = true;
                final BB ah15 = this.ah;
                ah15.ac += 256;
                final BB ah16 = this.ah;
                ah16.ag += this.ah.ac;
                final BB ah17 = this.ah;
                ah17.ab += this.ah.ad;
                this.ah.v();
                if (this.ah.c() >= this.ah.a(false) && this.ah.ac > 0) {
                    this.ah.a((byte)1);
                    this.ah.am = 0;
                    this.ah.ag = 0;
                    final BB ah18 = this.ah;
                    this.ah.getClass();
                    ah18.ac = -3584;
                    ++this.q;
                    return;
                }
                break;
            }
            case 7: {
                this.ah.n();
                this.d = true;
                final BB ah19 = this.ah;
                ah19.ab += 1536;
                if (this.ah.ab >> 8 > 14 * HH.D + (HH.D >> 1)) {
                    this.ah.a((byte)0);
                    ++this.q;
                    return;
                }
                break;
            }
            case 8: {
                this.n = 0;
                this.y();
                if (HH.ay == null) {
                    try {
                        HH.ay = Image.createImage("/clank.png");
                    }
                    catch (Exception ex) {}
                }
                HH.dz += HH.dy;
                this.b = 2;
                this.ah.ao = true;
                this.ah.L = 1;
                this.ah.a((byte)0);
                this.ah.am = 0;
                this.ah.aa = 1;
                this.ah.ag = 1792;
                this.ah.ab = 30720;
                this.ah.ac = 0;
                this.ah.ad = 0;
                this.ah.E = 0;
                ++this.q;
                break;
            }
        }
    }
    
    private void U() {
        this.e(HH.D * 14 - 42 + this.d(this.U.nextInt()) % (2 * HH.D) << 8, HH.E * 9 - HH.E + this.d(this.U.nextInt()) % (2 * HH.E) << 8, 30);
    }
    
    public final void d(final byte b) {
        switch (b) {
            case 0: {
                ++this.j;
            }
            case 1: {
                this.cB = true;
                this.cH = HH.cy[20];
                this.r(HH.cz[20]);
                ++this.j;
            }
            case 2: {
                if (!this.cC) {
                    this.a(3, 2, (byte)0, -1);
                    this.ag[9].ao = false;
                    ++this.j;
                    return;
                }
                break;
            }
            case 3: {
                this.ag[9].i();
                this.d = true;
                final int a = this.ag[9].a(false);
                final FF f = this.ag[9];
                f.ac += 256;
                final FF f2 = this.ag[9];
                f2.ag += this.ag[9].ac;
                this.ag[9].v();
                if (this.ag[9].b() + 2 * HH.E >= a && this.ag[9].ac > 0) {
                    this.ag[9].a((byte)0);
                    this.ag[9].am = 0;
                    this.b = 0;
                    this.cB = true;
                    this.cH = HH.cy[21];
                    this.r(HH.cz[21]);
                    ++this.j;
                    this.s();
                    return;
                }
                break;
            }
            case 4: {
                this.ah.n();
                this.d = true;
                final BB ah = this.ah;
                ah.ab += 1536;
                if (this.ah.ab >> 8 > 18 * HH.D - (HH.D >> 3)) {
                    this.ah.a((byte)0);
                    this.ah.ad = 1280;
                    this.ah.ag = 0;
                    final BB ah2 = this.ah;
                    this.ah.getClass();
                    ah2.ac = -3584;
                    ++this.j;
                    return;
                }
                break;
            }
            case 5: {
                this.cB = true;
                this.cH = HH.cy[15];
                this.r(HH.cz[15]);
                ++this.j;
            }
            case 6: {
                if (this.cC) {
                    this.ah.a((byte)0);
                    return;
                }
                this.ah.n();
                this.ah.a((byte)2);
                this.d = true;
                final BB ah3 = this.ah;
                ah3.ac += 384;
                final BB ah4 = this.ah;
                ah4.ag += this.ah.ac;
                final BB ah5 = this.ah;
                ah5.ab += this.ah.ad;
                this.ah.v();
                if (this.ah.c() >= 5 * HH.E + (HH.E >> 1) && this.ah.ac > 0) {
                    this.ah.a((byte)6);
                    final int n = (this.d(this.bd[0] - this.bb[0]) << 8) / 2304;
                    this.ah.V = (this.bf[0] << 8) / n;
                    this.ah.W = this.bg[0] / n;
                    this.ah.X = this.be[0];
                    ++this.j;
                    return;
                }
                break;
            }
            case 7: {
                this.ah.i();
                if (this.ah.ab >= HH.D * 25 << 8) {
                    ++this.j;
                    this.ah.ac = 0;
                    this.ah.ad = 0;
                    this.ah.a((byte)3);
                    return;
                }
                break;
            }
            case 8: {
                this.ah.n();
                this.d = true;
                final short a2 = this.ah.a(false);
                final BB ah6 = this.ah;
                ah6.ac += 256;
                if (this.ah.c() + this.ah.ac > a2 << 8) {
                    this.ah.ac = (short)((a2 << 8) - this.ah.c());
                }
                final BB ah7 = this.ah;
                ah7.ag += this.ah.ac;
                this.ah.v();
                if (this.ah.c() >= a2 && this.ah.ac > 0) {
                    this.ah.a((byte)4);
                    this.ah.ag = 0;
                    this.ah.ac = 0;
                    this.ah.ad = 0;
                    ++this.j;
                    return;
                }
                break;
            }
            case 9: {
                this.ah.a((byte)0);
                this.a(3, 2, (byte)0, -1);
                this.cs = System.currentTimeMillis();
                this.b = 0;
                ++this.j;
                this.s();
                break;
            }
        }
    }
    
    public final void l() {
        final int n = HH.D << 1;
        final int n2 = HH.E << 1;
        for (int i = 3; i >= 0; --i) {
            if (this.cp[i] != -1) {
                switch (this.cp[i]) {
                    case 0: {
                        final short[] cn = this.cn;
                        final int n3 = i;
                        cn[n3] += 2;
                        if (this.cn[i] > n) {
                            final short[] cn2 = this.cn;
                            final int n4 = i;
                            cn2[n4] -= 2;
                            final byte[] cp = this.cp;
                            final int n5 = i;
                            cp[n5] += 2;
                            break;
                        }
                        break;
                    }
                    case 1: {
                        final short[] co = this.co;
                        final int n6 = i;
                        co[n6] += 2;
                        if (this.co[i] > n2) {
                            final short[] co2 = this.co;
                            final int n7 = i;
                            co2[n7] -= 2;
                            final byte[] cp2 = this.cp;
                            final int n8 = i;
                            cp2[n8] += 2;
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final short[] cn3 = this.cn;
                        final int n9 = i;
                        cn3[n9] -= 2;
                        if (this.cn[i] < 0) {
                            final short[] cn4 = this.cn;
                            final int n10 = i;
                            cn4[n10] += 2;
                            final byte[] cp3 = this.cp;
                            final int n11 = i;
                            cp3[n11] -= 2;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        final short[] co3 = this.co;
                        final int n12 = i;
                        co3[n12] -= 2;
                        if (this.co[i] < 0) {
                            final short[] co4 = this.co;
                            final int n13 = i;
                            co4[n13] += 2;
                            final byte[] cp4 = this.cp;
                            final int n14 = i;
                            cp4[n14] -= 2;
                            break;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public final int d(final int n) {
        if (n < 0) {
            return n * -1;
        }
        return n;
    }
    
    public static final void e(final int n) {
        try {
            Thread.sleep(n);
        }
        catch (Exception ex) {}
    }
    
    public final void c(final int ds, final int dt) {
        this.dS = ds;
        this.dT = dt;
    }
    
    public final void m() {
        System.gc();
        e(20);
        this.c = this.b;
        this.b = 4;
        this.cu = 0;
        this.ct = 0;
        System.gc();
    }
    
    public final void n() {
        if (!this.dU) {
            this.dU = true;
            this.a.d();
            this.d = true;
            this.dV = 0L;
            this.cu = 0;
            this.cv = 0;
            if (this.b == 0 || this.b == 17 || this.b == 16 || this.b == 24 || this.b == 22) {
                if (this.b == 22) {
                    this.dW = this.ct;
                    this.b = 0;
                }
                this.ct = 0;
                this.c = this.b;
                this.b = 4;
                HH.aE = null;
            }
            System.gc();
        }
    }
    
    public final void o() {
        if (this.dU) {
            this.S = 4;
            if (HH.aE == null) {
                this.y();
            }
            this.d = true;
            this.dU = false;
            this.dV = System.currentTimeMillis();
        }
    }
    
    public final void p() {
        this.n();
    }
    
    public final void q() {
        this.o();
        this.dU = false;
    }
    
    public final void r() {
        if (this.ah.ac == 0) {
            this.dY = 0;
        }
        if (this.dS != -1) {
            this.f(this.dS);
            this.dS = -1;
            this.d = true;
            System.currentTimeMillis();
        }
        else if (this.dT != -1) {
            this.a.e(this.dT);
            this.aa = (byte)this.dT;
            this.dT = -1;
            this.d = true;
            System.currentTimeMillis();
        }
        if (this.dU) {
            e(100);
            return;
        }
        if (this.S > 0 && --this.S > 0) {
            e(10);
        }
        this.cr = System.currentTimeMillis();
        if (this.cr - this.cs > 33L) {
            this.T();
            if (this.b == 17) {
                this.d(this.j);
                if (!this.cC) {
                    this.s();
                }
            }
            if (this.b == 24) {
                this.c(this.q);
                this.s();
                for (int i = 9; i >= 0; --i) {
                    this.ai[i].b(false);
                }
            }
            if (this.b == 16) {
                for (int j = 9; j >= 0; --j) {
                    this.ai[j].b(false);
                }
                this.b(this.g);
                this.s();
            }
            if (this.b == 2) {
                ++this.o;
                if (this.o == 25) {
                    this.o = 80;
                }
                if (this.o > 84) {
                    this.o = 80;
                    if (this.n < 15) {
                        ++this.n;
                    }
                    else {
                        --this.n;
                    }
                }
            }
            else {
                this.o = 0;
            }
            if (this.b == 11 || this.b == 12) {
                this.ah.n();
            }
            if (this.b == 3 || this.b == 1) {
                HH.dv = 0L;
            }
            if (this.b == 0 && !this.cC) {
                HH.dv += this.cr - this.cs;
                this.cq += (int)(this.cr - this.cs);
                this.H();
                this.J();
                this.l();
                this.c();
                this.K();
                this.b();
                this.ah.l();
                this.ah.n();
                if (this.ah.E <= 0) {
                    this.R();
                }
                else {
                    final BB ah = this.ah;
                    --ah.E;
                }
                this.s();
                this.I();
                this.a();
                for (int k = 9; k >= 0; --k) {
                    this.ai[k].b(false);
                    if (this.ai[k].f != -1) {
                        this.m(k);
                    }
                }
                for (int l = 9; l >= 0; --l) {
                    this.aj[l].b(true);
                    if (this.aj[l].f != -1) {
                        this.l(l);
                    }
                }
                this.da = 0;
                for (int n = HH.aZ - 1; n >= 0; --n) {
                    if (this.ag[n].Z != -1) {
                        if (this.X == 12 && (this.ag[n].Z == 1 || this.ag[n].Z == 4)) {
                            if (this.ag[n].F > 140) {
                                this.ag[n].Z = -1;
                                continue;
                            }
                            final FF f = this.ag[n];
                            ++f.F;
                            if (this.ag[n].F == 1) {
                                this.ag[n].a((byte)6);
                                this.ag[n].am = 1;
                            }
                            else if (this.ag[n].F == 137) {
                                this.ag[n].a((byte)7);
                                this.ag[n].am = 1;
                            }
                        }
                        if (this.ag[n].al != 5 && this.ah.al != 10) {
                            this.q(n);
                        }
                        this.ag[n].h();
                        this.ag[n].i();
                        if (this.X == 11 && this.ag[n].Z != 4) {
                            ++this.da;
                        }
                    }
                }
                if (this.X == 0 && this.ag[9].Z == -1 && this.ah.c() >= this.ah.a(false)) {
                    this.b = 17;
                    this.bB[0] = 0;
                    this.ah.a((byte)1);
                    this.ah.am = 0;
                    this.ah.ao = true;
                }
                if (this.X == 12) {
                    if (!this.f && this.ah.ab >> 8 >= 6 * HH.D && this.ah.ab >> 8 <= 9 * HH.D && this.ah.c() >= this.ah.a(false)) {
                        this.b = 16;
                        this.ah.a((byte)1);
                        this.ah.am = 0;
                    }
                    if (this.f) {
                        this.M();
                    }
                }
                else if (this.cU) {
                    this.A();
                }
            }
            this.cs = this.cr;
        }
        else if (this.d) {
            this.d = false;
        }
        if (this.dX) {
            this.dX = false;
            this.a.b();
        }
    }
    
    public final void s() {
        final short b = this.ah.b();
        final short c = this.ah.c();
        int n;
        if (!HH.x) {
            if (this.ah.ao) {
                n = -(b - HH.D);
            }
            else {
                n = -(b + HH.D - 240);
            }
        }
        else {
            n = -(HH.C - 120);
            if (b > HH.C + (HH.D >> 1) || b < HH.C - (HH.D >> 1) || this.ah.c() == this.ah.a(false)) {
                HH.x = false;
            }
        }
        int n2;
        if (HH.y) {
            n2 = -(c + HH.I - 320);
        }
        else {
            n2 = -(c + HH.I + (HH.E << 1) - 320);
        }
        HH.w += n2 - HH.w >> 1;
        if (HH.v > n) {
            HH.v -= 10;
            if (HH.v < n) {
                HH.v = n;
            }
        }
        else if (HH.v < n) {
            HH.v += 10;
            if (HH.v > n) {
                HH.v = n;
            }
        }
        if (HH.v > 0) {
            HH.v = 0;
        }
        if (HH.v < -(28 * HH.D - 240)) {
            HH.v = -(28 * HH.D - 240);
        }
        if (HH.w > 0) {
            HH.w = 0;
        }
        if (HH.w < -(18 * HH.E - 320)) {
            HH.w = -(18 * HH.E - 320);
        }
    }
    
    public final void t() {
        int n = 0;
        final String a = a("/mapData.txt");
        for (int i = 0; i < 62; i = (short)(i + 1)) {
            for (int j = 0; j < 3; j = (short)(j + 1)) {
                final int index = a.indexOf(",", n);
                final String trim = a.substring(n, index).trim();
                n = index + 1;
                this.dc[i][j] = Short.parseShort(trim);
            }
            n = a.indexOf("\n", n) + 1;
        }
        for (int k = 0; k < 43; k = (short)(k + 1)) {
            for (int l = 0; l < 2; l = (short)(l + 1)) {
                final int index2 = a.indexOf(",", n);
                final String trim2 = a.substring(n, index2).trim();
                n = index2 + 1;
                this.dd[k][l] = Byte.parseByte(trim2);
            }
            n = a.indexOf("\n", n) + 1;
        }
    }
    
    public final void f(final int n) {
        this.ah.u = -2;
        this.cR = false;
        this.cC = false;
        this.bY = true;
        this.m = 13;
        this.j = 0;
        this.dB = 0;
        this.Z = 1;
        this.Y = false;
        this.u();
        if (n == 0) {
            this.X = (byte)n;
            this.T.b(n);
            this.V = DD.a;
            this.dh = 1;
            this.W = this.V;
            this.T.a(this.V, true);
            this.ab = 1;
            this.ac = 5;
            this.ah.ab = this.ab * HH.D + (HH.H >> 1) << 8;
            final BB ah = this.ah;
            final BB ah2 = this.ah;
            final byte ac = this.ac;
            ah2.af = ac;
            ah.aa = ac;
            this.ah.aj = 1;
            this.ah.ak = 0;
            this.ah.al = 0;
            this.ah.am = 0;
            this.ah.ag = 0;
            this.ah.Z = 0;
            this.ah.ah = 1;
            this.ah.ai = 20;
            this.cq = 0;
            this.cs = System.currentTimeMillis();
            this.b(this.V, 6364);
            this.ah.E = 0;
            this.ah.ao = true;
            this.d = true;
            this.aW = 0;
            this.ah.a((byte)0);
            this.ah.am = 0;
            this.cd = 1;
            this.ce = 18;
            this.ah.M[1] = 0;
            HH.v = -22;
            HH.w = -32;
        }
        this.b = 17;
    }
    
    public final void u() {
        this.d();
        this.bv = -1;
        this.bw = -1;
        this.bx = -1;
        this.bS = -1;
        this.bT = -1;
        this.cI = -1;
        this.cJ = -1;
        this.cK = 1572865;
        this.ah.O = 3;
        this.ah.L = 1;
        for (int i = 7; i >= 0; --i) {
            this.ah.N[i] = 0;
            this.ah.P[i] = 0;
            this.ah.M[i] = BB.e[i];
        }
        for (int j = 0; j < 10; ++j) {
            this.bt[j] = -1;
        }
        for (int k = 0; k < 6; ++k) {
            this.bs[k] = false;
        }
        for (int l = 0; l < 2; ++l) {
            this.bu[l] = -1;
        }
        this.ct = 0;
    }
    
    public final void a(final int n, final short n2) {
        this.l = true;
        try {
            this.by = this.bv;
            this.bz = this.bw;
            this.bA = this.bx;
            this.bU = this.bS;
            this.bV = this.bT;
            this.cL = this.cI;
            this.cM = this.cJ;
            this.cN = this.cK;
            this.dk = this.dh;
            this.aX = this.aW;
            this.ah.R = this.ah.L;
            this.cZ = this.ah.O;
            this.cO = n2;
            for (int i = 0; i < 8; ++i) {
                this.ah.S[i] = this.ah.N[i];
                this.ah.U[i] = this.ah.P[i];
                this.ah.T[i] = this.ah.M[i];
            }
            this.ah.u = -2;
            this.Z = 1;
            this.cR = false;
            this.cC = false;
            for (int j = 0; j < 10; ++j) {
                this.bt[j] = -1;
            }
            for (int k = 0; k < 2; ++k) {
                this.bu[k] = -1;
            }
            this.dB = 0;
            this.cs = System.currentTimeMillis();
            this.X = (byte)n;
            this.T.b(n);
            this.ah.ao = true;
            this.V = n2;
            this.W = this.V;
            this.ah.E = 10;
            this.d = true;
            this.b(this.V, 6541);
            this.T.a(this.V, true);
            if (this.X == 12) {
                this.N();
            }
            this.ah.ab = this.ab * HH.D + (HH.H >> 1) << 8;
            final BB ah = this.ah;
            final BB ah2 = this.ah;
            final byte ac = this.ac;
            ah2.af = ac;
            ah.aa = ac;
            this.ah.aj = 1;
            this.ah.ak = 0;
            this.ah.al = 0;
            this.ah.am = 0;
            this.ah.ag = 0;
            this.ah.Z = 0;
            this.ah.ah = 1;
            this.ah.ai = 20;
            this.cs = System.currentTimeMillis();
            this.ct = 0;
            HH.v = this.ad;
            HH.w = this.ae;
            this.d();
            final boolean b = false;
            this.cv = (b ? 1 : 0);
            this.cu = (b ? 1 : 0);
            this.b = 0;
            this.s();
        }
        catch (Exception ex) {}
        this.l = false;
        if (n == 1) {
            this.a.d(this.aa);
        }
    }
    
    public final void g(final int n) {
        if (n >= 0 && n <= 19) {
            this.cI &= ~(1 << n);
            if ((n == 4 || n == 5 || n == 6 || n == 7 || n == 9 || n == 10) && !this.h(4) && !this.h(5) && !this.h(6) && !this.h(7) && !this.h(9) && !this.h(10)) {
                this.cI |= 0x8;
            }
        }
        else if (n >= 20 && n <= 39) {
            this.cJ &= ~(1 << n - 20);
        }
    }
    
    public final boolean h(final int n) {
        if (n >= 0 && n <= 19) {
            return (this.cI & 1 << n) != 0x0;
        }
        return n >= 20 && n <= 39 && (this.cJ & 1 << n - 20) != 0x0;
    }
    
    public final void d(final int n, final int n2) {
        int n3;
        int n4;
        if (n > 0 && n <= 5) {
            n3 = (n - 1) * 6 + n2;
            n4 = this.bw;
        }
        else {
            if (n < 6 || n > 10) {
                this.bv |= 0x1;
                return;
            }
            n3 = (n - 5) * 6 + n2;
            n4 = this.bx;
        }
        if ((n4 & 1 << n3) == 0x0) {
            this.bv &= (byte)254;
            return;
        }
        this.bv |= 0x1;
    }
    
    public final void e(final int n, final int n2) {
        if (n > 0 && n <= 5) {
            this.bw &= ~(1 << (n - 1) * 6 + n2);
            return;
        }
        if (n >= 6 && n <= 10) {
            this.bx &= ~(1 << (n - 5) * 6 + n2);
        }
    }
    
    public final boolean f(final int n, final int n2) {
        int n3;
        int n4;
        if (n > 0 && n <= 5) {
            n3 = (n - 1) * 6 + n2;
            n4 = this.bS;
        }
        else {
            if (n < 6 || n > 10) {
                return false;
            }
            n3 = (n - 6) * 6 + n2;
            n4 = this.bT;
        }
        return (n4 & 1 << n3) != 0x0;
    }
    
    public final int v() {
        int n = 0;
        for (int i = (HH.bR >> 1) - 1; i >= 0; --i) {
            if ((this.bS & 1 << i) == 0x0) {
                ++n;
            }
            if ((this.bT & 1 << i) == 0x0) {
                ++n;
            }
        }
        return n;
    }
    
    public final int i(final int n) {
        int n2 = 0;
        if (n > 0 && n <= 5) {
            final int n3 = (n - 1) * 6;
            for (int i = 0; i < 6; ++i) {
                if ((this.bS & 1 << n3 + i) == 0x0) {
                    ++n2;
                }
            }
        }
        else if (n >= 6 && n <= 10) {
            final int n4 = (n - 6) * 6;
            for (int j = 0; j < 6; ++j) {
                if ((this.bT & 1 << n4 + j) == 0x0) {
                    ++n2;
                }
            }
        }
        return n2;
    }
    
    public final void g(final int n, final int n2) {
        if (n > 0 && n <= 5) {
            this.bS &= ~(1 << (n - 1) * 6 + n2);
        }
        else if (n >= 6 && n <= 10) {
            this.bT &= ~(1 << (n - 6) * 6 + n2);
        }
        if (this.v() >= HH.bQ) {
            this.cB = false;
            this.r(72);
            final BB ah = this.ah;
            ah.O |= (byte)128;
            this.cZ |= (byte)128;
            return;
        }
        if (this.v() == 1) {
            this.cB = false;
            this.r(74);
            return;
        }
        this.cB = false;
        this.r(227);
    }
    
    public final void w() {
        this.ah.u = -2;
        for (int i = 0; i < 6; i = (byte)(i + 1)) {
            this.bs[i] = true;
        }
        this.b(this.V = this.af, 6911);
        this.T.a(this.af, false);
        this.ah.E = 10;
        this.ah.ab = this.ab * HH.D + (HH.H >> 1) << 8;
        this.ah.aa = this.ac;
        HH.v = this.ad;
        HH.w = this.ae;
        this.ah.ag = 0;
        this.ah.ai = 20;
        final BB ah = this.ah;
        final BB ah2 = this.ah;
        final boolean b = false;
        ah2.ac = (short)(b ? 1 : 0);
        ah.ad = (short)(b ? 1 : 0);
        this.ah.a((byte)0);
        this.ah.am = 0;
        if (this.X == 12) {
            final byte[] bh = this.bH;
            final int n = 0;
            final byte[] bh2 = this.bH;
            final int n2 = 1;
            final byte[] bh3 = this.bH;
            final int n3 = 2;
            final byte[] bh4 = this.bH;
            final int n4 = 3;
            final boolean b2 = false;
            bh3[n3] = (bh4[n4] = (byte)(b2 ? 1 : 0));
            bh[n] = (bh2[n2] = (byte)(b2 ? 1 : 0));
            final byte[] bg = this.bG;
            final int n5 = 0;
            final byte[] bg2 = this.bG;
            final int n6 = 1;
            final byte[] bg3 = this.bG;
            final int n7 = 2;
            final byte[] bg4 = this.bG;
            final int n8 = 3;
            final boolean b3 = false;
            bg3[n7] = (bg4[n8] = (byte)(b3 ? 1 : 0));
            bg[n5] = (bg2[n6] = (byte)(b3 ? 1 : 0));
            final int[] bi = this.bI;
            final int n9 = 0;
            final int[] bi2 = this.bI;
            final int n10 = 1;
            final int[] bi3 = this.bI;
            final int n11 = 2;
            final int[] bi4 = this.bI;
            final int n12 = 3;
            final int n13 = 100;
            bi3[n11] = (bi4[n12] = n13);
            bi[n9] = (bi2[n10] = n13);
            this.bI[4] = 200;
        }
    }
    
    public final void a(final int n, final boolean b) {
        if (n == -1) {
            final boolean b2 = false;
            this.ct = (byte)(b2 ? 1 : 0);
            this.ea = (byte)(b2 ? 1 : 0);
            this.W();
            this.a.d(this.aa);
            this.y();
            this.b = 3;
            if (this.cU) {
                this.bu[0] = -1;
                this.bu[1] = -1;
                this.cU = false;
                this.X();
                this.b = 1;
                this.ah.O = this.cZ;
            }
        }
    }
    
    public final void x() {
        if (this.aP != DD.b) {
            this.aP = DD.b;
            try {
                HH.aE = null;
                System.gc();
                e(30);
                HH.aE = Image.createImage(HH.aQ[this.aP]);
            }
            catch (Exception ex) {}
        }
    }
    
    public final void y() {
        try {
            HH.aE = null;
            System.gc();
            e(20);
            HH.aE = Image.createImage(HH.aQ[3]);
        }
        catch (IOException ex) {}
    }
    
    public final void z() {
        try {
            HH.aE = null;
            System.gc();
            e(20);
            HH.aE = Image.createImage(HH.aQ[this.aP]);
        }
        catch (IOException ex) {}
    }
    
    private void s(final int n) {
        if (n < 0 || n > 11) {
            return;
        }
        this.cR = false;
        this.cC = false;
        this.ct = 0;
        this.X = 11;
        this.aP = 3;
        this.T.b(11);
        this.b(this.V, 7229);
        for (int i = 0; i < 10; ++i) {
            this.bt[i] = -1;
        }
        for (int j = 0; j < 6; ++j) {
            this.bs[j] = false;
        }
        for (int k = 0; k < 2; ++k) {
            this.bu[k] = -1;
        }
        this.T.a(n, true);
        this.aP = 1;
        this.ah.ab = this.ab * HH.D + (HH.H >> 1) << 8;
        final BB ah = this.ah;
        final BB ah2 = this.ah;
        final byte ac = this.ac;
        ah2.af = ac;
        ah.aa = ac;
        this.ah.aj = 1;
        this.ah.ak = 0;
        this.ah.al = 0;
        this.ah.am = 0;
        this.ah.ag = 0;
        this.ah.Z = 0;
        this.ah.ah = 1;
        this.ah.ai = 20;
        this.cs = System.currentTimeMillis();
        this.ah.ao = true;
        this.d = true;
        HH.v = this.ad;
        HH.w = this.ae;
        for (int l = 0; l < 8; ++l) {
            this.ah.M[l] = BB.d[l * 3 + this.ah.P[l]];
        }
        this.b = 0;
        this.s();
    }
    
    public final void A() {
        if (this.cW && this.ah.ai != 20) {
            this.ah.ai = 0;
            return;
        }
        if (this.cV) {
            final byte cx = this.cX;
            this.cX = (byte)(cx + 1);
            if (cx > 80) {
                if (!HH.e) {
                    final BB ah = this.ah;
                    --ah.ai;
                }
                this.cX = 0;
            }
        }
        if (this.cY && this.ah.O != 1 && this.ah.M[this.ah.L] <= 0) {
            this.y();
            this.b = 19;
        }
        else {
            for (int i = HH.aZ - 1; i >= 0; --i) {
                if (this.ag[i].ai > 0 && this.ag[i].Z != 4 && this.ag[i].Z != -1) {
                    return;
                }
            }
        }
        this.cV = false;
        this.cW = false;
        this.cX = 0;
        for (int j = 0; j < 10; ++j) {
            this.bt[j] = -1;
        }
        for (int k = 0; k < 2; ++k) {
            this.bu[k] = -1;
        }
        this.ct = 0;
        this.cU = false;
        this.ah.O = this.cZ;
        if (this.b != 19) {
            this.y();
            this.b = 15;
            this.aW += HH.ck[this.V];
            if (this.aW > 999999) {
                this.aW = 999999;
            }
            if (this.V < 11) {
                this.cK |= 1 << 21 + this.V;
                return;
            }
            final BB ah2 = this.ah;
            ah2.O |= 0x40;
        }
    }
    
    public final void j(final int n) {
        switch (n) {
            case 1: {
                this.eb = 6;
                this.W = DD.h[this.V][0];
                break;
            }
            case 6: {
                this.eb = 1;
                this.W = DD.h[this.V][1];
                break;
            }
            case 5: {
                this.eb = 2;
                this.W = DD.h[this.V][2];
                break;
            }
            case 2: {
                this.eb = 5;
                this.W = DD.h[this.V][3];
                break;
            }
        }
        if (this.W == -1) {
            return;
        }
        this.V = this.W;
        this.V();
        this.s();
    }
    
    private void V() {
        this.l = true;
        this.b(this.V, 7455);
        this.T.a(this.V, false);
        switch (this.eb) {
            case 1: {
                final BB ah = this.ah;
                final BB ah2 = this.ah;
                final boolean b = true;
                ah2.af = (byte)(b ? 1 : 0);
                ah.aa = (byte)(b ? 1 : 0);
                HH.w = 0;
                break;
            }
            case 6: {
                final BB ah3 = this.ah;
                final BB ah4 = this.ah;
                final byte b2 = 16;
                ah4.af = b2;
                ah3.aa = b2;
                HH.w = HH.u;
                break;
            }
            case 2: {
                this.ah.ab = 1 * HH.D + (HH.H >> 1) << 8;
                HH.v = 0;
                break;
            }
            case 5: {
                this.ah.ab = 26 * HH.D + (HH.H >> 1) << 8;
                HH.v = HH.t;
                break;
            }
        }
        this.l = false;
    }
    
    public final void a(final int n, final int n2, final int n3) {
        this.ah.w = n * HH.D + (HH.D >> 1) + (this.ah.ao ? -5 : 5) << 8;
        this.ah.x = n2 * HH.E + (HH.E >> 1) - 2 << 8;
        int n4 = 4 * HH.D / 44;
        if (!this.ah.ao) {
            n4 = -n4;
        }
        final byte b = (byte)(10 * HH.E / 44);
        this.ah.y = (this.ah.ab >> 8) + n4 << 8;
        this.ah.z = this.ah.aa * HH.E + (this.ah.ag >> 8) + b << 8;
        this.ah.A = (this.ah.w - this.ah.y) / 6;
        this.ah.B = (this.ah.x - this.ah.z) / 6;
        if (this.ah.x < this.ah.z) {
            this.ah.F = (byte)n3;
            this.ah.u = 0;
            this.ah.a((byte)5);
            this.ah.am = 2;
        }
    }
    
    public final int b(final int n, final int n2, final int n3) {
        int n4 = 18 * HH.E;
        final int n5 = n2 / HH.E;
        if ((DD.e[n / HH.D] & 1 << n5 + 1) > 0) {
            n4 = (n5 + 1) * HH.E;
        }
        return n4;
    }
    
    public final short B() {
        short n = (short)(18 * HH.E);
        if (this.ah.t != 0) {
            return n;
        }
        for (int i = 3; i >= 0; --i) {
            if (this.cp[i] != -1) {
                if (this.cl[i] + this.cn[i] <= (this.ah.ab >> 8) + 8) {
                    if (this.cl[i] + this.cn[i] + HH.D >= (this.ah.ab >> 8) - 8) {
                        final short n2;
                        if ((n2 = (short)(this.cm[i] + this.co[i])) < n && n2 > this.ah.c()) {
                            n = n2;
                            this.ah.H = 0;
                            if (this.cp[i] == 0) {
                                this.ah.H = 2;
                            }
                            else if (this.cp[i] == 2) {
                                this.ah.H = -2;
                            }
                        }
                    }
                }
            }
        }
        return (short)(n - HH.E);
    }
    
    public final short C() {
        short n = (short)(18 * HH.E);
        final short c = this.ah.c();
        final int n2 = this.ah.ab >> 8;
        final int width = HH.aI.getWidth();
        for (int i = 49; i >= 0; --i) {
            if (this.bm[i] != -1) {
                if (this.bl[i] >= c && this.bk[i] <= n2 + 8) {
                    if (this.bk[i] + width >= n2 - 8) {
                        if (this.bl[i] < n) {
                            n = this.bl[i];
                        }
                    }
                }
            }
        }
        return (short)(n - HH.E);
    }
    
    public final boolean D() {
        final int width = HH.aI.getWidth();
        final int n = HH.aI.getHeight() >> 3;
        final byte d = HH.D;
        final byte e = HH.E;
        final int n2 = this.ah.ab >> 8;
        final short c = this.ah.c();
        final byte b = (byte)(e - 1);
        for (int i = 49; i >= 0; --i) {
            if (this.bm[i] >= 0) {
                if (this.d(this.bk[i] - n2) <= d) {
                    if (this.d(this.bl[i] - c) <= e) {
                        if (this.a(this.bk[i], this.bl[i], width, n, n2 - 8, c, 16, b)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean k(final int n) {
        final short b = this.ah.b();
        final short n2 = (short)(this.ah.c() + HH.J);
        final byte z;
        return (z = this.ag[n].Z) != -1 && z != 4 && this.d(this.ag[n].ab - this.ah.ab) <= HH.D << 8 && this.d(this.ag[n].aa - this.ah.aa) <= 3 && this.ag[n].al != 5 && this.a(this.ag[n].c() - FF.a[z], this.ag[n].b() + FF.b[z], FF.c[z], FF.d[z], b - 11, n2 + 7, 18, 37);
    }
    
    public final boolean E() {
        final int width = HH.aI.getWidth();
        final byte d = HH.D;
        final int n = this.ah.ab >> 8;
        final short c = this.ah.c();
        for (int i = 49; i >= 0; --i) {
            if (this.bm[i] >= 0) {
                final int n2;
                if ((n2 = this.bk[i] + (width >> 1)) <= n || this.ah.ao) {
                    if (n2 >= n || !this.ah.ao) {
                        if (this.d(n2 - n) <= d) {
                            if (this.bl[i] == c) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean F() {
        for (int i = HH.aZ - 1; i >= 0; --i) {
            final byte z;
            if ((z = this.ag[i].Z) != -1) {
                if (z != 4) {
                    if (this.ag[i].ab <= this.ah.ab || this.ah.ao) {
                        if (this.ag[i].ab >= this.ah.ab || !this.ah.ao) {
                            if (this.d(this.ag[i].ab - this.ah.ab) <= HH.D << 8) {
                                if (this.ag[i].al != 5) {
                                    if (this.ah.aa == this.ag[i].aa) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final int G() {
        final short b = this.ah.b();
        final short n = (short)(this.ah.c() + HH.J);
        for (int i = HH.aZ - 1; i >= 0; --i) {
            final byte z;
            if ((z = this.ag[i].Z) != -1) {
                if (z != 4) {
                    if (this.d(this.ag[i].ab - this.ah.ab) <= HH.D << 8 && this.d(this.ag[i].aa - this.ah.aa) <= 3) {
                        if (this.ag[i].al != 5) {
                            if (this.a(this.ag[i].c() - FF.a[z], this.ag[i].b() + FF.b[z], FF.c[z], FF.d[z], b - 11, n + 7, 18, 37)) {
                                return i;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public final void h(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)3);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)3, (byte)0);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6 || n == -7) {
            if (n == -7) {
                this.ct = 0;
            }
            this.a.c(3);
            if (this.ct == 0) {
                if (this.c == 0 || this.c == 17 || this.c == 16 || this.c == 24) {
                    this.cs = System.currentTimeMillis();
                    this.z();
                }
                this.b = this.c;
                this.d = true;
            }
            else if (this.ct == 1) {
                this.b = 5;
            }
            else if (this.ct == 2) {
                this.b = 8;
            }
            else if (this.ct == 3) {
                this.b = 7;
            }
            this.ct = 0;
        }
    }
    
    public final void i(final int n, final int n2) {
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.ct == 0) {
                if (this.a.k) {
                    this.a.k = false;
                }
                else {
                    this.a.k = true;
                }
                this.a.a((byte)(this.a.k ? 1 : 0));
            }
        }
        else if (n == -7) {
            this.ct = 0;
            this.b = 4;
            this.a.c(3);
            this.a.a((byte)(this.a.k ? 1 : 0));
        }
    }
    
    public final void j(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)2);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)2, (byte)0);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            this.ea = this.ct;
            this.a.c(3);
            if (this.a.l[this.ct] != 0) {
                this.b = 9;
            }
            else {
                this.f(0);
                this.aa = this.ea;
                this.a.e();
            }
            this.ct = 0;
            return;
        }
        if (n == -7) {
            this.dX = true;
        }
    }
    
    public final void k(final int n, final int n2) {
        if (n == -7) {
            this.a.c(3);
            final boolean b = false;
            this.ct = (byte)(b ? 1 : 0);
            this.ea = (byte)(b ? 1 : 0);
            this.W();
            this.ah.L = this.cT;
            this.b = 3;
            return;
        }
        if (n == 52 || n2 == -3) {
            if (--this.ct < 0) {
                this.ct = 7;
            }
            while ((this.ct > 3 && (this.ah.O & 1 << this.ct + 1) == 0x0) || this.ct == 5) {
                if (this.ct == 7) {
                    return;
                }
                if (--this.ct >= 0) {
                    continue;
                }
                this.ct = 7;
            }
        }
        else if (n == 54 || n2 == -4) {
            if (++this.ct > 7) {
                this.ct = 0;
            }
            while ((this.ct > 3 && (this.ah.O & 1 << this.ct + 1) == 0x0) || this.ct == 5) {
                if (this.ct == 7) {
                    return;
                }
                if (++this.ct <= 7) {
                    continue;
                }
                this.ct = 0;
            }
        }
        else if (n == 53 || n2 == -5 || n == -6) {
            this.a.c(3);
            if (this.ct != 2 || !this.h(3)) {
                if (this.ct == 3 && this.h(8)) {
                    return;
                }
                if (this.ct == 7 && this.ah.Q <= 0) {
                    return;
                }
                if (this.ct != 7 && (this.ah.O & 1 << this.ct + 1) == 0x0) {
                    this.b = 12;
                    this.ea = this.ct;
                    this.ct = 0;
                    return;
                }
                if (this.ct != 7 && this.ah.M[this.ct + 1] >= BB.d[3 * (this.ct + 1) + this.ah.P[this.ct + 1]]) {
                    return;
                }
                this.b = 12;
                this.ea = this.ct;
                this.ct = 0;
            }
        }
    }
    
    public final void l(final int n, final int n2) {
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)1, (byte)0);
            return;
        }
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)1);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            this.a.c(3);
            if (this.ct == 1) {
                if (this.ea == 7) {
                    if (this.aW < this.ah.Q) {
                        this.ct = 0;
                        this.b = 13;
                        return;
                    }
                    this.aW -= this.ah.Q;
                    for (int i = 1; i < 8; ++i) {
                        if ((this.ah.O & 1 << i) > 0) {
                            this.ah.M[i] = BB.d[i * 3 + this.ah.P[i]];
                        }
                    }
                }
                else if ((this.ah.O & 1 << this.ea + 1) == 0x0) {
                    if (this.aW < BB.h[this.ea]) {
                        this.ct = 0;
                        this.b = 13;
                        return;
                    }
                    this.aW -= BB.h[this.ea];
                    final BB ah = this.ah;
                    ah.O |= (byte)(1 << this.ea + 1);
                }
                else {
                    if (this.aW < this.aY[this.ea + 1]) {
                        this.ct = 0;
                        this.b = 13;
                        return;
                    }
                    this.aW -= this.aY[this.ea + 1];
                    final short[] m = this.ah.M;
                    final byte b = (byte)(this.ea + 1);
                    m[b] += BB.d[(this.ea + 1) * 3 + this.ah.P[this.ea + 1]];
                    if (this.ah.M[this.ea + 1] > BB.d[(this.ea + 1) * 3 + this.ah.P[this.ea + 1]]) {
                        this.ah.M[this.ea + 1] = BB.d[(this.ea + 1) * 3 + this.ah.P[this.ea + 1]];
                    }
                }
            }
            this.ct = this.ea;
            this.b = 11;
            this.ah.Q = this.Y();
            return;
        }
        if (n == -7) {
            this.a.c(3);
            this.ct = this.ea;
            this.b = 11;
            this.ah.Q = this.Y();
        }
    }
    
    public final void m(final int n, final int n2) {
        final byte ct = this.ct;
        if (n2 == -1 || n == 50) {
            this.ct = HH.L[this.ct];
            while ((this.cK & 1 << this.ct) == 0x0) {
                this.ct = HH.L[this.ct];
            }
            if (this.ct == 19 && this.cK == 1572865) {
                this.ct = ct;
            }
        }
        else if (n2 == -2 || n == 56) {
            this.ct = HH.M[this.ct];
            while ((this.cK & 1 << this.ct) == 0x0) {
                this.ct = HH.M[this.ct];
            }
            if (this.ct == 19 && this.cK == 1572865) {
                this.ct = ct;
            }
        }
        else if (n2 == -4 || n == 54) {
            this.ct = HH.O[this.ct];
            while ((this.cK & 1 << this.ct) == 0x0) {
                this.ct = HH.O[this.ct];
            }
            if (this.ct == 19 && this.cK == 1572865) {
                this.ct = ct;
            }
        }
        else if (n2 == -3 || n == 52) {
            this.ct = HH.N[this.ct];
            while ((this.cK & 1 << this.ct) == 0x0) {
                this.ct = HH.N[this.ct];
            }
            if (this.ct == 19 && this.cK == 1572865) {
                this.ct = ct;
            }
        }
        else if (n == 53 || n2 == -5 || n == -6) {
            if (this.ct == 19) {
                if (this.cK != 1572865) {
                    this.ah.ao = true;
                    this.ah.a((byte)0);
                    this.ah.am = 0;
                    this.ah.aa = 2;
                    this.ah.ab = 30720;
                    this.ah.ac = 0;
                    this.ah.ad = 0;
                    this.ah.E = 0;
                    this.ah.ag = 0;
                    this.b = 11;
                    this.cT = this.ah.L;
                    this.ah.Q = this.Y();
                    this.ct = 0;
                }
            }
            else if (this.ct == 18) {
                this.bu[0] = -1;
                this.bu[1] = -1;
                this.X();
                this.b = 1;
                for (int i = 0; i < 8; ++i) {
                    this.ah.T[i] = this.ah.M[i];
                }
            }
            else {
                if (this.ct == 0 && this.h(0)) {
                    this.m = 0;
                }
                else if (this.ct == 1 && this.h(4)) {
                    this.m = 5;
                }
                else if (this.ct == 2 && this.h(1)) {
                    this.m = 0;
                }
                else if (this.ct == 3 && this.h(5)) {
                    this.m = 5;
                }
                else if (this.ct == 4 && this.h(2)) {
                    this.m = 1;
                }
                else if (this.ct == 5 && (this.bv & 0x2) != 0x0) {
                    this.m = 3;
                }
                else if (this.ct == 6 && this.h(3)) {
                    this.m = 3;
                }
                else if (this.ct == 7 && (this.bv & 0x4) != 0x0) {
                    this.m = 2;
                }
                else if (this.ct == 8 && this.h(13)) {
                    this.m = 0;
                }
                else if (this.ct == 9 && this.h(8)) {
                    this.m = 0;
                }
                else if (this.ct == 10 && this.h(8)) {
                    this.m = 5;
                }
                else if (this.ct == 11 && this.h(12)) {
                    this.m = 0;
                }
                else if (this.ct == 12 && this.h(9)) {
                    this.m = 5;
                }
                else if (this.ct == 13 && this.h(7)) {
                    this.m = 5;
                }
                else if (this.ct == 14 && this.h(10)) {
                    this.m = 5;
                }
                else if (this.ct == 15 && this.h(11)) {
                    this.m = 4;
                }
                else if (this.ct == 16 && this.h(14)) {
                    this.m = 0;
                }
                else if (this.ct == 17) {
                    this.m = 6;
                }
                else {
                    this.m = -1;
                }
                this.aP = 3;
                this.a(this.cP[this.ct], this.cQ[this.ct]);
                this.ct = 0;
            }
        }
    }
    
    public final void n(final int n, final int n2) {
        if (n == 53 || n2 == -5 || n == -6) {
            ++HH.dA;
            System.gc();
            e(50);
            if (HH.dA == 3 || (HH.dA == 2 && !HH.dF && !HH.dE)) {
                final boolean b = false;
                this.ct = (byte)(b ? 1 : 0);
                this.ea = (byte)(b ? 1 : 0);
                this.b = 21;
                HH.dA = 0;
                return;
            }
            a(HH.dA);
        }
    }
    
    public final void o(final int n, final int n2) {
        if (n == 53 || n2 == -5 || n == -6) {
            final boolean b = false;
            this.ct = (byte)(b ? 1 : 0);
            this.ea = (byte)(b ? 1 : 0);
            if (this.c == 21) {
                this.W();
                this.b = 3;
            }
            else if (this.c == 15) {
                this.X();
                this.b = 1;
            }
            this.a.c(3);
        }
    }
    
    public final void p(final int n, final int n2) {
        this.ct = 0;
        this.b = 11;
        this.ah.Q = this.Y();
        this.a.c(3);
    }
    
    public final void q(final int n, final int n2) {
        if (n == 53 || n2 == -5 || n == -6) {
            HH.ay = null;
            System.gc();
            e(20);
            if (!this.Y) {
                this.ct = 1;
                this.b = 23;
                return;
            }
            this.dX = true;
        }
    }
    
    public final void r(final int n, final int n2) {
        if (n == 53 || n2 == -5 || n == -6) {
            this.bu[0] = -1;
            this.bu[1] = -1;
            this.y();
            if (this.b == 19) {
                this.X();
                this.b = 1;
            }
            else if (this.b == 15) {
                this.c = this.b;
                this.b = 10;
                this.a.d(this.aa);
            }
            this.d = true;
        }
    }
    
    public final void s(final int n, final int n2) {
        if (n == 53 || n2 == -5 || n == -6) {
            this.s(this.ea);
            this.d = true;
            return;
        }
        if (n == -7) {
            this.X();
            this.b = 1;
            this.d = true;
            this.ah.O = this.cZ;
            this.cU = false;
        }
    }
    
    public final void t(final int n, final int n2) {
        if (n2 == -2 || n == 56) {
            if ((this.cK & 1 << this.ct + 21) == 0x0 || this.ct == 11) {
                return;
            }
            ++this.ct;
            if (this.ct >= 8) {
                HH.dj = 2;
                return;
            }
            if (this.ct >= 4) {
                HH.dj = 1;
                return;
            }
            HH.dj = 0;
        }
        else if (n2 == -1 || n == 50) {
            if (this.ct == 0) {
                return;
            }
            --this.ct;
            if (this.ct >= 8) {
                HH.dj = 2;
                return;
            }
            if (this.ct >= 4) {
                HH.dj = 1;
                return;
            }
            HH.dj = 0;
        }
        else {
            if (n == 53 || n2 == -5 || n == -6) {
                this.cZ = this.ah.O;
                this.cU = true;
                this.cV = false;
                this.cW = false;
                this.cY = false;
                this.cX = 0;
                switch (this.ct) {
                    case 0: {
                        this.m = 7;
                        break;
                    }
                    case 1: {
                        this.m = 7;
                        break;
                    }
                    case 2: {
                        this.cY = true;
                        this.ah.O = 2;
                        this.ah.L = 1;
                        this.m = 12;
                        break;
                    }
                    case 3: {
                        this.m = 7;
                        break;
                    }
                    case 4: {
                        this.cY = true;
                        this.ah.O = 1;
                        this.ah.L = 0;
                        this.m = 8;
                        break;
                    }
                    case 5: {
                        this.cY = true;
                        this.ah.O = 2;
                        this.ah.L = 1;
                        this.m = 12;
                        break;
                    }
                    case 6: {
                        this.cV = true;
                        this.m = 9;
                        break;
                    }
                    case 7: {
                        this.cW = true;
                        this.m = 10;
                        break;
                    }
                    case 8: {
                        this.m = 7;
                        break;
                    }
                    case 9: {
                        this.cW = true;
                        this.m = 10;
                        break;
                    }
                    case 10: {
                        this.cV = true;
                        this.m = 9;
                        break;
                    }
                    case 11: {
                        this.cY = true;
                        this.ah.O = 64;
                        this.ah.L = 6;
                        this.m = 11;
                        break;
                    }
                }
                this.V = this.ct;
                this.ea = this.ct;
                this.b = 14;
                return;
            }
            if (n == -7) {
                final boolean b = false;
                this.ct = (byte)(b ? 1 : 0);
                this.ea = (byte)(b ? 1 : 0);
                this.W();
                this.b = 3;
                if ((this.ah.O & 1 << this.ah.L) == 0x0 || this.ah.L == 0) {
                    this.ah.L = 1;
                }
                for (int i = 0; i < 8; ++i) {
                    this.ah.M[i] = this.ah.T[i];
                }
                this.a.c(3);
            }
        }
    }
    
    public final void u(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)1);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)1, (byte)0);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            this.a.c(3);
            if (this.ct == 0) {
                this.dX = true;
                if (HH.dz > 0) {
                    return;
                }
            }
            else if (this.ct == 1) {
                this.O();
            }
        }
    }
    
    public final void v(final int n, final int n2) {
        int n3 = 0;
        if (n == 54 || n == 50 || n2 == -4 || n2 == -1) {
            this.ah.L = HH.P[this.ah.L];
            while ((this.ah.O & 1 << this.ah.L) == 0x0 && n3 < 8) {
                this.ah.L = HH.P[this.ah.L];
                ++n3;
            }
        }
        else if (n == 52 || n == 56 || n2 == -3 || n2 == -2) {
            this.ah.L = HH.Q[this.ah.L];
            while ((this.ah.O & 1 << this.ah.L) == 0x0 && n3 < 8) {
                this.ah.L = HH.Q[this.ah.L];
                ++n3;
            }
        }
        else if (n2 == -5 || n == 53) {
            final boolean b = false;
            this.ct = (byte)(b ? 1 : 0);
            this.ea = (byte)(b ? 1 : 0);
            this.cs = System.currentTimeMillis();
            this.b = 0;
            this.s();
        }
    }
    
    public final void w(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)1);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)1, (byte)0);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            this.a.c(3);
            if (this.ct == 0) {
                this.a.e();
                this.b = 6;
            }
            else if (this.ct == 1) {
                this.aa = this.ea;
                this.f(0);
            }
            this.ct = 0;
            return;
        }
        if (n == -7) {
            this.a.c(3);
            this.ct = 0;
            this.b = 6;
        }
    }
    
    public final void x(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)1);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)1, (byte)0);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            this.a.c(3);
            if (this.ct == 0) {
                this.c = this.b;
                this.b = 10;
                HH.dz += HH.dy;
                this.a.d(this.aa);
                return;
            }
            if (this.ct == 1) {
                this.bv = this.by;
                this.bw = this.bz;
                this.bx = this.bA;
                this.bS = this.bU;
                this.bT = this.bV;
                this.cI = this.cL;
                this.cJ = this.cM;
                this.cK = this.cN;
                this.dh = this.dk;
                this.aW = this.aX;
                this.ah.L = this.ah.R;
                this.ah.O = this.cZ;
                for (int i = 0; i < 8; ++i) {
                    this.ah.N[i] = this.ah.S[i];
                    this.ah.P[i] = this.ah.U[i];
                    this.ah.M[i] = this.ah.T[i];
                }
                if (this.X == 1) {
                    this.bY = true;
                }
                this.aP = 3;
                this.a(this.X, this.cO);
            }
        }
    }
    
    public final void y(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)1);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)1, (byte)0);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.ct == 0) {
                this.b = 4;
                this.ct = 0;
                this.a.c(3);
                return;
            }
            if (this.ct == 1) {
                this.cU = true;
                this.ah.O = this.cZ;
                this.ah.L = 1;
                this.cU = false;
                if (this.X != 0) {
                    this.a.d(this.aa);
                }
                this.dX = true;
            }
        }
        else if (n == -7) {
            this.a.c(3);
            this.ct = 0;
            this.b = 4;
        }
    }
    
    public final void z(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.ct = this.a(this.ct, (byte)0, (byte)1);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.ct = this.b(this.ct, (byte)1, (byte)0);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.ct == 0) {
                this.b = 4;
                this.ct = 0;
                this.a.c(3);
                return;
            }
            if (this.ct == 1) {
                this.cU = true;
                this.ah.O = this.cZ;
                this.ah.L = 1;
                this.cU = false;
                if (this.X != 0) {
                    this.a.d(this.aa);
                }
                this.a.a();
            }
        }
        else if (n == -7) {
            this.ct = 0;
            this.b = 4;
            this.a.c(3);
        }
    }
    
    public final void A(final int n, final int cv) {
        if (this.cC) {
            if (cv == -5 || n == 53) {
                if (this.cE >= 0) {
                    this.cE = this.cF;
                }
                if (this.cE < 0) {
                    this.S();
                    this.cF = 0;
                }
            }
            return;
        }
        if (this.b == 16 || this.b == 17 || this.b == 24) {
            return;
        }
        if (n == -6 || n == -7) {
            this.ct = 0;
            this.c = this.b;
            this.b = 4;
            this.y();
            return;
        }
        if (this.ah.al == 10) {
            final boolean b = false;
            this.cv = (b ? 1 : 0);
            this.cu = (b ? 1 : 0);
            this.cw &= 0xFFFFFF7F;
            this.cx = 0L;
            return;
        }
        if (cv == -1) {
            if (this.ah.al == 11) {
                return;
            }
            int n2 = 0;
            if (this.ah.u == -1 && this.ah.al != 12) {
                this.ah.o();
            }
            else if (this.ah.s >= 0) {
                if (this.ah.g() && !this.ah.ao && this.dY != -1) {
                    if (!HH.x) {
                        HH.x = true;
                        HH.C = this.ah.b() - 8 + (HH.D >> 1);
                    }
                    n2 = -1;
                    this.dY = -1;
                    this.ah.ad = 2500;
                    this.ah.s = 0;
                    this.ah.ao = true;
                    this.ah.a((byte)4);
                    final boolean b2 = false;
                    this.cu = (b2 ? 1 : 0);
                    this.cv = (b2 ? 1 : 0);
                }
                else if (this.ah.h() && this.ah.ao && this.dY != 1) {
                    if (!HH.x) {
                        HH.x = true;
                        HH.C = this.ah.b() + 8 - (HH.D >> 1);
                    }
                    n2 = 1;
                    this.dY = 1;
                    this.ah.ad = -2500;
                    this.ah.s = 0;
                    this.ah.ao = false;
                    this.ah.a((byte)4);
                    final boolean b3 = false;
                    this.cu = (b3 ? 1 : 0);
                    this.cv = (b3 ? 1 : 0);
                }
            }
            if (this.ah.s < 1 || n2 != 0) {
                this.cu = cv;
            }
        }
        else if (cv == -2) {
            if (this.ah.al == 5) {
                return;
            }
            if (this.ah.s == 2) {
                this.ah.a((byte)3);
                this.ah.ad = 0;
                this.ah.ac = 0;
                this.ah.s = 1;
                if ((this.ah.O & 0x1) > 0) {
                    this.cv = 0;
                    this.ah.a((byte)14);
                    this.ah.am = 1;
                    this.ah.D = 1;
                }
            }
            else {
                if ((this.ah.O & 0x1) > 0 && this.ah.s != -1 && this.ah.al != 11 && this.ah.al != 14) {
                    this.cv = 0;
                    this.ah.a((byte)14);
                    this.ah.am = 1;
                    this.ah.D = 1;
                    return;
                }
                if (HH.z) {
                    this.a((int)HH.A, HH.B);
                    return;
                }
                if (this.ah.G) {
                    this.ah.G = false;
                    final BB ah = this.ah;
                    ++ah.aa;
                    this.ah.k();
                    this.ah.t = 10;
                    if ((this.ah.O & 0x1) > 0 && this.ah.al != 14) {
                        this.cv = 0;
                        this.ah.a((byte)14);
                        this.ah.am = 1;
                        this.ah.D = 1;
                    }
                }
                else if (this.ah.f() && this.ah.ac == 0 && this.ah.al != 14 && this.ah.al != 11) {
                    this.ah.k();
                    final BB ah2 = this.ah;
                    ++ah2.aa;
                    this.ah.ag = HH.E - 2;
                    if ((this.ah.O & 0x1) > 0) {
                        this.cv = 0;
                        this.ah.a((byte)14);
                        this.ah.am = 1;
                        this.ah.D = 1;
                    }
                }
            }
        }
        else if (cv == -3) {
            this.cu = cv;
            this.cv = cv;
            if (HH.x && this.ah.b() < HH.C + (HH.D >> 1) && this.ah.ad > 0) {
                final boolean b4 = false;
                this.cu = (b4 ? 1 : 0);
                this.cv = (b4 ? 1 : 0);
            }
        }
        else if (cv == -4) {
            this.cu = cv;
            this.cv = cv;
            if (HH.x && this.ah.b() > HH.C - (HH.D >> 1) && this.ah.ad < 0) {
                final boolean b5 = false;
                this.cu = (b5 ? 1 : 0);
                this.cv = (b5 ? 1 : 0);
            }
        }
        else if (n == 53 || cv == -5) {
            int a;
            final short n3 = (short)(a = this.T.a(this.ah.u(), (byte)((this.ah.c() + HH.I) / HH.E) - 1));
            a -= 36;
            final int n4 = 1 << a;
            if ((this.ah.O & 0x1) > 0 && this.ah.s == -1 && this.ah.al != 11 && this.ah.al != 14 && this.ah.al != 8 && (this.F() || this.E() || this.ah.M[this.ah.L] <= 0 || ((this.bv & n4) != 0x0 && n3 >= 36 && n3 <= 42))) {
                this.cv = 0;
                this.ah.D = 0;
                this.ah.q();
                return;
            }
            if (this.ah.M[this.ah.L] > 0 && this.cw == 0) {
                this.ah.p();
                this.cw = 129;
                ++HH.dC;
                this.cx = System.currentTimeMillis();
            }
        }
        else if (n == 42) {
            this.cv = 0;
            if ((this.ah.O & 0x1) > 0 && this.ah.s == -1) {
                this.ah.D = 0;
                this.ah.q();
            }
        }
        else if (n == 35) {
            this.ct = 0;
            this.b = 22;
            if (this.ah.L != 0) {
                final BB ah3 = this.ah;
                if (++ah3.L > 7) {
                    this.ah.L = 1;
                }
                while ((this.ah.O & 1 << this.ah.L) == 0x0) {
                    final BB ah4 = this.ah;
                    if (++ah4.L > 7) {
                        this.ah.L = 1;
                    }
                }
            }
        }
        else if (n == 55) {
            if (!this.p) {
                return;
            }
            if (this.X == 12) {
                this.bI[4] = 0;
                return;
            }
            this.cB = true;
            this.cH = HH.cy[this.X - 1];
            this.r(HH.cz[this.X - 1]);
            this.g(this.X - 1);
            if (HH.cz[this.X - 1] == 112 && (this.bv & 0x2) == 0x0) {
                this.dB = 248;
                HH.dx = 16;
                return;
            }
            this.dB = 233 + (this.X - 1);
            HH.dx = (byte)(this.X - 1);
        }
        else if (n == 49) {
            if (HH.x || this.ah.al == 11) {
                return;
            }
            if (this.ah.u >= 0 || this.ah.al == 5) {
                return;
            }
            if (this.ah.al != 12) {
                this.ah.a((byte)0);
            }
            if (this.ah.s < 0) {
                final BB ah5 = this.ah;
                this.ah.getClass();
                ah5.ac = 3584;
                final BB ah6 = this.ah;
                ++ah6.s;
            }
            else if (this.ah.s < 1) {
                final BB ah7 = this.ah;
                this.ah.getClass();
                ah7.ac = 3072;
                final BB ah8 = this.ah;
                ++ah8.s;
                this.ah.am = 1;
                this.ah.a((byte)13);
            }
            this.cu = -3;
        }
        else if (n == 51) {
            if (HH.x || this.ah.al == 11) {
                return;
            }
            if (this.ah.u >= 0 || this.ah.al == 5) {
                return;
            }
            if (this.ah.al != 12) {
                this.ah.a((byte)0);
            }
            if (this.ah.s < 0) {
                final BB ah9 = this.ah;
                this.ah.getClass();
                ah9.ac = 3584;
                final BB ah10 = this.ah;
                ++ah10.s;
            }
            else if (this.ah.s < 1) {
                final BB ah11 = this.ah;
                this.ah.getClass();
                ah11.ac = 3072;
                final BB ah12 = this.ah;
                ++ah12.s;
                this.ah.am = 1;
                this.ah.a((byte)13);
            }
            this.cu = -4;
        }
        else if (n == 57) {
            if (!this.p) {
                return;
            }
            this.g(this.X, this.V);
        }
        else if (n == 48) {
            if (!this.p) {
                return;
            }
            if (!HH.e) {
                HH.e = true;
                System.out.println("lifeCheat=" + HH.e);
                return;
            }
            if (this.cK == -1) {
                this.bw = 0;
                this.bx = 0;
                this.bv = 0;
                return;
            }
            if (this.ah.O == -1) {
                this.cK = -1;
                return;
            }
            this.ah.O = -1;
        }
    }
    
    public final void B(final int n, final int n2) {
        if (n == 53 || n2 == -5) {
            this.cw &= 0xFFFFFF7F;
            if (this.ah.al != 8) {
                this.ah.r();
            }
            this.cx = 0L;
        }
        else if ((this.cw & 0x80) != 0x0 && this.cx != 0L && System.currentTimeMillis() - this.cx > 5000L) {
            this.cw &= 0xFFFFFF7F;
            if (this.ah.al != 8) {
                this.ah.r();
            }
            this.cx = 0L;
        }
        if (n2 == this.cu) {
            this.cu = 0;
        }
        if (n2 == this.cv) {
            this.cv = 0;
        }
    }
    
    public final void l(final int n) {
        final int width = HH.aI.getWidth();
        final int n2 = HH.aI.getHeight() >> 3;
        final byte f;
        if ((f = this.aj[n].f) == -1 || f == 30 || (f >= 15 && f <= 17)) {
            return;
        }
        final int n3 = (this.aj[n].g >> 8) - this.aj[n].p;
        final int n4 = (this.aj[n].h >> 8) - this.aj[n].q;
        final int n5 = this.aj[n].p << 1;
        final int n6 = this.aj[n].q << 1;
        for (int i = 49; i >= 0; --i) {
            if (this.bm[i] != -1) {
                if (this.bk[i] + HH.v <= 240 && this.bk[i] + width + HH.v >= 0 && this.bl[i] + HH.w <= 320) {
                    if (this.bl[i] + n2 + HH.w >= 0) {
                        if (this.a(this.bk[i], this.bl[i], width, n2, n3, n4, n5, n6)) {
                            this.aj[n].a(true);
                        }
                    }
                }
            }
        }
    }
    
    public final void m(final int n) {
        final int width = HH.aI.getWidth();
        final int n2 = HH.aI.getHeight() >> 3;
        if (n == -1) {
            for (int i = 49; i >= 0; --i) {
                if (this.bm[i] != -1) {
                    if (this.d(this.bk[i] - (this.ah.ab >> 8)) <= 3 * HH.D >> 1) {
                        if (this.d(this.bl[i] - this.ah.c()) <= HH.E * 2) {
                            if (this.a(this.bk[i], this.bl[i] + this.bn[i], HH.aI.getWidth(), HH.aI.getHeight() >> 2, (this.ah.ab >> 8) + (this.ah.ao ? BB.o[this.ah.D] : (-BB.o[this.ah.D] - BB.q[this.ah.D])), this.ah.c() + BB.p[this.ah.D], BB.q[this.ah.D], BB.r[this.ah.D])) {
                                this.a.c(4);
                                this.n(i);
                                ++HH.dD;
                                if (this.bm[i] == 0) {
                                    this.c(this.bk[i] + (width >> 1), this.bl[i] + this.bn[i], 0);
                                    this.c(this.bk[i] + (width >> 1), this.bl[i] + this.bn[i], 0);
                                }
                                else {
                                    this.c(this.bk[i] + (width >> 1), this.bl[i] + this.bn[i], this.bm[i]);
                                }
                                this.e(this.bk[i] + (width >> 1) << 8, this.bl[i] + (n2 >> 1) + this.bn[i] << 8, 30);
                                this.bm[i] = -1;
                            }
                        }
                    }
                }
            }
            return;
        }
        final byte f;
        if ((f = this.ai[n].f) == -1 || f == 30 || (f >= 15 && f <= 17)) {
            return;
        }
        final int n3 = (this.ai[n].g >> 8) - this.ai[n].p;
        final int n4 = (this.ai[n].h >> 8) - this.ai[n].q;
        final int n5 = this.ai[n].p << 1;
        final int n6 = this.ai[n].q << 1;
        for (int j = 49; j >= 0; --j) {
            if (this.bm[j] != -1) {
                if (this.bk[j] + HH.v <= 240 && this.bk[j] + width + HH.v >= 0 && this.bl[j] + HH.w <= 320) {
                    if (this.bl[j] + n2 + HH.w >= 0) {
                        if (this.a(this.bk[j], this.bl[j] + this.bn[j], width, n2, n3, n4, n5, n6)) {
                            this.n(j);
                            ++HH.dD;
                            if (this.bm[j] == 0) {
                                this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], 0);
                                this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], 0);
                            }
                            else {
                                this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], this.bm[j]);
                            }
                            this.e(this.bk[j] + (width >> 1) << 8, this.bl[j] + (n2 >> 1) + this.bn[j] << 8, 30);
                            this.bm[j] = -1;
                            this.ai[n].a(false);
                        }
                    }
                }
            }
        }
    }
    
    public final void H() {
        final int n = HH.E >> 3;
        for (int i = 11; i >= 0; --i) {
            if (this.cj[i] != -1) {
                final int[] cg = this.cg;
                final int n2 = i;
                cg[n2] += n << 8;
                final int b = this.b((this.cf[i] >> 8) + 9, this.cg[i] >> 8, HH.E - 19);
                if ((this.cg[i] >> 8) + 19 >= b) {
                    this.cg[i] = b - 19 << 8;
                }
            }
        }
    }
    
    public final void I() {
        if (this.bO == -1) {
            return;
        }
        if (this.a(this.ah.b() - 11, this.ah.c() + HH.J + 7, 18, 37, this.bO * HH.D, this.bP * HH.E, 19, 19)) {
            final byte b = -1;
            this.bP = b;
            this.bO = b;
            this.g(this.X, this.V);
            ++HH.dq;
        }
    }
    
    public final void x(final Graphics graphics) {
        ratchetandclank.e = ratchetandclank.h;
        graphics.setClip(0, 0, 240, (int)HH.F);
        graphics.setColor(0);
        graphics.fillRect(0, 0, 240, (int)HH.F);
        final int n = 240 - (HH.D >> 1);
        final int n2 = HH.aD.getHeight() / 12;
        final int width = HH.aD.getWidth();
        if (this.ah.ai < 0) {
            this.ah.ai = 0;
        }
        final byte b = (byte)(20 - this.ah.ai);
        final int n3 = n2 >> 1;
        final int n4 = (240 - 10 * n3) / 2;
        EE.b.drawImage(HH.al, 0, 0, 20, 0);
        EE.b.drawImage(HH.al, 240 - HH.al.getWidth(), 0, 20, 8192);
        graphics.drawImage(HH.am, (240 - HH.am.getWidth()) / 2, (HH.F - HH.am.getHeight()) / 2, 0);
        graphics.setColor(255, 255, 255);
        final int n5 = (HH.al.getHeight() - ratchetandclank.e.a) / 2;
        final byte l;
        if ((l = this.ah.L) != 6 && l != 0) {
            ratchetandclank.e.a(graphics, String.valueOf(this.ah.M[l]), 3 + width + 6, n5, 0);
        }
        ratchetandclank.e.a(graphics, Integer.toString(this.aW), n, n5, 24);
        graphics.setColor(37, 84, 106);
        for (byte b2 = 0; b2 < b; ++b2) {
            graphics.fillRect(n4 + (b2 >> 1) * n3, 4 + b2 % 2 * n3, n3, n3);
        }
        if (this.ah.L != 0) {
            this.a(graphics, 3, 4, width, n2);
            graphics.drawImage(HH.aD, 3, 4 - (this.ah.L - 1) * n2, 0);
        }
        this.a(graphics, 237 - width, 4, width, n2);
        graphics.drawImage(HH.aD, 237 - width, 4 - 10 * n2, 0);
    }
    
    public final void y(final Graphics graphics) {
        if (HH.y) {
            final int n = HH.aD.getHeight() / 12;
            final int width = HH.aD.getWidth();
            graphics.setClip(240 - width >> 1, (int)HH.F, width, n);
            graphics.drawImage(HH.aD, 240 - width >> 1, HH.F - 7 * n, 0);
        }
    }
    
    public final void z(final Graphics graphics) {
        final int v = HH.v;
        final int n = HH.w + HH.J;
        for (int i = 3; i >= 0; --i) {
            if (this.bb[i] != -1) {
                final short n2 = (short)(this.bb[i] + v);
                final short n3 = (short)(this.bc[i] + n);
                final short n4 = (short)(this.bd[i] + v);
                final short n5 = (short)(this.be[i] + n);
                if ((n2 <= 240 || n4 <= 240) && (n2 >= 0 || n4 >= 0) && (n3 <= 320 || n5 <= 320)) {
                    if (n3 >= 0 || n5 >= 0) {
                        graphics.setClip(0, (int)HH.F, 240, 320 - HH.F);
                        graphics.setColor(15658734);
                        graphics.drawLine((int)n2, n3 - 2, (int)n4, n5 - 2);
                        graphics.setColor(12303291);
                        graphics.drawLine((int)n2, n3 - 1, (int)n4, n5 - 1);
                        graphics.setColor(8947848);
                        graphics.drawLine((int)n2, (int)n3, (int)n4, (int)n5);
                        graphics.setColor(5592405);
                        graphics.drawLine((int)n2, n3 + 1, (int)n4, n5 + 1);
                        graphics.setColor(2236962);
                        graphics.drawLine((int)n2, n3 + 2, (int)n4, n5 + 2);
                    }
                }
            }
        }
    }
    
    public final void A(final Graphics graphics) {
        final byte d = HH.D;
        final byte e = HH.E;
        for (int i = 3; i >= 0; --i) {
            if (this.cp[i] >= 0) {
                final int n = this.cl[i] + this.cn[i] + HH.v;
                final int n2 = this.cm[i] + this.co[i] + HH.w;
                if (n < 240 && n + d >= 0 && n2 < 320) {
                    if (n2 + e >= 0) {
                        if (0 < e) {
                            final byte b = (byte)(this.aP * HH.E);
                            this.b(graphics, n, n2, d, e - 0);
                            graphics.drawImage(HH.aC, n, n2 - 0 - b, 0);
                        }
                    }
                }
            }
        }
    }
    
    public final void J() {
        final int width = HH.aI.getWidth();
        final int n = HH.aI.getHeight() >> 3;
        int n2 = 8;
        short n3 = this.ah.c();
        int n4 = 16;
        final byte i = HH.I;
        for (int j = 49; j >= 0; --j) {
            final int n5 = this.ah.ab >> 8;
            if (this.br[j] && this.bm[j] != -1) {
                if (this.bq[j] == -1 || !this.br[this.bq[j]]) {
                    if (this.a(this.bk[j], this.bl[j] + this.bn[j], width, n, n5 - n2, n3, n4, i)) {
                        if (this.bm[j] == 0) {
                            this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], 0);
                            this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], 0);
                        }
                        else {
                            this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], this.bm[j]);
                        }
                        this.n(j);
                        this.e(this.bk[j] + (width >> 1) << 8, this.bl[j] + (n >> 1) + this.bn[j] << 8, 30);
                        this.bm[j] = -1;
                        continue;
                    }
                    n2 = 12;
                    n4 = 24;
                    for (int k = HH.aZ - 1; k >= 0; --k) {
                        if (this.ag[k].Z >= 0) {
                            final int n6 = this.ag[k].ab >> 8;
                            n3 = this.ag[k].b();
                            if (n6 + 12 >= this.bk[j]) {
                                if (n6 - 12 <= this.bk[j] + width) {
                                    if (this.a(this.bk[j], this.bl[j] + this.bn[j], width, n, n6 - 12, n3, 24, i)) {
                                        this.n(j);
                                        this.br[j] = false;
                                        if (this.bm[j] == 0) {
                                            this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], 0);
                                            this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], 0);
                                        }
                                        else {
                                            this.c(this.bk[j] + (width >> 1), this.bl[j] + this.bn[j], this.bm[j]);
                                        }
                                        this.e(this.bk[j] + (width >> 1) << 8, this.bl[j] + (n >> 1) + this.bn[j] << 8, 30);
                                        this.bm[j] = -1;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                final short[] bn = this.bn;
                final int n7 = j;
                bn[n7] += 4;
                if (this.bm[j] != -1 && this.bn[j] + this.bl[j] >= this.bo[j]) {
                    this.bl[j] = this.bo[j];
                    this.bn[j] = 0;
                    this.br[j] = false;
                }
            }
        }
    }
    
    public final void n(final int n) {
        short n2 = this.bp[n];
        short n3 = 0;
        int n4 = 0;
        short v = this.V;
        if (this.cU) {
            v = 0;
        }
        final int[] bt = this.bt;
        final int n5 = n + v * 50 >> 5;
        bt[n5] &= ~(1 << n - (n >> 5 << 5));
        if (this.br[n] || (n2 != -1 && this.br[n2])) {
            n4 = 1;
        }
        while (n2 != -1) {
            this.br[n2] = true;
            if (n4 == 1) {
                if (this.bq[n2] == n) {
                    n3 = this.bo[n2];
                    this.bo[n2] = this.bo[n];
                }
                else {
                    final short n6 = this.bo[n2];
                    this.bo[n2] = n3;
                    n3 = n6;
                }
            }
            else {
                this.bo[n2] = this.bl[this.bq[n2]];
            }
            n2 = this.bp[n2];
        }
        if (this.bp[n] != -1) {
            this.bq[this.bp[n]] = this.bq[n];
        }
        if (this.bq[n] != -1) {
            this.bp[this.bq[n]] = this.bp[n];
        }
        this.bp[n] = -1;
        this.bq[n] = -1;
    }
    
    public final void B(final Graphics graphics) {
        final int width = HH.aI.getWidth();
        final int n = HH.aI.getHeight() >> 3;
        final int v = HH.v;
        final int w = HH.w;
        for (int i = 0; i < 50; ++i) {
            if (this.bm[i] >= 0) {
                final short n2 = (short)(this.bk[i] + v);
                final short n3 = (short)(this.bl[i] + this.bn[i] + w);
                if (n2 < 240 && n2 + width >= 0 && n3 < 320) {
                    if (n3 + n >= 0) {
                        if (0 < n) {
                            this.b(graphics, n2, n3, width, n - 0);
                            graphics.drawImage(HH.aI, (int)n2, n3 - this.bm[i] * n - 0, 0);
                        }
                    }
                }
            }
        }
    }
    
    public final void C(final Graphics graphics) {
        final int v = HH.v;
        final int w = HH.w;
        for (int i = 11; i >= 0; --i) {
            if (this.cj[i] >= 0) {
                final int n = (this.cf[i] >> 8) + v;
                final int n2 = (this.cg[i] >> 8) + w;
                if (n < 240 && n + 19 >= 0 && n2 < 320) {
                    if (n2 + 19 >= 0) {
                        this.b(graphics, n, n2, 19, 19);
                        graphics.drawImage(HH.aK, n, n2 - this.cj[i] * 19 - 0, 0);
                    }
                }
            }
        }
    }
    
    public final void D(final Graphics graphics) {
        final int width = HH.av.getWidth();
        final int height = HH.av.getHeight();
        final int n = this.bZ * HH.D + HH.v;
        final int n2 = this.ca * HH.E + HH.w;
        if (n >= 240 || n + width < 0 || n2 >= 320 || n2 + height < 0) {
            return;
        }
        if (0 < height) {
            this.b(graphics, n, n2, width, height - 0);
            graphics.drawImage(HH.av, n, n2 - 0, 0);
        }
    }
    
    public final void K() {
        if (this.bZ == -1) {
            return;
        }
        if (this.a(this.ah.b() - 11, this.ah.c() + HH.J + 7, 18, 37, this.bZ * HH.D, this.ca * HH.E, HH.av.getHeight(), HH.av.getWidth())) {
            final byte b = -1;
            this.ca = b;
            this.bZ = b;
            this.cB = true;
            this.cH = HH.cy[11];
            this.r(HH.cz[11]);
            this.g(11);
            this.dB = 261;
            HH.dx = 11;
        }
    }
    
    public final void E(final Graphics graphics) {
        for (int i = HH.aZ - 1; i >= 0; --i) {
            if (this.ag[i].Z != -1) {
                this.ag[i].a(graphics, i, this.ag[i].ah, HH.v, HH.w);
            }
        }
        this.ah.a(graphics, this.ah.ah, HH.v, HH.w);
        for (int j = 9; j >= 0; --j) {
            this.aj[j].a(graphics);
        }
        for (int k = 9; k >= 0; --k) {
            this.ai[k].a(graphics);
        }
    }
    
    public final void L() {
        this.dZ = true;
        int i = 9;
        while (i >= 0) {
            if (this.aj[i].f != -1) {
                --i;
            }
            else {
                this.aj[i].g = HH.D * 14 << 8;
                this.aj[i].h = HH.E * 9 << 8;
                this.aj[i].f = 31;
                this.aj[i].o = 0;
                this.aj[i].r = 25;
                this.aj[i].p = JJ.b[31];
                this.aj[i].q = JJ.c[31];
                if (this.bJ == 0 || this.bJ == 1 || this.bJ == 7) {
                    this.aj[i].m = JJ.d[31] << 8;
                }
                else if (this.bJ == 2 || this.bJ == 6) {
                    this.aj[i].m = 0;
                }
                else {
                    this.aj[i].m = -(JJ.d[31] << 8);
                }
                if (this.bJ == 2 || this.bJ == 1 || this.bJ == 3) {
                    this.aj[i].n = -(JJ.d[31] << 8);
                    return;
                }
                if (this.bJ == 0 || this.bJ == 4) {
                    this.aj[i].n = 0;
                    return;
                }
                this.aj[i].n = JJ.d[31] << 8;
            }
        }
    }
    
    public final void C(final int n, final int n2) {
        this.dZ = false;
        int n3 = (n >> 8) / HH.D;
        int n4 = (n2 >> 8) / HH.E;
        if (!this.T.b(n3, n4)) {
            if (this.T.b(n3, n4 - 1)) {
                --n4;
            }
            else if (this.T.b(n3, n4 + 1)) {
                ++n4;
            }
            else if (this.T.b(n3 + 1, n4)) {
                ++n3;
            }
            else {
                if (!this.T.b(n3 - 1, n4)) {
                    return;
                }
                --n3;
            }
        }
        this.a(n3, n4, (byte)1, -1);
    }
    
    public final void M() {
        if (this.bI[4] <= 0) {
            this.a.k();
            this.X = 100;
            this.ct = 0;
            this.b = 24;
            this.bI[4] = 1;
            this.ah.ac = 256;
            this.ah.ao = true;
            for (byte b = 0; b < HH.aZ; ++b) {
                this.ag[b].Z = -1;
            }
            for (int i = 9; i >= 0; --i) {
                this.aj[i].f = -1;
            }
            for (int j = 9; j >= 0; --j) {
                this.aj[j].f = -1;
            }
            for (int k = 11; k >= 0; --k) {
                this.cj[k] = -1;
            }
            return;
        }
        final short b2 = this.ah.b();
        final int n = this.ah.c() + HH.J + (HH.I >> 1);
        final byte b3 = (byte)(HH.D * 14);
        final byte b4 = (byte)(HH.E * 9);
        final byte b5 = (byte)(b2 - b3);
        final byte b6 = (byte)(n - b4);
        final byte e = HH.E;
        if (this.bL <= 2 && !this.dZ) {
            if (b5 > e) {
                if (b6 > e) {
                    this.bJ = 7;
                }
                else if (b6 < -e) {
                    this.bJ = 1;
                }
                else {
                    this.bJ = 0;
                }
            }
            else if (b5 < -e) {
                if (b6 > e) {
                    this.bJ = 5;
                }
                else if (b6 < -e) {
                    this.bJ = 3;
                }
                else {
                    this.bJ = 4;
                }
            }
            else {
                this.bJ = 2;
                if (b6 > 0) {
                    this.bJ = 6;
                }
            }
        }
        if (++this.bK > 30) {
            this.bK = 0;
            if (++this.bL > 12) {
                this.bL = 0;
            }
            if (this.bL > 2) {
                this.bK = 7;
                if (++this.bJ > 7) {
                    this.bJ = 0;
                }
            }
            this.L();
        }
        for (int l = 0; l < 8; ++l) {
            final int n2 = l % 4;
            if (this.bG[n2] != 0 && this.bI[n2] > 0) {
                final byte[] bh = this.bH;
                final int n3 = n2;
                if (--bh[n3] < 0) {
                    this.bG[n2] = 0;
                }
            }
            else if (this.bG[n2] != 2 && this.bI[n2] <= 0) {
                final byte[] bh2 = this.bH;
                final int n4 = n2;
                if (--bh2[n4] < 0) {
                    this.bG[n2] = 2;
                }
            }
            this.o(n2);
        }
        if (this.bI[0] + this.bI[1] + this.bI[2] + this.bI[3] == 0) {
            this.o(4);
        }
    }
    
    public final void N() {
        this.g = 0;
        this.h = 0;
        this.f = false;
        this.q = 0;
        this.s = 0;
        this.bJ = 4;
        final byte[] bh = this.bH;
        final int n = 0;
        final byte[] bh2 = this.bH;
        final int n2 = 1;
        final byte[] bh3 = this.bH;
        final int n3 = 2;
        final byte[] bh4 = this.bH;
        final int n4 = 3;
        final boolean b = false;
        bh3[n3] = (bh4[n4] = (byte)(b ? 1 : 0));
        bh[n] = (bh2[n2] = (byte)(b ? 1 : 0));
        final byte[] bg = this.bG;
        final int n5 = 0;
        final byte[] bg2 = this.bG;
        final int n6 = 1;
        final byte[] bg3 = this.bG;
        final int n7 = 2;
        final byte[] bg4 = this.bG;
        final int n8 = 3;
        final boolean b2 = false;
        bg3[n7] = (bg4[n8] = (byte)(b2 ? 1 : 0));
        bg[n5] = (bg2[n6] = (byte)(b2 ? 1 : 0));
        final int[] bi = this.bI;
        final int n9 = 0;
        final int[] bi2 = this.bI;
        final int n10 = 1;
        final int[] bi3 = this.bI;
        final int n11 = 2;
        final int[] bi4 = this.bI;
        final int n12 = 3;
        final int n13 = 100;
        bi3[n11] = (bi4[n12] = n13);
        bi[n9] = (bi2[n10] = n13);
        this.bI[4] = 200;
        this.bL = 0;
    }
    
    public final void O() {
        if (this.Y) {
            this.dX = true;
            return;
        }
        this.m = -1;
        this.ah.u = -2;
        this.dB = 0;
        this.cR = false;
        this.X = 1;
        this.bY = false;
        this.aP = 3;
        this.T.b(this.X);
        this.V = DD.a;
        this.dh = 1;
        this.W = this.V;
        this.T.a(this.V, true);
        this.ah.ab = this.ab * HH.D + (HH.H >> 1) << 8;
        final BB ah = this.ah;
        final BB ah2 = this.ah;
        final byte ac = this.ac;
        ah2.af = ac;
        ah.aa = ac;
        this.ah.aj = 1;
        this.ah.ak = 0;
        this.ah.al = 0;
        this.ah.am = 0;
        this.ah.ag = 0;
        this.ah.s = -1;
        this.ah.Z = 0;
        this.ah.ah = 1;
        this.ah.ai = 20;
        HH.v = this.ad;
        HH.w = this.ae;
        this.cs = System.currentTimeMillis();
        this.b(this.V, 11337);
        this.ah.E = 0;
        this.ah.ao = true;
        this.d = true;
        this.ah.a((byte)0);
        this.ah.am = 0;
        this.cd = 1;
        this.ce = 18;
        final BB ah3 = this.ah;
        ah3.O &= 0xFFFFFFDF;
        this.Y = true;
        this.bv = -1;
        this.bw = -1;
        this.bx = -1;
        this.cI = -1;
        this.cJ = -1;
        this.cJ &= 0xFFFFFF23;
        this.cK = 1572865;
        this.ah.L = 1;
        this.b = 0;
        final boolean b = false;
        this.cv = (b ? 1 : 0);
        this.cu = (b ? 1 : 0);
        this.s();
    }
    
    public final void o(final int n) {
        int d = HH.D;
        int e = HH.E;
        if (this.bI[n] <= 0) {
            this.bI[n] = 0;
            return;
        }
        byte b;
        byte b2;
        if (n == 4) {
            d = HH.D << 1;
            e = HH.E << 1;
            b = (byte)(HH.bM[2] * HH.D);
            b2 = (byte)(HH.bN[2] * HH.E);
        }
        else {
            b = (byte)(HH.bM[n] * HH.D);
            b2 = (byte)(HH.bN[n] * HH.E);
        }
        if (b + d + HH.v < 0 || b + HH.v > 240 || b2 + e + HH.w < 0 || b2 + HH.w > 320) {
            return;
        }
        for (int i = 9; i >= 0; --i) {
            final byte f;
            if ((f = this.ai[i].f) >= 0 && f != 30 && f != 15 && f != 16) {
                if (f != 17) {
                    final int p = this.ai[i].p;
                    final int q = this.ai[i].q;
                    if (this.a(b, b2, d, e, (this.ai[i].g >> 8) - p, (this.ai[i].h >> 8) - q, p * 2, q * 2)) {
                        final int[] bi = this.bI;
                        bi[n] -= JJ.a[f];
                        if (n == 4) {
                            final byte[] bh = this.bH;
                            final int n2 = 0;
                            final byte[] bh2 = this.bH;
                            final int n3 = 1;
                            final byte[] bh3 = this.bH;
                            final int n4 = 2;
                            final byte[] bh4 = this.bH;
                            final int n5 = 3;
                            final byte b3 = 5;
                            bh3[n4] = (bh4[n5] = b3);
                            bh[n2] = (bh2[n3] = b3);
                            final byte[] bg = this.bG;
                            final int n6 = 0;
                            final byte[] bg2 = this.bG;
                            final int n7 = 1;
                            final byte[] bg3 = this.bG;
                            final int n8 = 2;
                            final byte[] bg4 = this.bG;
                            final int n9 = 3;
                            final byte b4 = 3;
                            bg3[n8] = (bg4[n9] = b4);
                            bg[n6] = (bg2[n7] = b4);
                        }
                        else {
                            this.bH[n] = 5;
                            this.bG[n] = 1;
                        }
                        this.ai[i].a(false);
                        return;
                    }
                }
            }
        }
    }
    
    public final void F(final Graphics graphics) {
        if (this.bI[4] <= 0) {
            return;
        }
        int n = 0;
        final int n2 = HH.D * 14 + HH.v;
        final int n3 = HH.E * 9 + HH.w;
        final int width = HH.aO.getWidth();
        final int n4 = HH.aO.getHeight() >> 1;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        switch (this.bJ) {
            case 0: {
                n5 = n2 + (HH.aM.getWidth() - width / 2);
                n6 = n3 - n4 / 2;
                n7 = n5;
                n8 = n6;
                break;
            }
            case 1: {
                n5 = n2 + ((HH.aM.getWidth() >> 1) - (HH.aM.getWidth() >> 3));
                n6 = n3 - ((HH.aM.getHeight() >> 3) + 2 * n4 - (HH.aM.getHeight() >> 5));
                n7 = n5;
                n8 = n6 + n4;
                break;
            }
            case 2: {
                n = 90;
                n5 = n2 - n4 / 2;
                n6 = n3 - ((HH.aM.getHeight() >> 2) + width / 2);
                n7 = n5;
                n8 = n6;
                break;
            }
            case 3: {
                n = 8192;
                n5 = n2 - ((HH.aM.getWidth() >> 1) + width - (HH.aM.getWidth() >> 3));
                n6 = n3 - ((HH.aM.getHeight() >> 3) + 2 * n4 - (HH.aM.getHeight() >> 5));
                n7 = n5;
                n8 = n6 + n4;
                break;
            }
            case 4: {
                n = 8192;
                n5 = n2 - (HH.aM.getWidth() + width / 2);
                n6 = n3 - n4 / 2;
                n7 = n5;
                n8 = n6;
                break;
            }
            case 5: {
                n = 180;
                n5 = n2 - ((HH.aM.getWidth() >> 1) + width - (HH.aM.getWidth() >> 3));
                n6 = n3 + ((HH.aM.getHeight() >> 3) - (HH.aM.getHeight() >> 5));
                n7 = n5;
                n8 = n6;
                break;
            }
            case 6: {
                n = 270;
                n5 = n2 - (n4 + n4 / 2);
                n6 = n3 + ((HH.aM.getHeight() >> 2) - width / 2);
                n7 = n5 + width;
                n8 = n6;
                break;
            }
            default: {
                n = 16384;
                n5 = n2 + ((HH.aM.getWidth() >> 1) - (HH.aM.getWidth() >> 3));
                n6 = n3 + ((HH.aM.getHeight() >> 3) - (HH.aM.getHeight() >> 5));
                n7 = n5;
                n8 = n6;
                break;
            }
        }
        if (n7 < 240 && n8 < 320 && n7 + width > 0 && n8 + n4 > 0) {
            this.b(graphics, n7, n8, width, n4);
            EE.b.drawImage(HH.aO, n5, n6, 20, n);
        }
        final int width2 = HH.aM.getWidth();
        final int n9 = HH.aM.getHeight() >> 2;
        for (int i = 0; i < 4; ++i) {
            int n10 = HH.D * 14 + HH.v;
            int n11 = HH.E * 9 + HH.w;
            int n12 = HH.D * 14 + HH.v;
            int n13 = HH.E * 9 + HH.w;
            int n14 = 0;
            switch (i) {
                case 0: {
                    n11 -= (HH.aM.getHeight() >> 2) + n9 * this.bG[i];
                    n13 -= n9;
                    break;
                }
                case 1: {
                    n14 = 16384;
                    n11 -= 3 * (HH.aM.getHeight() >> 2) - n9 * this.bG[i];
                    break;
                }
                case 2: {
                    n14 = 8192;
                    n10 -= HH.aM.getWidth();
                    n11 -= (HH.aM.getHeight() >> 2) + n9 * this.bG[i];
                    n12 -= width2;
                    n13 -= n9;
                    break;
                }
                case 3: {
                    n14 = 180;
                    n10 -= HH.aM.getWidth();
                    n11 -= 3 * (HH.aM.getHeight() >> 2) - n9 * this.bG[i];
                    n12 -= width2;
                    break;
                }
            }
            if (n12 + width2 >= 0 && n12 <= 240 && n13 + n9 >= 0) {
                if (n13 <= 320) {
                    this.b(graphics, n12, n13, width2, n9);
                    EE.b.drawImage(HH.aM, n10, n11, 20, n14);
                }
            }
        }
    }
    
    public final void c(final Graphics graphics, final byte b) {
        final int width = HH.au.getWidth();
        final int n = HH.au.getHeight() / 5;
        final int n2 = HH.D * 14 + HH.v;
        final int n3 = HH.E * 7 + HH.w;
        this.ah.n();
        if (n2 - 3 < 240 && n3 < 320 && n2 - 3 + width >= 0 && n3 + n >= 0) {
            graphics.setClip(n2 - (HH.D >> 1), n3, width, n);
            graphics.drawImage(HH.au, n2 - 3, n3 - n * b, 17);
        }
        if (!this.cC && b == 4 && !this.f) {
            this.cH = HH.cy[31];
            this.cB = true;
            this.r(HH.cz[31]);
        }
    }
    
    public final void p(final int n) {
        if (n == HH.ba) {
            this.aR = this.ah.Z;
            this.aS = this.ah.al;
            this.aT = this.ah.aj;
            if (this.ah.ao) {
                this.aV = 0;
            }
            else {
                this.aV = 5;
            }
        }
        else if (n >= 0) {
            this.aR = this.ag[n].Z;
            this.aS = this.ag[n].al;
            this.aT = this.ag[n].aj;
            if (this.ag[n].ap != 0) {
                if (this.ag[n].ap == 1) {
                    if (this.ag[n].ao) {
                        this.aV = 4;
                    }
                    else {
                        this.aV = 2;
                    }
                }
                else if (this.ag[n].ap == 2) {
                    if (this.ag[n].ao) {
                        this.aV = 6;
                    }
                    else {
                        this.aV = 3;
                    }
                }
                else if (this.ag[n].ap == 3) {
                    if (this.ag[n].ao) {
                        this.aV = 1;
                    }
                    else {
                        this.aV = 7;
                    }
                }
            }
            else if (this.ag[n].ao) {
                this.aV = 0;
            }
            else {
                this.aV = 5;
            }
        }
        if (this.aR >= 0) {
            if (n == HH.ba) {
                this.aU = BB.I[this.aR][this.aS][this.aT];
                return;
            }
            this.aU = FF.p[this.aR][this.aS][this.aT];
            this.K = (byte)(HH.aF[this.aR].getHeight() / HH.I);
        }
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3) {
        this.p(HH.ba);
        EE.b.drawImage(HH.aG, n, n2 - n3, 20, 8192);
    }
    
    public final void c(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        this.p(n);
        int n5 = 0;
        if (this.ag[n].v) {
            n5 = HH.I << 1;
        }
        switch (this.aV) {
            case 1: {
                EE.b.drawImage(HH.aF[this.aR], n2 - this.aU * HH.I - n5, n3 - n4, 20, 90);
            }
            case 2: {
                EE.b.drawImage(HH.aF[this.aR], n2, n3 - (this.K - 1 - this.aU) * HH.I - n4 + n5, 20, 180);
            }
            case 3: {
                EE.b.drawImage(HH.aF[this.aR], n2 - (this.K - 1 - this.aU) * HH.I + n5, n3 - n4, 20, 270);
            }
            case 4: {
                EE.b.drawImage(HH.aF[this.aR], n2, n3 - (this.K - 1 - this.aU) * HH.I - n4 + n5, 20, 16384);
            }
            case 5: {
                EE.b.drawImage(HH.aF[this.aR], n2, n3 - this.aU * HH.I - n4 - n5, 20, 8192);
            }
            case 6: {
                EE.b.drawImage(HH.aF[this.aR], n2 - (this.K - 1 - this.aU) * HH.I + n5, n3 - n4, 20, 8282);
            }
            case 7: {
                EE.b.drawImage(HH.aF[this.aR], n2 - this.aU * HH.I - n5, n3 - n4, 20, 16474);
                break;
            }
        }
    }
    
    private boolean f(final int n, final int n2, final int n3) {
        return n >= n2 && n <= n2 + n3;
    }
    
    public final boolean a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        return (this.f(n5, n, n3) || this.f(n, n5, n7)) && (this.f(n6, n2, n4) || this.f(n2, n6, n8));
    }
    
    public final void a(final int n, final int n2, final boolean b, final int n3) {
        final short n4 = (short)(n * HH.D + (HH.D >> 1));
        final short n5 = (short)(n2 * HH.E + (HH.E >> 1));
        if (b) {
            this.bb[n3] = n4;
            this.bc[n3] = n5;
        }
        else {
            this.bd[n3] = n4;
            this.be[n3] = n5;
        }
        if (this.bb[n3] != -1 && this.bd[n3] != -1) {
            this.bg[n3] = this.be[n3] - this.bc[n3] << 8;
            this.bf[n3] = (short)(this.bd[n3] - this.bb[n3]);
            this.bh[n3] = (this.bc[n3] << 8) - this.bg[n3] * this.bb[n3] / this.bf[n3];
        }
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4, final int n5) {
        short v = this.V;
        if (this.cU) {
            v = 0;
        }
        if (this.bs[v] && n3 > 0) {
            final int[] bt = this.bt;
            final int n6 = n5 + v * 50 >> 5;
            bt[n6] |= 1 << n5 - (n5 >> 5 << 5);
        }
        if ((this.bt[n5 + v * 50 >> 5] & 1 << n5 - (n5 >> 5 << 5)) == 0x0) {
            return;
        }
        this.bm[n5] = (byte)n3;
        if (n4 == 2) {
            this.bk[n5] = (short)(n * HH.D + (HH.aI.getWidth() >> 1));
        }
        else {
            this.bk[n5] = (short)(n * HH.D + n4 * HH.aI.getWidth());
        }
        this.bl[n5] = (short)(n2 * HH.E);
        this.bo[n5] = this.bl[n5];
        this.bn[n5] = 0;
    }
    
    public final void P() {
        for (int i = 0; i < 50; i = (short)(i + 1)) {
            if (this.bm[i] != -1) {
                int j = 1;
                short n2;
                int n = (n2 = this.bl[i]) / HH.E;
                final short n3 = (short)(this.bk[i] / HH.D);
                while (j != 0) {
                    final short n4;
                    if ((n4 = this.T.f[n3][n + 1]) >= 19 && n4 <= 27) {
                        break;
                    }
                    for (int k = 0; k < 50; k = (short)(k + 1)) {
                        if (this.bm[k] != -1) {
                            if (k != i) {
                                if (this.bk[k] == this.bk[i] && this.bl[k] == n2 + HH.E) {
                                    j = 0;
                                    break;
                                }
                            }
                        }
                    }
                    if (j != 1) {
                        continue;
                    }
                    final short[] bl = this.bl;
                    final int n5 = i;
                    bl[n5] += HH.E;
                    n2 += HH.E;
                    ++n;
                }
            }
        }
    }
    
    public final void Q() {
        this.P();
        for (short n = 49; n >= 0; --n) {
            if (this.bm[n] != -1) {
                final short n2 = this.bl[n];
                this.bp[n] = (this.bq[n] = -1);
                for (short n3 = 49; n3 >= 0; --n3) {
                    if (this.bm[n3] != -1) {
                        if (this.bk[n3] == this.bk[n]) {
                            if (this.bl[n3] == n2 - HH.E) {
                                this.bp[n] = n3;
                                this.bq[n3] = n;
                            }
                            else if (this.bl[n3] == n2 + HH.E) {
                                this.bq[n] = n3;
                                this.bp[n3] = n;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void c(int n, final int n2, final int n3) {
        n -= 9;
        for (int i = 11; i >= 0; --i) {
            if (this.cj[i] == -1) {
                if (n3 == 0) {
                    this.cj[i] = (byte)(this.d(this.U.nextInt()) % 2);
                }
                else if (n3 == 1) {
                    this.cj[i] = 2;
                }
                else {
                    this.cj[i] = 3;
                }
                this.cf[i] = n << 8;
                this.cg[i] = n2 << 8;
                this.ch[i] = 0;
                this.ci[i] = 768;
                return;
            }
        }
    }
    
    public final void d(final int n, final int n2, final int n3) {
        int i = 3;
        while (i >= 0) {
            if (this.cp[i] != -1) {
                --i;
            }
            else {
                this.cp[i] = (byte)n3;
                if (n3 == 0 || n3 == 1) {
                    this.cl[i] = (short)(n * HH.D);
                    this.cm[i] = (short)(n2 * HH.E);
                    this.cn[i] = 0;
                    this.co[i] = 0;
                    return;
                }
                if (n3 == 2) {
                    this.cl[i] = (short)((n - 2) * HH.D);
                    this.cm[i] = (short)(n2 * HH.E);
                    this.cn[i] = (short)(HH.D << 1);
                    this.co[i] = 0;
                    return;
                }
                this.cl[i] = (short)(n * HH.D);
                this.cm[i] = (short)((n2 - 2) * HH.E);
                this.cn[i] = 0;
                this.co[i] = (short)(HH.E << 1);
            }
        }
    }
    
    public final void e(int n, final int l, final int n2) {
        int i = 9;
        while (i >= 0) {
            if (this.ai[i].f != -1) {
                --i;
            }
            else {
                if ((n2 >= 0 && n2 <= 14) || (n2 >= 18 && n2 <= 20)) {
                    final short[] m = this.ah.M;
                    final byte j = this.ah.L;
                    --m[j];
                }
                if ((n2 >= 9 && n2 <= 11) || (n2 >= 15 && n2 <= 17)) {
                    this.ai[i].p = 84;
                    this.ai[i].q = 11;
                    n += (this.ah.ao ? 1 : -1) * 84 << 8;
                }
                else {
                    this.ai[i].p = JJ.b[n2];
                    this.ai[i].q = JJ.c[n2];
                }
                final JJ k = this.ai[i];
                final JJ j2 = this.ai[i];
                final JJ j3 = this.ai[i];
                final int k2 = n;
                j3.g = k2;
                j2.i = k2;
                k.k = k2;
                final JJ j4 = this.ai[i];
                final JJ j5 = this.ai[i];
                this.ai[i].h = l;
                j5.j = l;
                j4.l = l;
                this.ai[i].f = (byte)n2;
                this.ai[i].m = (this.ah.ao ? 1 : -1) * JJ.d[n2] << 8;
                this.ai[i].n = 0;
                this.ai[i].o = 0;
                this.ai[i].s = (this.ah.ao ? (n - this.ah.ab) : (this.ah.ab - n));
                if (n2 >= 3 && n2 <= 5) {
                    this.ai[i].n = 768;
                    return;
                }
                break;
            }
        }
    }
    
    public final void a(final int k, final int n, final int n2, final boolean b, final boolean b2, final int n3, final byte r) {
        int i = 9;
        while (i >= 0) {
            if (this.aj[i].f != -1) {
                --i;
            }
            else {
                this.aj[i].g = k;
                this.aj[i].h = n;
                this.aj[i].f = (byte)n2;
                this.aj[i].o = 0;
                this.aj[i].r = r;
                this.aj[i].p = JJ.b[n2];
                this.aj[i].q = JJ.c[n2];
                if (n3 == 0 || n3 == 1) {
                    if (b2) {
                        this.aj[i].m = 0;
                        if (r == 17 || r == 20 || r == 23) {
                            this.aj[i].n = (short)(((n3 == 0) ? 1 : -1) * JJ.d[n2] << 8);
                        }
                        else {
                            this.aj[i].n = (short)(((n3 == 0) ? -1 : 1) * JJ.d[n2] << 8);
                        }
                    }
                    else {
                        this.aj[i].m = (short)((b ? 1 : -1) * JJ.d[n2] << 8);
                        this.aj[i].n = 0;
                    }
                }
                else if (b2) {
                    this.aj[i].m = (short)(((n3 == 3) ? -1 : 1) * JJ.d[n2] << 8);
                    this.aj[i].n = 0;
                }
                else {
                    this.aj[i].m = 0;
                    this.aj[i].n = (short)((b ? -1 : 1) * JJ.d[n2] << 8);
                }
                if (n2 == 32) {
                    this.aj[i].i = k;
                    this.aj[i].j = n;
                    this.aj[i].k = k;
                    this.aj[i].l = n - (4 * HH.E << 8);
                    return;
                }
                break;
            }
        }
    }
    
    public final void a(final int n, final int n2, final byte w, int n3) {
        if (n3 == -1) {
            for (n3 = HH.aZ - 1; n3 >= 0 && this.ag[n3].Z != -1; --n3) {}
            if (n3 == -1) {
                return;
            }
        }
        else {
            short v = this.V;
            if (this.cU) {
                v = 0;
            }
            final int n4 = n3 + v * 10 >> 5;
            if (this.bs[v]) {
                final int[] bu = this.bu;
                final int n5 = n4;
                bu[n5] |= 1 << n3 + v * 10 - (n4 << 5);
            }
            if ((this.bu[n4] & 1 << n3 + v * 10 - (n4 << 5)) == 0x0) {
                return;
            }
        }
        if (w >= 0 && w <= 2) {
            this.ag[n3].Z = 1;
        }
        else if (w >= 3 && w <= 5) {
            this.ag[n3].Z = 0;
        }
        else if (w >= 6 && w <= 13) {
            this.ag[n3].Z = 2;
        }
        else {
            this.ag[n3].Z = 3;
        }
        this.ag[n3].ab = n * HH.D + (HH.D >> 1) << 8;
        this.ag[n3].aa = (byte)n2;
        final FF f = this.ag[n3];
        final FF f2 = this.ag[n3];
        final FF f3 = this.ag[n3];
        final boolean ag = false;
        f3.ac = (short)(ag ? 1 : 0);
        f2.ad = (short)(ag ? 1 : 0);
        f.ag = (ag ? 1 : 0);
        this.ag[n3].ai = FF.i[w];
        this.ag[n3].ap = 0;
        this.ag[n3].ao = true;
        if (this.X == 12 && this.ah.ab < this.ag[n3].ab) {
            this.ag[n3].ao = false;
        }
        this.ag[n3].H = false;
        this.ag[n3].v = false;
        this.ag[n3].F = 0;
        this.ag[n3].D = (byte)n3;
        this.ag[n3].x = 0;
        this.ag[n3].E = 0;
        this.ag[n3].F = 0;
        this.ag[n3].G = this.ag[n3].ab;
        if (this.ag[n3].Z == 1) {
            this.ag[n3].G = 0;
        }
        if (this.ag[n3].Z == 3) {
            this.ag[n3].ao = false;
            final short a;
            if ((a = this.T.a(n + 1, n2)) >= 19 && a <= 34) {
                this.ag[n3].ap = 3;
            }
            final short a2;
            if ((a2 = this.T.a(n - 1, n2)) >= 19 && a2 <= 34) {
                this.ag[n3].ap = 2;
            }
            final short a3;
            if ((a3 = this.T.a(n, n2 - 1)) >= 19 && a3 <= 34) {
                this.ag[n3].ag = 3072;
                this.ag[n3].ap = 1;
            }
        }
        this.ag[n3].w = w;
        this.ag[n3].a((byte)0);
        this.ag[n3].am = 1;
        this.ag[n3].ah = 1;
    }
    
    public final void a(final byte b, final byte b2) {
        for (int i = 0; i < 3; ++i) {
            if (this.bE[i] == -1) {
                this.bE[i] = b;
                this.bF[i] = b2;
                return;
            }
        }
    }
    
    public final void a(final byte b, final byte b2, final int n) {
        for (int i = 0; i < 3; ++i) {
            if (this.bB[i] == 0) {
                switch (n) {
                    case 70: {
                        this.bB[i] = 1;
                        break;
                    }
                    case 71: {
                        this.bB[i] = 2;
                        break;
                    }
                    case 72: {
                        this.bB[i] = 4;
                        break;
                    }
                    case 73: {
                        this.bB[i] = 8;
                        break;
                    }
                    case 74: {
                        this.bB[i] = 16;
                        break;
                    }
                    case 75: {
                        this.bB[i] = 32;
                        break;
                    }
                    case 76: {
                        this.bB[i] = 64;
                        break;
                    }
                    case -119: {
                        this.bB[i] = -128;
                        break;
                    }
                }
                this.bC[i] = b;
                this.bD[i] = (byte)(b2 - 1);
                return;
            }
        }
    }
    
    public final void G(final Graphics graphics) {
        final int n = HH.aB.getHeight() >> 2;
        final int width = HH.aB.getWidth();
        int n2 = 0;
        for (int i = 0; i < 3; ++i) {
            if (this.bB[i] != -128) {
                if (this.bB[i] == 0) {
                    continue;
                }
                if ((this.bv & this.bB[i]) == 0x0) {
                    continue;
                }
            }
            final int n3 = this.bC[i] * HH.D + HH.v + (HH.D - width >> 1);
            final int n4 = this.bD[i] * HH.E + HH.w;
            if (n3 + width >= 0 && n3 < 240 && n4 + n >= 0) {
                if (n4 < 320) {
                    if (this.bB[i] >= 2 && this.bB[i] <= 64) {
                        n2 = n;
                    }
                    else if (this.bB[i] == -128) {
                        n2 = n * 3;
                        if ((this.bv & 0xFFFFFF80) != 0x0) {
                            n2 = n << 1;
                        }
                    }
                    if (0 < n) {
                        this.b(graphics, n3, n4, width, n - 0);
                        graphics.drawImage(HH.aB, n3, n4 - 0 - n2, 0);
                    }
                }
            }
        }
        for (int j = 0; j < 3; ++j) {
            if (this.bE[j] != -1) {
                int a = this.T.a(this.bE[j], this.bF[j]);
                a -= 36;
                final int n5 = 1 << a;
                final int n6 = this.bE[j] * HH.D + HH.v + (HH.D - 19 >> 1);
                final int n7 = this.bF[j] * HH.E + HH.w + HH.E - 19;
                if (n6 + 19 >= 0 && n6 < 240 && n7 + 38 >= 0) {
                    if (n7 < 320) {
                        this.b(graphics, n6, n7, 19, 38);
                        graphics.drawImage(HH.aK, n6, n7 - 0 - (((this.bv & n5) == 0x0) ? 38 : 0) - 133, 0);
                    }
                }
            }
        }
    }
    
    public final void q(final int n) {
        if (this.ag[n].Z == -1 || this.ag[n].al == 5) {
            return;
        }
        final short c = this.ag[n].c();
        final short b = this.ag[n].b();
        final byte z = this.ag[n].Z;
        final byte b2 = FF.a[z];
        final byte b3 = FF.b[z];
        final byte b4 = FF.c[z];
        final byte b5 = FF.d[z];
        if (c - b2 + b4 + HH.v < 0 || c - b2 + HH.v > 240 || b + b3 + b5 + HH.w < 0 || b + b3 + HH.w > 320) {
            return;
        }
        for (int i = 9; i >= 0; --i) {
            final byte f;
            if ((f = this.ai[i].f) >= 0) {
                if (f != 30) {
                    if (!this.ai[i].b() && (f < 9 || f > 11) && (f < 15 || f > 17) && f != 2) {
                        if (f < 21) {
                            continue;
                        }
                        if (f > 29) {
                            continue;
                        }
                    }
                    if (this.a(c - b2, b + b3, b4, b5, (this.ai[i].g >> 8) - this.ai[i].p, (this.ai[i].h >> 8) - this.ai[i].q, this.ai[i].p << 1, this.ai[i].q << 1)) {
                        final byte c2 = this.ai[i].c();
                        if ((z != 4 && z != 3) || c2 != 6) {
                            if (f >= 9 && f <= 11) {
                                final int d;
                                if ((d = this.d(this.ah.b() - c)) < HH.D) {
                                    final FF f2 = this.ag[n];
                                    f2.ai -= JJ.a[f];
                                }
                                else if (d < HH.D * 2 || f > 10) {
                                    final FF f3 = this.ag[n];
                                    f3.ai -= (byte)(JJ.a[f] >> 1);
                                }
                                else {
                                    final FF f4 = this.ag[n];
                                    f4.ai -= (byte)(JJ.a[f] >> 2);
                                }
                            }
                            else {
                                final FF f5 = this.ag[n];
                                f5.ai -= JJ.a[f];
                            }
                            this.ai[i].a(false);
                            this.e(c << 8, (b << 8) + (HH.I << 7), 30);
                            ++HH.dD;
                            if (this.ag[n].ai <= 0 && this.ag[n].al != 5) {
                                short v = this.V;
                                if (this.cU) {
                                    v = 0;
                                }
                                final int n2 = n + v * 10 >> 5;
                                final int[] bu = this.bu;
                                final int n3 = n2;
                                bu[n3] &= ~(1 << n + v * 10 - (n2 << 5));
                                if (c2 == 6 && z != 4) {
                                    ++HH.dt;
                                    for (byte b6 = 0; b6 < FF.k[this.ag[n].w]; ++b6) {
                                        this.c((short)(this.ag[n].ab >> 8), this.ag[n].b(), 0);
                                    }
                                    this.ag[n].Z = 4;
                                    this.ag[n].w = 24;
                                    this.ag[n].ai = FF.i[24];
                                    if (this.ah.P[6] < 2) {
                                        final short[] n4 = this.ah.N;
                                        final int n5 = 6;
                                        ++n4[n5];
                                    }
                                    if (this.ah.N[6] >= 20) {
                                        final byte[] p = this.ah.P;
                                        final int n6 = 6;
                                        ++p[n6];
                                        this.ah.N[6] = 0;
                                        this.cB = false;
                                        this.r(73);
                                        ++HH.dn;
                                        if (this.Y && ++this.Z > 10) {
                                            this.Z = 10;
                                        }
                                        final int[] dj = HH.dJ;
                                        final short v2 = this.V;
                                        ++dj[v2];
                                    }
                                }
                                else {
                                    ++HH.dn;
                                    if (this.Y && ++this.Z > 10) {
                                        this.Z = 10;
                                    }
                                    final int[] dj2 = HH.dJ;
                                    final short v3 = this.V;
                                    ++dj2[v3];
                                    this.ag[n].a((byte)5);
                                    this.ag[n].am = 1;
                                    if (z != 4) {
                                        for (byte b7 = 0; b7 < FF.k[this.ag[n].w]; ++b7) {
                                            this.c((short)(this.ag[n].ab >> 8), this.ag[n].b(), 0);
                                        }
                                        if (this.ah.P[c2] < 2) {
                                            final short[] n7 = this.ah.N;
                                            final byte b8 = c2;
                                            ++n7[b8];
                                        }
                                        if (this.ah.N[c2] >= 20) {
                                            final byte[] p2 = this.ah.P;
                                            final byte b9 = c2;
                                            ++p2[b9];
                                            this.ah.N[c2] = 0;
                                            this.cB = false;
                                            this.r(73);
                                        }
                                    }
                                }
                            }
                            else if (this.ag[n].al != 2) {
                                this.ag[n].a((byte)4);
                                this.ag[n].an = 0;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
    
    public final void R() {
        final short b = this.ah.b();
        final short n = (short)(this.ah.c() + HH.J);
        for (int i = 9; i >= 0; --i) {
            if (this.ah.al == 10) {
                return;
            }
            final byte f;
            if ((f = this.aj[i].f) != -1) {
                if (f != 30) {
                    if (this.aj[i].b()) {
                        if (this.a(b - 11, n + 7, 18, 37, (this.aj[i].g >> 8) - this.aj[i].p, (this.aj[i].h >> 8) - this.aj[i].q, this.aj[i].p << 1, this.aj[i].q << 1)) {
                            final byte r = this.aj[i].r;
                            if (f != 3 && f != 6 && f != 18) {
                                if (!HH.e) {
                                    final BB ah = this.ah;
                                    ah.ai -= FF.j[r];
                                }
                                this.Z = 1;
                                HH.dH = true;
                                this.ah.a((byte)9);
                                this.ah.an = 0;
                                if (this.ah.s == 2) {
                                    this.ah.s = 1;
                                }
                                this.e(b << 8, (n << 8) + (HH.I << 7), 30);
                            }
                            if (f == 32) {
                                this.ah.E = 10;
                            }
                            this.aj[i].a(true);
                        }
                    }
                }
            }
        }
    }
    
    public final int D(final int n, final int n2) {
        if (n < n2) {
            return n;
        }
        return n2;
    }
    
    public final void H(final Graphics graphics) {
        ratchetandclank.e = ratchetandclank.h;
        int n = 51;
        if (this.cB && HH.cA[this.cG - 104] != -1 && 51 < HH.as.getHeight() / 5 + 12) {
            n = HH.as.getHeight() / 5 + 12;
        }
        final int n2 = 320 - n;
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(16777215);
        graphics.fillRect(0, n2, 240, n);
        if (this.cB && HH.cA[this.cG - 104] != -1) {
            final int n3 = HH.as.getHeight() / 5;
            final int width = HH.as.getWidth();
            graphics.setColor(52, 86, 92);
            final int n4 = n2 + (n - n3 >> 1);
            graphics.fillRect(6 + width, n4, 240 - width - 12, 2);
            graphics.fillRect(232, n4, 2, n3);
            graphics.fillRect(6 + width, n4 + n3 - 2, 240 - width - 12, 2);
            graphics.setClip(6, n4, HH.as.getWidth(), n3);
            graphics.drawImage(HH.as, 6, n4 - n3 * HH.cA[this.cG - 104], 20);
        }
    }
    
    public final int a(final Graphics graphics, final int n, final String s, final int n2, final int n3, final int n4, final int n5) {
        final char[] array = new char[s.length()];
        s.getChars(0, s.length(), array, 0);
        int n6 = 0;
        int n7 = n;
        int i = n;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        boolean b2 = false;
        int n11 = 0;
    Label_0192_Outer:
        while (true) {
            n9 = 0;
            n10 = i - 1;
            boolean b = false;
            b2 = false;
            n11 = -1;
            while (true) {
                while (i < s.length()) {
                    final char char1;
                    if ((char1 = s.charAt(i)) == ' ') {
                        n9 += ratchetandclank.h.a(char1);
                        ++i;
                        if (n6 + n9 > n5 && n8 == 0) {
                            b2 = true;
                        }
                        else {
                            n8 = 1;
                        }
                    }
                    else {
                        if (char1 == '-') {
                            n11 = i;
                        }
                        final int a = ratchetandclank.h.a(char1);
                        if (n6 + n9 + a <= n5 || n8 != 0) {
                            n9 += a;
                            ++i;
                            continue Label_0192_Outer;
                        }
                        b2 = true;
                    }
                    if (n6 + n9 > n5 || b || b2) {
                        break Label_0192_Outer;
                    }
                    n6 += n9;
                    continue Label_0192_Outer;
                }
                b = true;
                continue;
            }
        }
        if (s.charAt(n7) == ' ') {
            ++n7;
        }
        if (n6 + n9 > n5) {
            if (!b2) {
                i = n10;
            }
            else if (n11 >= 0) {
                i = n11 + 1;
            }
        }
        else if (b2 && n8 == 0 && n11 >= 0) {
            i = n11 + 1;
        }
        if ((n4 & 0x1) > 0) {
            if (i - n7 > 0) {
                ratchetandclank.e.a(graphics, array, n7, i - n7, 120, n3, n4);
            }
            return i + (b2 ? 0 : 1);
        }
        if (i - n7 > 0) {
            if (ratchetandclank.q == 3) {
                final String s2;
                final int index;
                if ((index = (s2 = new String(array, n7, i - n7)).indexOf("Informations-netzwerks")) >= 0) {
                    if (index == 0) {
                        ratchetandclank.e.a(graphics, "Informationsnetzwerks", n2, n3, n4);
                        if (s2.length() > 22) {
                            graphics.drawSubstring(s2, 22, s2.length() - 22, n2 + ratchetandclank.h.a("Informationsnetzwerks"), n3, n4);
                        }
                    }
                    else {
                        graphics.drawSubstring(s2, 0, index, n2, n3, n4);
                        ratchetandclank.e.a(graphics, "Informationsnetzwerks", n2 + ratchetandclank.h.a(s2, 0, index), n3, n4);
                        if (s2.length() > index + 1 + 22) {
                            graphics.drawSubstring(s2, index + 1 + 22, s2.length() - index - 1 - 22, n2 + ratchetandclank.h.a(s2, 0, index) + ratchetandclank.h.a("Informationsnetzwerks"), n3, n4);
                        }
                    }
                }
                else {
                    ratchetandclank.e.a(graphics, s2, n2, n3, n4);
                }
            }
            else {
                ratchetandclank.e.a(graphics, array, n7, i - n7, n2, n3, n4);
            }
        }
        return i + (b2 ? 0 : 1);
    }
    
    public final int a(final Graphics graphics, int n) {
        int n2 = 6;
        int n3 = 17;
        if (this.cB && HH.cA[this.cG - 104] != -1) {
            n2 = HH.as.getWidth() + 6 + 3;
            n3 = 20;
        }
        graphics.setColor(0);
        graphics.setClip(0, 0, 240, 320);
        ratchetandclank.e = ratchetandclank.h;
        final int length = this.cD.length();
        int n4;
        if (this.cB && HH.cA[this.cG - 104] != -1) {
            n4 = 320 - ((Math.max(HH.as.getHeight() / 5, 39) - 39 >> 1) + 39 + 6);
        }
        else {
            n4 = 275;
        }
        if ((n = this.a(graphics, n, this.cD, n2, n4, n3, 240 - n2 - 6)) >= length) {
            return -1;
        }
        if ((n = this.a(graphics, n, this.cD, n2, n4 + 13, n3, 240 - n2 - 6)) >= length) {
            return -1;
        }
        if ((n = this.a(graphics, n, this.cD, n2, n4 + 26, n3, 240 - n2 - 6 - 7)) >= length) {
            return -1;
        }
        return n;
    }
    
    public final void r(final int cg) {
        this.ah.E = 0;
        this.cE = 0;
        this.cG = cg;
        if (cg == 112 && !this.h(4) && !this.h(5) && !this.h(6) && !this.h(7) && !this.h(9) && !this.h(10)) {
            this.cH = HH.cy[16];
            this.cG = 150;
            this.cD = null;
            this.cD = ratchetandclank.n[150];
        }
        else if ((cg == 125 || cg == 126 || cg == 127 || cg == 128 || cg == 132 || cg == 133) && this.h(4) && this.h(5) && this.h(6) && this.h(7) && this.h(9) && this.h(10)) {
            this.cH = HH.cy[17];
            this.cG = 156;
            this.cD = null;
            this.cD = ratchetandclank.n[156];
        }
        else if (cg == 125 || cg == 126 || cg == 127 || cg == 128 || cg == 132 || cg == 133) {
            int n = 1;
            if (!this.h(4)) {
                ++n;
            }
            if (!this.h(5)) {
                ++n;
            }
            if (!this.h(6)) {
                ++n;
            }
            if (!this.h(7)) {
                ++n;
            }
            if (!this.h(9)) {
                ++n;
            }
            if (!this.h(10)) {
                ++n;
            }
            final Object[] array = { new Integer(n) };
            this.cD = null;
            this.cD = this.a(ratchetandclank.n[cg], array);
        }
        else if (cg == 227) {
            final Object[] array2 = { new Integer(this.v()), new Integer(HH.bQ) };
            this.cD = null;
            this.cD = this.a(ratchetandclank.n[cg], array2);
        }
        else {
            this.cD = ratchetandclank.n[cg];
        }
        if (this.cD == "") {
            this.cE = -1;
        }
        this.cC = true;
        this.cw = 0;
    }
    
    public final void S() {
        this.cC = false;
        if (this.cG == 104) {
            this.dh = 524288;
            this.cK |= 0x4;
        }
        else if (this.cG == 106) {
            this.dh = 16;
            this.cK |= 0x10;
            this.cK |= 0x40000;
        }
        else if (this.cG == 110) {
            this.dh = 128;
            this.cK |= 0x80;
        }
        else if (this.cG == 112) {
            this.dh = 10;
            this.cK |= 0xA;
            this.bv &= 0xFFFFFFFD;
        }
        else if (this.cG == 150) {
            this.cK |= 0x8000;
            this.dh = 32768;
            final BB ah = this.ah;
            ah.O |= 0x20;
        }
        else if (this.cG == 125) {
            this.dh &= 0xFFFFFFFD;
            this.dh |= 0x2000;
            this.cK |= 0x2000;
        }
        else if (this.cG == 126) {
            this.dh &= 0xFFFFFFF7;
            this.dh |= 0x400;
            this.cK |= 0x400;
        }
        else if (this.cG == 127) {
            this.dh &= 0xFFFFFBFF;
            if ((this.cI & 0x80) == 0x0) {
                this.dh |= 0x200;
                this.cK |= 0x200;
            }
        }
        else if (this.cG == 128) {
            this.dh &= 0xFFFFDFFF;
            if ((this.cI & 0x40) == 0x0) {
                this.dh |= 0x200;
                this.cK |= 0x200;
            }
        }
        else if (this.cG == 129) {
            this.dh = 20480;
            this.cK |= 0x1000;
            this.cK |= 0x4000;
        }
        else if (this.cG == 132) {
            this.dh &= 0xFFFFEFFF;
            if (!this.h(4) && !this.h(5) && !this.h(6) && !this.h(7) && !this.h(9) && !this.h(10)) {
                this.cK |= 0x40;
                this.dh = 64;
            }
        }
        else if (this.cG == 133) {
            this.dh &= 0xFFFFBFFF;
            if (!this.h(4) && !this.h(5) && !this.h(6) && !this.h(7) && !this.h(9) && !this.h(10)) {
                this.cK |= 0x40;
                this.dh = 64;
            }
        }
        else if (this.cG == 134) {
            this.cK |= 0x800;
            this.dh = 2048;
            this.bv &= 0xFFFFFFF7;
        }
        else if (this.cG == 135) {
            this.cK |= 0x100;
            this.dh = 256;
            this.bv &= (byte)(-129);
        }
        else if (this.cG == 140) {
            this.dh = 65536;
            this.cK |= 0x10000;
        }
        else if (this.cG == 144) {
            this.dh = 131072;
            this.cK |= 0x20000;
        }
        else if (this.cG == 156) {
            if (!this.h(4)) {
                this.dh &= 0xFFFFFFFD;
                this.dh |= 0x2000;
                this.cK |= 0x2000;
            }
            else {
                this.dh &= 0xFFFFFFF7;
                this.dh |= 0x400;
                this.cK |= 0x400;
            }
        }
        if (--this.cH > 0) {
            this.r(this.cG + 1);
            return;
        }
        this.cB = false;
        this.cH = 0;
        if (this.cG >= 104 && this.cG <= 156 + HH.cy[17] && this.X != 0) {
            this.y();
            a(HH.dA);
            this.b = 18;
        }
        if (this.cG + 1 == HH.cz[33] + HH.cy[33]) {
            this.y();
            a(HH.dA);
            this.b = 18;
        }
        if (this.cG + 1 == HH.cz[31] + HH.cy[31]) {
            this.f = true;
        }
        if (this.cG + 1 == HH.cz[32] + HH.cy[32]) {
            this.ah.a((byte)1);
            this.ah.am = 0;
        }
    }
    
    public final void a(final byte[] array) {
        array[0] = (byte)((this.X == 0) ? 2 : 1);
        this.a.a(this.cK, array, 1);
        this.a.a(this.bS, array, 5);
        this.a.a(this.bT, array, 9);
        this.a.a(this.cI, array, 13);
        array[17] = this.ah.O;
        for (int i = 0; i < 8; ++i) {
            array[18 + i] = this.ah.P[i];
            this.a.a(this.ah.N[i], array, 26 + i * 2);
            this.a.a(this.ah.M[i], array, 42 + i * 2);
        }
        this.a.a(this.aW, array, 58);
        array[62] = this.bv;
        this.a.a(this.bw, array, 63);
        this.a.a(this.bx, array, 67);
        this.a.a(this.cq, array, 195);
        array[199] = (byte)(this.bY ? 1 : 0);
        this.a.a(this.dh, array, 200);
        this.a.a(this.cJ, array, 204);
        this.a.a(HH.dz, array, 208);
        array[212] = (byte)(this.Y ? 1 : 0);
        array[213] = this.aa;
    }
    
    public final void b(final byte[] array) {
        if (array[0] == 2) {
            this.f(0);
            return;
        }
        this.cK = this.a.a(array, 1);
        this.bS = this.a.a(array, 5);
        this.bT = this.a.a(array, 9);
        this.cI = this.a.a(array, 13);
        this.ah.O = array[17];
        for (int i = 0; i < 8; ++i) {
            this.ah.P[i] = array[18 + i];
            this.ah.N[i] = this.a.b(array, 26 + i * 2);
            this.ah.M[i] = this.a.b(array, 42 + i * 2);
        }
        this.aW = this.a.a(array, 58);
        this.bv = array[62];
        this.bw = this.a.a(array, 63);
        this.bx = this.a.a(array, 67);
        this.cq = this.a.a(array, 195);
        this.bY = (array[199] == 1);
        this.dh = this.a.a(array, 200);
        this.cJ = this.a.a(array, 204);
        HH.dz = this.a.a(array, 208);
        this.Y = (array[212] != 0);
        this.aa = array[213];
        final boolean b = false;
        this.ct = (byte)(b ? 1 : 0);
        this.ea = (byte)(b ? 1 : 0);
        this.W();
        this.b = 3;
    }
    
    public final void T() {
        if (this.b == 0) {
            final int n = this.cw & 0x3F;
            final byte b = this.ah.P[this.ah.L];
            if (n > 0) {
                ++this.cw;
                if (n >= BB.g[b][this.ah.L]) {
                    if ((this.cw & 0x80) != 0x0) {
                        this.cw = 129;
                        this.ah.p();
                    }
                    else {
                        this.cw = 0;
                    }
                }
            }
        }
        if (this.b == 11) {
            if ((this.dh & 0x80000) > 0) {
                this.dh = 4;
            }
        }
        else if (this.b == 16 && this.g == 4) {
            ++this.ec;
            if (this.ec > 20) {
                if (this.f && this.i == 0) {
                    this.b = 0;
                    this.s();
                }
                if (this.f) {
                    --this.i;
                }
                else {
                    ++this.i;
                }
                if (this.i > 4) {
                    this.i = 4;
                }
                this.ec = 0;
            }
            this.d = true;
        }
        if (this.b != 0) {
            final byte di = this.di;
            this.di = (byte)(di + 1);
            if (di > 12) {
                this.di = 0;
            }
            this.d = true;
        }
    }
    
    private byte a(final byte b, final byte b2, final byte b3) {
        if (b > b2) {
            return (byte)(b - 1);
        }
        return b3;
    }
    
    private byte b(final byte b, final byte b2, final byte b3) {
        if (b < b2) {
            return (byte)(b + 1);
        }
        return b3;
    }
    
    public final String a(final String s, final Object[] array) {
        int digit = 0;
        int digit2 = 0;
        final StringBuffer sb = new StringBuffer(s.length());
        final char[] array2 = new char[s.length()];
        s.getChars(0, s.length(), array2, 0);
        for (int i = 0; i < array2.length; ++i) {
            final char c;
            final int n;
            final char c2;
            if ((c = array2[i]) == '%' && (n = i + 1) < array2.length && (digit2 = (Character.isDigit(c2 = array2[n]) ? 1 : 0)) == 1) {
                digit = Character.digit(c2, 10);
            }
            if (digit2 == 1) {
                digit2 = 0;
                sb.append(array[digit]);
                ++i;
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public final int a(final Graphics graphics, final String s, final int n, final int n2, final int k) {
        final int a = ratchetandclank.e.a;
        final int a2 = ratchetandclank.e.a(s);
        graphics.setClip(n2, 0, k - n2, 320);
        ratchetandclank.e.a(graphics, s, this.k, n, 20);
        this.k -= 2;
        if (this.k + a2 <= n2) {
            this.k = k;
        }
        return a;
    }
    
    private void W() {
        this.ct = 0;
        for (int i = 0; i < 19; ++i) {
            if ((this.dh & 1 << i) > 0) {
                return;
            }
            ++this.ct;
        }
    }
    
    private void X() {
        this.ct = 0;
        HH.dj = 0;
        if ((this.ah.O & 0x40) > 0) {
            return;
        }
        for (int i = 0; i < 11; ++i) {
            if ((this.cK & 1 << 21 + i) != 0x0) {
                ++this.ct;
            }
        }
        if (this.ct >= 8) {
            HH.dj = 2;
            return;
        }
        if (this.ct >= 4) {
            HH.dj = 1;
            return;
        }
        HH.dj = 0;
    }
    
    private int Y() {
        int n = 0;
        final int[] array = new int[8];
        for (int i = 0; i < 8; ++i) {
            array[i] = BB.d[i * 3 + this.ah.P[i]] - this.ah.M[i];
            switch (i) {
                case 0: {
                    this.aY[i] = 0;
                    break;
                }
                case 1: {
                    n += array[i];
                    this.aY[i] = array[i];
                    break;
                }
                case 2: {
                    if ((this.ah.O & 1 << i) > 0) {
                        n += array[i];
                        this.aY[i] = array[i];
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((this.ah.O & 1 << i) > 0) {
                        n += array[i] * 3;
                        this.aY[i] = array[i] * 3;
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((this.ah.O & 1 << i) > 0) {
                        n += array[i] * 3;
                        this.aY[i] = array[i] * 3;
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((this.ah.O & 1 << i) > 0) {
                        n += array[i] * 2;
                        this.aY[i] = array[i] * 2;
                        break;
                    }
                    break;
                }
                case 6: {
                    this.aY[i] = 0;
                    break;
                }
                case 7: {
                    if ((this.ah.O & 1 << i) > 0) {
                        n += array[i] * 5;
                        this.aY[i] = array[i] * 5;
                        break;
                    }
                    break;
                }
            }
        }
        return n;
    }
    
    public final int a(final Graphics graphics, final String s, int n, int n2, final int n3, final int n4) {
        System.out.println("BOOOO");
        final int a = ratchetandclank.e.a;
        final char[] array = new char[s.length()];
        s.getChars(0, s.length(), array, 0);
        int n5;
        if ((n3 & 0x1) > 0) {
            n = (n5 = 0);
        }
        else {
            n5 = n;
        }
        int i;
        int n6 = i = 0;
        int n7 = 0;
    Label_0218_Outer:
        do {
            int n8 = 0;
            boolean b = false;
            boolean b2 = false;
            int n9 = -1;
            final int n10 = i;
            while (true) {
                while (i < array.length) {
                    final char c;
                    if ((c = array[i]) == '.' || c == '/') {
                        n9 = i;
                    }
                    if (c == ' ') {
                        n8 += ratchetandclank.e.a(c);
                        ++i;
                        if (n5 + n8 > n4 && n7 == 0) {
                            b2 = true;
                        }
                        else {
                            n7 = 1;
                        }
                    }
                    else {
                        final int a2 = ratchetandclank.e.a(c);
                        if (n5 + n8 + a2 <= n4 || n7 != 0) {
                            n8 += a2;
                            ++i;
                            continue Label_0218_Outer;
                        }
                        b2 = true;
                    }
                    if (n5 + n8 > n4 || b || b2) {
                        if (n5 + n8 > n4) {
                            if (!b2) {
                                i = n10;
                            }
                            else if (n9 > 0) {
                                i = n9;
                            }
                        }
                        else if (b2 && n9 > 0) {
                            i = n9;
                        }
                        if (i - n6 > 0) {
                            if ((n3 & 0x1) > 0) {
                                if (i - n6 > 0) {
                                    ratchetandclank.e.a(graphics, array, n6, i - n6, 120, n2, n3);
                                }
                            }
                            else if (i - n6 > 0) {
                                ratchetandclank.e.a(graphics, array, n6, i - n6, n, n2, n3);
                            }
                        }
                        n2 += a;
                        n5 = n;
                        n7 = 0;
                        n6 = i;
                        continue Label_0218_Outer;
                    }
                    n5 += n8;
                    continue Label_0218_Outer;
                }
                b = true;
                continue;
            }
        } while (i < array.length);
        System.out.println("GOOD BOO");
        return n2;
    }
    
    public static final String a(final String s) {
        final StringBuffer sb = new StringBuffer();
        String string = "";
        try {
            final InputStream resourceAsStream;
            if ((resourceAsStream = string.getClass().getResourceAsStream(s)) == null) {
                return "";
            }
            final InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
            int read;
            while ((read = inputStreamReader.read()) != -1) {
                sb.append((char)read);
            }
            string = sb.toString();
            inputStreamReader.close();
        }
        catch (IOException ex) {}
        System.gc();
        return string;
    }
    
    static {
        HH.e = false;
        HH.v = 0;
        HH.w = 0;
        HH.x = false;
        HH.y = false;
        HH.z = false;
        HH.B = false;
        HH.C = 0;
        HH.D = 42;
        HH.E = 28;
        HH.F = 20;
        HH.H = 44;
        HH.I = 44;
        HH.J = -16;
        L = new byte[] { 6, 0, 0, 1, 2, 4, 5, 3, 13, 13, 9, 10, 9, 16, 12, 11, 8, 11, 19, 18 };
        M = new byte[] { 2, 3, 4, 7, 5, 6, 0, 5, 16, 12, 11, 17, 14, 10, 15, 13, 13, 15, 4, 18 };
        N = new byte[] { 19, 0, 18, 2, 12, 4, 5, 4, 7, 10, 3, 8, 11, 1, 15, 6, 6, 16, 9, 13 };
        O = new byte[] { 1, 13, 3, 10, 7, 7, 16, 8, 11, 18, 9, 12, 4, 19, 12, 14, 17, 14, 2, 0 };
        P = new byte[] { 0, 2, 3, 5, 1, 7, 4, 6 };
        Q = new byte[] { 0, 4, 1, 2, 6, 3, 7, 5 };
        R = new byte[] { 4, 3, 2, 3, 4, 4, 2, 3, 3, 2, 0, 0, 0 };
        aQ = new String[] { "/bg_agclnk.png", "/bg_arena.png", "/bg_os.png", "/bg_menu.png" };
        HH.aZ = 10;
        HH.ba = HH.aZ;
        bM = new byte[] { 14, 14, 13, 13 };
        bN = new byte[] { 8, 9, 8, 9 };
        HH.bQ = 30;
        HH.bR = 60;
        ck = new int[] { 200, 400, 400, 600, 600, 600, 800, 800, 800, 1200, 1200, 2000 };
        cy = new byte[] { 2, 4, 2, 13, 1, 1, 1, 1, 3, 1, 1, 1, 5, 4, 3, 3, 6, 5, 0, 0, 6, 1, 5, 1, 1, 1, 1, 1, 5, 1, 3, 7, 4, 3, 4, 3, 1, 1, 1, 1 };
        cz = new short[] { 104, 106, 110, 112, 125, 126, 127, 128, 129, 132, 133, 134, 135, 140, 144, 147, 150, 156, 0, 0, 161, 167, 168, 173, 174, 175, 176, 177, 178, 183, 184, 187, 194, 199, 202, 206, 209, 209, 210, 211 };
        cA = new byte[] { 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 1, 0, 2, -1, -1, -1, -1, 0, 1, 0, -1, -1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 2, 1, 0, 2, -1, 1, 0, 2, 0, 1, 0, 1, 0, 1, 0, 1, -1, 1, 0, 1, 0, 1, -1, -1, -1, -1, -1, 0, 1, 0, 1, 0, -1, 4, 0, 4, 3, 0, 3, 0, 3, 1, 3, 0, 1, 0, 1, -1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, -1, -1, 0, 1 };
        dw = new long[] { 160000L, 120000L, 160000L, 130000L, 160000L, 130000L, 100000L, 140000L, 220000L, 180000L, 180000L, 110000L, 140000L, 140000L, 300000L, 150000L, 30000L };
        dL = new short[][] { { 24, 62 }, { 70, 42 }, { 117, 62 }, { 11, 112 }, { 128, 112 }, { 43, 154 }, { 97, 154 } };
        dM = new byte[] { 0, 0, 10, 26, 36, 36, 26, 10 };
        dN = new byte[] { 26, 10, 0, 0, 10, 26, 36, 36 };
        dO = new byte[] { 3, 3, 10, 26, 33, 33, 26, 10 };
        dP = new byte[] { 26, 10, 3, 3, 10, 26, 33, 33 };
        dQ = new byte[] { 2, 2, 11, 26, 35, 35, 26, 11 };
        dR = new byte[] { 25, 11, 2, 2, 11, 25, 34, 34 };
    }
}
