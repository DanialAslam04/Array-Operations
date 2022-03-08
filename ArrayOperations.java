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
for(int i=0;i<size;i++)
{
s1 = s1+arr[i] + " ";
}
JOptionPane.showMessageDialog(null,"Numbers are\n"+s1 ,"Result",JOptionPane.QUESTION_MESSAGE);
s1="";
}

});

//3)Insert Button

Ins.addActionListener(new ActionListener()
{
int num=0;
int pos=0;
public void actionPerformed(ActionEvent ae)
{
num=Integer.parseInt(JOptionPane.showInputDialog("Enter Number you want to insert: "));
do{
pos=Integer.parseInt(JOptionPane.showInputDialog("Enter location where you want to insert number: "));
System.out.println(size);
if(pos<=0||pos>size+1)
{
JOptionPane.showMessageDialog(null,"Enter Valid Position","Error",JOptionPane.ERROR_MESSAGE);
}
}while(pos<=0||pos>size+1);

if(pos-1==size)
{
arr[pos-1]=num;
size++;
}

else
{
for(int i=size-1;i>=pos-1;i--)
{
arr[i+1]=arr[i];
}
arr[pos-1]=num;
size++;
}

}
});

//4)Deletion Button

Del.addActionListener(new ActionListener()
{
int pos=0;
public void actionPerformed(ActionEvent ae)
{
do{
pos=Integer.parseInt(JOptionPane.showInputDialog("Enter location where you want to delete number: "));
//System.out.println(size);
if(pos<=0||pos>size)
{
JOptionPane.showMessageDialog(null,"Enter Valid Position","Error",JOptionPane.ERROR_MESSAGE);
}
}while(pos<=0||pos>size);

if(pos-1==size-1)
{
size--;
}

else
{
for(int i=pos-1;i<size-1;i++)
{
arr[i]=arr[i+1];
}
size--;
}

}
});


//5)Searching Button

Sear.addActionListener(new ActionListener()
{
int num=0;
int i=0;
public void actionPerformed(ActionEvent ae)
{
boolean check=false;
num=Integer.parseInt(JOptionPane.showInputDialog("Enter Number you want to Search: "));
for(i=0;i<size;i++)
{
if(num==arr[i])
{
check=true;
break;
}
}

if(check)
{
JOptionPane.showMessageDialog(null,"Number found at Location: "+(i+1),"Result",JOptionPane.QUESTION_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(null,"Number not found ","Result",JOptionPane.QUESTION_MESSAGE);
}

}
});

//6)MAX Button

Sort.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
int temp=0;
for(int i=0;i<size;i++)
{
for(int j=0;j<size-1;j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}

}

}

}
});



//7)MAX Button

Max.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
int max=arr[0];
int pos=0;

for(int i=0;i<size;i++)
{
if(max<arr[i])
{
max=arr[i];
pos=i;
}
}
JOptionPane.showMessageDialog(null,"Maximum Number is: "+max+" at location "+(pos+1),"Result",JOptionPane.QUESTION_MESSAGE);
}
});

//8)MIN Button

Min.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
int min=arr[0];
int pos=0;

for(int i=0;i<size;i++)
{
if(min>arr[i])
{
min=arr[i];
pos=i;
}
}
JOptionPane.showMessageDialog(null,"Minimum Number is: "+min+" at location "+(pos+1),"Result",JOptionPane.QUESTION_MESSAGE);
}
});

//9)Exit  Button

Exit.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
try {
Thread.sleep(500);
}
catch (InterruptedException e) {
e.printStackTrace();
}
JOptionPane.showMessageDialog(null,"Are you sure you want to Exit","Result",JOptionPane.QUESTION_MESSAGE);
System.exit(0);
}
});



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