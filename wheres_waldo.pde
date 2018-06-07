 PImage waldo;
 
void setup() {
    waldo = loadImage("waldo.jpg"); // 5. Change this to match your file name.
      size(500, 500);
      waldo.resize(width,height);
     
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {
  background(waldo);
      // 6. Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
          println("X: " + mouseX + " Y: " + mouseY); 
      // 7. If the mouse is on Waldo, print “Waldo found!”
if(mouseY>208&&mouseY<249){
if(mouseX>90&&mouseX<104);

}      // 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;