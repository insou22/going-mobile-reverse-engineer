import javax.microedition.midlet.*;
import java.io.*;
import javax.microedition.lcdui.*;

public final class GG
{
    public static final int[] a;
    public static int b;
    public boolean c;
    private Image[] z;
    public static byte d;
    private static byte A;
    private static byte B;
    private Display C;
    public byte e;
    private byte D;
    private long E;
    public byte f;
    public int[] g;
    private long F;
    private byte G;
    private byte H;
    public boolean h;
    private byte I;
    private byte J;
    private int[] K;
    private ratchetandclank L;
    public String i;
    public boolean j;
    public Form k;
    public TextField l;
    public String m;
    public long n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public long t;
    public int u;
    private int M;
    public int[] v;
    public int[][] w;
    public static int x;
    public static int y;
    
    public final byte a() {
        return GG.B;
    }
    
    public final int b() {
        return GG.A - ((240 / GG.A + 1) * GG.A - 240) / 2;
    }
    
    public GG(final ratchetandclank l) {
        this.c = false;
        this.K = new int[] { 52, 54, 52, 54 };
        this.j = true;
        this.m = "";
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = 0L;
        this.u = 0;
        this.M = 4;
        this.v = new int[] { 652482873, 766492548 };
        this.w = new int[2][8];
        this.L = l;
        this.c = true;
        this.L.l();
        GG.A = HH.D;
        GG.B = HH.E;
        this.C = Display.getDisplay((MIDlet)l);
        this.e = 0;
        this.D = 0;
        this.f = 3;
        this.g = new int[8];
        this.F = System.currentTimeMillis();
        this.G = 0;
        this.H = 0;
        final String appProperty;
        if ((appProperty = this.L.getAppProperty("Unlock-Code")) != null) {
            this.j = appProperty.equals("true");
        }
        try {
            (this.z = new Image[3])[0] = Image.createImage("/intro_publisher.png");
            this.z[1] = Image.createImage("/intro_handheld.png");
            this.z[2] = Image.createImage("/intro_ratchet.png");
        }
        catch (IOException ex) {}
    }
    
    public final void c() {
        this.f = 3;
        this.D = 0;
        this.G = 0;
        this.L.c.aP = 3;
        try {
            HH.aE = null;
            System.gc();
            HH.e(20);
            HH.aE = Image.createImage(HH.aQ[3]);
        }
        catch (IOException ex) {}
        System.currentTimeMillis();
        this.a((byte)1);
    }
    
    public final void a(final boolean b) {
        this.L.d();
        System.gc();
        HH.e(20);
        this.o = true;
        this.r = true;
    }
    
    public final void d() {
        if (this.r) {
            this.p = true;
            this.L.d();
            return;
        }
        this.f();
    }
    
    public final void e() {
        if (this.q) {
            this.q = false;
        }
        else {
            this.g();
        }
        this.p = false;
    }
    
    public final void f() {
        this.L.d();
        this.f |= 0x1;
        this.p = true;
        this.t = 0L;
        HH.aE = null;
        HH.aF = null;
        HH.aG = null;
        HH.aB = null;
        HH.aL = null;
        HH.aI = null;
        System.gc();
    }
    
    public final void g() {
        if (this.p) {
            if (this.e > 0) {
                this.s = 5;
            }
            this.f |= 0x1;
            this.p = false;
            this.u = 4;
            try {
                if (HH.aF == null) {
                    (HH.aF = new Image[5])[0] = Image.createImage("/en_disdro.png");
                    HH.aF[1] = Image.createImage("/en_micbot.png");
                    HH.aF[2] = Image.createImage("/en_patbot.png");
                    HH.aF[3] = Image.createImage("/en_turret.png");
                    HH.aF[4] = Image.createImage("/en_boar.png");
                }
                if (HH.aG == null) {
                    HH.aG = Image.createImage("/ratcht.png");
                }
                if (HH.aE == null) {
                    try {
                        this.L.c.aP = 3;
                        HH.aE = Image.createImage(HH.aQ[3]);
                    }
                    catch (IOException ex) {}
                }
                if (HH.aB == null) {
                    HH.aB = Image.createImage("/doors.png");
                }
                if (HH.aL == null) {
                    HH.aL = Image.createImage("/explod.png");
                }
                if (HH.aI == null) {
                    HH.aI = Image.createImage("/box.png");
                }
            }
            catch (Exception ex2) {}
            this.t = System.currentTimeMillis();
        }
    }
    
    public final void h() {
        if (this.M <= 42) {
            if (this.L.c == null) {
                this.E = System.currentTimeMillis();
                this.L.c = new HH(this.L);
            }
            if (this.u > 0) {
                this.u = 0;
                --this.M;
            }
            try {
                this.L.c.a(this.M);
                ++this.M;
            }
            catch (Exception ex) {}
            if (this.M <= 42) {
                return;
            }
            this.f = 3;
            System.currentTimeMillis();
        }
        if (this.p) {
            HH.e(100);
            return;
        }
        if (this.u > 0 && --this.u > 0) {
            HH.e(10);
            return;
        }
        if (System.currentTimeMillis() - this.F > 33L) {
            this.F = System.currentTimeMillis();
            if (this.s > 0 && --this.s == 0 && ratchetandclank.q != -1 && !this.L.a(false)) {
                this.s = 2;
            }
            this.j();
        }
        else if ((this.f & 0x1) > 0) {
            this.f &= 0xFFFFFFFE;
        }
        if (this.o) {
            this.o = false;
        }
    }
    
    public final void a(final String s, final int n) {
        final String upperCase = s.toUpperCase();
        int n2 = 0;
        for (int length = upperCase.length(), i = 0; i < length; ++i) {
            n2 += upperCase.charAt(i) * (i + 1);
        }
        final int n3 = n2 * this.v[n];
        for (int j = 0; j < 8; ++j) {
            final int n4 = j * 4;
            this.w[n][j] = this.a((n3 & 15 << n4) >> n4);
        }
    }
    
    public final int a(final int n) {
        if (n >= 0 && n <= 3) {
            return 0;
        }
        if (n >= 4 && n <= 7) {
            return 1;
        }
        if (n >= 8 && n <= 11) {
            return 2;
        }
        return 3;
    }
    
    public final void a(final byte e) {
        this.f = 3;
        if (e == 1) {
            this.L.c.dW = -1;
            this.L.c.ah.ao = true;
            GG.d = 90;
            this.L.c.ah.L = 1;
            this.L.c.ah.a((byte)1);
            this.L.c.ah.am = 0;
            this.L.c.ah.aa = 10;
            this.L.c.ah.ab = -30720;
            this.L.c.ah.ac = 0;
            this.L.c.ah.ad = 1536;
            this.L.c.ah.E = 0;
            this.L.c.ah.ag = -2048;
            this.L.c.ag[0].Z = 1;
            this.L.c.ag[0].w = 0;
            this.L.c.ag[0].ao = true;
            this.L.c.ag[0].v = false;
            this.L.c.ag[0].a((byte)1);
            this.L.c.ag[0].am = 0;
            this.L.c.ag[0].aa = 10;
            this.L.c.ag[0].ab = -10752;
            this.L.c.ag[0].ac = 0;
            this.L.c.ag[0].ad = 1536;
            this.L.c.ag[0].ai = 1;
            this.L.c.ag[0].ah = 1;
            this.L.c.ag[0].ap = 0;
            this.L.c.ag[0].ag = -2048;
            this.L.c.ag[1].Z = 1;
            this.L.c.ag[1].w = 0;
            this.L.c.ag[1].ao = false;
            this.L.c.ag[1].v = false;
            this.L.c.ag[1].a((byte)1);
            this.L.c.ag[1].am = 0;
            this.L.c.ag[1].aa = 10;
            this.L.c.ag[1].ab = 9 * GG.A << 8;
            this.L.c.ag[1].ac = 0;
            this.L.c.ag[1].ad = 0;
            this.L.c.ag[1].ai = 1;
            this.L.c.ag[1].ah = 1;
            this.L.c.ag[1].ap = 0;
            this.L.c.ag[1].ag = -2048;
            this.L.c.ag[2].Z = 1;
            this.L.c.ag[2].w = 0;
            this.L.c.ag[2].ao = false;
            this.L.c.ag[2].v = false;
            this.L.c.ag[2].a((byte)1);
            this.L.c.ag[2].am = 0;
            this.L.c.ag[2].aa = 10;
            this.L.c.ag[2].ab = 10 * GG.A << 8;
            this.L.c.ag[2].ac = 0;
            this.L.c.ag[2].ad = 0;
            this.L.c.ag[2].ai = 1;
            this.L.c.ag[2].ah = 1;
            this.L.c.ag[2].ap = 0;
            this.L.c.ag[2].ag = -2048;
            this.L.c.ag[3].Z = 1;
            this.L.c.ag[3].w = 0;
            this.L.c.ag[3].ao = false;
            this.L.c.ag[3].v = false;
            this.L.c.ag[3].a((byte)1);
            this.L.c.ag[3].am = 0;
            this.L.c.ag[3].aa = 10;
            this.L.c.ag[3].ab = 11 * GG.A << 8;
            this.L.c.ag[3].ac = 0;
            this.L.c.ag[3].ad = 0;
            this.L.c.ag[3].ai = 1;
            this.L.c.ag[3].ah = 1;
            this.L.c.ag[3].ap = 0;
            this.L.c.ag[3].ag = -2048;
            this.s = 3;
        }
        if (e == 5) {
            for (byte b = 0; b < HH.aZ; ++b) {
                this.L.c.ag[b].Z = -1;
            }
            this.L.c.ah.ao = true;
            this.L.c.ah.L = 0;
            this.L.c.ah.a((byte)8);
            this.L.c.ah.am = 1;
            this.L.c.ah.ah = 1;
            this.L.c.ah.ab = 30720;
            this.L.c.ah.ac = 0;
            this.L.c.ah.ad = 0;
            this.L.c.ah.E = 0;
            this.L.c.ah.aa = 2;
            this.L.c.ah.ag = -1280;
            this.L.c.ah.O = -1;
            this.I = 0;
        }
        if (e == 15) {
            this.n = 0L;
            ((Displayable)(this.k = new Form(""))).addCommand(new Command(ratchetandclank.n[39], 4, 1));
            ((Displayable)this.k).addCommand(new Command(ratchetandclank.n[8], 3, 1));
            ((Displayable)this.k).setCommandListener((CommandListener)this.L.d);
            this.l = new TextField(ratchetandclank.n[289], this.m, 15, 0);
            this.k.append((Item)this.l);
            this.r = true;
            this.C.setCurrent((Displayable)this.k);
            this.n = System.currentTimeMillis();
        }
        if (e == 17) {
            this.a(this.m, 0);
            this.a(this.m, 1);
        }
        this.e = e;
        this.G = 0;
        if (e == 20) {
            if (ratchetandclank.q == -1) {
                this.G = 0;
            }
            else {
                this.G = (byte)ratchetandclank.q;
            }
        }
        if (e == 4 || e == 6 || e == 11) {
            this.L.e();
        }
    }
    
    public final void a(final Command command) {
        if (this.n == 0L) {
            return;
        }
        if (System.currentTimeMillis() - this.n < 1000L) {
            return;
        }
        if (command.getCommandType() == 4) {
            final String trim;
            final int length;
            if ((length = (trim = this.l.getString().trim()).length()) < 4) {
                this.a(ratchetandclank.n[292], ratchetandclank.n[293], 1500);
                return;
            }
            if (length >= 16) {
                this.a(ratchetandclank.n[292], ratchetandclank.n[294], 1500);
                return;
            }
            this.m = trim;
            this.a((byte)17);
        }
        else {
            this.a((byte)1);
        }
        this.k = null;
        this.l = null;
        System.gc();
        this.q = true;
        this.L.d.a = -1;
        this.C.setCurrent((Displayable)this.L.d);
    }
    
    public final void a(final String s, final String s2, final int timeout) {
        final Alert current;
        (current = new Alert(s, s2, (Image)null, AlertType.ERROR)).setTimeout(timeout);
        this.C.setCurrent((Displayable)current);
    }
    
    public final void a(final Graphics graphics, final byte b) {
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(0);
        graphics.fillRect(0, 0, 240, 320);
        int n;
        if (240 % HH.aE.getWidth() == 0) {
            n = 0;
        }
        else {
            n = -(((240 / HH.aE.getWidth() + 1) * HH.aE.getWidth() - 240) / 2);
        }
        this.L.c.a(graphics, n, 0, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        graphics.drawImage(HH.aE, n, 0, 0);
        this.L.c.a(graphics, n, HH.aE.getHeight() / 16, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        graphics.drawImage(HH.aE, n, HH.aE.getHeight() / 16, 0);
        this.L.c.a(graphics, 240 - n - HH.aE.getWidth(), 0, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        EE.b.drawImage(HH.aE, 240 - n - HH.aE.getWidth(), 0, 20, 8192);
        this.L.c.a(graphics, 240 - n - HH.aE.getWidth(), HH.aE.getHeight() / 16, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        EE.b.drawImage(HH.aE, 240 - n - HH.aE.getWidth(), HH.aE.getHeight() / 16, 20, 8192);
        this.L.c.a(graphics, n, 2 * HH.aE.getHeight() / 16, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        graphics.drawImage(HH.aE, n, HH.aE.getHeight() / 16, 0);
        this.L.c.a(graphics, 240 - n - HH.aE.getWidth(), 2 * HH.aE.getHeight() / 16, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        EE.b.drawImage(HH.aE, 240 - n - HH.aE.getWidth(), HH.aE.getHeight() / 16, 20, 8192);
        for (int n2 = HH.aE.getHeight() / 16, i = 3 * n2; i < 320 - HH.aE.getHeight() / 16; i += n2) {
            if (i + n2 > 320 - HH.aE.getHeight() / 16) {
                n2 = 320 - HH.aE.getHeight() / 16 - i;
            }
            this.L.c.a(graphics, n, i, HH.aE.getWidth(), n2);
            graphics.drawImage(HH.aE, n, i - 2 * HH.aE.getHeight() / 16, 0);
            this.L.c.a(graphics, 240 - n - HH.aE.getWidth(), i, HH.aE.getWidth(), n2);
            EE.b.drawImage(HH.aE, 240 - n - HH.aE.getWidth(), i - 2 * HH.aE.getHeight() / 16, 0, 8192);
        }
        this.L.c.a(graphics, n, 320 - HH.aE.getHeight() / 16, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        graphics.drawImage(HH.aE, n, 320 - HH.aE.getHeight() / 16 - 3 * HH.aE.getHeight() / 16, 0);
        this.L.c.a(graphics, 240 - n - HH.aE.getWidth(), 320 - HH.aE.getHeight() / 16, HH.aE.getWidth(), HH.aE.getHeight() / 16);
        EE.b.drawImage(HH.aE, 240 - n - HH.aE.getWidth(), 320 - 4 * HH.aE.getHeight() / 16, 20, 8192);
        for (int j = n + HH.aE.getWidth(); j < 240 - n - HH.aE.getWidth(); j += HH.aE.getWidth()) {
            this.L.c.a(graphics, j, 320 - HH.aE.getHeight() / 16, HH.aE.getWidth(), HH.aE.getHeight() / 16);
            graphics.drawImage(HH.aE, j, 320 - HH.aE.getHeight() / 16 - 4 * HH.aE.getHeight() / 16, 0);
        }
        graphics.setClip(0, 0, 240, 320);
    }
    
    public final void b(final int n) {
        if (this.u > 0) {
            return;
        }
        if (this.t > 0L && System.currentTimeMillis() - this.t < 1000L) {
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
        switch (this.e) {
            case 0: {
                if (this.L.c != null) {
                    this.E = 0L;
                    this.f |= 0x1;
                    return;
                }
                break;
            }
            case 1: {
                this.c(n, n2);
            }
            case 2: {
                this.e(n, n2);
            }
            case 4: {
                this.d(n, n2);
            }
            case 8: {
                this.g(n, n2);
            }
            case 15: {}
            case 16: {
                this.b(n, n2);
            }
            case 17: {
                this.a(n, n2);
            }
            case 5: {
                this.h(n, n2);
            }
            case 6: {
                this.k(n, n2);
            }
            case 9: {
                this.i(n, n2);
            }
            case 7: {
                this.j(n, n2);
            }
            case 11: {
                this.l(n, n2);
            }
            case 20: {
                this.f(n, n2);
                break;
            }
        }
    }
    
    private void c(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.G = this.a(this.G, (byte)0, (byte)(this.j ? 6 : 5));
            this.f |= 0x3;
            return;
        }
        if (n2 == -2 || n == 56) {
            this.G = this.b(this.G, (byte)(this.j ? 6 : 5), (byte)0);
            this.f |= 0x3;
            return;
        }
        if (n == -8) {
            this.f |= 0x3;
            this.a((byte)9);
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.G == 0) {
                this.a((byte)11);
                return;
            }
            if (this.G == 1) {
                this.a((byte)4);
                return;
            }
            if (this.G == 2 && this.j) {
                if (this.L.h()) {
                    this.a((byte)15);
                    return;
                }
                this.a((byte)16);
            }
            else {
                if ((this.G == 2 && !this.j) || (this.G == 3 && this.j)) {
                    this.a((byte)2);
                    return;
                }
                if ((this.G == 3 && !this.j) || (this.G == 4 && this.j)) {
                    this.a((byte)5);
                    return;
                }
                if ((this.G == 4 && !this.j) || (this.G == 5 && this.j)) {
                    for (int i = 0; i < 4; ++i) {
                        this.K[i] = 52;
                    }
                    this.a((byte)8);
                    return;
                }
                if ((this.G == 5 && !this.j) || (this.G == 6 && this.j)) {
                    this.a((byte)9);
                }
            }
        }
    }
    
    private void d(final int n, final int n2) {
        if (n2 == -1 || n == 50) {
            this.G = this.a(this.G, (byte)0, (byte)2);
            this.f |= 0x3;
            return;
        }
        if (n2 == -2 || n == 56) {
            this.G = this.b(this.G, (byte)2, (byte)0);
            this.f |= 0x3;
            return;
        }
        if (n != 53 && n2 != -5 && n != -6) {
            if (n == -7 || n == -8) {
                this.a((byte)1);
            }
            return;
        }
        if (this.L.l[this.G] == 0) {
            return;
        }
        this.L.b(this.G);
    }
    
    private void e(final int n, final int n2) {
        if (n == -7 || n == -8) {
            this.a((byte)1);
            this.L.a((byte)(this.L.k ? 1 : 0));
            return;
        }
        if (n2 == -1 || n == 50) {
            this.G = this.a(this.G, (byte)0, (byte)(this.c ? 2 : 1));
            this.f |= 0x3;
            return;
        }
        if (n2 == -2 || n == 56) {
            this.G = this.b(this.G, (byte)(this.c ? 2 : 1), (byte)0);
            this.f |= 0x3;
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.G == 0) {
                if (this.L.k) {
                    this.s = 0;
                    this.L.k = false;
                    this.L.d();
                }
                else {
                    this.s = 15;
                    this.L.k = true;
                }
                this.f |= 0x3;
                return;
            }
            if (this.G == 1) {
                this.a((byte)6);
                return;
            }
            if (this.G == 2 && this.c) {
                this.a((byte)20);
            }
        }
    }
    
    private void f(final int n, final int n2) {
        if (n == -7 || n == -8) {
            if (ratchetandclank.q != -1) {
                this.a((byte)2);
            }
        }
        else {
            if (n2 == -1 || n == 50) {
                this.G = this.a(this.G, (byte)0, (byte)4);
                this.f |= 0x3;
                return;
            }
            if (n2 == -2 || n == 56) {
                this.G = this.b(this.G, (byte)4, (byte)0);
                this.f |= 0x3;
                return;
            }
            if ((n == 53 || n2 == -5 || n == -6) && this.G != ratchetandclank.q) {
                final boolean b = ratchetandclank.q == -1;
                ratchetandclank.q = this.G;
                this.L.a((byte)(this.L.k ? 1 : 0));
                System.gc();
                HH.e(20);
                this.L.l();
                this.f |= 0x3;
                if (b) {
                    this.a((byte)1);
                }
            }
        }
    }
    
    private void g(final int n, final int n2) {
        if (n == 52 || n2 == -3 || n == -7) {
            if (this.G > 0) {
                --this.G;
                this.f |= 0x3;
            }
            else {
                this.a((byte)1);
            }
        }
        else if (n == 54 || n2 == -4 || n == -6) {
            if (this.G < 4) {
                ++this.G;
                this.f |= 0x3;
            }
            else {
                this.a((byte)1);
            }
        }
        else if (n == 53 || n2 == -5) {
            this.a((byte)1);
        }
        if (!this.L.c.p) {
            this.e(n);
            this.L.c.p = this.l();
        }
    }
    
    public final void a(final int n, final int n2) {
        if (n == -7 || n == -8) {
            this.a((byte)15);
            return;
        }
        if (n == -6) {
            this.a((byte)1);
        }
    }
    
    public final void b(final int n, final int n2) {
        if (n == -7 || n == -8) {
            this.a((byte)1);
        }
    }
    
    private void h(final int n, final int n2) {
        if (n == 52 || n2 == -3 || n == -7) {
            if (this.G > 0) {
                --this.G;
                if (this.G > 3 && this.G < 11) {
                    final BB ah = this.L.c.ah;
                    --ah.L;
                }
                else if (this.G == 3) {
                    this.L.c.ah.L = 0;
                    this.L.c.ah.a((byte)8);
                    this.L.c.ah.am = 1;
                }
                else if (this.G == 11) {
                    this.L.c.ah.L = 8;
                }
                for (int i = 9; i >= 0; --i) {
                    this.L.c.ai[i].a();
                }
                this.J = 0;
                this.I = 0;
                this.f |= 0x3;
                return;
            }
            this.a((byte)1);
        }
        else {
            if (n != 54 && n2 != -4 && n != -6) {
                if (n == 53 || n2 == -5) {
                    this.a((byte)1);
                }
                return;
            }
            if (this.G < 13) {
                ++this.G;
                if (this.G > 3 && this.G < 11) {
                    final BB ah2 = this.L.c.ah;
                    ++ah2.L;
                }
                else if (this.G == 3) {
                    this.L.c.ah.L = 0;
                    this.L.c.ah.a((byte)8);
                    this.L.c.ah.am = 1;
                }
                else if (this.G == 11) {
                    this.L.c.ah.L = 8;
                }
                for (int j = 9; j >= 0; --j) {
                    this.L.c.ai[j].a();
                }
                this.J = 0;
                this.I = 0;
                this.f |= 0x3;
                return;
            }
            this.a((byte)1);
        }
    }
    
    private void i(final int n, final int n2) {
        if (n == -7 || n == -8) {
            this.a((byte)1);
            return;
        }
        if (n2 == -2 || n == 56) {
            this.G = this.a(this.G, (byte)0, (byte)1);
            this.f |= 0x3;
            return;
        }
        if (n2 == -1 || n == 50) {
            this.G = this.b(this.G, (byte)1, (byte)0);
            this.f |= 0x3;
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.G == 0) {
                this.a((byte)1);
                return;
            }
            if (this.G == 1) {
                this.L.a();
            }
        }
    }
    
    private void j(final int n, final int n2) {
        if (n == -7 || n == -8) {
            if (this.h) {
                this.a((byte)11);
                return;
            }
            this.a((byte)6);
        }
        else {
            if (n2 == -1 || n == 50) {
                this.G = this.a(this.G, (byte)0, (byte)1);
                this.f |= 0x3;
                return;
            }
            if (n2 == -2 || n == 56) {
                this.G = this.b(this.G, (byte)1, (byte)0);
                this.f |= 0x3;
                return;
            }
            if (n == 53 || n2 == -5 || n == -6) {
                if (this.G == 0) {
                    if (this.h) {
                        this.a((byte)11);
                        return;
                    }
                    this.a((byte)6);
                }
                else if (this.G == 1) {
                    if (this.h) {
                        this.L.c.aa = this.H;
                        this.H = -1;
                        this.L.a(0);
                        return;
                    }
                    this.L.f(this.H);
                    this.H = -1;
                    this.L.e();
                    this.f |= 0x3;
                    this.a((byte)6);
                }
            }
        }
    }
    
    private void k(final int n, final int n2) {
        if (n == -7 || n == -8) {
            this.a((byte)2);
            return;
        }
        if (n2 == -1 || n == 50) {
            this.G = this.a(this.G, (byte)0, (byte)2);
            this.f |= 0x3;
            return;
        }
        if (n2 == -2 || n == 56) {
            this.G = this.b(this.G, (byte)2, (byte)0);
            this.f |= 0x3;
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.L.l[this.G] == 0) {
                return;
            }
            this.H = this.G;
            this.h = false;
            this.a((byte)7);
        }
    }
    
    private void l(final int n, final int n2) {
        if (n == -7 || n == -8) {
            this.a((byte)1);
            return;
        }
        if (n2 == -1 || n == 50) {
            this.G = this.a(this.G, (byte)0, (byte)2);
            this.f |= 0x3;
            return;
        }
        if (n2 == -2 || n == 56) {
            this.G = this.b(this.G, (byte)2, (byte)0);
            this.f |= 0x3;
            return;
        }
        if (n == 53 || n2 == -5 || n == -6) {
            if (this.L.l[this.G] == 0) {
                this.L.c.aa = this.G;
                this.L.a(0);
                return;
            }
            this.H = this.G;
            this.h = true;
            this.a((byte)7);
        }
    }
    
    public final void a(final Graphics graphics) {
        System.out.println(10);
        if (this.u > 0) {
            System.out.println(11);
            return;
        }
        System.out.println(12);
        if (this.e != 0 && (HH.aF == null || HH.aG == null || HH.aE == null)) {
            System.out.println(13);
            return;
        }
        System.out.println(14);
        graphics.setClip(0, 0, 240, 320);
        if (this.o) {
            System.out.println(15);
            graphics.setColor(0);
            graphics.fillRect(0, 0, 240, 320);
            System.out.println(16);
            return;
        }
        System.out.println(17);
        System.out.println("E: " + this.e);
        switch (this.e) {
            case 0: {
                this.b(graphics);
                System.out.println(18);
            }
            System.out.println(60);
            case 1: {
                this.d(graphics);
            }
            case 2: {
                this.h(graphics);
            }
            case 4: {
                this.e(graphics);
            }
            System.out.println(61);
            case 5: {
                this.a(graphics, (int)this.G);
            }
            System.out.println(70);
            case 8: {
                this.b(graphics, this.G);
            }
            System.out.println(71);
            case 15: {}
            System.out.println(72);
            case 16: {
                this.g(graphics);
            }
            System.out.println(73);
            case 17: {
                System.out.println("Inside 17?????");
                this.f(graphics);
            }
            System.out.println(62);
            case 7: {
                this.l(graphics);
            }
            case 6: {
                this.k(graphics);
            }
            case 9: {
                this.j(graphics);
            }
            System.out.println(63);
            case 10: {
                graphics.setClip(0, 0, 240, 320);
                graphics.setColor(0);
                graphics.fillRect(0, 0, 240, 320);
            }
            case 11: {
                this.c(graphics);
            }
            System.out.println(64);
            case 20: {
                this.i(graphics);
                break;
            }
//            System.out.println(65);

            case 101: {
                break;
            }
        }
        System.out.println(19);
    }
    
    private void j() {
        switch (this.e) {
            case 0: {
                this.k();
            }
            case 1: {
                if (GG.d <= 100) {
                    ++GG.d;
                    return;
                }
                this.L.c.ah.n();
                this.L.c.ag[0].i();
                this.L.c.ag[1].i();
                this.L.c.ag[2].i();
                this.L.c.ag[3].i();
                this.f |= 0x1;
                final BB ah = this.L.c.ah;
                ah.ab += this.L.c.ah.ad;
                final FF f = this.L.c.ag[0];
                f.ab += this.L.c.ag[0].ad;
                final FF f2 = this.L.c.ag[1];
                f2.ab += this.L.c.ag[1].ad;
                final FF f3 = this.L.c.ag[2];
                f3.ab += this.L.c.ag[2].ad;
                final FF f4 = this.L.c.ag[3];
                f4.ab += this.L.c.ag[3].ad;
                if (this.L.c.ah.ab >> 8 > (240 / GG.A + 2) * GG.A && this.L.c.ah.ao) {
                    this.L.c.ah.ao = false;
                    final BB ah2 = this.L.c.ah;
                    ah2.ad *= -1;
                    this.L.c.ag[0].ao = false;
                    final FF f5 = this.L.c.ag[0];
                    f5.ad *= -1;
                    this.L.c.ag[0].ab = (240 / GG.A + 7) * GG.A << 8;
                    this.L.c.ag[1].ad = -1536;
                    this.L.c.ag[1].ab = (240 / GG.A + 4) * GG.A << 8;
                    this.L.c.ag[2].ad = -1536;
                    this.L.c.ag[2].ab = (240 / GG.A + 5) * GG.A << 8;
                    this.L.c.ag[3].ad = -1536;
                    this.L.c.ag[3].ab = (240 / GG.A + 6) * GG.A << 8;
                    return;
                }
                if (this.L.c.ag[0].ab >> 8 < 0 && !this.L.c.ag[0].ao) {
                    GG.d = 0;
                    this.L.c.ah.ao = true;
                    final BB ah3 = this.L.c.ah;
                    ah3.ad *= -1;
                    this.L.c.ah.ab = -5 * GG.A << 8;
                    final FF f6 = this.L.c.ag[0];
                    f6.ad *= -1;
                    this.L.c.ag[0].ao = true;
                    this.L.c.ag[0].ab = -3 * GG.A << 8;
                    this.L.c.ag[1].ab = (240 / GG.A + 4) * GG.A << 8;
                    this.L.c.ag[1].ad = 0;
                    this.L.c.ag[2].ab = (240 / GG.A + 5) * GG.A << 8;
                    this.L.c.ag[2].ad = 0;
                    this.L.c.ag[3].ab = (240 / GG.A + 6) * GG.A << 8;
                    this.L.c.ag[3].ad = 0;
                    return;
                }
                break;
            }
            case 5: {
                this.f |= 0x1;
                this.L.c.ah.n();
                if (this.G == 3) {
                    if (this.I > 70) {
                        this.L.c.ah.a((byte)0);
                        this.L.c.ah.am = 0;
                        this.I = 0;
                    }
                    else if (this.I == 1 || this.I == 10 || this.I == 20) {
                        this.L.c.ah.a((byte)8);
                        this.L.c.ah.am = 1;
                    }
                    ++this.I;
                    return;
                }
                if (this.J < 3) {
                    if (this.G > 3 && this.G < 11 && this.I > 10) {
                        this.L.c.ah.p();
                        this.I = 0;
                        ++this.J;
                        for (int i = 0; i < 8; ++i) {
                            if (this.L.c.ah.M[i] == 0) {
                                this.L.c.ah.M[i] = 30;
                            }
                        }
                    }
                }
                else if (this.I > 50) {
                    this.J = 0;
                    this.I = 0;
                }
                else if (this.I == 1) {
                    this.L.c.ah.a((byte)0);
                    this.L.c.ah.am = 0;
                }
                ++this.I;
                for (int j = 9; j >= 0; --j) {
                    this.a(this.L.c.ai[j]);
                }
                break;
            }
        }
    }
    
    private void k() {
        if (this.E == 0L || this.E + 2000L < System.currentTimeMillis()) {
            if (this.D == 0) {
                this.D = 1;
                this.f |= 0x1;
                this.E = System.currentTimeMillis();
                return;
            }
            if (this.D == 1) {
                this.D = 2;
                this.f |= 0x1;
                this.E = System.currentTimeMillis();
                return;
            }
            if (this.D == 2) {
                this.f |= 0x1;
                this.E = System.currentTimeMillis();
                this.z[2] = null;
                this.z[1] = null;
                this.z[0] = null;
                System.gc();
                Thread.yield();
                if (ratchetandclank.q >= 0) {
                    this.a((byte)1);
                    return;
                }
                this.a((byte)20);
            }
        }
        else if (this.z[this.D] == null) {
            switch (this.D) {
                case 0: {
                    try {
                        if (this.z[1] == null) {
                            this.z[1] = Image.createImage("/intro_handheld.png");
                        }
                    }
                    catch (Exception ex) {}
                }
                case 1: {
                    try {
                        if (this.z[2] == null) {
                            this.z[2] = Image.createImage("/intro_ratchet.png");
                        }
                        return;
                    }
                    catch (Exception ex2) {}
                    break;
                }
            }
        }
    }
    
    public final void a(final Command command, final Displayable displayable) {
        if (displayable == this.k) {
            this.a(command);
        }
    }
    
    public final void b(final Command command, final Displayable displayable) {
        if (displayable == this.k) {
            this.a(command);
            return;
        }
        if (command.getCommandType() == 4 && GG.x >= 0) {
            this.b(-6);
            return;
        }
        if (command.getCommandType() == 2 && GG.y >= 0) {
            this.b(-7);
        }
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final Object o) {
        graphics.setClip(0, 0, 240, 320);
        ratchetandclank.e = ratchetandclank.f;
        if (n >= 0) {
            final String s = ratchetandclank.n[n];
            final int n3 = 320 - ratchetandclank.f.a;
            ratchetandclank.f.a(s);
            graphics.setColor(6580223);
            graphics.setColor(14474495);
            ratchetandclank.e.a(graphics, s, 1, n3, 20);
        }
        if (n2 >= 0) {
            final String s2 = ratchetandclank.n[n2];
            final int n4 = 320 - ratchetandclank.f.a;
            final int a = ratchetandclank.f.a(s2);
            graphics.setColor(6580223);
            graphics.setColor(14474495);
            ratchetandclank.e.a(graphics, s2, 240 - a - 1, n4, 20);
        }
    }
    
    private int a(final Graphics graphics, final String i, final int n, final int n2, final int n3, final boolean b, final int color) {
        System.out.println("a1");
        ratchetandclank.e = (b ? ratchetandclank.g : ratchetandclank.h);
        System.out.println("a2");
        if (b) {
            System.out.println("a3");
            this.L.b.i = i;
            System.out.println("a4");
        }
        System.out.println("a5");
        graphics.setColor(color);
        System.out.println("a6");
        return this.L.c.a(graphics, i, n, n2, 17, HH.ao.getWidth() - 10);
    }
    
    public final int a(final Graphics graphics, final String s, final int n, final int n2, final int n3, final boolean b) {
        return this.a(graphics, s, n, n2, n3, b, b ? 1175023 : 14474495);
    }
    
    public final int b(final Graphics graphics, final String s, final int n, final int n2, final int n3, final boolean b) {
        return this.a(graphics, s, n, n2, n3, b, b ? 16777215 : 14474495);
    }
    
    public final int a(final Graphics graphics, final byte b, final int n, final int n2, final int n3, final boolean b2) {
        int n4;
        if (this.L.l[b] == 0) {
            n4 = this.b(graphics, String.valueOf(b + 1) + ratchetandclank.n[31], n, n2, 17, b2);
        }
        else {
            n4 = this.a(graphics, this.L.c.a(ratchetandclank.n[32], new Object[] { new Integer(b + 1), new String(this.c(this.L.m[b])) }), n, n2, n3, b2);
        }
        return n4;
    }
    
    public final int a(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        return this.a(graphics, this.L.c.a(ratchetandclank.n[n], new Object[] { new Integer(n2) }), n3, n4, n5, b);
    }
    
    public final int a(final Graphics graphics, final String s) {
        ratchetandclank.e = ratchetandclank.f;
        graphics.setColor(14474495);
        return this.L.c.a(graphics, s, 120, 5, 17, 240 - 2 * this.b() + 10);
    }
    
    public final void a(final Graphics graphics, final int n, final int n2) {
        ratchetandclank.e = ratchetandclank.g;
        graphics.setClip(0, 319, 1, 1);
        final int a;
        if ((a = this.a(graphics, this.i, 0, 0, 17, true, 1175023)) + HH.ao.getHeight() / 3 >= HH.ao.getHeight()) {
            final int n3 = (240 - HH.ao.getWidth()) / 2;
            final int height = HH.ao.getHeight();
            graphics.setClip(n3, n2 - 3, HH.ao.getWidth(), height / 3);
            graphics.drawImage(HH.ao, n3, n2 - 3, 20);
            for (int i = n2 + height / 3 - 3, n4 = height / 3; i < n2 + a - height / 3 + 3; i += n4) {
                if (i + n4 > n2 + a - height / 3 + 3) {
                    n4 -= i + n4 - (n2 + a - height / 3 + 3);
                }
                graphics.setClip(n3, i, HH.ao.getWidth(), n4);
                graphics.drawImage(HH.ao, n3, i - height / 3, 20);
            }
            graphics.setClip(n3, n2 + a - height / 3 + 3, HH.ao.getWidth(), height / 3);
            graphics.drawImage(HH.ao, n3, n2 + a - height / 3 + 3 - 2 * height / 3 - 1, 20);
        }
        else {
            graphics.setClip(0, 0, 240, 320);
            graphics.drawImage(HH.ao, (240 - HH.ao.getWidth()) / 2, n2 - (HH.ao.getHeight() - a) / 2, 20);
        }
        graphics.setClip(0, 0, 240, 320);
        this.a(graphics, this.i, n, n2 - 1, 17, false, 1175023);
    }
    
    public final void b(final Graphics graphics, final int n, final int n2) {
        final String a = this.L.c.a(ratchetandclank.n[36], new Object[] { new Integer(n), new Integer(n2) });
        ratchetandclank.e = ratchetandclank.h;
        this.a(graphics, a, 120, 320 - ratchetandclank.e.a + 1, 17, false);
    }
    
    public final String c(int n) {
        final int n2 = n / 1000;
        final int n3 = (n /= 60000) / 60;
        n %= 60;
        final int n4 = n2 % 60;
        return String.valueOf(n3) + ((n < 10) ? ":0" : ":") + String.valueOf(n) + ((n4 < 10) ? ":0" : ":") + String.valueOf(n4);
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
    
    public final void b(final Graphics graphics) {
        System.out.println("D: " + this.D);
        if (this.D == 0) {
            System.out.println(21);
            this.f |= 0x1;
            if ((this.f & 0x1) != 0x0) {
                System.out.println(22);
                try {
                    System.out.println(23);
                    if (this.z[0] == null) {
                        System.out.println(24);
                        this.z[0] = Image.createImage("/intro_publisher.png");
                        HH.e(30);
                    }
                }
                catch (Exception ex) {
                    System.out.println("Ex2: " + ex.getMessage());
                }
                System.out.println(25);
                graphics.setColor(0);
                graphics.fillRect(0, 0, 240, 320);
                graphics.drawImage(this.z[this.D], 120, 320 - this.z[this.D].getHeight() >> 1, 17);
                System.out.println(26);
                this.z[this.D] = null;
                System.gc();
                HH.e(20);
                System.out.println(27);
            }
            graphics.setClip(0, 160, 240, 160);
            graphics.setColor(13369344);
            graphics.fillRect(71, 306, GG.b * 100 / 95, 6);
            graphics.setColor(16777215);
            graphics.drawRect(70, 306, 102, 6);
            System.out.println(28);
            return;
        }
        if (this.z[this.D] == null) {
            System.out.println(29);
            return;
        }
        System.out.println(30);
        int color = 0;
        if (this.D == 1) {
            System.out.println(31);
            color = 16777215;
        }
        System.out.println(32);
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(color);
        graphics.fillRect(0, 0, 240, 320);
        graphics.setClip(120 - (this.z[this.D].getWidth() >> 1), 160 - (this.z[this.D].getHeight() >> 1), this.z[this.D].getWidth(), this.z[this.D].getHeight());
        graphics.drawImage(this.z[this.D], 120 - (this.z[this.D].getWidth() >> 1), 160 - (this.z[this.D].getHeight() >> 1), 20);
        System.out.println(33);
        this.z[0] = null;
        this.z[this.D] = null;
    }
    
    public final void d(final int n) {
        GG.b = (this.M - 4) * 100 / 39;
        System.gc();
        HH.e(10);
        try {
            Thread.yield();
        }
        catch (Exception ex) {}
    }
    
    private void d(final Graphics graphics) {
        this.a(graphics, (byte)0);
        this.L.c.ah.a(graphics, this.L.c.ah.ah, 0, 1);
        this.L.c.ag[0].a(graphics, 0, this.L.c.ag[0].ah, 0, 1);
        this.L.c.ag[1].a(graphics, 1, this.L.c.ag[1].ah, 0, 1);
        this.L.c.ag[2].a(graphics, 1, this.L.c.ag[1].ah, 0, 1);
        this.L.c.ag[3].a(graphics, 1, this.L.c.ag[1].ah, 0, 1);
        graphics.setClip(0, 0, 240, 320);
        graphics.drawImage(HH.ar, 120, 4, 17);
        final int n = 4 + HH.ar.getHeight() + 4;
        ratchetandclank.e = ratchetandclank.h;
        int n2 = 0;
        final int[] g = this.g;
        final int n3 = 0;
        ++n2;
        final int n4 = g[n3] = HH.ao.getHeight() / 2 + n;
        final int[] g2 = this.g;
        final int n5 = 1;
        ++n2;
        final int n6 = g2[n5] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[1], 120, n4, 0, this.G == 0);
        final int[] g3 = this.g;
        final int n7 = 2;
        ++n2;
        int n8 = g3[n7] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[2], 120, n6, 0, this.G == 1);
        if (this.j) {
            final int[] g4 = this.g;
            final int n9 = 3;
            ++n2;
            n8 = (g4[n9] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[286], 120, n8, 0, this.G == 2));
        }
        this.a(graphics, ratchetandclank.n[6], 120, this.g[n2] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[5], 120, this.g[n2++] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[4], 120, this.g[n2++] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[3], 120, n8, 0, (this.G == 2 && !this.j) || (this.G == 3 && this.j)), 0, (this.G == 3 && !this.j) || (this.G == 4 && this.j)), 0, (this.G == 4 && !this.j) || (this.G == 5 && this.j)), 0, (this.G == 5 && !this.j) || (this.G == 6 && this.j));
        this.a(graphics, 0 + GG.A + (GG.A >> 1), this.g[this.G]);
        this.a(graphics, 7, -1, this);
    }
    
    public final int i() {
        return this.L.c.k() + 3 * HH.ao.getHeight() / 2;
    }
    
    private void e(final Graphics graphics) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.L.c.e(graphics);
        this.a(graphics, ratchetandclank.n[2]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.i();
        this.g[0] = i;
        this.a(graphics, (byte)2, 0 + GG.A + (GG.A >> 1), this.g[2] = HH.ao.getHeight() / 2 + this.a(graphics, (byte)1, 0 + GG.A + (GG.A >> 1), this.g[1] = HH.ao.getHeight() / 2 + this.a(graphics, (byte)0, 0 + GG.A + (GG.A >> 1), i, 0, this.G == 0), 0, this.G == 1), 0, this.G == 2);
        this.a(graphics, 7, 8, this);
        this.a(graphics, 0 + GG.A + (GG.A >> 1), this.g[this.G]);
    }
    
    private void b(final Graphics graphics, final int n) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        final int a = this.a(graphics, ratchetandclank.n[5]);
        ratchetandclank.e = ratchetandclank.h;
        final int n2 = a + ratchetandclank.h.a;
        if (n == 0) {
            this.L.c.a(graphics, ratchetandclank.n[284], 120, n2, 17, 240 - 2 * this.b());
        }
        else if (n == 1) {
            this.L.c.a(graphics, ratchetandclank.n[88], 120, this.L.c.a(graphics, ratchetandclank.n[87], 240, this.L.c.a(graphics, ratchetandclank.n[86], 120, n2, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b()) + ratchetandclank.e.a * 2, 17, 240 - 2 * this.b());
        }
        else if (n == 2) {
            this.L.c.a(graphics, ratchetandclank.n[94], 120, this.L.c.a(graphics, ratchetandclank.n[93], 120, this.L.c.a(graphics, ratchetandclank.n[92], 120, this.L.c.a(graphics, ratchetandclank.n[91], 120, this.L.c.a(graphics, ratchetandclank.n[90], 120, this.L.c.a(graphics, ratchetandclank.n[89], 120, n2, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b()) + ratchetandclank.e.a, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b()) + ratchetandclank.e.a, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b());
        }
        else if (n == 3) {
            this.L.c.a(graphics, ratchetandclank.n[100], 120, this.L.c.a(graphics, ratchetandclank.n[99], 120, this.L.c.a(graphics, ratchetandclank.n[98], 120, this.L.c.a(graphics, ratchetandclank.n[97], 120, this.L.c.a(graphics, ratchetandclank.n[96], 120, this.L.c.a(graphics, ratchetandclank.n[95], 120, n2, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b()) + ratchetandclank.e.a, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b()) + ratchetandclank.e.a, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b());
        }
        else if (n == 4) {
            final int a2 = this.L.c.a(graphics, ratchetandclank.n[84], 120, this.L.c.a(graphics, ratchetandclank.n[103], 120, this.L.c.a(graphics, ratchetandclank.n[102], 240, this.L.c.a(graphics, ratchetandclank.n[101], 120, n2, 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b()), 17, 240 - 2 * this.b()) + ratchetandclank.e.a * 2, 17, 240 - 2 * this.b());
            String string;
            final int index;
            final String appProperty;
            if ((index = (string = ratchetandclank.n[85]).indexOf("??")) > 0 && (appProperty = this.L.getAppProperty("MIDlet-Version")) != null) {
                string = string.substring(0, index) + appProperty;
            }
            this.L.c.a(graphics, string, 120, a2, 17, 240 - 2 * this.b());
        }
        this.b(graphics, n + 1, 5);
        this.a(graphics, 9, 8, this);
    }
    
    private int c(final Graphics graphics, final int n, int a) {
        a = this.L.c.a(graphics, ratchetandclank.n[(n == 0) ? 312 : 313], -1, a, 17, this.L.c.g());
        for (int n2 = 65, i = 0; i < 8; ++i, n2 += 14) {
            graphics.setClip(n2, a, 12, 12);
            graphics.drawImage(HH.ak, n2 - this.w[n][i] * 12, a, 20);
        }
        graphics.setClip(0, 0, 240, 320);
        return a + 14;
    }
    
    private void f(final Graphics graphics) {
        System.out.println(80);
        this.a(graphics, (byte)0);
        System.out.println(81);
        graphics.setClip(0, 0, 240, 320);
        System.out.println(82);
        final int a = this.a(graphics, ratchetandclank.n[286]);
        System.out.println(83);
        ratchetandclank.e = ratchetandclank.h;
        System.out.println(84);
        final int n = this.a(graphics, this.m, -1, this.a(graphics, ratchetandclank.n[290], -1, a + ratchetandclank.h.a / 2, 17, false), 17, false) + ratchetandclank.e.a / 2;
        System.out.println(85);
        ratchetandclank.e = ratchetandclank.f;
        System.out.println(86);
        graphics.setColor(14474495);
        System.out.println(87);
        this.a(graphics, ratchetandclank.n[288], -1, this.c(graphics, 0, this.c(graphics, 1, n) + ratchetandclank.e.a / 2) + ratchetandclank.e.a / 2, 17, false);
        System.out.println(88);
        this.a(graphics, 39, 8, this);
        System.out.println(89);
    }
    
    private void g(final Graphics graphics) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        int a = this.a(graphics, ratchetandclank.n[286]);
        ratchetandclank.e = ratchetandclank.h;
        a += 6;
        int a2 = this.L.c.a(graphics, ratchetandclank.n[287], this.b(), a, 17, 240 - 2 * this.b());
        a2 += 5;
        this.L.c.a(graphics, ratchetandclank.n[288], this.b(), a2, 17, 240 - 2 * this.b());
        this.a(graphics, -1, 8, this);
    }
    
    private void h(final Graphics graphics) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.L.c.e(graphics);
        this.a(graphics, ratchetandclank.n[27]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.i();
        this.g[0] = i;
        final int n = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[33], 0 + GG.A + (GG.A >> 1), this.g[1] = HH.ao.getHeight() / 2 + this.a(graphics, this.L.k ? ratchetandclank.n[28] : ratchetandclank.n[29], 0 + GG.A + (GG.A >> 1), i, 0, this.G == 0), 0, this.G == 1);
        this.g[2] = n;
        this.a(graphics, ratchetandclank.n[314], 120, n, 17, this.G == 2);
        this.a(graphics, 7, 8, this);
        this.a(graphics, 0 + GG.A + (GG.A >> 1), this.g[this.G]);
    }
    
    private void i(final Graphics graphics) {
        this.a(graphics, (byte)0);
        int a = this.a(graphics, (ratchetandclank.q == -1) ? (ratchetandclank.n[7] + " " + ratchetandclank.n[314]) : ratchetandclank.n[314]);
        a += 28;
        this.g[0] = a;
        final int n = this.g[4] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[318], 0, this.g[3] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[317], 0, this.g[2] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[316], 0, this.g[1] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[315], 0, a, 0, this.G == 0), 0, this.G == 1), 0, this.G == 2), 0, this.G == 3);
        HH.ao.getHeight();
        this.a(graphics, ratchetandclank.n[319], 0, n, 0, this.G == 4);
        this.a(graphics, 7, (ratchetandclank.q == -1) ? -1 : 8, this);
        this.a(graphics, 0, this.g[this.G]);
    }
    
    public final void a(final Graphics graphics, final int n) {
        final int n2 = 120 - HH.ap.getWidth() / 2 + 10;
        final int n3 = 120 + HH.ap.getWidth() / 2 - 10;
        final int width = HH.aI.getWidth();
        final int n4 = HH.aI.getHeight() >> 3;
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.L.c.e(graphics);
        final int a = this.a(graphics, ratchetandclank.n[4]);
        ratchetandclank.e = ratchetandclank.h;
        if (n < 3) {
            this.a(graphics, ratchetandclank.n[76], 0 + (GG.A >> 1), a, 0, false);
        }
        else if (n < 11) {
            this.a(graphics, ratchetandclank.n[262], 120, a, 17, false);
        }
        else {
            this.a(graphics, ratchetandclank.n[271], 120, a, 17, false);
        }
        final int k = this.L.c.k();
        if (n == 0) {
            this.L.c.a(graphics, ratchetandclank.n[80], n2, this.L.c.a(graphics, ratchetandclank.n[79], n2, this.L.c.a(graphics, ratchetandclank.n[78], n2, this.L.c.a(graphics, ratchetandclank.n[77], n2, k + ratchetandclank.e.a, 0, n3), 0, n3), 0, n3), 0, n3);
        }
        else if (n == 1) {
            this.L.c.a(graphics, ratchetandclank.n[81], n2, this.L.c.a(graphics, ratchetandclank.n[259], n2, this.L.c.a(graphics, ratchetandclank.n[258], n2, k + ratchetandclank.e.a, 0, n3), 0, n3), 0, n3);
        }
        else if (n == 2) {
            this.L.c.a(graphics, ratchetandclank.n[260], n2, this.L.c.a(graphics, ratchetandclank.n[83], n2, this.L.c.a(graphics, ratchetandclank.n[82], n2, k + ratchetandclank.e.a, 0, n3), 0, n3), 0, n3);
        }
        else if (n == 3) {
            this.L.c.a(graphics, ratchetandclank.n[263], n2, this.a(graphics, ratchetandclank.n[48], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 4) {
            this.L.c.a(graphics, ratchetandclank.n[264], n2, this.a(graphics, ratchetandclank.n[49], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 5) {
            this.L.c.a(graphics, ratchetandclank.n[265], n2, this.a(graphics, ratchetandclank.n[50], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 6) {
            this.L.c.a(graphics, ratchetandclank.n[266], n2, this.a(graphics, ratchetandclank.n[51], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 7) {
            this.L.c.a(graphics, ratchetandclank.n[267], n2, this.a(graphics, ratchetandclank.n[52], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 8) {
            this.L.c.a(graphics, ratchetandclank.n[268], n2, this.a(graphics, ratchetandclank.n[53], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 9) {
            this.L.c.a(graphics, ratchetandclank.n[269], n2, this.a(graphics, ratchetandclank.n[54], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 10) {
            this.L.c.a(graphics, ratchetandclank.n[270], n2, this.a(graphics, ratchetandclank.n[55], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 11) {
            graphics.setClip(240 - width >> 1, 2 * GG.B - (GG.B >> 1) - 2, width, n4);
            graphics.drawImage(HH.aI, 240 - width >> 1, 2 * GG.B - (GG.B >> 1) - 2, 0);
            graphics.setClip(0, 0, 240, 320);
            this.L.c.a(graphics, ratchetandclank.n[275], n2, this.a(graphics, ratchetandclank.n[272], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 12) {
            graphics.setClip(240 - width >> 1, 2 * GG.B - (GG.B >> 1) - 2, width, n4);
            graphics.drawImage(HH.aI, 240 - width >> 1, 2 * GG.B - (GG.B >> 1) - n4 - 2, 0);
            graphics.setClip(0, 0, 240, 320);
            this.L.c.a(graphics, ratchetandclank.n[276], n2, this.a(graphics, ratchetandclank.n[273], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        else if (n == 13) {
            graphics.setClip(240 - width >> 1, 2 * GG.B - (GG.B >> 1) - 2, width, n4);
            graphics.drawImage(HH.aI, 240 - width >> 1, 2 * GG.B - (GG.B >> 1) - 2 * n4 - 2, 0);
            graphics.setClip(0, 0, 240, 320);
            this.L.c.a(graphics, ratchetandclank.n[277], n2, this.a(graphics, ratchetandclank.n[274], 0 + (GG.A >> 1), k + ratchetandclank.e.a, 0, false) + ratchetandclank.e.a, 0, n3);
        }
        this.b(graphics, n + 1, 14);
        this.a(graphics, 9, 8, this);
        if (n > 2 && n < 11) {
            this.L.c.ah.a(graphics, this.L.c.ah.ah, 0, -4);
            if (n > 3) {
                for (int i = 9; i >= 0; --i) {
                    this.L.c.ai[i].a(graphics);
                }
            }
        }
    }
    
    private void j(final Graphics graphics) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.L.c.e(graphics);
        this.a(graphics, ratchetandclank.n[35]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.i();
        this.g[0] = i;
        this.a(graphics, ratchetandclank.n[10], 0 + GG.A + (GG.A >> 1), this.g[1] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[11], 0 + GG.A + (GG.A >> 1), i, 0, this.G == 0), 0, this.G == 1);
        this.a(graphics, 7, 8, this);
        this.a(graphics, 0 + GG.A + (GG.A >> 1), this.g[this.G]);
    }
    
    private void k(final Graphics graphics) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.L.c.e(graphics);
        this.a(graphics, ratchetandclank.n[33]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.i();
        this.g[0] = i;
        this.a(graphics, (byte)2, 0 + GG.A + (GG.A >> 1), this.g[2] = HH.ao.getHeight() / 2 + this.a(graphics, (byte)1, 0 + GG.A + (GG.A >> 1), this.g[1] = HH.ao.getHeight() / 2 + this.a(graphics, (byte)0, 0 + GG.A + (GG.A >> 1), i, 0, this.G == 0), 0, this.G == 1), 0, this.G == 2);
        this.a(graphics, 7, 8, this);
        this.a(graphics, 0 + GG.A + (GG.A >> 1), this.g[this.G]);
    }
    
    private void l(final Graphics graphics) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.L.c.e(graphics);
        ratchetandclank.e = ratchetandclank.f;
        graphics.setColor(14474495);
        this.a(graphics, ratchetandclank.n[34]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.i();
        this.g[0] = i;
        this.a(graphics, ratchetandclank.n[10], 0 + GG.A + (GG.A >> 1), this.g[1] = HH.ao.getHeight() / 2 + this.a(graphics, ratchetandclank.n[11], 0 + GG.A + (GG.A >> 1), i, 0, this.G == 0), 0, this.G == 1);
        this.a(graphics, 7, 8, this);
        this.a(graphics, 0 + GG.A + (GG.A >> 1), this.g[this.G]);
    }
    
    public final void c(final Graphics graphics) {
        this.a(graphics, (byte)0);
        graphics.setClip(0, 0, 240, 320);
        this.L.c.e(graphics);
        this.a(graphics, ratchetandclank.n[283]);
        ratchetandclank.e = ratchetandclank.h;
        final int i = this.i();
        this.g[0] = i;
        this.a(graphics, (byte)2, 0 + GG.A + (GG.A >> 1), this.g[2] = HH.ao.getHeight() / 2 + this.a(graphics, (byte)1, 0 + GG.A + (GG.A >> 1), this.g[1] = HH.ao.getHeight() / 2 + this.a(graphics, (byte)0, 0 + GG.A + (GG.A >> 1), i, 0, this.G == 0), 0, this.G == 1), 0, this.G == 2);
        this.L.b.a(graphics, 7, 8, this);
        this.L.b.a(graphics, GG.A >> 1, this.g[this.G]);
    }
    
    public final void a(final JJ j) {
        if (j.f == -1) {
            return;
        }
        if (j.f >= 6 && j.f <= 8) {
            j.g += j.m;
            final int n = j.g >> 8;
            j.h += j.n;
            if (n > 240) {
                j.a();
            }
        }
        else if (j.f >= 0 && j.f <= 2) {
            j.g += j.m;
            final int n2 = j.g >> 8;
            j.h += j.n;
            if (n2 > 240) {
                j.a();
            }
        }
        else {
            if (j.f >= 3 && j.f <= 5) {
                j.g += j.m;
                final int n3 = j.g >> 8;
                if (j.h >> 8 > 320 || n3 > 240) {
                    j.a();
                }
                j.h -= j.n;
                j.n -= 256;
                return;
            }
            if (j.f >= 9 && j.f <= 11) {
                final byte o = j.o;
                j.o = (byte)(o + 1);
                if (o == 2) {
                    j.a();
                }
            }
            else if (j.f >= 12 && j.f <= 14) {
                j.a(1);
                if (j.g >> 8 > 240) {
                    j.a();
                }
            }
            else if (j.f >= 15 && j.f <= 17) {
                final byte o2 = j.o;
                j.o = (byte)(o2 + 1);
                if (o2 == 3) {
                    j.a();
                }
            }
            else if (j.f >= 18 && j.f <= 20) {
                j.a(4);
                if (j.g >> 8 > 240) {
                    j.a();
                }
            }
        }
    }
    
    private void e(final int n) {
        this.K[0] = this.K[1];
        this.K[1] = this.K[2];
        this.K[2] = this.K[3];
        this.K[3] = n;
    }
    
    private boolean l() {
        for (int i = 0; i < 4; ++i) {
            if (this.K[i] != GG.a[i]) {
                System.err.println("wrong key");
                return false;
            }
        }
        System.err.println("keyUnlocked");
        return true;
    }
    
    static {
        a = new int[] { 49, 51, 49, 51 };
        GG.x = 0;
        GG.y = 0;
    }
}
