import java.awt.*; 
import java.awt.event.*;
public class p1{
    Frame f;
    TextField t1,t2,t3; 
    Button btnplus, btnmin, btndiv, btnmod, btnmul ;
    p1(){
          f=new Frame("Button Example");  

            t1=new TextField("");  
            t1.setBounds(50,100, 200,30);  
            t2=new TextField("");  
             t2.setBounds(50,150, 200,30);  

             t3=new TextField("");  
             t3.setBounds(50,200, 200,30);

            f.add(t1); f.add(t2); f.add(t3); 

            btnplus= new Button("+");
            btnplus.setBounds(50,250, 50,30);
            f.add(btnplus);

            btnmin= new Button("-");
            btnmin.setBounds(150,250, 50,30);
            f.add(btnmin);

            btndiv= new Button("/");
            btndiv.setBounds(250,250, 50,30);
            f.add(btndiv);

            btnmul= new Button("*");
            btnmul.setBounds(350,250, 50,30);
            f.add(btnmul);

            btnmod= new Button("%");
            btnmod.setBounds(450,250, 50,30);
            f.add(btnmod);



          f.setSize(600,400);  
          f.setLayout(null);  
          f.setVisible(true); 
          f.addWindowListener( new WindowListener(){
            public  void windowClosed(WindowEvent e)
            {
        
            } 
            public  void windowDeactivated(WindowEvent e)
            {
            }  
            public  void windowActivated(WindowEvent e)
            {
            }  
            public  void windowClosing(WindowEvent e)
            {
                f.dispose();  
            }  
            public  void windowDeiconified(WindowEvent e)
            {
            }  
            public  void windowIconified(WindowEvent e)
            {
            }  
            public  void windowOpened(WindowEvent e)
            {
            }  
          });


          btnplus.addMouseListener(new MouseListener(){
            public  void mouseClicked(MouseEvent e)
            {
                int a=0,b=0,ans=0;
                a= Integer.valueOf(t1.getText());
                b= Integer.valueOf(t2.getText());
                ans=a+b;
                t3.setText(String.valueOf(ans));
            }  
            public  void mouseEntered(MouseEvent e)
            {

            }  
            public  void mouseExited(MouseEvent e)
            {

            } 
            public  void mousePressed(MouseEvent e)
            {

            }  
            public  void mouseReleased(MouseEvent e)
            {

            } 

          });

	btnmin.addMouseListener(new MouseListener(){
            public  void mouseClicked(MouseEvent e)
            {
                int a=0,b=0,ans=0;
                a= Integer.valueOf(t1.getText());
                b= Integer.valueOf(t2.getText());
                ans=a-b;
                t3.setText(String.valueOf(ans));
            }  
            public  void mouseEntered(MouseEvent e)
            {

            }  
            public  void mouseExited(MouseEvent e)
            {

            } 
            public  void mousePressed(MouseEvent e)
            {

            }  
            public  void mouseReleased(MouseEvent e)
            {

            } 

          });

	btndiv.addMouseListener(new MouseListener(){
            public  void mouseClicked(MouseEvent e)
            {
                int a=0,b=0,ans=0;
                a= Integer.valueOf(t1.getText());
                b= Integer.valueOf(t2.getText());
                ans=a/b;
                t3.setText(String.valueOf(ans));
            }  
            public  void mouseEntered(MouseEvent e)
            {

            }  
            public  void mouseExited(MouseEvent e)
            {

            } 
            public  void mousePressed(MouseEvent e)
            {

            }  
            public  void mouseReleased(MouseEvent e)
            {

            } 

          });

	btnmul.addMouseListener(new MouseListener(){
            public  void mouseClicked(MouseEvent e)
            {
                int a=0,b=0,ans=0;
                a= Integer.valueOf(t1.getText());
                b= Integer.valueOf(t2.getText());
                ans=a*b;
                t3.setText(String.valueOf(ans));
            }  
            public  void mouseEntered(MouseEvent e)
            {

            }  
            public  void mouseExited(MouseEvent e)
            {

            } 
            public  void mousePressed(MouseEvent e)
            {

            }  
            public  void mouseReleased(MouseEvent e)
            {

            } 

          });

	btnmod.addMouseListener(new MouseListener(){
            public  void mouseClicked(MouseEvent e)
            {
                int a=0,b=0,ans=0;
                a= Integer.valueOf(t1.getText());
                b= Integer.valueOf(t2.getText());
                ans=a%b;
                t3.setText(String.valueOf(ans));
            }  
            public  void mouseEntered(MouseEvent e)
            {

            }  
            public  void mouseExited(MouseEvent e)
            {

            } 
            public  void mousePressed(MouseEvent e)
            {

            }  
            public  void mouseReleased(MouseEvent e)
            {

            } 

          });
    }



public static void main(String args[])  
{  
    new p1();  
} 

}      
