import java.io.*;
import javax.microedition.lcdui.*;

public final class DD
{
    public static byte a;
    public static byte b;
    public HH c;
    public static byte[][][] d;
    public static int[] e;
    public byte[][] f;
    public static byte g;
    public static byte[][] h;
    public static byte[] i;
    public static byte j;
    public static byte k;
    public static byte l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final byte[][] p;
    
    public DD(final HH c) {
        this.c = c;
        DD.j = HH.D;
        DD.k = HH.E;
        DD.l = 0;
        DD.h = new byte[12][4];
        DD.i = new byte[12];
        DD.d = new byte[12][28][18];
        DD.e = new int[28];
        this.f = new byte[28][18];
    }
    
    public final short a(final int n, final int n2) {
        if (n >= 0 && n < 28 && n2 >= 0 && n2 < 18) {
            return DD.d[DD.i[this.c.V]][n][n2];
        }
        return -1;
    }
    
    public final void a(final int n) {
        final byte[] array = DD.p[n];
        int n2 = 0;
        final byte[] array2 = array;
        final int n3 = 0;
        ++n2;
        DD.g = array2[n3];
        for (byte b = 0; b < DD.g; ++b) {
            for (int i = 0; i < 4; ++i) {
                DD.h[b][i] = array[n2++];
            }
        }
        for (byte b2 = 0; b2 < DD.g; ++b2) {
            DD.i[b2] = array[n2++];
        }
        DD.a = 0;
        DD.b = array[n2];
    }
    
    public final void b(final int n) {
        this.a(n);
        this.c.x();
        try {
            final InputStream resourceAsStream = this.getClass().getResourceAsStream("/level" + n + ".bin");
            for (byte b = 0; b < DD.g; ++b) {
                for (int i = 0; i < 28; ++i) {
                    for (int j = 0; j < 18; ++j) {
                        DD.d[b][i][j] = (byte)(resourceAsStream.read() - 32);
                    }
                }
            }
            resourceAsStream.close();
        }
        catch (Exception ex) {}
    }
    
    public final void a(final int n, final boolean b) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        this.c.V = (short)n;
        this.c.d(this.c.X, n);
        for (int i = 3; i >= 0; --i) {
            this.c.cp[i] = -1;
        }
        for (int j = 49; j >= 0; --j) {
            this.c.bp[j] = (this.c.bq[j] = -1);
            this.c.bn[j] = 0;
            this.c.br[j] = false;
            this.c.bm[j] = -1;
        }
        for (int k = HH.aZ - 1; k >= 0; --k) {
            this.c.ag[k].Z = -1;
        }
        this.c.bO = -1;
        this.c.bP = -1;
        for (int l = 3; l >= 0; --l) {
            this.c.bb[l] = -1;
            this.c.bd[l] = -1;
        }
        for (int n7 = 11; n7 >= 0; --n7) {
            this.c.cj[n7] = -1;
        }
        for (int n8 = 2; n8 >= 0; --n8) {
            this.c.bB[n8] = 0;
            this.c.bE[n8] = -1;
        }
        for (int n9 = 9; n9 >= 0; --n9) {
            this.c.aj[n9].f = -1;
        }
        for (int n10 = 9; n10 >= 0; --n10) {
            this.c.ai[n10].f = -1;
        }
        this.c.cb = -1;
        this.c.cc = -1;
        this.c.bZ = -1;
        this.c.ca = -1;
        this.c.bW = -1;
        this.c.bX = -1;
        this.c.cS = true;
        if (DD.h[n][1] != -1) {
            this.c.cS = false;
        }
        for (int n11 = 7; n11 >= 0; --n11) {
            this.c.bi[n11] = -1;
        }
        for (byte b2 = 27; b2 >= 0; --b2) {
            for (int n12 = 17; n12 >= 0; --n12) {
                final short a = this.a(b2, n12);
                if (n4 != 0) {
                    this.f[b2][n12 + 1] = (byte)a;
                }
                else if (n5 != 0) {
                    if (a % 2 == 0 && a < 12) {
                        this.f[b2][n12 + 1] = (byte)(a + 1);
                    }
                    else {
                        this.f[b2][n12 + 1] = (byte)a;
                    }
                }
                if (n6 != 0) {
                    short n13 = a;
                    if (this.f[b2][n12 + 2] >= 19) {
                        for (int n14 = 1; n13 >= 47 && n13 <= 55; n13 = this.a(b2, n12 - n14), ++n14) {}
                        if (n13 % 2 == 0 && n13 < 12) {
                            this.f[b2][n12 + 1] = (byte)(n13 + 1);
                        }
                        else {
                            this.f[b2][n12 + 1] = (byte)n13;
                        }
                    }
                    else if (n13 >= 47 && n13 <= 55) {
                        for (int n15 = 1; n13 >= 47 && n13 <= 55; n13 = this.a(b2, n12 - n15), ++n15) {}
                        this.f[b2][n12 + 1] = (byte)n13;
                    }
                }
                n4 = 0;
                n5 = 0;
                n6 = 0;
                if (a >= 47 && a <= 55) {
                    n4 = 1;
                    n6 = 1;
                    switch (a) {
                        case 47: {
                            this.c.a(b2, n12, 0, 0, n2);
                            break;
                        }
                        case 48: {
                            this.c.a(b2, n12, 2, 0, n2);
                            break;
                        }
                        case 49: {
                            this.c.a(b2, n12, 1, 0, n2);
                            break;
                        }
                        case 50: {
                            this.c.a(b2, n12, 0, 0, n2++);
                            this.c.a(b2, n12, 0, 1, n2);
                            break;
                        }
                        case 51: {
                            this.c.a(b2, n12, 0, 0, n2++);
                            this.c.a(b2, n12, 2, 1, n2);
                            break;
                        }
                        case 52: {
                            this.c.a(b2, n12, 0, 0, n2++);
                            this.c.a(b2, n12, 1, 1, n2);
                            break;
                        }
                        case 53: {
                            this.c.a(b2, n12, 0, 2, n2);
                            break;
                        }
                        case 54: {
                            this.c.a(b2, n12, 2, 2, n2);
                            break;
                        }
                        case 55: {
                            this.c.a(b2, n12, 1, 2, n2);
                            break;
                        }
                    }
                    ++n2;
                }
                else if (a == -97 || a == -96 || a == -95) {
                    this.f[b2][n12] = 1;
                }
                else if (a == -98) {
                    this.f[b2][n12] = 0;
                    this.c.a(b2, n12);
                }
                else if (a == 35) {
                    if (this.c.f(this.c.X, this.c.V)) {
                        this.c.bO = b2;
                        this.c.bP = (byte)n12;
                    }
                    n4 = 1;
                }
                else if (a >= -118 && a <= -99) {
                    n5 = 1;
                }
                else if (a == -93) {
                    if (this.c.h(11)) {
                        this.c.bZ = b2;
                        this.c.ca = (byte)n12;
                    }
                    n5 = 1;
                }
                else if (a == -94) {
                    this.c.cb = b2;
                    this.c.cc = (byte)n12;
                    n5 = 1;
                }
                else if (a == -92) {
                    if (this.c.bY) {
                        this.c.bW = b2;
                        this.c.bX = (byte)n12;
                    }
                    n5 = 1;
                }
                else if (a == 99) {
                    n5 = 1;
                }
                else if (a == 100) {
                    this.f[b2][n12] = this.f[b2 + 1][n12];
                }
                else if (a == 56) {
                    this.f[b2][n12] = 27;
                }
                else if (a == 57) {
                    this.f[b2][n12] = 22;
                }
                else if (a == 58) {
                    this.f[b2][n12] = 20;
                }
                else if (a == 59) {
                    this.f[b2][n12] = 21;
                }
                else if (a == 60) {
                    this.f[b2][n12] = 22;
                }
                else if (a == 61) {
                    this.f[b2][n12] = 22;
                }
                else if (a == -125) {
                    if (b) {
                        this.c.af = (byte)n;
                        this.c.ab = b2;
                        this.c.ac = (byte)(n12 - 1);
                        if (b2 < 1) {
                            this.c.ad = 0;
                        }
                        else {
                            this.c.ad = (short)(-DD.j * (b2 - 1));
                        }
                        if (n12 < 6) {
                            this.c.ae = 0;
                        }
                        else {
                            this.c.ae = (short)(-DD.k * (n12 - 5));
                        }
                    }
                    this.f[b2][n12] = 22;
                }
                else if (a == -127) {
                    this.f[b2][n12] = 0;
                }
                else if (a == -126) {
                    this.f[b2][n12] = 1;
                }
                else if (a >= 62 && a <= 69) {
                    n4 = 1;
                    final short n16 = (short)(a - 62);
                    this.c.a(b2, n12, n16 % 2 == 0, n16 >> 1);
                }
                else if (a == 97 || a == 98) {
                    n4 = 1;
                }
                else if (a == -124) {
                    n5 = 1;
                }
                else if (a >= 43 && a <= 46) {
                    n4 = 1;
                    if (this.a(b2, n12 + 1) >= 19) {
                        n5 = 1;
                        n4 = 0;
                    }
                    this.c.d(b2, n12, DD.o[a - 43]);
                }
                else if (a >= 114 && a <= 127) {
                    n5 = 1;
                    this.c.a(b2, n12, DD.n[a - 114], n3++);
                }
                else if (a == -128) {
                    n5 = 1;
                    this.c.a(b2, n12, (byte)13, n3++);
                }
                else if (a >= 102 && a <= 113) {
                    if ((a - 102) % 2 == 0) {
                        n4 = 1;
                    }
                    else {
                        this.f[b2][n12] = this.f[b2 + 1][n12];
                    }
                    this.c.a(b2, n12, DD.m[a - 102], n3++);
                }
                else if ((a >= 70 && a <= 76) || a == -119) {
                    this.f[b2][n12] = 1;
                    this.c.a(b2, (byte)n12, a);
                }
                else if (a >= 36 && a <= 42) {
                    n5 = 1;
                    this.c.a(b2, (byte)n12);
                }
                else if (a >= 77 && a <= 96) {
                    n5 = 1;
                }
                else if (a == 101) {
                    n4 = 1;
                    this.c.a(b2 * DD.j + (DD.j >> 1) << 8, (n12 + 1) * DD.k + (DD.k >> 1) << 8, 32, true, true, 0, (byte)26);
                }
                else if (a > 34) {
                    n4 = 1;
                }
                else {
                    this.f[b2][n12] = (byte)a;
                }
            }
        }
        this.a();
        this.c.Q();
        if (this.c.cU) {
            this.c.bs[0] = false;
            return;
        }
        this.c.bs[this.c.V] = false;
    }
    
    public final void a() {
        for (int i = 27; i >= 0; i = (byte)(i - 1)) {
            DD.e[i] = 0;
            for (int j = 0; j < 18; j = (byte)(j + 1)) {
                final short n;
                if (((n = this.f[i][j]) >= 19 && n <= 27) || (n >= 19 && n <= 34)) {
                    final int[] e = DD.e;
                    final int n2 = i;
                    e[n2] |= 1 << j;
                }
            }
        }
    }
    
    public final void a(final Graphics graphics) {
        final int v = HH.v;
        final int w = HH.w;
        final byte b = (byte)(-v / DD.j);
        final byte b2 = (byte)(-w / DD.k);
        final byte b3 = b;
        final byte b4 = b2;
        final byte b5 = (byte)(b * DD.j + v);
        final byte b6 = (byte)(b2 * DD.k + w);
        byte b7 = b5;
        byte b8 = b6;
        byte b9 = (byte)(b3 + (240 / DD.j + 2));
        byte b10 = (byte)(b4 + (320 / DD.k + 2));
        if (b9 > 28) {
            b9 = 28;
        }
        if (b10 > 18) {
            b10 = 18;
        }
        if (++DD.l >= 12) {
            DD.l = 0;
        }
        try {
            for (byte b11 = b; b11 < b9; ++b11) {
                for (byte b12 = b2; b12 < b10; ++b12) {
                    if (b7 >= 240 || b8 >= 320) {
                        b8 += DD.k;
                    }
                    else {
                        short n;
                        if ((n = this.f[b11][b12]) <= 34) {
                            final byte b13 = b8;
                            if (0 < DD.k) {
                                if (DD.l >> 1 > 2) {
                                    if (n == 15 || n == 17) {
                                        ++n;
                                    }
                                    else if (n == 16 || n == 18) {
                                        --n;
                                    }
                                }
                                if (this.c.aP != 0 && n == 26) {
                                    if (DD.l < 6) {
                                        n = 13;
                                    }
                                    else {
                                        n = 14;
                                    }
                                }
                                this.c.b(graphics, b7, b13, DD.j, DD.k - 0);
                                graphics.drawImage(HH.aE, (int)b7, b13 - n * DD.k - 0, 0);
                            }
                        }
                        else {
                            graphics.setColor(0);
                            graphics.fillRect((int)b7, (int)b8, (int) DD.j, (int) DD.k);
                        }
                        final short a;
                        if ((a = this.a(b11, b12)) > -127 && a <= -125) {
                            final int width = HH.aJ.getWidth();
                            final byte k = DD.k;
                            final byte b14 = b8;
                            short n2 = (short)(a + 126);
                            if (DD.l >> 1 > 2) {
                                n2 += 2;
                            }
                            if (0 < k) {
                                this.c.b(graphics, b7 + (DD.j - width >> 1), b14, width, k - 0);
                                graphics.drawImage(HH.aJ, b7 + (DD.j - width >> 1), b14 - 0 - k * n2, 0);
                            }
                        }
                        else if (a == 97 || a == 98) {
                            final int n3 = b8 + (DD.k - 19 >> 1);
                            this.c.b(graphics, b7 + (DD.j - 19 >> 1), n3, 19, 19);
                            graphics.drawImage(HH.aK, b7 + (DD.j - 19 >> 1), n3 - 0 - 209, 0);
                        }
                        else if (a == 35 && this.c.f(this.c.X, this.c.V)) {
                            final byte b15 = b8;
                            this.c.b(graphics, b7 + (DD.j - 19 >> 1), b15, 19, 19);
                            graphics.drawImage(HH.aK, b7 + (DD.j - 19 >> 1), b15 - 0 - 76, 0);
                        }
                        else if (a >= 77 && a <= 96) {
                            final int width2 = HH.aI.getWidth();
                            final int n4 = HH.aI.getHeight() >> 3;
                            final byte b16 = (byte)(b8 + DD.k - n4);
                            byte b17 = (byte)(this.c.h(a - 77) ? (3 * n4) : (4 * n4));
                            if (a >= 81 && a <= 87 && a != 85) {
                                b17 = (byte)(this.c.h(a - 77) ? (7 * n4) : (8 * n4));
                            }
                            if (a == 80) {
                                b17 += (byte)(2 * n4);
                            }
                            if (0 < n4) {
                                this.c.b(graphics, b7 + (DD.j - width2 >> 1), b16, width2, n4 - 0);
                                graphics.drawImage(HH.aI, b7 + (DD.j - width2 >> 1), b16 - 0 - b17, 0);
                            }
                        }
                        b8 += DD.k;
                    }
                }
                b8 = b6;
                b7 += DD.j;
            }
        }
        catch (Exception ex) {}
    }
    
    public final boolean b(final int n, final int n2) {
        if (n < 0 || n >= 28 || n2 < 0 || n2 >= 18) {
            return false;
        }
        final byte b = this.f[n][n2];
        final short a = this.a(n, n2);
        final short a2 = this.a(n, n2 + 1);
        final short n3 = (short)(a - 70);
        final short n4 = (short)(a2 - 70);
        final int n5 = 1 << n3;
        final int n6 = 1 << n4;
        return (a < 70 || a > 76 || (this.c.bv & n5) == 0x0) && (a2 < 70 || a2 > 76 || (this.c.bv & n6) == 0x0) && ((a != -119 && a2 != -119) || (this.c.bv & 0x80) == 0x0) && (b >= 0 && b <= 19);
    }
    
    static {
        m = new byte[] { 15, 15, 16, 17, 18, 18, 19, 20, 21, 21, 22, 23 };
        n = new byte[] { 3, 4, 5, 0, 1, 2, 6, 7, 7, 9, 10, 10, 12, 13 };
        o = new byte[] { 0, 2, 1, 3 };
        p = new byte[][] { { 1, -1, -1, -1, -1, 0, 2 }, { 6, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, 3, 1, -1, -1, 4, 2, -1, -1, 5, 3, -1, -1, -1, 4, 0, 1, 2, 3, 4, 5, 0 }, { 4, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, 3, 1, -1, -1, -1, 2, 0, 1, 2, 3, 1 }, { 5, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, 3, 1, -1, -1, 4, 2, -1, -1, -1, 3, 4, 0, 1, 2, 3, 2 }, { 6, -1, -1, 1, -1, -1, 2, 3, 0, 1, -1, 4, -1, -1, 4, -1, 1, 3, -1, 5, 2, -1, -1, -1, 4, 0, 1, 3, 2, 4, 5, 2 }, { 5, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, 3, 1, -1, -1, 4, 2, -1, -1, -1, 3, 2, 1, 0, 3, 4, 2 }, { 5, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, 3, 1, -1, -1, 4, 2, -1, -1, -1, 3, 0, 1, 2, 3, 4, 0 }, { 3, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, -1, 1, 0, 2, 1, 0 }, { 4, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, 3, 1, -1, -1, -1, 2, 0, 1, 2, 3, 1 }, { 6, -1, 1, 2, -1, 0, -1, 3, -1, -1, 3, 4, 0, 2, -1, -1, 1, -1, -1, 5, 2, -1, -1, -1, 4, 0, 4, 3, 5, 1, 2, 1 }, { 6, -1, -1, 1, -1, -1, -1, 2, 0, -1, -1, 3, 1, -1, -1, 4, 2, -1, -1, 5, 3, -1, -1, -1, 4, 0, 1, 2, 3, 5, 4, 2 }, { 12, -1, 1, 8, -1, 0, 2, 9, -1, 1, 3, 10, -1, 2, 4, 11, -1, 3, 5, -1, -1, 4, 6, -1, -1, 5, 7, -1, -1, 6, -1, -1, -1, -1, 9, -1, 0, 8, 10, -1, 1, 9, 11, -1, 2, 10, -1, -1, 3, 0, 1, 2, 3, 0, 4, 1, 2, 5, 3, 4, 5, 1 }, { 1, -1, -1, -1, -1, 0, 2 } };
    }
}
