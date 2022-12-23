package com.momo;

public class Sms extends Decorator{

    public Sms(NotificationComponent notif) {
        NotificationComponent notificationComponent = notif;
        setDestinataire("Mohamed Zayad");
        setSubject("Devoir Design pattern");
        setMessage("Implementation de Decorator");
        setMoyen("Sms envoyé avec succes");
    }

    @Override
    public String toString() {
        return "Sms{" +
                "Destinataire='" + getDestinataire() + '\'' +
                ", Sujet=" + getSubject() + ", Message=" + getMessage() +
                ", Moyen =" + getMoyen() +
                '}';
    }

}
