package view;
import javax.swing.*;

public class ViewMenu {
	public static void main(String[] a) { 
		JFrame janela = new JFrame("TESTE!"); 
		JButton b =new JButton("click");
		b.setBounds(130,100,100, 40);
		janela.add(b);
		janela.setSize(400,500);
		janela.setLayout(null);
		janela.setVisible(true);
	} 
}
