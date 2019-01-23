import java.awt.*;
import java.awt.event.*;

public class p2{
	Frame f;
	TextField t1, t2, t3;
	Button btnplus, btnmin, btnmul, btndiv, btnmod;

	p2(){
		f = new Frame("Calculation Demo");
		f.setSize(600,400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		t1 = new TextField("");
		t1.setBounds(50,100,200,30);

		t2 = new TextField("");
		t2.setBounds(50,200,200,30);

		t3 = new TextField("");
		t3.setBounds(50,300,200,30);

		btnplus = new Button("+");
		btnplus.setBounds(50,250,50,30);

		btndiv = new Button("/");
		btndiv.setBounds(150,250,50,30);

		btnmin = new Button("-");
		btnmin.setBounds(250,250,50,30);

		btnmod = new Button("%");
		btnmod.setBounds(350,250,50,30);

		btnmul = new Button("*");
		btnmul.setBounds(450,250,50,30);

		btnplus.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				int a = 0;
				int b = 0;
				int ans = 0;

				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				ans = a + b;
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

	f.add(t1);
	f.add(t3);
	f.add(btn);


	}
	public static void main(String args[]){
		new p2();
	}
}
