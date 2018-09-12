import javax.microedition.lcdui.*;

public final class JJ
{
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final short[] e;
    public byte f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte o;
    public int p;
    public int q;
    private boolean w;
    private short x;
    public byte r;
    public int s;
    public static byte t;
    public static byte u;
    public static short v;
    private HH y;
    
    public JJ(final HH y) {
        JJ.t = HH.D;
        JJ.u = HH.E;
        JJ.v = HH.F;
        this.y = y;
        this.f = -1;
        final boolean b = false;
        this.h = (b ? 1 : 0);
        this.g = (b ? 1 : 0);
        final boolean b2 = false;
        this.n = (b2 ? 1 : 0);
        this.m = (b2 ? 1 : 0);
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.w = false;
        this.x = -1;
        final boolean b3 = false;
        this.i = (b3 ? 1 : 0);
        this.k = (b3 ? 1 : 0);
        final boolean b4 = false;
        this.j = (b4 ? 1 : 0);
        this.l = (b4 ? 1 : 0);
        this.r = 0;
    }
    
    public final void a() {
        this.f = -1;
        final boolean b = false;
        this.h = (b ? 1 : 0);
        this.g = (b ? 1 : 0);
        final boolean b2 = false;
        this.n = (b2 ? 1 : 0);
        this.m = (b2 ? 1 : 0);
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.w = false;
        this.x = -1;
        final boolean b3 = false;
        this.i = (b3 ? 1 : 0);
        this.k = (b3 ? 1 : 0);
        final boolean b4 = false;
        this.j = (b4 ? 1 : 0);
        this.l = (b4 ? 1 : 0);
        this.r = 0;
    }
    
    public final boolean b() {
        return !this.w;
    }
    
    public final void a(final boolean b) {
        if (this.w || this.f == 32) {
            return;
        }
        this.w = true;
        switch (this.f) {
            case 3:
            case 4:
            case 5: {
                final byte b2 = (byte)(this.f - 3);
                if (b) {
                    this.y.a(this.g, this.h, 21 + b2, true, false, 0, this.r);
                    return;
                }
                this.y.e(this.g, this.h, 21 + b2);
            }
            case 6:
            case 7:
            case 8: {
                final byte b3 = (byte)(this.f - 6);
                if (b) {
                    this.y.a(this.g, this.h, 24 + b3, true, false, 0, this.r);
                    return;
                }
                this.y.e(this.g, this.h, 24 + b3);
            }
            case 18:
            case 19:
            case 20: {
                final byte b4 = (byte)(this.f - 18);
                if (b) {
                    this.y.a(this.g, this.h, 27 + b4, true, false, 0, this.r);
                    return;
                }
                this.y.e(this.g, this.h, 27 + b4);
            }
            case 31: {
                if (!HH.dH) {
                    this.y.C(this.g, this.h);
                }
                HH.dH = false;
                break;
            }
        }
    }
    
    public final byte c() {
        if (this.f >= 0 && this.f <= 2) {
            return 1;
        }
        if (this.f >= 21 && this.f <= 23) {
            return 2;
        }
        if (this.f >= 24 && this.f <= 26) {
            return 3;
        }
        if (this.f >= 9 && this.f <= 11) {
            return 4;
        }
        if (this.f >= 12 && this.f <= 14) {
            return 5;
        }
        if (this.f >= 15 && this.f <= 17) {
            return 6;
        }
        if (this.f >= 27 && this.f <= 29) {
            return 7;
        }
        return 0;
    }
    
    public final void b(final boolean b) {
        final int v = HH.v;
        final int w = HH.w;
        if (this.w) {
            this.a();
            return;
        }
        if (this.f == -1) {
            return;
        }
        if (this.f == 32) {
            if (this.m != 0) {
                --this.m;
            }
            if (this.m == 0) {
                this.h += this.n;
            }
            if (this.h < this.l && this.m == 0) {
                this.n *= -1;
                this.m = 15;
            }
            else if (this.h > this.j && this.m == 0) {
                this.n *= -1;
                this.m = 1;
            }
            ++this.o;
            if (this.o >= 3) {
                this.o = 0;
            }
        }
        else if (this.f >= 6 && this.f <= 8) {
            this.g += this.m;
            final int n = this.g >> 8;
            this.h += this.n;
            final int n2 = this.h >> 8;
            if (n < -v - JJ.t || n > -v + 240 + JJ.t || n2 < -w - JJ.u || n2 > -w + 320 + JJ.u) {
                this.a(b);
            }
        }
        else if (this.f >= 0 && this.f <= 2) {
            this.g += this.m;
            final int n3 = this.g >> 8;
            this.h += this.n;
            final int n4 = this.h >> 8;
            if (n3 < -v - JJ.t || n3 > -v + 240 + JJ.t || n4 < -w - JJ.u || n4 > -w + 320 + JJ.u) {
                this.a();
            }
        }
        else if (this.f >= 3 && this.f <= 5) {
            this.g += this.m;
            final int n5 = this.g >> 8;
            final int n6 = this.h >> 8;
            if (this.g < 0 || this.h < 0 || n6 > 17 * JJ.u || n5 > 27 * JJ.t) {
                this.a(b);
            }
            else if (n6 + JJ.c[this.f] >= this.y.b(n5, n6, JJ.u - JJ.c[this.f])) {
                this.a(b);
            }
            this.h -= this.n;
            this.n -= 256;
        }
        else if (this.f >= 9 && this.f <= 11) {
            final byte o = this.o;
            this.o = (byte)(o + 1);
            if (o == 2) {
                this.a();
            }
        }
        else if (this.f >= 12 && this.f <= 14) {
            this.a(1);
            final int n7 = this.g >> 8;
            final int n8 = this.h >> 8;
            if (n7 < -v - JJ.t || n7 > -v + 240 + JJ.t || n8 < -w - JJ.u || n8 > -w + 320 + JJ.u) {
                this.a();
            }
        }
        else if (this.f >= 15 && this.f <= 17) {
            final byte o2 = this.o;
            this.o = (byte)(o2 + 1);
            if (o2 == 3) {
                this.a();
            }
        }
        else if (this.f >= 18 && this.f <= 20) {
            if (b) {
                return;
            }
            this.a(4);
            final int n9 = this.g >> 8;
            final int n10 = this.h >> 8;
            if (n9 < -v - JJ.t || n9 > -v + 240 + JJ.t || n10 < -w - JJ.u || n10 > -w + 320 + JJ.u) {
                this.a(b);
            }
        }
        else if (this.f >= 21 && this.f <= 30) {
            if (++this.o == 3) {
                this.a();
            }
        }
        else if (this.f == 31) {
            this.g += this.m;
            this.h += this.n;
        }
        if (((this.f != 15 || this.f != 16 || this.f != 17 || this.f != 9 || this.f != 10 || this.f != 11) && this.f < 21) || this.f == 31) {
            final int n11 = (this.g >> 8) / JJ.t;
            final int n12 = (this.h >> 8) / JJ.u;
            if (!this.y.T.b(n11, n12)) {
                this.a(b);
                if (this.f >= 12 && this.f <= 14 && this.y.T.a(n11, n12) == 34) {
                    this.y.T.f[n11][n12] = 0;
                    final int[] e = DD.e;
                    final int n13 = n11;
                    e[n13] &= ~(1 << n12);
                }
            }
        }
    }
    
    public final void a(final int n) {
        if (this.x == -1) {
            final int n2 = this.g >> 8;
            final int n3 = this.h >> 8;
            for (int i = HH.aZ - 1; i >= 0; --i) {
                if (this.y.ag[i].Z != -1) {
                    if (this.y.ag[i].al != 5) {
                        final short c = this.y.ag[i].c();
                        final short b = this.y.ag[i].b();
                        if ((c - n2) * (c - n2) + (b - n3) * (b - n3) <= 15876) {
                            if (this.m > 0) {
                                if (c <= n2) {
                                    continue;
                                }
                            }
                            else if (c >= n2) {
                                continue;
                            }
                            this.x = (short)i;
                            break;
                        }
                    }
                }
            }
        }
        else if (this.y.ag[this.x].Z == -1 || this.y.ag[this.x].al == 5) {
            this.x = -1;
        }
        else {
            final short c2 = this.y.ag[this.x].c();
            final int n4 = this.y.ag[this.x].b() + FF.b[this.y.ag[this.x].Z] + (FF.d[this.y.ag[this.x].Z] >> 1);
            final int n5 = this.g >> 8;
            final int n6 = this.h >> 8;
            final short n7 = (short)(c2 - n5);
            final int n8 = n4 - n6;
            final int n9 = JJ.d[this.f] << 8;
            if (this.f >= 18 && this.f <= 20) {
                if (n8 > 0) {
                    this.n = n9;
                    if (n8 << 8 < this.n) {
                        this.n = 0;
                    }
                }
                else {
                    this.n = -n9;
                    if (n8 << 8 > this.n) {
                        this.n = 0;
                    }
                }
            }
            else if (this.o >= 10) {
                this.k = this.i;
                this.l = this.j;
                this.i = this.g;
                this.j = this.h;
                if (this.y.d(n7) > this.y.d(n8)) {
                    if (n7 > 0) {
                        this.m = n9;
                    }
                    else {
                        this.m = -n9;
                    }
                    this.n = 0;
                }
                else {
                    if (n8 > 0) {
                        this.n = n9;
                    }
                    else {
                        this.n = -n9;
                    }
                    this.m = 0;
                }
                this.o = 0;
            }
        }
        ++this.o;
        this.g += this.m;
        this.h += this.n;
    }
    
    public final void a(final Graphics graphics) {
        final int v = HH.v;
        final int w = HH.w;
        if (this.f < 0) {
            return;
        }
        if (this.f >= 21 && this.f <= 30) {
            final byte b = (byte)(this.o * 44);
            final int n = (this.g >> 8) + v - 22;
            final int n2 = (this.h >> 8) + w - 22;
            if (n < 240 && n + 44 >= 0) {
                this.y.b(graphics, n, n2, 44, 44);
                graphics.drawImage(HH.aL, n, n2 - b - 0, 0);
            }
        }
        else if (this.f == 32) {
            final int n3 = HH.ax.getHeight() / 3;
            final int width = HH.ax.getWidth();
            final byte b2 = (byte)(this.o * n3);
            final int n4 = (this.g >> 8) + v - (width >> 1);
            final int n5 = (this.h >> 8) + w - (n3 >> 1);
            if (0 < n3 && n4 < 240 && n4 + width >= 0) {
                this.y.b(graphics, n4, n5, width, n3 - 0);
                graphics.drawImage(HH.ax, n4, n5 - b2 - 0, 0);
            }
        }
        else if (this.f == 31) {
            final int n6 = (this.g >> 8) + v - (HH.aN.getWidth() >> 1);
            final int n7 = (this.h >> 8) + w - (HH.aN.getHeight() >> 1);
            final int n8 = JJ.t * 14 - ((this.g >> 8) - (HH.aN.getWidth() >> 1));
            final int n9 = JJ.u * 9 - ((this.h >> 8) - (HH.aN.getHeight() >> 1));
            if (n8 * n8 + n9 * n9 > 1764 && n6 < 240 && n6 + 12 >= 0 && n7 < 320 && n7 + 12 >= 0) {
                graphics.setClip(0, (int)JJ.v, 240, 320 - JJ.v);
                graphics.drawImage(HH.aN, n6, n7, 0);
            }
        }
        else {
            final short n10;
            if ((n10 = (short)(JJ.e[this.f] * 19)) < 0) {
                final int n11 = (this.g >> 8) + v;
                final int n12 = (this.h >> 8) + w;
                if (this.f >= 9 && this.f <= 11) {
                    final int n13 = n11 - ((this.m > 0) ? this.p : (-this.p));
                    graphics.setClip(0, (int)JJ.v, 240, 320 - JJ.v);
                    if (this.o == 0) {
                        graphics.setColor(255, 255, 255);
                    }
                    else {
                        graphics.setColor(0, 0, 255);
                    }
                    graphics.drawLine(n13, n12, (this.m > 0) ? (n13 + 168) : (n13 - 168), n12 + 11);
                    graphics.drawLine(n13, n12, (this.m > 0) ? (n13 + 168) : (n13 - 168), n12 + 5);
                    graphics.drawLine(n13, n12, (this.m > 0) ? (n13 + 168) : (n13 - 168), n12 - 5);
                    graphics.drawLine(n13, n12, (this.m > 0) ? (n13 + 168) : (n13 - 168), n12 - 11);
                    return;
                }
                if (this.f >= 12 && this.f <= 14) {
                    final int n14 = (this.i >> 8) + v;
                    final int n15 = (this.j >> 8) + w;
                    final int n16 = (this.k >> 8) + v;
                    final int n17 = (this.l >> 8) + w;
                    graphics.setClip(0, (int)JJ.v, 240, 320 - JJ.v);
                    graphics.setColor(255, 255, 0);
                    graphics.drawLine(n11, n12, n14, n15);
                    graphics.drawLine(n14, n15, n16, n17);
                    graphics.fillRect(n11 - 1, n12 - 1, 3, 3);
                    return;
                }
                if (this.f >= 15 && this.f <= 17) {
                    if (this.y.ah.ao) {
                        if (this.g < this.y.ah.ab + this.s) {
                            this.g = this.y.ah.ab + this.s;
                        }
                    }
                    else if (this.g > this.y.ah.ab - this.s) {
                        this.g = this.y.ah.ab - this.s;
                    }
                    final int n18 = (this.g >> 8) + v;
                    final int n19 = (this.h >> 8) + w;
                    final int n20 = n18 - ((this.m > 0) ? this.p : (-this.p));
                    if (this.m > 0) {
                        graphics.setClip(0, (int)JJ.v, 240, 320 - JJ.v);
                        graphics.setColor(0, 0, 255);
                        graphics.fillRoundRect(n20, n19 - 11, 168, 22, 12, 12);
                        graphics.setColor(16250871);
                        graphics.fillRect(n20 + 4, n19 - 2, 164, 4);
                        return;
                    }
                    graphics.setClip(0, (int)JJ.v, 240, 320 - JJ.v);
                    graphics.setColor(0, 0, 255);
                    graphics.fillRoundRect(n20 - 168, n19 - 11, 168, 22, 12, 12);
                    graphics.setColor(16250871);
                    graphics.fillRect(n20 - 168, n19 - 2, 164, 4);
                }
            }
            else {
                final int n21 = (this.g >> 8) + v - 9;
                final int n22 = (this.h >> 8) + w - 9;
                if (n21 >= 240 || n22 >= 320 || n21 + 19 < 0 || n22 + 19 < 0) {
                    return;
                }
                this.y.b(graphics, n21, n22, 19, 19);
                if (this.m > 0) {
                    graphics.drawImage(HH.aK, n21, n22 - n10 - 0, 20);
                    return;
                }
                if (this.m == 0) {
                    if (this.n < 0) {
                        EE.b.drawImage(HH.aK, n21 - n10, n22 - 0, 20, 90);
                        return;
                    }
                    EE.b.drawImage(HH.aK, n21 - 475 + n10, n22 - 0, 20, 270);
                }
                else {
                    EE.b.drawImage(HH.aK, n21, n22 - n10 - 0, 20, 8192);
                }
            }
        }
    }
    
    static {
        a = new byte[] { 1, 2, 4, 0, 0, 0, 0, 0, 0, 12, 12, 12, 1, 2, 3, 1, 2, 2, 0, 0, 0, 3, 5, 6, 6, 11, 17, 4, 7, 10, 0, 0, 0 };
        b = new byte[] { 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 3, 3, 3, 0, 0, 0, 3, 3, 3, 45, 65, 65, 15, 15, 30, 15, 15, 15, 0, 12, 10 };
        c = new byte[] { 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 3, 3, 3, 0, 0, 0, 3, 3, 3, 45, 65, 65, 15, 15, 30, 15, 15, 15, 0, 12, 10 };
        d = new byte[] { 10, 16, 16, 5, 5, 5, 8, 8, 8, 1, 1, 1, 4, 4, 4, 1, 1, 1, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 10 };
        e = new short[] { 13, 14, 15, 22, 23, 24, 19, 20, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 17, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1 };
    }
}
