package com.googlecode.lanterna.gui2.dialogs;

import com.googlecode.lanterna.TerminalSize;

import java.io.File;

/**
 * Created by martin on 26/06/15.
 */
public class FileDialogBuilder extends AbstractDialogBuilder<FileDialogBuilder, FileDialog> {

    private String actionLabel;
    private TerminalSize suggestedSize;
    private File selectedFile;
    private boolean showHiddenDirectories;

    public FileDialogBuilder() {
        super("FileDialog");
        actionLabel = "OK";
        suggestedSize = new TerminalSize(45, 10);
        showHiddenDirectories = false;
        selectedFile = null;
    }

    @Override
    public FileDialog build() {
        return new FileDialog(title, description, actionLabel, suggestedSize, showHiddenDirectories, selectedFile);
    }

    public FileDialogBuilder setActionLabel(String actionLabel) {
        this.actionLabel = actionLabel;
        return this;
    }

    public FileDialogBuilder setSuggestedSize(TerminalSize suggestedSize) {
        this.suggestedSize = suggestedSize;
        return this;
    }

    public FileDialogBuilder setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
        return this;
    }

    public void setShowHiddenDirectories(boolean showHiddenDirectories) {
        this.showHiddenDirectories = showHiddenDirectories;
    }

    @Override
    protected FileDialogBuilder self() {
        return this;
    }
}
