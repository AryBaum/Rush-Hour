package rushhour;

import java.awt.Rectangle;

/*
 * Sammy and Arielle
 * 6/21/2023
 * class for buttons in rush hour UI
 */

class Button extends Rectangle {

    int x,y,w,h, aW, aH;

    // normal rect
    Button(int x, int y, int w, int h) {
        super(x,y,w,h);
        this.x = x; this.y = y;
        this.w = w; this.h = h;
    }

    // round rect
    Button(int x, int y, int w, int h, int aW, int aH) {
        this(x,y,w,h);
        this.aH = aH; this.aW = aW;
    }
}