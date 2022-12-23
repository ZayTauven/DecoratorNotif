package com.momo;

public class Whatsapp extends Decorator{

    public Whatsapp(NotificationComponent notif) {
        NotificationComponent notificationComponent = notif;
        setDestinataire("Mohamed Zayad");
        setSubject("Devoir Design pattern");
        setSubject("Implementation de Decorator");
        setMoyen("Sms envoyé avec succes");
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "Destinataire='" + getDestinataire() + '\'' +
                ", Sujet=" + getSubject() + ", Message=" + getMessage() +
                ", Moyen =" + getMoyen() +
                '}';
    }

}
