import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import javax.microedition.rms.*;
import java.io.*;

public class ratchetandclank extends MIDlet
{
    public Display a;
    public GG b;
    public HH c;
    public EE d;
    public static AA e;
    public static AA f;
    public static AA g;
    public static AA h;
    public boolean i;
    public boolean j;
    public boolean k;
    private CC s;
    public byte[] l;
    public int[] m;
    public static String[] n;
    private int[] t;
    public byte[] o;
    private byte[] u;
    public boolean p;
    public static int q;
    public static final String[] r;

    public ratchetandclank() {
        this.i = false;
        this.j = false;
        this.t = new int[] { 1, 2, 3, 4 };
        this.o = new byte[214];
        this.u = new byte[3];
        this.p = false;
        System.gc();
        this.a = Display.getDisplay((MIDlet)this);
        this.f();
        ratchetandclank.q = this.j();
        this.l = new byte[3];
        this.m = new int[3];
        this.s = new CC();
        if (this.i() > 0) {
            this.k = true;
        }
        else {
            this.k = false;
        }
        this.b = new GG(this);
    }

    public final void startApp() throws MIDletStateChangeException {
        System.out.println("STARTAPP CALLED!!");
        if (!this.j) {
            this.j = true;
            this.b.q = true;
            (this.d = new EE(this)).setFullScreenMode(true);
            this.a.setCurrent((Displayable)this.d);
            this.d.b();
        }
    }

    public final void pauseApp() {
        if (this.d != null) {
            this.d.hideNotify();
        }
    }

    public final void a() {
        if (this.s != null) {
            this.s.a();
        }
        try {
            this.destroyApp(true);
        }
        catch (Exception ex) {}
        this.notifyDestroyed();
    }

    public final void destroyApp(final boolean b) throws MIDletStateChangeException {
        this.b = null;
        this.c = null;
    }

    public final void a(final int n) {
        this.e();
        this.b.a(true);
        this.c.ct = 0;
        this.c.c(n, -1);
        this.i = true;
    }

    public final void b(final int n) {
        this.b.a(false);
        this.c.c(-1, n);
        this.i = true;
    }

    public final void b() {
        this.d();
        this.c.m();
        this.i = false;
        this.b.c();
    }

    public final void c() {
        this.s.a();
    }

    public final void c(final int n) {
        if (!this.k) {
            return;
        }
        this.s.a(n);
    }

    public final boolean a(final boolean b) {
        return !this.k || (this.i || this.b.p) || this.s.a(b);
    }

    public final void d() {
        this.s.a();
    }

    public final void e() {
        for (int i = 0; i < 3; ++i) {
            this.g(i);
            this.l[i] = this.o[0];
            this.m[i] = this.a(this.o, 195);
        }
    }

    public final void a(final int n, final byte[] array, final int n2) {
        array[0 + n2] = (byte)(n >> 24 & 0xFF);
        array[1 + n2] = (byte)(n >> 16 & 0xFF);
        array[2 + n2] = (byte)(n >> 8 & 0xFF);
        array[3 + n2] = (byte)(n & 0xFF);
    }

    public final int a(final byte[] array, final int n) {
        return ((array[0 + n] < 0) ? (array[0 + n] + 256) : array[0 + n]) << 24 | ((array[1 + n] < 0) ? (array[1 + n] + 256) : array[1 + n]) << 16 | ((array[2 + n] < 0) ? (array[2 + n] + 256) : array[2 + n]) << 8 | ((array[3 + n] < 0) ? (array[3 + n] + 256) : array[3 + n]);
    }

    public final void a(final short n, final byte[] array, int n2) {
        array[n2++] = (byte)(n >> 8);
        array[n2] = (byte)n;
    }

    public final short b(final byte[] array, final int n) {
        return (short)((short)((array[0 + n] < 0) ? (array[0 + n] + 256) : array[0 + n]) << 8 | (short)((array[1 + n] < 0) ? (array[1 + n] + 256) : array[1 + n]));
    }

    public final void f() {
        RecordStore openRecordStore = null;
        try {
            if ((openRecordStore = RecordStore.openRecordStore("RANDCSm", true)).getNumRecords() < 4) {
                openRecordStore.closeRecordStore();
                this.g();
                return;
            }
            for (int i = 0; i < 4; ++i) {
                if ((i < 3 && openRecordStore.getRecordSize(this.t[i]) != 214) || (i == 3 && openRecordStore.getRecordSize(this.t[i]) != 3)) {
                    openRecordStore.closeRecordStore();
                    this.g();
                    return;
                }
            }
            openRecordStore.closeRecordStore();
        }
        catch (RecordStoreException ex) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex2) {}
            this.g();
        }
    }

    public final void g() {
        try {
            RecordStore.deleteRecordStore("RANDCSm");
        }
        catch (RecordStoreException ex) {}
        RecordStore openRecordStore = null;
        try {
            openRecordStore = RecordStore.openRecordStore("RANDCSm", true);
            for (int i = 0; i < 3; ++i) {
                openRecordStore.addRecord(this.o, 0, 214);
            }
            this.u[0] = 1;
            this.u[2] = 0;
            this.u[1] = -1;
            openRecordStore.addRecord(this.u, 0, 3);
            openRecordStore.closeRecordStore();
        }
        catch (RecordStoreException ex2) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex3) {}
        }
    }

    public final void d(final int n) {
        RecordStore openRecordStore = null;
        try {
            openRecordStore = RecordStore.openRecordStore("RANDCSm", false);
            this.c.a(this.o);
            openRecordStore.setRecord(this.t[n], this.o, 0, 214);
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex2) {}
        }
    }

    public final void e(final int n) {
        RecordStore openRecordStore = null;
        try {
            (openRecordStore = RecordStore.openRecordStore("RANDCSm", false)).getRecord(this.t[n], this.o, 0);
            openRecordStore.closeRecordStore();
            this.c.b(this.o);
        }
        catch (Exception ex) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex2) {}
        }
    }

    public final void f(final int n) {
        RecordStore openRecordStore = null;
        try {
            openRecordStore = RecordStore.openRecordStore("RANDCSm", false);
            for (int i = 0; i < 214; ++i) {
                this.o[i] = 0;
            }
            openRecordStore.setRecord(this.t[n], this.o, 0, 214);
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex2) {}
        }
    }

    public final void g(final int n) {
        RecordStore openRecordStore = null;
        try {
            (openRecordStore = RecordStore.openRecordStore("RANDCSm", false)).getRecord(this.t[n], this.o, 0);
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex2) {}
        }
    }

    public final boolean h() {
        if (!this.p) {
            try {
                final RecordStore openRecordStore;
                (openRecordStore = RecordStore.openRecordStore("RANDCSm", false)).getRecord(this.t[3], this.u, 0);
                this.p = true;
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex) {}
        }
        final String appProperty;
        if ((appProperty = this.getAppProperty("GameIsWon")) != null) {
            return appProperty.equals("true");
        }
        return this.u[2] != 0;
    }

    public final byte i() {
        if (!this.p) {
            try {
                final RecordStore openRecordStore;
                (openRecordStore = RecordStore.openRecordStore("RANDCSm", false)).getRecord(this.t[3], this.u, 0);
                this.p = true;
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex) {}
        }
        return this.u[0];
    }

    public final byte j() {
        if (!this.p) {
            try {
                final RecordStore openRecordStore;
                (openRecordStore = RecordStore.openRecordStore("RANDCSm", false)).getRecord(this.t[3], this.u, 0);
                this.p = true;
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex) {}
        }
        return this.u[1];
    }

    public final void a(final byte b) {
        try {
            final RecordStore openRecordStore;
            (openRecordStore = RecordStore.openRecordStore("RANDCSm", false)).getRecord(this.t[3], this.u, 0);
            this.u[0] = b;
            this.u[1] = (byte)ratchetandclank.q;
            openRecordStore.setRecord(this.t[3], this.u, 0, 3);
            openRecordStore.closeRecordStore();
        }
        catch (RecordStoreNotOpenException ex) {}
        catch (InvalidRecordIDException ex2) {}
        catch (RecordStoreException ex3) {}
    }

    public final void k() {
        try {
            final RecordStore openRecordStore;
            (openRecordStore = RecordStore.openRecordStore("RANDCSm", false)).getRecord(this.t[3], this.u, 0);
            this.u[2] = 1;
            openRecordStore.setRecord(this.t[3], this.u, 0, 3);
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {}
    }

    public final void l() {
        ratchetandclank.n = new String[321];
        System.gc();
        int n = 0;
        final StringBuffer sb = new StringBuffer();
        new String();
        try {
            final InputStream resourceAsStream = this.getClass().getResourceAsStream(ratchetandclank.r[(ratchetandclank.q == -1) ? 0 : ratchetandclank.q] + ".txt");
            int read;
            while ((read = resourceAsStream.read()) != -1) {
                sb.append((char)read);
            }
            final String string = sb.toString();
            for (int i = 0; i < 321; ++i) {
                final int index = string.indexOf("\n", n);
                final String trim;
                if (!(trim = string.substring(n, index).trim()).equals("")) {
                    ratchetandclank.n[i] = trim;
                }
                n = index + 1;
            }
            resourceAsStream.close();
        }
        catch (IOException ex) {}
        System.gc();
    }

    static {
        ratchetandclank.q = -1;
        r = new String[] { "txt_en", "txt_fr", "txt_it", "txt_gr", "txt_sp" };
    }
}
