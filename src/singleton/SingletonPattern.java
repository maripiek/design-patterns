package singleton;

public class SingletonPattern {
  private SingletonPattern() {
      System.out.println("Singleton Pattern constructor");
  }

  private static SingletonPattern instance = null;

  public static SingletonPattern getInstance() {
      if (instance == null) {
          instance = new SingletonPattern();
      }
      return instance;
  }


  public static void main(String[] args) throws Exception {
      SingletonPattern.getInstance();
      SingletonPattern.getInstance();
      SingletonPattern.getInstance();
  }
}
