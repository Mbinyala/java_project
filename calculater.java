import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
import java.lang.Math;
/*
<applet code="calculater.class" height = 300 width=400>
</applet> */
public class calculater extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(10);  
    TextField t2 = new TextField(10);  
    TextField t3 = new TextField(10); 
    TextField t4 = new TextField(10); 
    Label l1 = new Label("Loan Amount:");  
    Label l2 = new Label("Interest rate:");  
    Label l3 = new Label("Number of months:");
    Label l4 = new Label("EMI:");
    Button b = new Button("Calculate");  
    public void init()  
    {  
        //t1.setForeground(Color.RED);  
        add(l1);  
        add(t1);  
        add(l2);  
        add(t2);  
        add(l3);  
        add(t3); 
        add(l4);
        add(t4); 
        add(b);  
        b.addActionListener(this);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource() == b)  
        {  
            int p = Integer.parseInt(t1.getText());  
           float r =Float.parseFloat(t2.getText());  
            int t = Integer.parseInt(t3.getText());
            t4.setText(" " +((p * r * Math.pow(1 + r, t)) / (Math.pow(1 + r, t) - 1)));  
        } 
} 
}