import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class screen1{

int arr[]=new int [10];
int size=0;

JButton Store,Dis,Ins,Del,Sear,Sort,Max,Min,Exit;
JLabel l1;


screen1(){

JFrame j=new JFrame("Array Operations");
JPanel p=new JPanel();
//JPanel p1=new JPanel();


//----------> Label

l1=new JLabel("<---Array Operations--->");
l1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 26));
l1.setForeground(new Color(0x00244f));

//----------> Buttons

Store= new JButton("STORE        ");
Dis= new JButton("DISPLAY     ");
Ins=new JButton("INSERT        ");
Del= new JButton("DELETE       ");
Sear= new JButton("SEARCHING");
Sort= new JButton("SORTING     ");
Max= new JButton("MAX              ");
Min= new JButton("MIN               ");
Exit= new JButton("EXIT             ");

//----------> adding elements to the panel

p.add(l1);
p.add(Box.createRigidArea(new Dimension(10,25)));
p.add(Store);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Dis);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Ins);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Del);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Sear);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Sort);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Max);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Min);
p.add(Box.createRigidArea(new Dimension(0,25)));
p.add(Exit);

//----------> adding action listner to the buttons

//1)Store Button:

Store.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
size=Integer.parseInt(JOptionPane.showInputDialog("Enter how many total numbers are: "));
System.out.println(size);

for(int i=0;i<size;i++)
{
arr[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter Number "+(i+1)));
}

}
});

//2)Display Button
Dis.addActionListener(new ActionListener()
{
String s1="";

public void actionPerformed(ActionEvent ae)
{
StringBuilder sb = new StringBuilder();
//StringBuilder s1 = new StringBuilder();
for(int i=0;i<size;i++)
{
//s1= Integer.toString(arr[i]);
s1 = s1+arr[i] + " ";
//sb.append(screen1.s1.append(System.lineSeparator()));
}
JOptionPane.showMessageDialog(null,"Numbers are\n"+s1 ,"Result",JOptionPane.QUESTION_MESSAGE);

}

}

);









p.setLayout (new BoxLayout (p, BoxLayout.Y_AXIS));    
j.setContentPane(p);
j.setVisible(true);
j.setSize(1280,850); 
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

}
public class ArrayOperations{

public static void main(String []args){

screen1 obj= new screen1();

}
}