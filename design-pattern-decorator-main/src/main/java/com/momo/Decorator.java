package com.momo;

import java.math.BigDecimal;

public abstract class Decorator extends NotificationComponent {
    protected NotificationComponent notificationComponent;

    @Override
    public String getDestinataire() {
        return notificationComponent.getDestinataire() + " " + super.getDestinataire();
    }

    @Override
    public String getSubject() {
        return notificationComponent.getSubject() + "" + super.getSubject();
    }

    @Override
    public String getMessage() {
        return notificationComponent.getMessage() + "" + super.getMessage();
    }

    @Override
    public String getMoyen() {
        return notificationComponent.getMoyen() + "" + super.getMoyen();
    }
}
