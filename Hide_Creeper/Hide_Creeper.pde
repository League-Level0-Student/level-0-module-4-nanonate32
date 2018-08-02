PImage creeper; 
PImage minecraft;
int x = 900;
int y = 100 ;
void setup(){
  
  size(1000,800);
   minecraft = loadImage("PREVIEW_SCREENSHOT4_62492.jpg");   
minecraft.resize(width, height);         
  
creeper=loadImage("creeper.png");
creeper.resize(20,20);
}
void draw(){
  background(minecraft); 

image(creeper, x, y);

if(mouseX == 20 && mouseY == 20){
    fill(#6FE82F);
  }else{
    fill(#E01D37);
  }
  if(mousePressed){
  
   ellipse(mouseX,mouseY,20,20);
  }
  
}