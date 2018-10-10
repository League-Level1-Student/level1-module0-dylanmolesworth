int ballX = 20;
int xSpeed = 1;
void setup(){
  size(600, 600);

  
}
void draw(){
  background(#3B83D8);
  fill(#FF0022);
stroke(#890718);
ellipse(ballX, 20, 20, 20);
  ballX += xSpeed;
  if(ballX > 600) {
   xSpeed = -xSpeed;
  }
   
}