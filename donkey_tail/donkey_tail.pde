PImage donkey;
PImage tail;
 void setup(){
  donkey = loadImage("Donkey.jpg");   
tail = loadImage("donkey tail.png");
size(2710,1814);
}
void draw(){
  background (donkey);
image(tail, mouseX-150, mouseY-150);
rect(0, 0, 30, 30);
rect(200, 100, 40,40 );
}