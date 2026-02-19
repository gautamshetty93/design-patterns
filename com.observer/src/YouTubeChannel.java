package com.observer.src;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();
    private String videoTitle;

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : subscribers) {
            observer.update(videoTitle);
        }
    }

    public void uploadVideo(String title) {
        this.videoTitle = title;
        System.out.println("New video uploaded: " + title);
        notifySubscribers();
    }
}