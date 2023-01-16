package com.AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuclassAwt implements ActionListener {
	
	Frame p;
	String s="";
	TextArea ta;
	MenuBar mbar;
	Menu file,edit,view,format;
	MenuItem New,open,save,save_as,print,redo,undo,cut,copy,paste,ww,mu,font,exit;
	Label l;
	
	
	MenuclassAwt()
	{
		p =new Frame();
		p.setVisible(true);
        p.setSize(500,500);	
        p.setTitle("Note Pad");
        
        ta= new TextArea(40,60);
        l = new Label("");
        s =new String(" ");
        mbar = new MenuBar();
        file = new Menu("file");
        edit = new Menu("edit");
        view = new Menu("view");
        format = new Menu("format");
        
        New = new MenuItem("New");
        open = new MenuItem("open");
        save = new MenuItem("save");
        save_as = new MenuItem("save_as");
        print = new MenuItem("print");
        redo = new MenuItem("redo");
        undo = new MenuItem("undo");
        cut = new MenuItem("cut");
        copy = new MenuItem("copy");
        paste = new MenuItem("paste");
        ww = new MenuItem("ww");
        mu = new MenuItem("mu");
        font = new MenuItem("font");
        exit = new MenuItem("exit");
        p.setMenuBar(mbar);
        
        mbar.add(file);
        mbar.add(edit);
        mbar.add(view);
        mbar.add(format);
        
        file.add(New);
        file.add(open);
        file.add(save);
        file.add(save_as);
        file.add(print);
        file.add(exit);
        
        edit.add(redo);
        edit.add(undo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        view.add(ww);
        view.add(mu);
        format.add(font);
        
        p.add(ta);
        
       New.addActionListener(this);
       cut.addActionListener(this);
       copy.addActionListener(this);
       paste.addActionListener(this);
       undo.addActionListener(this);
       exit.addActionListener(this);
	}

	public static void main(String[] args)throws Exception 
	{
		MenuclassAwt  ob = new MenuclassAwt();
    }


	
	public void actionPerformed(ActionEvent e) 
	{
	     	if(e.getSource()==New)
	     	{
	     		ta.setText(" ");
	     	}
	     	
	     	if(e.getSource()==cut)
	     	{
	     		s=ta.getSelectedText();
	     		ta.replaceText(" ", ta.getSelectionStart(), ta.getSelectionEnd());
	     	}
	     	
	     	if(e.getSource()==copy)
	     	{
	     		s=ta.getSelectedText();
	     	}
	     	
	     	if(e.getSource()==paste)
	     	{
	     		
	     		ta.replaceText(s, ta.getSelectionStart(),ta.getSelectionEnd());
	     	}
	     	
	     	if(e.getSource()==undo)
	     	{
	     		ta.replaceText(s, ta.getSelectionStart(), ta.getSelectionEnd());
	     	}
	     	
	     	if(e.getSource()==exit)
	     	{
	     		p.dispose();
	     	}
		
	}

}
