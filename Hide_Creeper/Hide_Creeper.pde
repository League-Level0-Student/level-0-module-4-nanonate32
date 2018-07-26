PImage creeper; 

void setup(){
  
  size(1000,800);
  PImage minecraft = loadImage("PREVIEW_SCREENSHOT4_62492.jpg");   
minecraft.resize(width, height);         
background(minecraft);   
creeper=loadImage("creeper.png");
}
void draw(){
  image(creeper, mouseX, mouseY);
}