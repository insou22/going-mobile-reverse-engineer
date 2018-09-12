import com.nokia.mid.ui.*;
import javax.microedition.lcdui.*;

public final class EE extends Canvas implements Runnable, CommandListener
{
    private Thread g;
    private ratchetandclank h;
    public byte a;
    public static DirectGraphics b;
    public boolean c;
    public int[] d;
    public int e;
    public boolean f;
    
    public EE(final ratchetandclank h) {
        this.a = -1;
        this.d = new int[64];
        this.e = 0;
        this.f = false;
        this.h = h;
    }
    
    public final void hideNotify() {
        try {
            if (this.a == 0) {
                this.h.c();
                this.a = 1;
                if (this.h.i) {
                    if (this.h.c != null) {
                        this.h.c.p();
                    }
                }
                else if (this.h.b != null) {
                    this.h.b.d();
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public final void showNotify() {
        try {
            if (this.a == -1) {
                this.a = 0;
                this.a();
            }
            else {
                this.hideNotify();
            }
        }
        catch (Exception ex) {}
    }
    
    public final void a() {
        if (this.h.i) {
            if (this.h.c != null) {
                this.h.c.q();
            }
        }
        else if (this.h.b != null) {
            this.h.b.e();
        }
    }
    
    public final void paint(final Graphics graphics) {
        System.out.println("PAINTING!!");
        try {
            System.out.println("a == " + this.a);
            if (this.a == 1) {
                graphics.setClip(0, 0, 240, 320);
                graphics.setColor(0);
                graphics.fillRect(0, 0, 240, 320);
                graphics.setColor(16777215);
                ratchetandclank.f.a(graphics, "Press * Key...", 120, 160, 17);
            }
            else if (this.a == 2) {
                graphics.setClip(0, 0, 240, 320);
                graphics.setColor(0);
                graphics.fillRect(0, 0, 240, 320);
            }
            else if (this.a == 0) {
                System.out.println("a is 0");
                EE.b = DirectUtils.getDirectGraphics(graphics);
                System.out.println("Got graphics");
                if (this.h.i) {
                    System.out.println(1);
                    if (this.h.c != null) {
                        System.out.println(2);
                        this.h.c.w(graphics);
                        System.out.println(3);
                    }
                }
                else if (this.h.b != null) {
                    System.out.println(4);
                    this.h.b.a(graphics);
                    System.out.println(5);
                }
                System.out.println(6);
                EE.b = null;
                System.out.println(7);
            }
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        this.c = false;
        System.out.println("SET c TO FALSE");
    }
    
    public final void b() {
        (this.g = new Thread(this)).start();
    }
    
    private void b(final int n) {
        if (this.h.i) {
            if (this.h.c != null) {
                this.h.c.b(n);
            }
        }
        else if (this.h.b != null) {
            this.h.b.b(n);
        }
    }
    
    private void c(final int n) {
        if (this.h.i && this.h.c != null) {
            this.h.c.c(n);
        }
    }
    
    private void d() {
        if (this.h.i) {
            if (this.h.c != null) {
                this.h.c.r();
            }
        }
        else if (this.h.b != null) {
            this.h.b.h();
        }
    }
    
    public final void run() {
        System.out.println("RUNNING");
        while (true) {
            try {
                while (true) {
                    if (this.e > 0) {
                        synchronized (this.d) {
                            for (int i = 0; i < this.e; ++i) {
                                if ((this.d[i] & 0xF0000) == 0x0) {
                                    this.b((short)(this.d[i] & 0xFFFF));
                                }
                                else if ((this.d[i] & 0xF0000) == 0x10000) {
                                    this.c((short)(this.d[i] & 0xFFFF));
                                }
                            }
                            this.e = 0;
                        }
                    }
                    if (this.a == 0) {
                        this.d();
                        if (!((Displayable)this).isShown()) {
                            this.hideNotify();
                        }
                    }
                    else if (this.a == 2) {
                        this.a();
                        this.a = 0;
                    }
                    this.c = true;
                    System.out.println("ABOUT TO REPAINT");
                    this.repaint();
                    while (this.c) {
                        Thread.sleep(10L);
                    }
                }
            }
            catch (Exception ex) {
                continue;
            }
//            break; TODO: Invalid Java
        }
    }
    
    public final int a(final int n) {
        return n;
    }
    
    public final void c() {
        this.f = true;
    }
    
    public final void keyPressed(int a) {
        try {
            if (this.a == 1) {
                if (a == 42) {
                    this.a = 2;
                    this.repaint();
                }
            }
            else if (this.a == 0) {
                if (!this.f) {
                    return;
                }
                a = this.a(a);
                synchronized (this.d) {
                    if (this.e < 63) {
                        this.d[this.e] = (char)a;
                        ++this.e;
                    }
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public final void keyReleased(int a) {
        try {
            if (this.a == 0) {
                if (!this.f) {
                    return;
                }
                a = this.a(a);
                synchronized (this.d) {
                    if (this.e < 63) {
                        this.d[this.e] = ((char)a | 0x10000);
                        ++this.e;
                    }
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (!this.f) {
            return;
        }
        try {
            if (this.a == 0) {
                if (!this.h.i && this.h.b != null) {
                    this.h.b.b(command, displayable);
                }
            }
            else if (this.a == 1 && !this.h.i && this.h.b != null) {
                this.h.b.a(command, displayable);
            }
        }
        catch (Exception ex) {}
    }
}
