import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import tictactoe.*;



public class UserPanel implements ActionListener{
    
  JFrame jf;
  JLabel jl1,jl2;
  JTextField jt1,jt2;
  JButton jb;

      void openGamePanel()
      {
        Border border = BorderFactory.createLineBorder(Color.ORANGE);
        Border border2 = BorderFactory.createLineBorder(Color.BLUE);
  
          jf = new JFrame();
          jf.setSize(500, 500);
          jf.setDefaultCloseOperation(3);
          jf.setLayout(null);
          
  
          jl1 = new JLabel("Enter Player 1 Name");
          jl1.setBounds(50,100,150,40);
          jl1.setFont(new Font("Arial",1,15));
          jf.add(jl1);
          
          jt1 = new JTextField();
          jt1.setBounds(200,100,200,40);
          jt1.setFont(new Font("Serif Bold Italic",1,15));
          jt1.setBackground(Color.ORANGE);
          jt1.setForeground(Color.RED); // foreground yani text color
          jt1.setBorder(border);
          jf.add(jt1);
  
          jl2 = new JLabel("Enter Player 2 Name");
          jl2.setBounds(50,150,150,40);
          jl2.setFont(new Font("Arial",1,15));
          jf.add(jl2);  
  
          jt2 = new JTextField();
          jt2.setBounds(200,150,200,40);
          jt2.setFont(new Font("Serif Bold Italic",1,15));
          jt2.setBackground(Color.ORANGE);
          jt2.setForeground(Color.RED);
          jt2.setBorder(border);
          jf.add(jt2);
  
          jb = new JButton("Start Game");
          jb.setBounds(150, 350, 150, 60);
          jb.setFont(new Font("Arial",1,15));
          jb.setBackground(Color.BLUE);
          jb.setBorder(border2);
          jb.setForeground(Color.WHITE);
          jb.addActionListener(this);
          jf.add(jb);
  
          jf.setVisible(true);
      }

      @Override
      public void actionPerformed(ActionEvent e)
      { 
           if(e.getSource()==jb)
           {
              String player1 = jt1.getText();
              String player2 = jt2.getText();

              jf.setVisible(false);

               Game1 obj = new Game1();
               obj.GameStart(player1,player2);
           }
      }

      public static void main(String[] args) 
      {
      
            UserPanel obj = new UserPanel();
            obj.openGamePanel();
          
      }

      
}
