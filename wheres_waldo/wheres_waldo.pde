 PImage waldo;
 
void setup() {
    waldo = loadImage("450_1000.jpg"); // 5. Change this to match your file name.
      size(450, 253);
      waldo.resize(450,253);
     
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {
  background(waldo);
      // 6. Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
          println("X: " + mouseX + " Y: " + mouseY); 
      // 7. If the mouse is on Waldo, print “Waldo found!”
if(mouseY>103&&mouseY<133){
if(mouseX>87&&mouseX<96){
if(mousePressed){
System.out.print("Waldo found!");

playWoohoo();


}
}

}
else{
if(mousePressed){
 playDoh(); // 8. If Waldo is found, also use the method below to play “Woohoo”
}
}
}// Change the name of the sound file if you need to 

  
// 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 



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