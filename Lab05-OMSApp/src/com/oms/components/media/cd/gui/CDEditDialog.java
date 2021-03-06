package com.oms.components.media.cd.gui;

import com.oms.bean.Book;
import com.oms.bean.CompactDisc;
import com.oms.bean.Media;
import com.oms.components.abstractdata.controller.IDataManageController;
import com.oms.components.media.gui.PhysicalMediaEditDialog;

import javax.swing.*;

@SuppressWarnings("serial")
public class CDEditDialog extends PhysicalMediaEditDialog{
	
	private JTextField artistField;
	
	public CDEditDialog(Media media, IDataManageController<Media> controller) {

		super(media, controller);
	}

	@Override
	public void buildControls() {
		super.buildControls();
		
		if (t instanceof CompactDisc) {
			CompactDisc cd = (CompactDisc) t;
			
			int row = getLastRowIndex();
			JLabel publisherLabel = new JLabel("Publisher");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(publisherLabel, c);
			artistField = new JTextField(15);
			artistField.setText(cd.getArtist());
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(artistField, c);
		}
	}

	@Override
	public Media getNewData() {
		super.getNewData();
		
		if (t instanceof CompactDisc) {
			CompactDisc compactDisc = (CompactDisc) t;
			compactDisc.setArtist(artistField.getText());
		}
		
		return t;
	}
}
