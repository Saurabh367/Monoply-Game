import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeGraphic extends JFrame{
	public static void letsGo()
	{
		final JFrame frame=new JFrame("Monopoly");

		frame.setSize(450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JPanel bob=new JPanel();
		JButton jk=new JButton("Done");
		bob.setBackground(Color.black);
		final JLabel lol=new JLabel(new ImageIcon("Monopoly_pack_logo.png"));
		frame.add(bob);
		bob.add(lol);
		bob.add(jk);
		jk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				frame.dispose();
			}
			
		}
				
				
		);
		frame.setVisible(true);
		
		
		
	}

}
