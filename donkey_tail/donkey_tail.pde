PImage donkey;
PImage tail;
int x;
int y;
 void setup(){
  donkey = loadImage("Donkey.jpg");   
tail = loadImage("donkey tail.png");
size(800,600);
donkey.resize(width,height);
tail.resize(150,0);
}
void draw(){  
image(tail, x-150, y-150);
rect(0, 0, 30, 30);
rect(240,  150, 40,40 );

  println(mouseX+ ""+mouseY);
}
if(dist(0, 0, mouseX, mouseY) < 30){
  background (donkey);
}
else{
  background(255,255,255);
}
if(mousePressed){
  x = mouseX;
  y = mouseY;
  
}
}