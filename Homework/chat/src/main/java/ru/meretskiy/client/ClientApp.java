package ru.meretskiy.client;

public class ClientApp {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                new ConsoleChatClient().startClient();
            }
        }).start();

    }
}
