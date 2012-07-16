/*
 * This file is part of lanterna (http://code.google.com/p/lanterna/).
 * 
 * lanterna is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2010-2012 Martin
 */

package com.googlecode.lanterna.gui.component;

/**
 *
 * @author Martin
 */
public class PasswordBox extends TextBox
{
    /**
     * Creates a password masked text box component, where the user can enter 
     * text by typing on the keyboard and the characters will be represented by
     * the * character. It will be initially empty and 10 columns wide.
     */
    public PasswordBox()
    {
        this(0, "");
    }

    /**
     * Creates a password masked text box component, where the user can enter 
     * text by typing on the keyboard and the characters will be represented by
     * the * character.
     * @param width Width of the password box
     * @param initialContent Initial text content
     */
    public PasswordBox(int width, String initialContent)
    {
        super(width, initialContent);
    }

    @Override
    protected String prerenderTransformation(String textboxString)
    {
        String newString = "";
        for(int i = 0; i < textboxString.length(); i++)
            newString += "*";
        return newString;
    }
}