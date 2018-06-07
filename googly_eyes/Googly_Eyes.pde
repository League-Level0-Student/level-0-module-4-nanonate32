 void draw(){
   background(220);
    if(mouseX>563){
      mouseX = 563;
    }
     if(mouseX<280){
      mouseX = 280;
    }
    if(mouseY<131){
      mouseY=131;
    }
      if(mouseY>289){
        mouseY=289;
    }
   fill(#FFFCFC);
 ellipse(400,200,400,200);
 ellipse(700,500,400,200);
 fill(#F21111);
   ellipse(mouseX,mouseY,100,100);
   ellipse(mouseX+200,mouseY+300,100,100);
   println(mouseY);
 
 }


void setup(){
  size(1000,1000);
}
  
  
  
  