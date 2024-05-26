import java.awt.*;
import java.applet.*;
/* 
  <applet code="ovalmove" width=400 height=400>
</applet>
*/
public class ovalmove extends Applet 
{
   int x1=70,y1=70,x2=70,y2=70,x3=70,y3=70;
   public void paint(Graphics g){
        g.setColor(Color.red);
        //fillRect(int x,int y,int width,int height);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
         g.setColor(Color.green);
        //FillOval(int x,int y,int width,int height);
     g.fillOval(x1,y1,20,20);
       g.setColor(Color.blue);
     g.fillOval(x2,y2,20,20);
         g.setColor(Color.black);
     g.fillOval(x3,y3,20,20);

        for(int i=0;i<20;i++)
       {
                 x1++;  //Diagonally Move
                 y1++;     //Diagonally Move
                 x2++;  //  Horizontally Move
                 y3++; //   Verticallly Move
                 repaint();
               try{     
              Thread.sleep(100);
                  }
               catch(Exception e){
                 }
          
        }
         

  }
}    