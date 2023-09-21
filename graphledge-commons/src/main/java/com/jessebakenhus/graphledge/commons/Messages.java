package com.jessebakenhus.graphledge.commons;

import lombok.experimental.UtilityClass;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

@UtilityClass
public class Messages {

    public String getTranslation(String messageKey) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", Locale.getDefault());

        return resourceBundle.getString(messageKey);
    }

    public String getTranslation(String messageKey, Object... objects) {

        String translation = getTranslation(messageKey);

        return MessageFormat.format(translation, objects);
    }
}
