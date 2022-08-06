package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import dao.AnimalDao;
import frame.Dao;
import vo.AnimalVo;

public class UI {
	
	Dao<Integer, AnimalVo> dao;
	java.util.List<AnimalVo> clist;
	
	Frame f;
	Button b1, b2, b3, b4;
	Panel p1, p2;
	Panel main;
	TextField tf1, tf2, tf3;
	TextField maintf;
	List list;
	
	public UI() {
		dao = new AnimalDao();
		init();
		make();
		addEvent();
	}
	public void init() {
		f = new Frame("My Frame");
		b1 = new Button("ADD");
		b2 = new Button("SELECT");
		b3 = new Button("DELETE");
		b4 = new Button("UPDATE");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		maintf = new TextField();
		list = new List();
	}
	public void make() {
		p1.setBackground(Color.black);
		p2.setBackground(Color.orange);
		
		p2.setLayout(new BorderLayout());
		p2.add(b2,"South");
		p2.add(list,"Center");
		list.setBackground(Color.gray);
		
		p1.setLayout(new GridLayout(6, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b1);
		p1.add(b3);
		p1.add(b4);
		tf1.setBackground(Color.lightGray);
		tf2.setBackground(Color.lightGray);
		tf3.setBackground(Color.lightGray);
		b1.setBackground(Color.magenta);
		b2.setBackground(Color.green);
		b3.setBackground(Color.cyan);
		b4.setBackground(Color.pink);
		main.setLayout(new GridLayout(1, 2));
		
		main.add(p1);
		main.add(p2);
		
		f.add(main,"Center");
		f.add(maintf,"South");
		
		f.setSize(350, 400);
		f.setVisible(true);
	}
	public void addEvent() {
		
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String i = tf1.getText();
				int id = Integer.parseInt(i);
				String species = tf2.getText();
				String a = tf3.getText();
				int age = Integer.parseInt(a);
				AnimalVo v = new AnimalVo(id, species, age);
				try {
					dao.insert(v);
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					maintf.setText(id+"Insert OK");
				} catch (Exception e1) {
					maintf.setText("Insert Error ... !!!");
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					list.removeAll();
					clist = dao.select();
					for (AnimalVo v : clist) {
						String str = v.getId()+""+v.getSpecies();
						list.add(str);
						maintf.setText(clist.size()+": Completed !");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});		
		b3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String i = tf1.getText();
				int id = Integer.parseInt(i);
				try {
					dao.delete(id);
					tf1.setText("");
					maintf.setText(id+"Delete OK");
				} catch (Exception e1) {
					maintf.setText("Delete Error ... !!!");
					tf1.setText("");
					e1.printStackTrace();
				}
				
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String i = tf1.getText();
				int id = Integer.parseInt(i);
				String species = tf2.getText();
				String a = tf3.getText();
				int age = Integer.parseInt(a);
				AnimalVo v = new AnimalVo(id, species, age);
				try {
					dao.update(v);
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					maintf.setText(id+"Update OK");
				} catch (Exception e1) {
					maintf.setText("Update Error ... !!!");
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
				}
			}
		});
		list.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				AnimalVo ani = clist.get(t);
				String s = ani.getId()+""+ani.getSpecies()+""+ani.getAge();
				maintf.setText(s);
			}
		});
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	

}
