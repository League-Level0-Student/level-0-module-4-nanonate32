import ddf.minim.*;          
AudioSample woohooSound;          
boolean playSound = true;          

PImage donkey;
PImage tail;
int x;
int y;
void setup() {
  Minim minim = new Minim(this);     
woohooSound = minim.loadSample("homer-woohoo.wav"); 
  donkey = loadImage("Donkey.jpg");   
  tail = loadImage("donkey tail.png");
  size(800, 600);
  donkey.resize(width, height);
  tail.resize(150, 0);
}
void draw() {  


  println(mouseX+ ""+mouseY);

  if (dist(0, 0, mouseX, mouseY) < 30) {
    background (donkey);
  } else {
    background(255, 255, 255);
  }
  if (mousePressed) {
    x = mouseX;
    y = mouseY;
  }  
  if(dist (240,150,mouseX,mouseY) < 30) {
    
   if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
 
  }
  
   image(tail, x-150, y-150);
}
