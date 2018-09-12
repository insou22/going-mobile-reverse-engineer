import java.io.*;
import javax.microedition.media.*;

public final class CC implements Runnable, PlayerListener
{
    private static final String[] b;
    private static final int[] c;
    public byte[][] a;
    private Player d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Thread i;
    
    public CC() {
        this.a = new byte[CC.b.length][];
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.b();
    }
    
    private void b() {
        final byte[] array = new byte[8192];
        for (int i = 0; i < CC.b.length; ++i) {
            try {
                InputStream inputStream;
                if (CC.c[i] == 0) {
                    inputStream = System.out.getClass().getResourceAsStream("/" + CC.b[i] + ".mid");
                }
                else {
                    inputStream = System.out.getClass().getResourceAsStream("/" + CC.b[i] + ".wav");
                }
                final int read = inputStream.read(array);
                inputStream.close();
                System.arraycopy(array, 0, this.a[i] = new byte[read], 0, read);
            }
            catch (Throwable t) {}
        }
        (this.i = new Thread(this)).start();
    }
    
    private boolean c() {
        return this.h != 0;
    }
    
    private void a(final int e, final int g) {
        synchronized (this) {
            if (this.c()) {
                return;
            }
            if (g == 0) {
                return;
            }
            if (e > -1 && e < CC.b.length) {
                this.e = e;
                this.g = g;
            }
        }
    }
    
    public final void a(final int n) {
        this.a(n, 1);
    }
    
    public final boolean a(final boolean b) {
        this.a(5, -1);
        return true;
    }
    
    public final void a() {
        this.f();
    }
    
    private void d() {
        this.h = 0;
        final int n = -1;
        this.f = n;
        this.e = n;
        this.g = 0;
    }
    
    private void e() {
        if (this.d != null) {
            try {
                this.d.deallocate();
            }
            catch (Throwable t) {}
            try {
                this.d.close();
            }
            catch (Throwable t2) {}
            this.d = null;
        }
    }
    
    private void f() {
        this.d();
        try {
            this.d.stop();
        }
        catch (Throwable t) {}
        this.e();
    }
    
    public final void run() {
        while (Thread.currentThread() == this.i) {
            switch (this.h) {
                case 0: {
                    synchronized (this) {
                        if (this.e != -1) {
                            if (this.d != null && this.f == this.e) {
                                try {
                                    this.h = 3;
                                    this.d.setMediaTime(0L);
                                    this.d.start();
                                }
                                catch (Throwable t) {
                                    this.f();
                                }
                            }
                            else {
                                this.e();
                                try {
                                    this.h = 2;
                                    this.f = this.e;
                                    if (CC.c[this.e] == 0) {
                                        this.d = Manager.createPlayer((InputStream)new ByteArrayInputStream(this.a[this.e]), "audio/midi");
                                    }
                                    else {
                                        this.d = Manager.createPlayer((InputStream)new ByteArrayInputStream(this.a[this.e]), "audio/x-wav");
                                    }
                                    this.d.addPlayerListener((PlayerListener)this);
                                    this.d.realize();
                                    this.d.prefetch();
                                    this.d.setLoopCount(1);
                                }
                                catch (Exception ex) {
                                    this.f();
                                }
                            }
                        }
                        break;
                    }
                }
                case 2: {
                    try {
                        this.h = 3;
                        this.d.start();
                    }
                    catch (Exception ex2) {
                        this.f();
                    }
                    break;
                }
            }
//            HH.EE(30); TODO: Invalid Java
        }
        this.f();
    }
    
    public final void playerUpdate(final Player player, final String s, final Object o) {
        if (s.equals("endOfMedia")) {
            if (this.g != -1) {
                this.e = -1;
            }
            this.h = 0;
        }
    }
    
    static {
        b = new String[] { "death", "bubble", "shoot", "msound", "box", "menu" };
        c = new int[] { 1, 1, 1, 1, 1, 0 };
    }
}
