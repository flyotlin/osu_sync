package Model;

import View.Pages.ObserverPage;

import java.util.ArrayList;

public interface OsuSyncObservable {
    ArrayList<ObserverPage> observerPages = new ArrayList<>();

    void registerObserver(ObserverPage o);

    void removeObservers();

    void notifyObservers(String path);
}
