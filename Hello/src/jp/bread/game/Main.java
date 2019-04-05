package jp.bread.game;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Main extends Canvas implements Runnable {
    private static final long serialVersionUID = -685801649383208246L;
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private Thread thread;
    private boolean runnning = false;

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        runnning = true;

    }

    public synchronized void stop() {
        try {
            thread.join();
            runnning = false;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void run() {
        long lasttime = System.nanoTime();
        double amountofTicks = 60.0;
        double ns = 1000000000 / amountofTicks;
        double delta = 0;
        long timer = System.nanoTime();
        int frams = 0;
        long now = System.nanoTime();

        delta += (now - lasttime) / ns;
        lasttime = now;
        while (delta >= 1) {
            tick();
            delta--;
        }
        if (runnning)
            render();
        frams++;
        if (System.currentTimeMillis() - timer > 1000) {
            timer += 1000;
            System.out.println("FPS:" + frams);
            frams = 0;
        }
        stop();
    }




    private void render() {

    }

    private void    tick() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null){

        }
    }

    public Main(){
        new Window(WIDTH, HEIGHT, "Bread Game", this);
    }
    public static void main(String[]  args){
        new Main();

    }



}
