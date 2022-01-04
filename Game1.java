//package tictactoe;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;



public class Game1 implements ActionListener{

    JFrame jf ;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    String str = "";
    int count = 0;
    String player1,player2;

         void GameStart(String s1,String s2)
         {  
            player1 = s1;
            player2 = s2;
          
            try
            {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } 
            catch (Exception e) 
            {
                  System.out.println(e);   
            } /* try catch ke andar humne jo bhi code diya hai wo look and feel ko achieve karne ke 
                 liye diya hai or ye isi tarah achieve karte hai or try catch isliye hai kyuki ye 
                 look and feel kisi tarah ki exception throw karta hai */

             jf = new JFrame();    
             jf.setTitle(player1+" turn");    // Hum pehle se player 1 ki turn kra kar hi denge              
             jf.setSize(500,500);
             jf.setDefaultCloseOperation(3); //This 3 is equal to the constant JFrame.EXIT_ON_CLOSE

             GridLayout gd = new GridLayout(3,3);

             jf.setLayout(gd); /* ab jo bhi component iss frame ke upar aayega wo grid layout me aayega 
                                  chahe wo button ho ya kuch or grid layout matlab jaisa hmare 
                                  phone me album ka layout hota hai waisa line khichi hui*/ 

             jb1 = new JButton();
             jb1.addActionListener(this);
             jf.add(jb1);

             jb2 = new JButton();
             jb2.addActionListener(this);
             jf.add(jb2);

             jb3 = new JButton();
             jb3.addActionListener(this);
             jf.add(jb3);

             jb4 = new JButton();
             jb4.addActionListener(this);
             jf.add(jb4);

             jb5 = new JButton();
             jb5.addActionListener(this);
             jf.add(jb5);

             jb6 = new JButton();
             jb6.addActionListener(this);
             jf.add(jb6);

             jb7 = new JButton();
             jb7.addActionListener(this);
             jf.add(jb7);

             jb8 = new JButton();
             jb8.addActionListener(this);
             jf.add(jb8);

             jb9 = new JButton();
             jb9.addActionListener(this);
             jf.add(jb9);

             jf.setVisible(true);

         }  
         
         @Override
         public void actionPerformed(ActionEvent e) 
         {
             count++;

             if(count%2==0)
             {
                 str="0";
                 jf.setTitle(player1+" turn");
                
             }
             else
             {
                 str="X";
                 jf.setTitle(player2+" turn");

                 
             }
              
             if(e.getSource()==jb1)
             {  
                jb1.setFont(new Font("Arial",1,60));  // ye Font class java.awt package me hi hai
                /* iss font se kiya hoga na ki kitne bade size me koi letter uss button par aayega
                  ye wo chij hai */
                jb1.setText(str);
                jb1.setEnabled(false); //setEnabled false karne se ab aap uske upar dwara kuch nhi likh sakte
             }

             if(e.getSource()==jb2)
             {   
                jb2.setFont(new Font("Arial",1,60)); // 60 is for size of text 1 is for style
                jb2.setText(str);
                jb2.setEnabled(false);
             }

             if(e.getSource()==jb3)
             {  
                jb3.setFont(new Font("Arial",1,60));  
                jb3.setText(str);
                jb3.setEnabled(false);
             }

             if(e.getSource()==jb4)
             {  
                jb4.setFont(new Font("Arial",1,60));  
                jb4.setText(str);
                jb4.setEnabled(false);
             }

             if(e.getSource()==jb5)
             {  
                jb5.setFont(new Font("Arial",1,60));  
                jb5.setText(str);
                jb5.setEnabled(false);
             }

             if(e.getSource()==jb6)
             {  
                jb6.setFont(new Font("Arial",1,60));  
                jb6.setText(str);
                jb6.setEnabled(false);
             }

             if(e.getSource()==jb7)
             {  
                jb7.setFont(new Font("Arial",1,60));  
                jb7.setText(str);
                jb7.setEnabled(false);
             }

             if(e.getSource()==jb8)
             {   
                jb8.setFont(new Font("Arial",1,60)); 
                jb8.setText(str);
                jb8.setEnabled(false);
             }

             if(e.getSource()==jb9)
             {  
                jb9.setFont(new Font("Arial",1,60));  
                jb9.setText(str);
                jb9.setEnabled(false);
             }

             winningPossibilities();
           
         } 

         public void winningPossibilities()
         {
            // Horizontal Winning Possibilities
            if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText()!="")
            {    
                if(count%2==0)
                {
                  JOptionPane.showMessageDialog(jf, player2+" Win");
                }
                else 
                {
                  JOptionPane.showMessageDialog(jf, player1+" Win");
                }
                 
                 restartGame();
            }
            else if(jb4.getText()==jb5.getText()&&jb5.getText()==jb6.getText() && jb5.getText()!="")
            {  
               if(count%2==0)
               {
                 JOptionPane.showMessageDialog(jf, player2+" Win");
               }
               else 
               {
                 JOptionPane.showMessageDialog(jf, player1+" Win");
               }
               restartGame();
            }
            else if(jb7.getText()==jb8.getText()&&jb8.getText()==jb9.getText() && jb7.getText()!="")
            {  
               
               if(count%2==0)
               {
                 JOptionPane.showMessageDialog(jf, player2+" Win");
               }
               else 
               {
                 JOptionPane.showMessageDialog(jf, player1+" Win");
               }
               restartGame();
            }
           // Vertical Winning Possibilities
            else if(jb1.getText()==jb4.getText()&&jb4.getText()==jb7.getText() && jb1.getText()!="")
            {  
               
               if(count%2==0)
               {
                 JOptionPane.showMessageDialog(jf, player2+" Win");
               }
               else 
               {
                 JOptionPane.showMessageDialog(jf, player1+" Win");
               }
               restartGame();
            }
            else if(jb2.getText()==jb5.getText()&&jb5.getText()==jb8.getText() && jb2.getText()!="")
            {  
               
               if(count%2==0)
               {
                 JOptionPane.showMessageDialog(jf, player2+" Win");
               }
               else 
               {
                 JOptionPane.showMessageDialog(jf, player1+" Win");
               }
               restartGame();
            }
            else if(jb3.getText()==jb6.getText()&&jb6.getText()==jb9.getText() && jb3.getText()!="")
            {  

               if(count%2==0)
               {
                 JOptionPane.showMessageDialog(jf, player2+" Win");
               }
               else 
               {
                 JOptionPane.showMessageDialog(jf, player1+" Win");
               }
               restartGame();
            }
            
            // Diagonally Winning Possibilities
            else if(jb1.getText()==jb5.getText()&&jb5.getText()==jb9.getText() && jb1.getText()!="")
            {  
               if(count%2==0)
               {
                 JOptionPane.showMessageDialog(jf, player2+" Win");
               }
               else 
               {
                 JOptionPane.showMessageDialog(jf, player1+" Win");
               }
               restartGame();
            }
            else if(jb3.getText()==jb5.getText()&&jb5.getText()==jb7.getText() && jb3.getText()!="")
            {  

               if(count%2==0)
               {
                 JOptionPane.showMessageDialog(jf, player2+" Win");
               }
               else 
               {
                 JOptionPane.showMessageDialog(jf, player1+" Win");
               }
               restartGame();
            }
            // Game Draw Possibility
            else  /* jab koi bhi else if nhi chalega or sabhi button par cross ya 0 ho gya hoga tab ye else
                    chalega kyuki jab saare buttons fill ho chuke hai toh count ki value bhi 9 honi chahiye
                    or humne yha whi condition lgayi hai*/
            {  
                if(count==9)
               { 
                  JOptionPane.showMessageDialog(jf, "Match Draw");
                  restartGame();
               }   
            }
         }
         
         void restartGame()
         {
             int i = JOptionPane.showConfirmDialog(jf, "Do You Want to restart the Game");
             
             jf.setTitle(player1+" turn");
             // showConfirmDialog method returns integer value

             /* Jab match draw ho jayega ya koi match jeet jayega tab ek confirmation dialog box
               open hoga jo ki puchega kiya aap or khelna chahte ho toh agr koi ok kar dega 
               toh fir ye showConfirmDialog method 0 return karega agr koi no kar dega toh wo 1
               return karega or agr koi cancel kar dega toh wo 2 return karega or agr koi dialog box 
               ko hi remove kar de uske cross par click karke toh fir method -1 return karega */
             
               if(i==0)
               {
                    jb1.setText("");
                    jb2.setText("");
                    jb3.setText("");
                    jb4.setText("");
                    jb5.setText("");
                    jb6.setText("");
                    jb7.setText("");
                    jb8.setText("");
                    jb9.setText("");
                   
                    jb1.setEnabled(true);
                    jb2.setEnabled(true);
                    jb3.setEnabled(true);
                    jb4.setEnabled(true);
                    jb5.setEnabled(true);
                    jb6.setEnabled(true);
                    jb7.setEnabled(true);
                    jb8.setEnabled(true);
                    jb9.setEnabled(true);

                    count = 0;
               }
               else if(i==1)
               {
                   System.exit(0);
               }
               else
               {
                  jb1.setEnabled(false);
                  jb2.setEnabled(false);
                  jb3.setEnabled(false);
                  jb4.setEnabled(false);
                  jb5.setEnabled(false);
                  jb6.setEnabled(false);
                  jb7.setEnabled(false);
                  jb8.setEnabled(false);
                  jb9.setEnabled(false);
                  
               }

         }

         public static void main(String[] args) 
         {
            
             Game1 obj = new Game1(); 

             obj.GameStart("Harsh", "Ravi");
                 
         }  
        
}
