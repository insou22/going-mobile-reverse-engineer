import java.io.*;
import javax.microedition.lcdui.*;

public final class AA
{
    private short[][] b;
    public int a;
    private int c;
    
    public AA(final String s, final int a, final int c) throws IOException {
        this.b = new short[192][];
        final InputStream resourceAsStream = System.out.getClass().getResourceAsStream(s);
        for (int i = 0; i < this.b.length; ++i) {
            final int read = resourceAsStream.read();
            (this.b[i] = new short[(read & 0xF) + 1])[0] = (short)((read & 0xF0) >> 4);
            for (int j = 0; j < (read & 0xF); ++j) {
                this.b[i][j + 1] = (short)(resourceAsStream.read() << 8 | resourceAsStream.read());
            }
            this.a = a;
            this.c = c;
        }
        resourceAsStream.close();
    }
    
    private int a(final int n) {
        if (n < 32) {
            return 0;
        }
        if (n < 128) {
            return n - 32;
        }
        if (n < 160) {
            return 0;
        }
        if (n < 256) {
            return n - 64;
        }
        return 0;
    }
    
    public final void a(final Graphics graphics, final String s, final int n, final int n2, final int n3) {
        this.a(graphics, s, 0, -1, n, n2, n3);
    }
    
    private void a(final Graphics graphics, final String s, final int n, int n2, int n3, int n4, final int n5) {
        if (n2 < 0) {
            n2 = s.length() - n;
        }
        switch (n5 & 0x72) {
            case 2: {
                n4 -= this.a / 2;
                break;
            }
            case 32: {
                n4 -= this.a;
                break;
            }
        }
        int n6 = 0;
        switch (n5 & 0xD) {
            case 1: {
                for (int i = n; i < n + n2; ++i) {
                    n6 += this.b[this.a((int)s.charAt(i))][0] + this.c;
                }
                n3 -= (n6 - this.c) / 2;
            }
            case 0:
            case 4: {
                for (int j = n; j < n + n2; ++j) {
                    final int a = this.a((int)s.charAt(j));
                    for (int k = this.b[a].length - 1; k >= 1; --k) {
                        final short n7 = this.b[a][k];
                        graphics.fillRect(n3 + (n7 >> 12 & 0xF), n4 + (n7 >> 8 & 0xF), n7 >> 4 & 0xF, n7 & 0xF);
                    }
                    n3 += this.b[a][0] + this.c;
                }
                break;
            }
            case 8: {
                n3 += this.c;
                for (int l = n + n2 - 1; l >= n; --l) {
                    final int a2 = this.a((int)s.charAt(l));
                    n3 -= this.b[a2][0] + this.c;
                    for (int n8 = this.b[a2].length - 1; n8 >= 1; --n8) {
                        final short n9 = this.b[a2][n8];
                        graphics.fillRect(n3 + (n9 >> 12 & 0xF), n4 + (n9 >> 8 & 0xF), n9 >> 4 & 0xF, n9 & 0xF);
                    }
                }
                break;
            }
            default: {
                System.out.println("@!#%!%$#@%!%!%!%!$#% " + n5);
                break;
            }
        }
    }
    
    public final void a(final Graphics graphics, final char[] array, final int n, int n2, int n3, int n4, final int n5) {
        if (n2 < 0) {
            n2 = array.length - n;
        }
        switch (n5 & 0x72) {
            case 2: {
                n4 -= this.a / 2;
                break;
            }
            case 32: {
                n4 -= this.a;
                break;
            }
        }
        int n6 = 0;
        switch (n5 & 0xD) {
            case 1: {
                for (int i = n; i < n + n2; ++i) {
                    n6 += this.b[this.a((int)array[i])][0] + this.c;
                }
                n3 -= (n6 - this.c) / 2;
            }
            case 0:
            case 4: {
                for (int j = n; j < n + n2; ++j) {
                    final int a = this.a((int)array[j]);
                    for (int k = this.b[a].length - 1; k >= 1; --k) {
                        final short n7 = this.b[a][k];
                        graphics.fillRect(n3 + (n7 >> 12 & 0xF), n4 + (n7 >> 8 & 0xF), n7 >> 4 & 0xF, n7 & 0xF);
                    }
                    n3 += this.b[a][0] + this.c;
                }
                break;
            }
            case 8: {
                n3 += this.c;
                for (int l = n + n2 - 1; l >= n; --l) {
                    final int a2 = this.a((int)array[l]);
                    n3 -= this.b[a2][0] + this.c;
                    for (int n8 = this.b[a2].length - 1; n8 >= 1; --n8) {
                        final short n9 = this.b[a2][n8];
                        graphics.fillRect(n3 + (n9 >> 12 & 0xF), n4 + (n9 >> 8 & 0xF), n9 >> 4 & 0xF, n9 & 0xF);
                    }
                }
                break;
            }
            default: {
                System.out.println("@!#%!%$#@%!%!%!%!$#% " + n5);
                break;
            }
        }
    }
    
    public final int a(final String s) {
        return this.a(s, 0, -1);
    }
    
    public final int a(final String s, final int n, int n2) {
        if (n2 < 0) {
            n2 = s.length() - n;
        }
        int n3 = 0;
        for (int i = n; i < n + n2; ++i) {
            n3 += this.b[this.a((int)s.charAt(i))][0] + this.c;
        }
        return n3 - this.c;
    }
    
    public final int a(final char c) {
        return this.b[this.a((int)c)][0] + this.c;
    }
}
