package com.oms.components.media.cd.gui;

import com.oms.bean.CompactDisc;
import com.oms.bean.Media;
import com.oms.components.media.gui.PhysicalMediaSinglePane;

import javax.swing.*;

@SuppressWarnings("serial")
public class CDSinglePane extends PhysicalMediaSinglePane {
    // artist, length, dateOfIssue
    private JLabel artist;
    private JLabel length;
    private JLabel dateOfIssue;

    public CDSinglePane() {
        super();
    }

    public CDSinglePane(Media media) {
        this();
        this.t = media;
        displayData();
    }

    @Override
    public void buildControls() {
        super.buildControls();


        int row = getLastRowIndex();
        c.gridx = 0;
        c.gridy = row;
        artist = new JLabel();
        add(artist, c);

        row = getLastRowIndex();
        c.gridx = 0;
        c.gridy = row;
        length = new JLabel();
        add(length, c);

        row = getLastRowIndex();
        c.gridx = 0;
        c.gridy = row;
        dateOfIssue = new JLabel();
        add(dateOfIssue, c);
    }


    @Override
    public void displayData() {
        super.displayData();

        if (t instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) t;

            artist.setText("Artist: " + cd.getArtist());
            length.setText("Length: " + cd.getLength());
            dateOfIssue.setText("Date Of Issue: " + cd.getDateOfIssue().toString());
        }
    }
}
