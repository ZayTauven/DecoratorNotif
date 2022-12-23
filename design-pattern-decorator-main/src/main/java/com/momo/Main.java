package com.momo;

public class Main {
    public static void main(String[] args) {

        NotificationComponent mail = new Mail();
        System.out.println("Destinataire -> "+ mail.getDestinataire()
                        +". Sujet -> " + mail.getSubject()
                        +". Message -> " + mail.getMessage()
                        +". Confirmation -> " + mail.getMoyen()
        );

        NotificationComponent Msgsms = new Sms(new Mail());
        System.out.println("Destinataire -> "+ Msgsms.getDestinataire()
                +". Sujet -> " + Msgsms.getSubject()
                +". Message -> " + Msgsms.getMessage()
                +". Confirmation -> " + Msgsms.getMoyen()
        );

    }
}