package lesson10;

interface Observable {
  void registerObserver(Observer o);
  void removeObserver(Observer o);
  void notifyObservers();
}